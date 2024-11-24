
package ua.nure.it.clinic.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "PolyclinicService", targetNamespace = "http://it.nure.ua/clinic/server/service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ua.nure.it.clinic.medicalcard.ObjectFactory.class,
    ua.nure.it.clinic.appointment.ObjectFactory.class,
    ua.nure.it.clinic.appointmentresult.ObjectFactory.class,
    ObjectFactory.class
})
public interface PolyclinicService {


    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.GetMedicalCardResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "getMedicalCardResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/getMedicalCardRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/getMedicalCardResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/getMedicalCard/Fault/ServiceException")
    })
    public GetMedicalCardResponse getMedicalCard(
        @WebParam(name = "getMedicalCard", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        GetMedicalCard parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.DeleteAppointmentResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "deleteAppointmentResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/deleteAppointmentRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/deleteAppointmentResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/deleteAppointment/Fault/ServiceException")
    })
    public DeleteAppointmentResponse deleteAppointment(
        @WebParam(name = "deleteAppointment", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        DeleteAppointment parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.AddMedicalCardResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "addMedicalCardResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/addMedicalCardRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/addMedicalCardResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/addMedicalCard/Fault/ServiceException")
    })
    public AddMedicalCardResponse addMedicalCard(
        @WebParam(name = "addMedicalCard", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        AddMedicalCard parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.UpdateAppointmentTimeResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "updateAppointmentTimeResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/updateAppointmentTimeRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/updateAppointmentTimeResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/updateAppointmentTime/Fault/ServiceException")
    })
    public UpdateAppointmentTimeResponse updateAppointmentTime(
        @WebParam(name = "updateAppointmentTime", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        UpdateAppointmentTime parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.AddAppointmentForPatientResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "addAppointmentForPatientResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/addAppointmentForPatientRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/addAppointmentForPatientResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/addAppointmentForPatient/Fault/ServiceException")
    })
    public AddAppointmentForPatientResponse addAppointmentForPatient(
        @WebParam(name = "addAppointmentForPatient", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        AddAppointmentForPatient parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.AddAppointmentResultResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "addAppointmentResultResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/addAppointmentResultRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/addAppointmentResultResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/addAppointmentResult/Fault/ServiceException")
    })
    public AddAppointmentResultResponse addAppointmentResult(
        @WebParam(name = "addAppointmentResult", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        AddAppointmentResult parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.UpdateAppointmentResultResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "updateAppointmentResultResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/updateAppointmentResultRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/updateAppointmentResultResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/updateAppointmentResult/Fault/ServiceException")
    })
    public UpdateAppointmentResultResponse updateAppointmentResult(
        @WebParam(name = "updateAppointmentResult", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        UpdateAppointmentResult parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

    /**
     * 
     * @param clientToken
     * @param parameters
     * @param serverToken
     * @return
     *     returns ua.nure.it.clinic.server.service.GetAppointmentsForPatientResponse
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "getAppointmentsForPatientResponse", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "result")
    @Action(input = "http://it.nure.ua/clinic/server/service/PolyclinicService/getAppointmentsForPatientRequest", output = "http://it.nure.ua/clinic/server/service/PolyclinicService/getAppointmentsForPatientResponse", fault = {
        @FaultAction(className = ServiceException_Exception.class, value = "http://it.nure.ua/clinic/server/service/PolyclinicService/getAppointmentsForPatient/Fault/ServiceException")
    })
    public GetAppointmentsForPatientResponse getAppointmentsForPatient(
        @WebParam(name = "getAppointmentsForPatient", targetNamespace = "http://it.nure.ua/clinic/server/service", partName = "parameters")
        GetAppointmentsForPatient parameters,
        @WebParam(name = "clientToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, partName = "clientToken")
        String clientToken,
        @WebParam(name = "serverToken", targetNamespace = "http://it.nure.ua/clinic/server/service", header = true, mode = WebParam.Mode.OUT, partName = "serverToken")
        Holder<String> serverToken)
        throws ServiceException_Exception
    ;

}