
package ua.nure.it.clinic.server.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ua.nure.it.clinic.appointmentresult.AppointmentResult;


/**
 * <p>Java class for addAppointmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAppointmentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://it.nure.ua/clinic/appointmentResult}appointmentResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAppointmentResult", propOrder = {
    "appointmentResult"
})
public class AddAppointmentResult {

    @XmlElement(namespace = "http://it.nure.ua/clinic/appointmentResult")
    protected AppointmentResult appointmentResult;

    /**
     * Gets the value of the appointmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentResult }
     *     
     */
    public AppointmentResult getAppointmentResult() {
        return appointmentResult;
    }

    /**
     * Sets the value of the appointmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentResult }
     *     
     */
    public void setAppointmentResult(AppointmentResult value) {
        this.appointmentResult = value;
    }

}
