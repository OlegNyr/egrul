
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
 *         &lt;element name="ВидЗаяв">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодСЗОЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимСЗОЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="500"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                 &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвУпрОрг" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                 &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвФЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвФИОИНН">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Фамилия">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="60"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Имя">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="60"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Отчество">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="60"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвРожд" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="МестоРожд" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ПрДатаРожд">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                                 &lt;enumeration value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="УдЛичнФЛ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="КодВидДок" use="required" type="{}СПДУЛТип" />
 *                           &lt;attribute name="НаимДок" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="100"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="СерНомДок" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="50"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="ВыдДок">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="КодВыдДок">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="7"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="АдресМЖРФ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Регион" type="{}РегионТип"/>
 *                             &lt;element name="Район" type="{}РайонТип" minOccurs="0"/>
 *                             &lt;element name="Город" type="{}ГородТип" minOccurs="0"/>
 *                             &lt;element name="НаселПункт" type="{}НаселПунктТип" minOccurs="0"/>
 *                             &lt;element name="Улица" type="{}УлицаТип" minOccurs="0"/>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Индекс">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="6"/>
 *                                 &lt;pattern value="[0-9]{6}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="КодРегион" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{}CCРФТип">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="КодАдрКладр">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="11"/>
 *                                 &lt;maxLength value="19"/>
 *                                 &lt;pattern value="[0-9]{11}"/>
 *                                 &lt;pattern value="[0-9]{15}"/>
 *                                 &lt;pattern value="[0-9]{19}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Дом">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="50"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Корпус">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="50"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Кварт">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="50"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="АдрМЖИн" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ОКСМ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{}ОКСМТип">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСтран" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="250"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="АдрИн">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
    "vidZayvitel",
    "\u0441\u0432\u042e\u041b",
    "\u0441\u0432\u0423\u043f\u0440\u041e\u0440\u0433",
    "\u0441\u0432\u0424\u041b"
})
public class DocVidInfoZayvitelType {

    @XmlElement(name = "\u0412\u0438\u0434\u0417\u0430\u044f\u0432", required = true)
    protected DocVidZayvitelType vidZayvitel;
    @XmlElement(name = "\u0421\u0432\u042e\u041b")
    protected DocInfoULReorgType свЮЛ;
    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u041e\u0440\u0433")
    protected DocInfoUpravlOrganType свУпрОрг;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected DocInfoFLReorganType свФЛ;

    /**
     * Gets the value of the vidZayvitel property.
     * 
     * @return
     *     possible object is
     *     {@link DocVidZayvitelType }
     *     
     */
    public DocVidZayvitelType getVidZayvitel() {
        return vidZayvitel;
    }

    /**
     * Sets the value of the vidZayvitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocVidZayvitelType }
     *     
     */
    public void setVidZayvitel(DocVidZayvitelType value) {
        this.vidZayvitel = value;
    }

    /**
     * Gets the value of the свЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoULReorgType }
     *     
     */
    public DocInfoULReorgType getСвЮЛ() {
        return свЮЛ;
    }

    /**
     * Sets the value of the свЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoULReorgType }
     *     
     */
    public void setСвЮЛ(DocInfoULReorgType value) {
        this.свЮЛ = value;
    }

    /**
     * Gets the value of the свУпрОрг property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoUpravlOrganType }
     *     
     */
    public DocInfoUpravlOrganType getСвУпрОрг() {
        return свУпрОрг;
    }

    /**
     * Sets the value of the свУпрОрг property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoUpravlOrganType }
     *     
     */
    public void setСвУпрОрг(DocInfoUpravlOrganType value) {
        this.свУпрОрг = value;
    }

    /**
     * Gets the value of the свФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoFLReorganType }
     *     
     */
    public DocInfoFLReorganType getСвФЛ() {
        return свФЛ;
    }

    /**
     * Sets the value of the свФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoFLReorganType }
     *     
     */
    public void setСвФЛ(DocInfoFLReorganType value) {
        this.свФЛ = value;
    }

}
