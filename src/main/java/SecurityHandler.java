import jakarta.xml.bind.*;
import jakarta.xml.soap.*;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import ua.nure.it.clinic.service.ObjectFactory;

import javax.xml.namespace.QName;
import java.util.Set;

public class SecurityHandler implements SOAPHandler<SOAPMessageContext> {
    public static final String SERVER_SECURITY_TOKEN_NAME = "serverToken";
    private final JAXBContext jaxb;
    private final ObjectFactory factory;
    private final String TOKEN_BASE = "token_";
    private String currentToken;

    public SecurityHandler() throws JAXBException {
        jaxb = JAXBContext.newInstance("ua.nure.it.clinic.service");
        factory = new ObjectFactory();
        currentToken = TOKEN_BASE + "1";
    }

    @Override
    public Set<QName> getHeaders() {
        return Set.of();
    }

    @Override
    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        boolean outbound = (boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        boolean result = true;
        if (outbound){
            result = addClientToken(soapMessageContext.getMessage());
        } else {
            result = retrieveNewToken(soapMessageContext.getMessage());
        }
        return result;
    }

    private boolean retrieveNewToken(SOAPMessage message) {
        try {
            QName serverTokenQName = new QName(Constants.SERVICE_NS, SERVER_SECURITY_TOKEN_NAME);
            SOAPHeader header = message.getSOAPHeader();
            Unmarshaller unmarshaller = jaxb.createUnmarshaller();
            Node serverTokenNode = header.getChildElements(serverTokenQName).next();
            currentToken = unmarshaller.unmarshal(serverTokenNode, String.class).getValue();
        } catch (SOAPException | JAXBException e) {
            String msg = e.getMessage();
            msg += e.getCause() != null ? "\nCause: " + e.getCause().getMessage() : "";
            System.err.println(msg);
        }
        return true;
    }

    private boolean addClientToken(SOAPMessage message) {
        try{
            SOAPHeader header = message.getSOAPHeader();
            header.extractAllHeaderElements();
            Marshaller marshaller = jaxb.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.marshal(factory.createClientToken(currentToken), header);
            message.saveChanges();
        }
        catch (SOAPException | JAXBException e){
            String msg = e.getMessage();
            msg += e.getCause() != null ? "\nCause: " + e.getCause().getMessage() : "";
            System.err.println(msg);
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        System.err.println("Fault occurred.");
        try {
            SOAPFault soapFault = soapMessageContext.getMessage().getSOAPBody().getFault();
            System.err.println("Returned FaultCode: " + soapFault.getFaultCode() + "; FaultString: " + soapFault.getFaultString() + ";");
        } catch (SOAPException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public void close(MessageContext messageContext) {
        System.out.println("Handler closed.");
    }
}
