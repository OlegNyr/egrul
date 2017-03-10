
package ru.nyrk.generate.egrul;

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
 *         &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *         &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвПредЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="НаимПредЮЛ" use="required">
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
 *         &lt;element name="СвАдрРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *         &lt;element name="ПредИнЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                   &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *                   &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
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
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432",
    "\u043d\u0430\u0438\u043c\u0418\u041d\u041d\u042e\u041b",
    "\u0441\u0432\u0420\u0435\u0433\u0418\u043d",
    "\u0441\u0432\u041f\u0440\u0435\u0434\u042e\u041b",
    "\u0441\u0432\u0410\u0434\u0440\u0420\u0424",
    "\u0441\u0432\u041d\u043e\u043c\u0422\u0435\u043b",
    "predInostrUL"
})
public class DocInfoUprOrganType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0418\u041d\u041d\u042e\u041b", required = true)
    protected InfoULEGRULType наимИННЮЛ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u043d")
    protected InfoRegInstrEGRULULType свРегИн;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u0434\u042e\u041b")
    protected DocInfoPredstavitelULType свПредЮЛ;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0420\u0424")
    protected AddressRFEGRULType свАдрРФ;
    @XmlElement(name = "\u0421\u0432\u041d\u043e\u043c\u0422\u0435\u043b")
    protected PhoneContactType свНомТел;
    @XmlElement(name = "\u041f\u0440\u0435\u0434\u0418\u043d\u042e\u041b")
    protected DocPredInostrUL predInostrUL;

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
     * Gets the value of the наимИННЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link InfoULEGRULType }
     *     
     */
    public InfoULEGRULType getНаимИННЮЛ() {
        return наимИННЮЛ;
    }

    /**
     * Sets the value of the наимИННЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoULEGRULType }
     *     
     */
    public void setНаимИННЮЛ(InfoULEGRULType value) {
        this.наимИННЮЛ = value;
    }

    /**
     * Gets the value of the свРегИн property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRegInstrEGRULULType }
     *     
     */
    public InfoRegInstrEGRULULType getСвРегИн() {
        return свРегИн;
    }

    /**
     * Sets the value of the свРегИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRegInstrEGRULULType }
     *     
     */
    public void setСвРегИн(InfoRegInstrEGRULULType value) {
        this.свРегИн = value;
    }

    /**
     * Gets the value of the свПредЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoPredstavitelULType }
     *     
     */
    public DocInfoPredstavitelULType getСвПредЮЛ() {
        return свПредЮЛ;
    }

    /**
     * Sets the value of the свПредЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoPredstavitelULType }
     *     
     */
    public void setСвПредЮЛ(DocInfoPredstavitelULType value) {
        this.свПредЮЛ = value;
    }

    /**
     * Gets the value of the свАдрРФ property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public AddressRFEGRULType getСвАдрРФ() {
        return свАдрРФ;
    }

    /**
     * Sets the value of the свАдрРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public void setСвАдрРФ(AddressRFEGRULType value) {
        this.свАдрРФ = value;
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
     * Gets the value of the predInostrUL property.
     * 
     * @return
     *     possible object is
     *     {@link DocPredInostrUL }
     *     
     */
    public DocPredInostrUL getPredInostrUL() {
        return predInostrUL;
    }

    /**
     * Sets the value of the predInostrUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPredInostrUL }
     *     
     */
    public void setPredInostrUL(DocPredInostrUL value) {
        this.predInostrUL = value;
    }

}
