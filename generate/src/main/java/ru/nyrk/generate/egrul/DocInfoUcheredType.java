
package ru.nyrk.generate.egrul;

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
 *         &lt;element name="УчрЮЛРос" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                   &lt;element name="СвРегСтарые" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="РегНом">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ДатаРег">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимРО">
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
 *                   &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="УчрЮЛИн" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                   &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="УчрФЛ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                   &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="СвДовУпрЮЛ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="НаимИННДовУпр" type="{}СвЮЛЕГРЮЛТип"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвДовУпрФЛ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                             &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ЛицоУпрНасл" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                             &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ДатаОткрНасл" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="УчрРФСубМО" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="ВидНаимУчр">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодУчрРФСубМО" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                                 &lt;enumeration value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимМО">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="КодРегион" type="{}CCРФТип" />
 *                           &lt;attribute name="НаимРегион">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="100"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвОргОсущПр" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвФЛОсущПр" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                             &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="УчрПИФ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвНаимПИФ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="НаимПИФ" use="required">
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
 *                   &lt;element name="СвУпрКомпПИФ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="УпрКомпПиф" type="{}СвЮЛЕГРЮЛТип"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
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
    "\u0443\u0447\u0440\u042e\u041b\u0420\u043e\u0441",
    "\u0443\u0447\u0440\u042e\u041b\u0418\u043d",
    "\u0443\u0447\u0440\u0424\u041b",
    "\u0443\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e",
    "\u0443\u0447\u0440\u041f\u0418\u0424"
})
public class DocInfoUcheredType {

    @XmlElement(name = "\u0423\u0447\u0440\u042e\u041b\u0420\u043e\u0441")
    protected List<DocInfoUcheredULRFType> учрЮЛРос;
    @XmlElement(name = "\u0423\u0447\u0440\u042e\u041b\u0418\u043d")
    protected List<DocInfoUcheredULInostrType> учрЮЛИн;
    @XmlElement(name = "\u0423\u0447\u0440\u0424\u041b")
    protected List<DocInfoUcheredFLType> учрФЛ;
    @XmlElement(name = "\u0423\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e")
    protected List<DocInfoRFSubMOType> учрРФСубМО;
    @XmlElement(name = "\u0423\u0447\u0440\u041f\u0418\u0424")
    protected List<DocInfoUchredPifType> учрПИФ;

    /**
     * Gets the value of the учрЮЛРос property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрЮЛРос property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрЮЛРос().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoUcheredULRFType }
     * 
     * 
     */
    public List<DocInfoUcheredULRFType> getУчрЮЛРос() {
        if (учрЮЛРос == null) {
            учрЮЛРос = new ArrayList<DocInfoUcheredULRFType>();
        }
        return this.учрЮЛРос;
    }

    /**
     * Gets the value of the учрЮЛИн property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрЮЛИн property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрЮЛИн().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoUcheredULInostrType }
     * 
     * 
     */
    public List<DocInfoUcheredULInostrType> getУчрЮЛИн() {
        if (учрЮЛИн == null) {
            учрЮЛИн = new ArrayList<DocInfoUcheredULInostrType>();
        }
        return this.учрЮЛИн;
    }

    /**
     * Gets the value of the учрФЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрФЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрФЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoUcheredFLType }
     * 
     * 
     */
    public List<DocInfoUcheredFLType> getУчрФЛ() {
        if (учрФЛ == null) {
            учрФЛ = new ArrayList<DocInfoUcheredFLType>();
        }
        return this.учрФЛ;
    }

    /**
     * Gets the value of the учрРФСубМО property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрРФСубМО property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрРФСубМО().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoRFSubMOType }
     * 
     * 
     */
    public List<DocInfoRFSubMOType> getУчрРФСубМО() {
        if (учрРФСубМО == null) {
            учрРФСубМО = new ArrayList<DocInfoRFSubMOType>();
        }
        return this.учрРФСубМО;
    }

    /**
     * Gets the value of the учрПИФ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрПИФ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрПИФ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoUchredPifType }
     * 
     * 
     */
    public List<DocInfoUchredPifType> getУчрПИФ() {
        if (учрПИФ == null) {
            учрПИФ = new ArrayList<DocInfoUchredPifType>();
        }
        return this.учрПИФ;
    }

}
