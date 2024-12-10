
package ua.nure.it.clinic.server.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ua.nure.it.clinic.medicalcard.MedicalCard;


/**
 * <p>Java class for addMedicalCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMedicalCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://it.nure.ua/clinic/medicalCard}medicalCard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMedicalCard", propOrder = {
    "medicalCard"
})
public class AddMedicalCard {

    @XmlElement(namespace = "http://it.nure.ua/clinic/medicalCard")
    protected MedicalCard medicalCard;

    /**
     * Gets the value of the medicalCard property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalCard }
     *     
     */
    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    /**
     * Sets the value of the medicalCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalCard }
     *     
     */
    public void setMedicalCard(MedicalCard value) {
        this.medicalCard = value;
    }

}
