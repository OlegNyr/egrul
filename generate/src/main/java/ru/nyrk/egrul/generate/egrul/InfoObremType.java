
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об обременении доли участника, внесенные в ЕГРЮЛ
 * 
 * <p>Java class for СвОбремТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвОбремТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="РешСуд" type="{}РешСудТип" minOccurs="0"/>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *         &lt;element name="СвЗалогДержФЛ" minOccurs="0">
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
 *                   &lt;element name="СвНотУдДогЗал" type="{}СвНотУдДогЗалТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвЗалогДержЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                   &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвНотУдДогЗал" type="{}СвНотУдДогЗалТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ВидОбрем" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *             &lt;maxLength value="16"/>
 *             &lt;enumeration value="ЗАЛОГ"/>
 *             &lt;enumeration value="ИНОЕ ОБРЕМЕНЕНИЕ"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="СрокОбременения">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5000"/>
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
@XmlType(name = "\u0421\u0432\u041e\u0431\u0440\u0435\u043c\u0422\u0438\u043f", propOrder = {
    "courtDecision",
    "grnDate",
    "grnDateChange",
    "infoPawneeFL",
    "infoPawneeUL"
})
public class InfoObremType {

    @XmlElement(name = "\u0420\u0435\u0448\u0421\u0443\u0434")
    protected CourtDecisionType courtDecision;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateChange;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043b\u043e\u0433\u0414\u0435\u0440\u0436\u0424\u041b")
    protected InfoPawneeFLType infoPawneeFL;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043b\u043e\u0433\u0414\u0435\u0440\u0436\u042e\u041b")
    protected GRNDateChange infoPawneeUL;
    @XmlAttribute(name = "\u0412\u0438\u0434\u041e\u0431\u0440\u0435\u043c", required = true)
    protected String vidObremen;
    @XmlAttribute(name = "\u0421\u0440\u043e\u043a\u041e\u0431\u0440\u0435\u043c\u0435\u043d\u0435\u043d\u0438\u044f")
    protected String srokObremen;

    /**
     * Gets the value of the courtDecision property.
     * 
     * @return
     *     possible object is
     *     {@link CourtDecisionType }
     *     
     */
    public CourtDecisionType getCourtDecision() {
        return courtDecision;
    }

    /**
     * Sets the value of the courtDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtDecisionType }
     *     
     */
    public void setCourtDecision(CourtDecisionType value) {
        this.courtDecision = value;
    }

    /**
     * Gets the value of the grnDate property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDate() {
        return grnDate;
    }

    /**
     * Sets the value of the grnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDate(GRNDateType value) {
        this.grnDate = value;
    }

    /**
     * Gets the value of the grnDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDateChange() {
        return grnDateChange;
    }

    /**
     * Sets the value of the grnDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDateChange(GRNDateType value) {
        this.grnDateChange = value;
    }

    /**
     * Gets the value of the infoPawneeFL property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPawneeFLType }
     *     
     */
    public InfoPawneeFLType getInfoPawneeFL() {
        return infoPawneeFL;
    }

    /**
     * Sets the value of the infoPawneeFL property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPawneeFLType }
     *     
     */
    public void setInfoPawneeFL(InfoPawneeFLType value) {
        this.infoPawneeFL = value;
    }

    /**
     * Gets the value of the infoPawneeUL property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateChange }
     *     
     */
    public GRNDateChange getInfoPawneeUL() {
        return infoPawneeUL;
    }

    /**
     * Sets the value of the infoPawneeUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateChange }
     *     
     */
    public void setInfoPawneeUL(GRNDateChange value) {
        this.infoPawneeUL = value;
    }

    /**
     * Gets the value of the vidObremen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVidObremen() {
        return vidObremen;
    }

    /**
     * Sets the value of the vidObremen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVidObremen(String value) {
        this.vidObremen = value;
    }

    /**
     * Gets the value of the srokObremen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrokObremen() {
        return srokObremen;
    }

    /**
     * Sets the value of the srokObremen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrokObremen(String value) {
        this.srokObremen = value;
    }

}
