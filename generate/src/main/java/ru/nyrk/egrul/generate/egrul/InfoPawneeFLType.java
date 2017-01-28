
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *         &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *         &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвНотУдДогЗал" type="{}СвНотУдДогЗалТип" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "grnDateFirst",
    "infoFL",
    "infoBirthFL",
    "infoDocFl",
    "addressResidence",
    "addressNotResidence",
    "infoNotariusEdostvZalog"
})
public class InfoPawneeFLType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType grnDateFirst;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected InfoFLEGRULType infoFL;
    @XmlElement(name = "\u0421\u0432\u0420\u043e\u0436\u0434\u0424\u041b")
    protected InfoBirthEGRULType infoBirthFL;
    @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b")
    protected InfoLichEGRULType infoDocFl;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424")
    protected AddressRFEGRULType addressResidence;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
    protected AddrrInEGRULType addressNotResidence;
    @XmlElement(name = "\u0421\u0432\u041d\u043e\u0442\u0423\u0434\u0414\u043e\u0433\u0417\u0430\u043b")
    protected InfoNotarialDogZalog infoNotariusEdostvZalog;

    /**
     * Gets the value of the grnDateFirst property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDateFirst() {
        return grnDateFirst;
    }

    /**
     * Sets the value of the grnDateFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDateFirst(GRNDateType value) {
        this.grnDateFirst = value;
    }

    /**
     * Gets the value of the infoFL property.
     * 
     * @return
     *     possible object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public InfoFLEGRULType getInfoFL() {
        return infoFL;
    }

    /**
     * Sets the value of the infoFL property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public void setInfoFL(InfoFLEGRULType value) {
        this.infoFL = value;
    }

    /**
     * Gets the value of the infoBirthFL property.
     * 
     * @return
     *     possible object is
     *     {@link InfoBirthEGRULType }
     *     
     */
    public InfoBirthEGRULType getInfoBirthFL() {
        return infoBirthFL;
    }

    /**
     * Sets the value of the infoBirthFL property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoBirthEGRULType }
     *     
     */
    public void setInfoBirthFL(InfoBirthEGRULType value) {
        this.infoBirthFL = value;
    }

    /**
     * Gets the value of the infoDocFl property.
     * 
     * @return
     *     possible object is
     *     {@link InfoLichEGRULType }
     *     
     */
    public InfoLichEGRULType getInfoDocFl() {
        return infoDocFl;
    }

    /**
     * Sets the value of the infoDocFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLichEGRULType }
     *     
     */
    public void setInfoDocFl(InfoLichEGRULType value) {
        this.infoDocFl = value;
    }

    /**
     * Gets the value of the addressResidence property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public AddressRFEGRULType getAddressResidence() {
        return addressResidence;
    }

    /**
     * Sets the value of the addressResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public void setAddressResidence(AddressRFEGRULType value) {
        this.addressResidence = value;
    }

    /**
     * Gets the value of the addressNotResidence property.
     * 
     * @return
     *     possible object is
     *     {@link AddrrInEGRULType }
     *     
     */
    public AddrrInEGRULType getAddressNotResidence() {
        return addressNotResidence;
    }

    /**
     * Sets the value of the addressNotResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrrInEGRULType }
     *     
     */
    public void setAddressNotResidence(AddrrInEGRULType value) {
        this.addressNotResidence = value;
    }

    /**
     * Gets the value of the infoNotariusEdostvZalog property.
     * 
     * @return
     *     possible object is
     *     {@link InfoNotarialDogZalog }
     *     
     */
    public InfoNotarialDogZalog getInfoNotariusEdostvZalog() {
        return infoNotariusEdostvZalog;
    }

    /**
     * Sets the value of the infoNotariusEdostvZalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoNotarialDogZalog }
     *     
     */
    public void setInfoNotariusEdostvZalog(InfoNotarialDogZalog value) {
        this.infoNotariusEdostvZalog = value;
    }

}
