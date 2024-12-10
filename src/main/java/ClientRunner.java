import jakarta.xml.bind.JAXBException;
import jakarta.xml.ws.Holder;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;
import ua.nure.it.clinic.appointment.Appointment;
import ua.nure.it.clinic.appointmentresult.AppointmentResult;
import ua.nure.it.clinic.medicalcard.Identification;
import ua.nure.it.clinic.medicalcard.MedicalCard;
import ua.nure.it.clinic.medicalcard.PersonalInfo;
import ua.nure.it.clinic.service.*;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
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
        DatatypeFactory datatypeFactory = null;
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------Checking how faults work----------------------------------");
        try {
            System.out.println("Trying to get a medical card with a non-existing card number");
            MedicalCard card = port.getMedicalCard(new GetMedicalCard(11415), null, serverToken).getMedicalCard();
        }
        catch (Exception e){
            System.out.println(e);
        }

        try {
            System.out.println("Trying to send null as a medical card");
            int cardNumber = port.addMedicalCard(new AddMedicalCard(null), null, serverToken).getReturn();
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("----------------------------------Checking work basic scenario----------------------------------");
        try {
            MedicalCard newMedicalCard = getDummyMedicalCard(datatypeFactory);
            System.out.println("Adding a new medical card");
            int cardNumber = port.addMedicalCard(new AddMedicalCard(newMedicalCard), null, serverToken).getReturn();
            System.out.println("New card number: " + cardNumber);
            System.out.println();
            System.out.println("Getting the added medical card");
            MedicalCard card = port.getMedicalCard(new GetMedicalCard(cardNumber), null, serverToken).getMedicalCard();
            System.out.println("Received medical card:");
            printMedicalCard(card);
            System.out.println();
            System.out.println("Adding an appointment for the patient");
            Appointment newAppointment = new Appointment();
            newAppointment.setDate(datatypeFactory.newXMLGregorianCalendarDate(2021, 12, 12, 0));
            newAppointment.setStartTime(datatypeFactory.newXMLGregorianCalendarTime(12, 0, 0, 0));
            newAppointment.setEndTime(datatypeFactory.newXMLGregorianCalendarTime(12, 30, 0, 0));
            newAppointment.setRoomNumber(1);
            newAppointment.setPatientCardNumber(cardNumber);
            int appointmentId = port.addAppointmentForPatient(new AddAppointmentForPatient(newAppointment), null, serverToken).getReturn();
            System.out.println("New appointment id: " + appointmentId);
            System.out.println();
            System.out.println("Adding another appointment.");
            Appointment newAppointment2 = new Appointment();
            newAppointment2.setDate(datatypeFactory.newXMLGregorianCalendarDate(2021, 12, 13, 0));
            newAppointment2.setStartTime(datatypeFactory.newXMLGregorianCalendarTime(12, 0, 0, 0));
            newAppointment2.setEndTime(datatypeFactory.newXMLGregorianCalendarTime(12, 30, 0, 0));
            newAppointment2.setRoomNumber(2);
            newAppointment2.setPatientCardNumber(cardNumber);
            int appointmentId2 = port.addAppointmentForPatient(new AddAppointmentForPatient(newAppointment2), null, serverToken).getReturn();
            System.out.println("Another appointment id: " + appointmentId2);
            System.out.println();
            System.out.println("Getting the list of appointments for patient");
            List<Appointment> appointments = port.getAppointmentsForPatient(new GetAppointmentsForPatient(cardNumber), null, serverToken).getAppointment();
            System.out.println("Received appointments:");
            for (Appointment appointment : appointments) {
                printAppointment(appointment);
            }
            System.out.println();
            System.out.println("Updating the appointment time");
            XMLGregorianCalendar newStartTime = datatypeFactory.newXMLGregorianCalendarTime(13, 0, 0, 0);
            XMLGregorianCalendar newEndTime = datatypeFactory.newXMLGregorianCalendarTime(13, 30, 0, 0);
            Appointment updatedAppointment = port.updateAppointmentTime(new UpdateAppointmentTime(appointmentId,
                    newStartTime, newEndTime), null, serverToken).getAppointment();
            System.out.println("Updated appointment:");
            printAppointment(updatedAppointment);
            System.out.println();
            System.out.println("Deleting the appointment");
            Appointment deletedAppointment = port.deleteAppointment(new DeleteAppointment(appointmentId), null, serverToken).getAppointment();
            System.out.println("Deleted appointment:");
            printAppointment(deletedAppointment);
            System.out.println();
            System.out.println("Adding an appointment result");
            AppointmentResult newResult = new AppointmentResult();
            newResult.setPatientCardNumber(cardNumber);
            newResult.setAppointmentId(appointmentId2);
            newResult.setDiagnosis("Diagnosis");
            newResult.setPrescription("Prescription");
            newResult.setRecommendations("Recommendations");
            newResult.setActions("Actions");
            newResult.setAnamnesis("Anamnesis");
            newResult.setConclusion("Conclusion");
            newResult.setObjectively("Objectively");
            newResult.setRadiationDose(new BigDecimal(9000));
            newResult.setReason("Reason");
            int resultId = port.addAppointmentResult(new AddAppointmentResult(newResult), null, serverToken).getReturn();
            System.out.println("New result id: " + resultId);
            System.out.println();
            System.out.println("Getting the medical card for patient after all the changes");
            MedicalCard updatedCard = port.getMedicalCard(new GetMedicalCard(cardNumber), null, serverToken).getMedicalCard();
            System.out.println("Received medical card:");
            printMedicalCard(updatedCard);
            System.out.println();
            System.out.println("Updating the appointment result");
            AppointmentResult updatedResult = new AppointmentResult();
            updatedResult.setId(resultId);
            updatedResult.setPatientCardNumber(cardNumber);
            updatedResult.setAppointmentId(appointmentId2);
            updatedResult.setDiagnosis("Updated diagnosis");
            updatedResult.setPrescription("Updated prescription");
            updatedResult.setRecommendations("Updated recommendations");
            updatedResult.setActions("Updated actions");
            updatedResult.setAnamnesis("Updated anamnesis");
            updatedResult.setConclusion("Updated conclusion");
            updatedResult.setObjectively("Updated objectively");
            updatedResult.setRadiationDose(new BigDecimal(10000));
            updatedResult.setReason("Updated reason");
            AppointmentResult result = port.updateAppointmentResult(new UpdateAppointmentResult(updatedResult), null, serverToken).getAppointmentResult();
            System.out.println("Updated result:");
            printAppointmentResult(result);
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void printMedicalCard(MedicalCard medicalCard) {
        System.out.println("Card number: " + medicalCard.getCardNumber());
        System.out.println("Card address: " + medicalCard.getAddress());
        System.out.println("Card email: " + medicalCard.getEmail());
        PersonalInfo personalInfo = medicalCard.getPersonalInfo();
        System.out.println("Card first name: " + personalInfo.getFirstName());
        System.out.println("Card last name: " + personalInfo.getLastName());
        System.out.println("Card patronymic: " + personalInfo.getPatronymic());
        System.out.println("Card birth date: " + personalInfo.getBirthDate());
        System.out.println("Card gender: " + personalInfo.getGender());
        Identification identification = medicalCard.getIdentification();
        System.out.println("Card id card number: " + identification.getIdCardNumber());
        System.out.println("Card phone: " + medicalCard.getPhone());
        System.out.println("Card workplace: " + medicalCard.getWorkplace());
        MedicalCard.Appointments appointments = medicalCard.getAppointments();
        if (appointments != null) {
            for (Appointment appointment : appointments.getAppointment()) {
                printAppointment(appointment);
            }
        }
        MedicalCard.Results results = medicalCard.getResults();
        if (results != null) {
            for (AppointmentResult result : results.getAppointmentResult()) {
                printAppointmentResult(result);
            }
        }
    }

    public static MedicalCard getDummyMedicalCard(DatatypeFactory datatypeFactory){
        MedicalCard newMedicalCard = new MedicalCard();
        newMedicalCard.setAddress("New address");
        newMedicalCard.setEmail("emal@gmail.com");
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setFirstName("First name");
        personalInfo.setLastName("Last name");
        personalInfo.setPatronymic("Patronymic");
        personalInfo.setBirthDate(datatypeFactory.newXMLGregorianCalendarDate(1999, 12, 12, 0));
        personalInfo.setGender("Male");
        newMedicalCard.setPersonalInfo(personalInfo);
        newMedicalCard.setPhone("+380974521198");
        newMedicalCard.setWorkplace("Workplace");
        Identification identification = new Identification();
        identification.setIdCardNumber("1111");
        newMedicalCard.setIdentification(identification);
        newMedicalCard.setAppointments(new MedicalCard.Appointments());
        newMedicalCard.setResults(new MedicalCard.Results());
        return newMedicalCard;
    }

    public static void printAppointment(Appointment appointment){
        System.out.println("Appointment id: " + appointment.getId());
        System.out.println("Appointment date: " + appointment.getDate());
        System.out.println("Appointment start time: " + appointment.getStartTime());
        System.out.println("Appointment end time: " + appointment.getEndTime());
        System.out.println("Appointment room number: " + appointment.getRoomNumber());
        System.out.println("Appointment patient card number: " + appointment.getPatientCardNumber());
        System.out.println();
    }

    public static void printAppointmentResult(AppointmentResult result){
        System.out.println("Appointment result id: " + result.getId());
        System.out.println("Appointment result appointment id: " + result.getAppointmentId());
        System.out.println("Appointment result diagnosis: " + result.getDiagnosis());
        System.out.println("Appointment result prescription: " + result.getPrescription());
        System.out.println("Appointment result recommendations: " + result.getRecommendations());
        System.out.println();
    }
}
