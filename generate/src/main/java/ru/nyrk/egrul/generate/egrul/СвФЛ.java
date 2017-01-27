
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
 *         &lt;element name="СвФИОИНН">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Фамилия">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="60"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Имя">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="60"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Отчество">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="60"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРожд" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="МестоРожд" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ПрДатаРожд">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="УдЛичнФЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="КодВидДок" use="required" type="{}СПДУЛТип" />
 *                 &lt;attribute name="НаимДок" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="100"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="СерНомДок" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="50"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ВыдДок">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="КодВыдДок">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="7"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="АдресМЖРФ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Регион" type="{}РегионТип"/>
 *                   &lt;element name="Район" type="{}РайонТип" minOccurs="0"/>
 *                   &lt;element name="Город" type="{}ГородТип" minOccurs="0"/>
 *                   &lt;element name="НаселПункт" type="{}НаселПунктТип" minOccurs="0"/>
 *                   &lt;element name="Улица" type="{}УлицаТип" minOccurs="0"/>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Индекс">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="6"/>
 *                       &lt;pattern value="[0-9]{6}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="КодРегион" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{}CCРФТип">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="КодАдрКладр">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="11"/>
 *                       &lt;maxLength value="19"/>
 *                       &lt;pattern value="[0-9]{11}"/>
 *                       &lt;pattern value="[0-9]{15}"/>
 *                       &lt;pattern value="[0-9]{19}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Дом">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="50"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Корпус">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="50"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Кварт">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="50"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="АдрМЖИн" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОКСМ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{}ОКСМТип">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимСтран" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="250"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="АдрИн">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
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
    "\u0441\u0432\u0424\u0418\u041e\u0418\u041d\u041d",
    "\u0441\u0432\u0420\u043e\u0436\u0434",
    "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
    "addressRFEGRUL",
    "\u0430\u0434\u0440\u041c\u0416\u0418\u043d"
})
public class СвФЛ {

    @XmlElement(name = "\u0421\u0432\u0424\u0418\u041e\u0418\u041d\u041d", required = true)
    protected СвФИОИНН свФИОИНН;
    @XmlElement(name = "\u0421\u0432\u0420\u043e\u0436\u0434")
    protected СвРожд свРожд;
    @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b")
    protected УдЛичнФЛ удЛичнФЛ;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424")
    protected DOCAddressRFEGRULType addressRFEGRUL;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
    protected АдрМЖИн адрМЖИн;

    /**
     * Gets the value of the свФИОИНН property.
     * 
     * @return
     *     possible object is
     *     {@link СвФИОИНН }
     *     
     */
    public СвФИОИНН getСвФИОИНН() {
        return свФИОИНН;
    }

    /**
     * Sets the value of the свФИОИНН property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвФИОИНН }
     *     
     */
    public void setСвФИОИНН(СвФИОИНН value) {
        this.свФИОИНН = value;
    }

    /**
     * Gets the value of the свРожд property.
     * 
     * @return
     *     possible object is
     *     {@link СвРожд }
     *     
     */
    public СвРожд getСвРожд() {
        return свРожд;
    }

    /**
     * Sets the value of the свРожд property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРожд }
     *     
     */
    public void setСвРожд(СвРожд value) {
        this.свРожд = value;
    }

    /**
     * Gets the value of the удЛичнФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link УдЛичнФЛ }
     *     
     */
    public УдЛичнФЛ getУдЛичнФЛ() {
        return удЛичнФЛ;
    }

    /**
     * Sets the value of the удЛичнФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link УдЛичнФЛ }
     *     
     */
    public void setУдЛичнФЛ(УдЛичнФЛ value) {
        this.удЛичнФЛ = value;
    }

    /**
     * Gets the value of the addressRFEGRUL property.
     * 
     * @return
     *     possible object is
     *     {@link DOCAddressRFEGRULType }
     *     
     */
    public DOCAddressRFEGRULType getAddressRFEGRUL() {
        return addressRFEGRUL;
    }

    /**
     * Sets the value of the addressRFEGRUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCAddressRFEGRULType }
     *     
     */
    public void setAddressRFEGRUL(DOCAddressRFEGRULType value) {
        this.addressRFEGRUL = value;
    }

    /**
     * Gets the value of the адрМЖИн property.
     * 
     * @return
     *     possible object is
     *     {@link АдрМЖИн }
     *     
     */
    public АдрМЖИн getАдрМЖИн() {
        return адрМЖИн;
    }

    /**
     * Sets the value of the адрМЖИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдрМЖИн }
     *     
     */
    public void setАдрМЖИн(АдрМЖИн value) {
        this.адрМЖИн = value;
    }

}
