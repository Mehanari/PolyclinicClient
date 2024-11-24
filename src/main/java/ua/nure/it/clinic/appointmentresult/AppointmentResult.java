
package ua.nure.it.clinic.appointmentresult;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="anamnesis" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="objectively" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="radiationDose" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/&gt;
 *         &lt;element name="diagnosis" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="prescription" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="recommendations" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="conclusion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="appointmentTime" type="{http://www.w3.org/2001/XMLSchema}time" form="qualified"/&gt;
 *         &lt;element name="appointmentDate" type="{http://www.w3.org/2001/XMLSchema}date" form="qualified"/&gt;
 *         &lt;element name="patientCardNumber" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="doctorID" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="appointmentId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reason",
    "anamnesis",
    "objectively",
    "radiationDose",
    "diagnosis",
    "prescription",
    "recommendations",
    "actions",
    "conclusion",
    "appointmentTime",
    "appointmentDate",
    "patientCardNumber",
    "doctorID"
})
@XmlRootElement(name = "appointmentResult")
public class AppointmentResult {

    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected String anamnesis;
    @XmlElement(required = true)
    protected String objectively;
    @XmlElement(required = true)
    protected BigDecimal radiationDose;
    @XmlElement(required = true)
    protected String diagnosis;
    @XmlElement(required = true)
    protected String prescription;
    @XmlElement(required = true)
    protected String recommendations;
    @XmlElement(required = true)
    protected String actions;
    @XmlElement(required = true)
    protected String conclusion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar appointmentTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appointmentDate;
    protected int patientCardNumber;
    protected int doctorID;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "appointmentId")
    protected Integer appointmentId;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the anamnesis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnamnesis() {
        return anamnesis;
    }

    /**
     * Sets the value of the anamnesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnamnesis(String value) {
        this.anamnesis = value;
    }

    /**
     * Gets the value of the objectively property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectively() {
        return objectively;
    }

    /**
     * Sets the value of the objectively property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectively(String value) {
        this.objectively = value;
    }

    /**
     * Gets the value of the radiationDose property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRadiationDose() {
        return radiationDose;
    }

    /**
     * Sets the value of the radiationDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRadiationDose(BigDecimal value) {
        this.radiationDose = value;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosis(String value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the prescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescription() {
        return prescription;
    }

    /**
     * Sets the value of the prescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescription(String value) {
        this.prescription = value;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendations(String value) {
        this.recommendations = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActions(String value) {
        this.actions = value;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConclusion(String value) {
        this.conclusion = value;
    }

    /**
     * Gets the value of the appointmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * Sets the value of the appointmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentTime(XMLGregorianCalendar value) {
        this.appointmentTime = value;
    }

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDate(XMLGregorianCalendar value) {
        this.appointmentDate = value;
    }

    /**
     * Gets the value of the patientCardNumber property.
     * 
     */
    public int getPatientCardNumber() {
        return patientCardNumber;
    }

    /**
     * Sets the value of the patientCardNumber property.
     * 
     */
    public void setPatientCardNumber(int value) {
        this.patientCardNumber = value;
    }

    /**
     * Gets the value of the doctorID property.
     * 
     */
    public int getDoctorID() {
        return doctorID;
    }

    /**
     * Sets the value of the doctorID property.
     * 
     */
    public void setDoctorID(int value) {
        this.doctorID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the appointmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentId() {
        return appointmentId;
    }

    /**
     * Sets the value of the appointmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentId(Integer value) {
        this.appointmentId = value;
    }

}
