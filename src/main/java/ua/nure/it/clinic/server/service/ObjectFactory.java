
package ua.nure.it.clinic.server.service;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.nure.it.clinic.server.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceException_QNAME = new QName("http://it.nure.ua/clinic/server/service", "ServiceException");
    private final static QName _AddAppointmentForPatient_QNAME = new QName("http://it.nure.ua/clinic/server/service", "addAppointmentForPatient");
    private final static QName _AddAppointmentForPatientResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "addAppointmentForPatientResponse");
    private final static QName _AddAppointmentResult_QNAME = new QName("http://it.nure.ua/clinic/server/service", "addAppointmentResult");
    private final static QName _AddAppointmentResultResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "addAppointmentResultResponse");
    private final static QName _AddMedicalCard_QNAME = new QName("http://it.nure.ua/clinic/server/service", "addMedicalCard");
    private final static QName _AddMedicalCardResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "addMedicalCardResponse");
    private final static QName _ClientToken_QNAME = new QName("http://it.nure.ua/clinic/server/service", "clientToken");
    private final static QName _DeleteAppointment_QNAME = new QName("http://it.nure.ua/clinic/server/service", "deleteAppointment");
    private final static QName _DeleteAppointmentResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "deleteAppointmentResponse");
    private final static QName _GetAppointmentsForPatient_QNAME = new QName("http://it.nure.ua/clinic/server/service", "getAppointmentsForPatient");
    private final static QName _GetAppointmentsForPatientResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "getAppointmentsForPatientResponse");
    private final static QName _GetMedicalCard_QNAME = new QName("http://it.nure.ua/clinic/server/service", "getMedicalCard");
    private final static QName _GetMedicalCardResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "getMedicalCardResponse");
    private final static QName _ServerToken_QNAME = new QName("http://it.nure.ua/clinic/server/service", "serverToken");
    private final static QName _UpdateAppointmentResult_QNAME = new QName("http://it.nure.ua/clinic/server/service", "updateAppointmentResult");
    private final static QName _UpdateAppointmentResultResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "updateAppointmentResultResponse");
    private final static QName _UpdateAppointmentTime_QNAME = new QName("http://it.nure.ua/clinic/server/service", "updateAppointmentTime");
    private final static QName _UpdateAppointmentTimeResponse_QNAME = new QName("http://it.nure.ua/clinic/server/service", "updateAppointmentTimeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.nure.it.clinic.server.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link AddAppointmentForPatient }
     * 
     */
    public AddAppointmentForPatient createAddAppointmentForPatient() {
        return new AddAppointmentForPatient();
    }

    /**
     * Create an instance of {@link AddAppointmentForPatientResponse }
     * 
     */
    public AddAppointmentForPatientResponse createAddAppointmentForPatientResponse() {
        return new AddAppointmentForPatientResponse();
    }

    /**
     * Create an instance of {@link AddAppointmentResult }
     * 
     */
    public AddAppointmentResult createAddAppointmentResult() {
        return new AddAppointmentResult();
    }

    /**
     * Create an instance of {@link AddAppointmentResultResponse }
     * 
     */
    public AddAppointmentResultResponse createAddAppointmentResultResponse() {
        return new AddAppointmentResultResponse();
    }

    /**
     * Create an instance of {@link AddMedicalCard }
     * 
     */
    public AddMedicalCard createAddMedicalCard() {
        return new AddMedicalCard();
    }

    /**
     * Create an instance of {@link AddMedicalCardResponse }
     * 
     */
    public AddMedicalCardResponse createAddMedicalCardResponse() {
        return new AddMedicalCardResponse();
    }

    /**
     * Create an instance of {@link DeleteAppointment }
     * 
     */
    public DeleteAppointment createDeleteAppointment() {
        return new DeleteAppointment();
    }

    /**
     * Create an instance of {@link DeleteAppointmentResponse }
     * 
     */
    public DeleteAppointmentResponse createDeleteAppointmentResponse() {
        return new DeleteAppointmentResponse();
    }

    /**
     * Create an instance of {@link GetAppointmentsForPatient }
     * 
     */
    public GetAppointmentsForPatient createGetAppointmentsForPatient() {
        return new GetAppointmentsForPatient();
    }

    /**
     * Create an instance of {@link GetAppointmentsForPatientResponse }
     * 
     */
    public GetAppointmentsForPatientResponse createGetAppointmentsForPatientResponse() {
        return new GetAppointmentsForPatientResponse();
    }

    /**
     * Create an instance of {@link GetMedicalCard }
     * 
     */
    public GetMedicalCard createGetMedicalCard() {
        return new GetMedicalCard();
    }

    /**
     * Create an instance of {@link GetMedicalCardResponse }
     * 
     */
    public GetMedicalCardResponse createGetMedicalCardResponse() {
        return new GetMedicalCardResponse();
    }

    /**
     * Create an instance of {@link UpdateAppointmentResult }
     * 
     */
    public UpdateAppointmentResult createUpdateAppointmentResult() {
        return new UpdateAppointmentResult();
    }

    /**
     * Create an instance of {@link UpdateAppointmentResultResponse }
     * 
     */
    public UpdateAppointmentResultResponse createUpdateAppointmentResultResponse() {
        return new UpdateAppointmentResultResponse();
    }

    /**
     * Create an instance of {@link UpdateAppointmentTime }
     * 
     */
    public UpdateAppointmentTime createUpdateAppointmentTime() {
        return new UpdateAppointmentTime();
    }

    /**
     * Create an instance of {@link UpdateAppointmentTimeResponse }
     * 
     */
    public UpdateAppointmentTimeResponse createUpdateAppointmentTimeResponse() {
        return new UpdateAppointmentTimeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointmentForPatient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAppointmentForPatient }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "addAppointmentForPatient")
    public JAXBElement<AddAppointmentForPatient> createAddAppointmentForPatient(AddAppointmentForPatient value) {
        return new JAXBElement<AddAppointmentForPatient>(_AddAppointmentForPatient_QNAME, AddAppointmentForPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointmentForPatientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAppointmentForPatientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "addAppointmentForPatientResponse")
    public JAXBElement<AddAppointmentForPatientResponse> createAddAppointmentForPatientResponse(AddAppointmentForPatientResponse value) {
        return new JAXBElement<AddAppointmentForPatientResponse>(_AddAppointmentForPatientResponse_QNAME, AddAppointmentForPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointmentResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAppointmentResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "addAppointmentResult")
    public JAXBElement<AddAppointmentResult> createAddAppointmentResult(AddAppointmentResult value) {
        return new JAXBElement<AddAppointmentResult>(_AddAppointmentResult_QNAME, AddAppointmentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointmentResultResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAppointmentResultResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "addAppointmentResultResponse")
    public JAXBElement<AddAppointmentResultResponse> createAddAppointmentResultResponse(AddAppointmentResultResponse value) {
        return new JAXBElement<AddAppointmentResultResponse>(_AddAppointmentResultResponse_QNAME, AddAppointmentResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMedicalCard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMedicalCard }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "addMedicalCard")
    public JAXBElement<AddMedicalCard> createAddMedicalCard(AddMedicalCard value) {
        return new JAXBElement<AddMedicalCard>(_AddMedicalCard_QNAME, AddMedicalCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMedicalCardResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMedicalCardResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "addMedicalCardResponse")
    public JAXBElement<AddMedicalCardResponse> createAddMedicalCardResponse(AddMedicalCardResponse value) {
        return new JAXBElement<AddMedicalCardResponse>(_AddMedicalCardResponse_QNAME, AddMedicalCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "clientToken")
    public JAXBElement<String> createClientToken(String value) {
        return new JAXBElement<String>(_ClientToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAppointment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAppointment }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "deleteAppointment")
    public JAXBElement<DeleteAppointment> createDeleteAppointment(DeleteAppointment value) {
        return new JAXBElement<DeleteAppointment>(_DeleteAppointment_QNAME, DeleteAppointment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAppointmentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAppointmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "deleteAppointmentResponse")
    public JAXBElement<DeleteAppointmentResponse> createDeleteAppointmentResponse(DeleteAppointmentResponse value) {
        return new JAXBElement<DeleteAppointmentResponse>(_DeleteAppointmentResponse_QNAME, DeleteAppointmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppointmentsForPatient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAppointmentsForPatient }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "getAppointmentsForPatient")
    public JAXBElement<GetAppointmentsForPatient> createGetAppointmentsForPatient(GetAppointmentsForPatient value) {
        return new JAXBElement<GetAppointmentsForPatient>(_GetAppointmentsForPatient_QNAME, GetAppointmentsForPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppointmentsForPatientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAppointmentsForPatientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "getAppointmentsForPatientResponse")
    public JAXBElement<GetAppointmentsForPatientResponse> createGetAppointmentsForPatientResponse(GetAppointmentsForPatientResponse value) {
        return new JAXBElement<GetAppointmentsForPatientResponse>(_GetAppointmentsForPatientResponse_QNAME, GetAppointmentsForPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalCard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMedicalCard }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "getMedicalCard")
    public JAXBElement<GetMedicalCard> createGetMedicalCard(GetMedicalCard value) {
        return new JAXBElement<GetMedicalCard>(_GetMedicalCard_QNAME, GetMedicalCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalCardResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMedicalCardResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "getMedicalCardResponse")
    public JAXBElement<GetMedicalCardResponse> createGetMedicalCardResponse(GetMedicalCardResponse value) {
        return new JAXBElement<GetMedicalCardResponse>(_GetMedicalCardResponse_QNAME, GetMedicalCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "serverToken")
    public JAXBElement<String> createServerToken(String value) {
        return new JAXBElement<String>(_ServerToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "updateAppointmentResult")
    public JAXBElement<UpdateAppointmentResult> createUpdateAppointmentResult(UpdateAppointmentResult value) {
        return new JAXBElement<UpdateAppointmentResult>(_UpdateAppointmentResult_QNAME, UpdateAppointmentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentResultResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentResultResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "updateAppointmentResultResponse")
    public JAXBElement<UpdateAppointmentResultResponse> createUpdateAppointmentResultResponse(UpdateAppointmentResultResponse value) {
        return new JAXBElement<UpdateAppointmentResultResponse>(_UpdateAppointmentResultResponse_QNAME, UpdateAppointmentResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "updateAppointmentTime")
    public JAXBElement<UpdateAppointmentTime> createUpdateAppointmentTime(UpdateAppointmentTime value) {
        return new JAXBElement<UpdateAppointmentTime>(_UpdateAppointmentTime_QNAME, UpdateAppointmentTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAppointmentTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://it.nure.ua/clinic/server/service", name = "updateAppointmentTimeResponse")
    public JAXBElement<UpdateAppointmentTimeResponse> createUpdateAppointmentTimeResponse(UpdateAppointmentTimeResponse value) {
        return new JAXBElement<UpdateAppointmentTimeResponse>(_UpdateAppointmentTimeResponse_QNAME, UpdateAppointmentTimeResponse.class, null, value);
    }

}
