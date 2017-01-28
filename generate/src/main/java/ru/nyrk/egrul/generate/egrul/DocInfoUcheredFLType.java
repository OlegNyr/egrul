
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
 *         &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвДовУпрЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="НаимИННДовУпр" type="{}СвЮЛЕГРЮЛТип"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвДовУпрФЛ" minOccurs="0">
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ЛицоУпрНасл" minOccurs="0">
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
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаОткрНасл" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
    "\u0441\u0432\u0420\u043e\u0436\u0434\u0424\u041b",
    "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
    "\u0430\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424",
    "\u0430\u0434\u0440\u041c\u0416\u0418\u043d",
    "\u0434\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f",
    "\u0441\u0432\u041e\u0431\u0440\u0435\u043c",
    "\u0441\u0432\u0414\u043e\u0432\u0423\u043f\u0440\u042e\u041b",
    "\u0441\u0432\u0414\u043e\u0432\u0423\u043f\u0440\u0424\u041b",
    "docInfoLicoUprNasl"
})
public class DocInfoUcheredFLType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected InfoFLEGRULType свФЛ;
    @XmlElement(name = "\u0421\u0432\u0420\u043e\u0436\u0434\u0424\u041b")
    protected InfoBirthEGRULType свРождФЛ;
    @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b")
    protected InfoLichEGRULType удЛичнФЛ;
    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424")
    protected AddressRFEGRULType адресМЖРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
    protected AddrrInEGRULType адрМЖИн;
    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f")
    protected ShareCapitalEGRULType доляУстКап;
    @XmlElement(name = "\u0421\u0432\u041e\u0431\u0440\u0435\u043c")
    protected List<InfoObremType> свОбрем;
    @XmlElement(name = "\u0421\u0432\u0414\u043e\u0432\u0423\u043f\u0440\u042e\u041b")
    protected DocInfoDoveritUprULType свДовУпрЮЛ;
    @XmlElement(name = "\u0421\u0432\u0414\u043e\u0432\u0423\u043f\u0440\u0424\u041b")
    protected DocInfoDoveritFLType свДовУпрФЛ;
    @XmlElement(name = "\u041b\u0438\u0446\u043e\u0423\u043f\u0440\u041d\u0430\u0441\u043b")
    protected DocInfoLicoUprNaslType docInfoLicoUprNasl;

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
     * Gets the value of the доляУстКап property.
     * 
     * @return
     *     possible object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public ShareCapitalEGRULType getДоляУстКап() {
        return доляУстКап;
    }

    /**
     * Sets the value of the доляУстКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public void setДоляУстКап(ShareCapitalEGRULType value) {
        this.доляУстКап = value;
    }

    /**
     * Gets the value of the свОбрем property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свОбрем property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвОбрем().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoObremType }
     * 
     * 
     */
    public List<InfoObremType> getСвОбрем() {
        if (свОбрем == null) {
            свОбрем = new ArrayList<InfoObremType>();
        }
        return this.свОбрем;
    }

    /**
     * Gets the value of the свДовУпрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoDoveritUprULType }
     *     
     */
    public DocInfoDoveritUprULType getСвДовУпрЮЛ() {
        return свДовУпрЮЛ;
    }

    /**
     * Sets the value of the свДовУпрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoDoveritUprULType }
     *     
     */
    public void setСвДовУпрЮЛ(DocInfoDoveritUprULType value) {
        this.свДовУпрЮЛ = value;
    }

    /**
     * Gets the value of the свДовУпрФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoDoveritFLType }
     *     
     */
    public DocInfoDoveritFLType getСвДовУпрФЛ() {
        return свДовУпрФЛ;
    }

    /**
     * Sets the value of the свДовУпрФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoDoveritFLType }
     *     
     */
    public void setСвДовУпрФЛ(DocInfoDoveritFLType value) {
        this.свДовУпрФЛ = value;
    }

    /**
     * Gets the value of the docInfoLicoUprNasl property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoLicoUprNaslType }
     *     
     */
    public DocInfoLicoUprNaslType getDocInfoLicoUprNasl() {
        return docInfoLicoUprNasl;
    }

    /**
     * Sets the value of the docInfoLicoUprNasl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoLicoUprNaslType }
     *     
     */
    public void setDocInfoLicoUprNasl(DocInfoLicoUprNaslType value) {
        this.docInfoLicoUprNasl = value;
    }

}
