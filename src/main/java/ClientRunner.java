import jakarta.xml.bind.JAXBException;
import jakarta.xml.ws.Holder;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;
import ua.nure.it.clinic.medicalcard.MedicalCard;
import ua.nure.it.clinic.service.GetMedicalCard;
import ua.nure.it.clinic.service.Polyclinic;
import ua.nure.it.clinic.service.PolyclinicService;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ClientRunner {
    static class ClientHandlerResolver implements HandlerResolver {
        @SuppressWarnings("rawtypes")
        @Override
        public List<Handler> getHandlerChain(PortInfo portInfo) {
            List<Handler> list = new ArrayList<>();
            try {
                list.add(new SecurityHandler());
            } catch (JAXBException e) {
                System.err.println(e.getMessage());
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Polyclinic service = new Polyclinic();
        service.setHandlerResolver(new ClientHandlerResolver());
        PolyclinicService port = service.getPolyclinicPort();
        Holder<String> serverToken = new Holder<>();

        try {
            GetMedicalCard parameters = new GetMedicalCard();
            parameters.setCardNumber(1);
            MedicalCard card = port.getMedicalCard(parameters, null, serverToken).getMedicalCard();
            System.out.println(card.getCardNumber());
            card = port.getMedicalCard(parameters, null, serverToken).getMedicalCard();
            System.out.println(card.getCardNumber());
            card = port.getMedicalCard(parameters, null, serverToken).getMedicalCard();
            System.out.println(card.getCardNumber());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
