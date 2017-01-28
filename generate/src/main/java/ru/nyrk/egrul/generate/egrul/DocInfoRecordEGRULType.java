
package ru.nyrk.egrul.generate.egrul;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="ВидЗап" type="{}ВидЗапТип"/>
 *         &lt;element name="СвРегОрг" type="{}СвРегОргТип"/>
 *         &lt;element name="СвЗаявФЛ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ВидЗаяв">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСЗОЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСЗОЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="500"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвЮЛ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                           &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                           &lt;attribute name="НаимЮЛПолн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвУпрОрг" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                           &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                           &lt;attribute name="НаимЮЛПолн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвФЛ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="СвФИОИНН">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Фамилия">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="60"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Имя">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="60"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Отчество">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="60"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвРожд" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="МестоРожд" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ПрДатаРожд">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="1"/>
 *                                           &lt;enumeration value="2"/>
 *                                           &lt;enumeration value="3"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="УдЛичнФЛ" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="КодВидДок" use="required" type="{}СПДУЛТип" />
 *                                     &lt;attribute name="НаимДок" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="100"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="СерНомДок" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="50"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="ВыдДок">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="КодВыдДок">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="7"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="АдресМЖРФ" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Регион" type="{}РегионТип"/>
 *                                       &lt;element name="Район" type="{}РайонТип" minOccurs="0"/>
 *                                       &lt;element name="Город" type="{}ГородТип" minOccurs="0"/>
 *                                       &lt;element name="НаселПункт" type="{}НаселПунктТип" minOccurs="0"/>
 *                                       &lt;element name="Улица" type="{}УлицаТип" minOccurs="0"/>
 *                                       &lt;element name="ГРНДата" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Индекс">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="6"/>
 *                                           &lt;pattern value="[0-9]{6}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="КодРегион" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{}CCРФТип">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="КодАдрКладр">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="11"/>
 *                                           &lt;maxLength value="19"/>
 *                                           &lt;pattern value="[0-9]{11}"/>
 *                                           &lt;pattern value="[0-9]{15}"/>
 *                                           &lt;pattern value="[0-9]{19}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Дом">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="50"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Корпус">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="50"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Кварт">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="50"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="АдрМЖИн" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ОКСМ" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{}ОКСМТип">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="НаимСтран" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="250"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="АдрИн">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СведПредДок" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="НаимДок">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="НомДок" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ДатаДок" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                         &lt;minInclusive value="1900-01-01"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвСвид" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаСвидНед" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Серия" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Номер" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="7"/>
 *                       &lt;maxLength value="9"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаВыдСвид" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ГРНДатаИспрПред" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *         &lt;element name="ГРНДатаНедПред" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *         &lt;element name="СвСтатусЗап" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаНед" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ИдГРНДатаТип" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдЗап" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="19"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ГРН" type="{}ОГРНТип" />
 *       &lt;attribute name="ДатаЗап" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0432\u0438\u0434\u0417\u0430\u043f",
    "\u0441\u0432\u0420\u0435\u0433\u041e\u0440\u0433",
    "infoZayvitelFL",
    "\u0441\u0432\u0435\u0434\u041f\u0440\u0435\u0434\u0414\u043e\u043a",
    "\u0441\u0432\u0421\u0432\u0438\u0434",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440\u041f\u0440\u0435\u0434",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u041d\u0435\u0434\u041f\u0440\u0435\u0434",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0417\u0430\u043f"
})
public class DocInfoRecordEGRULType {

    @XmlElement(name = "\u0412\u0438\u0434\u0417\u0430\u043f", required = true)
    protected VidRecord видЗап;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433", required = true)
    protected InfoRegOrganType свРегОрг;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u044f\u0432\u0424\u041b")
    protected List<DocVidInfoZayvitelType> infoZayvitelFL;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u041f\u0440\u0435\u0434\u0414\u043e\u043a")
    protected List<DocInfoPredDocType> сведПредДок;
    @XmlElement(name = "\u0421\u0432\u0421\u0432\u0438\u0434")
    protected List<DocInfoSvidetelType> свСвид;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440\u041f\u0440\u0435\u0434")
    protected IdGRNDateType грнДатаИспрПред;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041d\u0435\u0434\u041f\u0440\u0435\u0434")
    protected IdGRNDateType грнДатаНедПред;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0417\u0430\u043f")
    protected DocInfoStatusRecordType свСтатусЗап;
    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f", required = true)
    protected BigInteger идЗап;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаЗап;

    /**
     * Gets the value of the видЗап property.
     * 
     * @return
     *     possible object is
     *     {@link VidRecord }
     *     
     */
    public VidRecord getВидЗап() {
        return видЗап;
    }

    /**
     * Sets the value of the видЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link VidRecord }
     *     
     */
    public void setВидЗап(VidRecord value) {
        this.видЗап = value;
    }

    /**
     * Gets the value of the свРегОрг property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRegOrganType }
     *     
     */
    public InfoRegOrganType getСвРегОрг() {
        return свРегОрг;
    }

    /**
     * Sets the value of the свРегОрг property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRegOrganType }
     *     
     */
    public void setСвРегОрг(InfoRegOrganType value) {
        this.свРегОрг = value;
    }

    /**
     * Gets the value of the infoZayvitelFL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoZayvitelFL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoZayvitelFL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocVidInfoZayvitelType }
     * 
     * 
     */
    public List<DocVidInfoZayvitelType> getInfoZayvitelFL() {
        if (infoZayvitelFL == null) {
            infoZayvitelFL = new ArrayList<DocVidInfoZayvitelType>();
        }
        return this.infoZayvitelFL;
    }

    /**
     * Gets the value of the сведПредДок property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the сведПредДок property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСведПредДок().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoPredDocType }
     * 
     * 
     */
    public List<DocInfoPredDocType> getСведПредДок() {
        if (сведПредДок == null) {
            сведПредДок = new ArrayList<DocInfoPredDocType>();
        }
        return this.сведПредДок;
    }

    /**
     * Gets the value of the свСвид property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свСвид property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвСвид().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoSvidetelType }
     * 
     * 
     */
    public List<DocInfoSvidetelType> getСвСвид() {
        if (свСвид == null) {
            свСвид = new ArrayList<DocInfoSvidetelType>();
        }
        return this.свСвид;
    }

    /**
     * Gets the value of the грнДатаИспрПред property.
     * 
     * @return
     *     possible object is
     *     {@link IdGRNDateType }
     *     
     */
    public IdGRNDateType getГРНДатаИспрПред() {
        return грнДатаИспрПред;
    }

    /**
     * Sets the value of the грнДатаИспрПред property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdGRNDateType }
     *     
     */
    public void setГРНДатаИспрПред(IdGRNDateType value) {
        this.грнДатаИспрПред = value;
    }

    /**
     * Gets the value of the грнДатаНедПред property.
     * 
     * @return
     *     possible object is
     *     {@link IdGRNDateType }
     *     
     */
    public IdGRNDateType getГРНДатаНедПред() {
        return грнДатаНедПред;
    }

    /**
     * Sets the value of the грнДатаНедПред property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdGRNDateType }
     *     
     */
    public void setГРНДатаНедПред(IdGRNDateType value) {
        this.грнДатаНедПред = value;
    }

    /**
     * Gets the value of the свСтатусЗап property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoStatusRecordType }
     *     
     */
    public DocInfoStatusRecordType getСвСтатусЗап() {
        return свСтатусЗап;
    }

    /**
     * Sets the value of the свСтатусЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoStatusRecordType }
     *     
     */
    public void setСвСтатусЗап(DocInfoStatusRecordType value) {
        this.свСтатусЗап = value;
    }

    /**
     * Gets the value of the идЗап property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getИдЗап() {
        return идЗап;
    }

    /**
     * Sets the value of the идЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setИдЗап(BigInteger value) {
        this.идЗап = value;
    }

    /**
     * Gets the value of the грн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getГРН() {
        return грн;
    }

    /**
     * Sets the value of the грн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setГРН(String value) {
        this.грн = value;
    }

    /**
     * Gets the value of the датаЗап property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаЗап() {
        return датаЗап;
    }

    /**
     * Sets the value of the датаЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаЗап(Date value) {
        this.датаЗап = value;
    }

}
