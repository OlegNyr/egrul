
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
 *         &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *         &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
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
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432",
    "\u0441\u0432\u0424\u041b",
    "\u0441\u0432\u041d\u043e\u043c\u0422\u0435\u043b",
    "\u0441\u0432\u0420\u043e\u0436\u0434\u0424\u041b",
    "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
    "\u0430\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424",
    "\u0430\u0434\u0440\u041c\u0416\u0418\u043d"
})
public class ПредИнЮЛ {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected InfoFLEGRULType свФЛ;
    @XmlElement(name = "\u0421\u0432\u041d\u043e\u043c\u0422\u0435\u043b")
    protected PhoneContactType свНомТел;
    @XmlElement(name = "\u0421\u0432\u0420\u043e\u0436\u0434\u0424\u041b")
    protected InfoBirthEGRULType свРождФЛ;
    @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b")
    protected InfoLichEGRULType удЛичнФЛ;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424")
    protected AddressRFEGRULType адресМЖРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
    protected AddrrInEGRULType адрМЖИн;

    /**
     * Gets the value of the грнДатаПерв property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДатаПерв() {
        return грнДатаПерв;
    }

    /**
     * Sets the value of the грнДатаПерв property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДатаПерв(GRNDateType value) {
        this.грнДатаПерв = value;
    }

    /**
     * Gets the value of the свФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public InfoFLEGRULType getСвФЛ() {
        return свФЛ;
    }

    /**
     * Sets the value of the свФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public void setСвФЛ(InfoFLEGRULType value) {
        this.свФЛ = value;
    }

    /**
     * Gets the value of the свНомТел property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneContactType }
     *     
     */
    public PhoneContactType getСвНомТел() {
        return свНомТел;
    }

    /**
     * Sets the value of the свНомТел property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneContactType }
     *     
     */
    public void setСвНомТел(PhoneContactType value) {
        this.свНомТел = value;
    }

    /**
     * Gets the value of the свРождФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link InfoBirthEGRULType }
     *     
     */
    public InfoBirthEGRULType getСвРождФЛ() {
        return свРождФЛ;
    }

    /**
     * Sets the value of the свРождФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoBirthEGRULType }
     *     
     */
    public void setСвРождФЛ(InfoBirthEGRULType value) {
        this.свРождФЛ = value;
    }

    /**
     * Gets the value of the удЛичнФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link InfoLichEGRULType }
     *     
     */
    public InfoLichEGRULType getУдЛичнФЛ() {
        return удЛичнФЛ;
    }

    /**
     * Sets the value of the удЛичнФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLichEGRULType }
     *     
     */
    public void setУдЛичнФЛ(InfoLichEGRULType value) {
        this.удЛичнФЛ = value;
    }

    /**
     * Gets the value of the адресМЖРФ property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public AddressRFEGRULType getАдресМЖРФ() {
        return адресМЖРФ;
    }

    /**
     * Sets the value of the адресМЖРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public void setАдресМЖРФ(AddressRFEGRULType value) {
        this.адресМЖРФ = value;
    }

    /**
     * Gets the value of the адрМЖИн property.
     * 
     * @return
     *     possible object is
     *     {@link AddrrInEGRULType }
     *     
     */
    public AddrrInEGRULType getАдрМЖИн() {
        return адрМЖИн;
    }

    /**
     * Sets the value of the адрМЖИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrrInEGRULType }
     *     
     */
    public void setАдрМЖИн(AddrrInEGRULType value) {
        this.адрМЖИн = value;
    }

}
