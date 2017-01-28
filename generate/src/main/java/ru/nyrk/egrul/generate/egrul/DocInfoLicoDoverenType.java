
package ru.nyrk.egrul.generate.egrul;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="СвДолжн">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОГРНИП" type="{}ОГРНИПТип" />
 *                 &lt;attribute name="ВидДолжн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимВидДолжн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="5"/>
 *                       &lt;maxLength value="100"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимДолжн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="255"/>
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *         &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвДискв" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ДатаОкончДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ДатаРеш" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "\u0441\u0432\u0414\u043e\u043b\u0436\u043d",
    "\u0441\u0432\u041d\u043e\u043c\u0422\u0435\u043b",
    "\u0441\u0432\u0420\u043e\u0436\u0434\u0424\u041b",
    "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
    "\u0430\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424",
    "\u0430\u0434\u0440\u041c\u0416\u0418\u043d",
    "\u0441\u0432\u0414\u0438\u0441\u043a\u0432"
})
public class DocInfoLicoDoverenType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected InfoFLEGRULType свФЛ;
    @XmlElement(name = "\u0421\u0432\u0414\u043e\u043b\u0436\u043d", required = true)
    protected DocInfoDolgnostFL свДолжн;
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
    @XmlElement(name = "\u0421\u0432\u0414\u0438\u0441\u043a\u0432")
    protected List<DocInfoDelete> свДискв;

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
     * Gets the value of the свДолжн property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoDolgnostFL }
     *     
     */
    public DocInfoDolgnostFL getСвДолжн() {
        return свДолжн;
    }

    /**
     * Sets the value of the свДолжн property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoDolgnostFL }
     *     
     */
    public void setСвДолжн(DocInfoDolgnostFL value) {
        this.свДолжн = value;
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

    /**
     * Gets the value of the свДискв property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свДискв property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвДискв().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoDelete }
     * 
     * 
     */
    public List<DocInfoDelete> getСвДискв() {
        if (свДискв == null) {
            свДискв = new ArrayList<DocInfoDelete>();
        }
        return this.свДискв;
    }

}
