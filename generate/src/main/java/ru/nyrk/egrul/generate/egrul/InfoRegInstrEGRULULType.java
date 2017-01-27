
package ru.nyrk.egrul.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о регистрации иностранного ЮЛ в стране происхождения, внесенные в ЕГРЮЛ
 *             
 * 
 * <p>Java class for СвРегИнЮЛЕГРЮЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвРегИнЮЛЕГРЮЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОКСМ" use="required" type="{}ОКСМТип" />
 *       &lt;attribute name="НаимСтран" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="РегНомер">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимРегОрг">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="АдрСтр">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
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
@XmlType(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u043d\u042e\u041b\u0415\u0413\u0420\u042e\u041b\u0422\u0438\u043f", propOrder = {
    "grnDate",
    "grnDateChange"
})
public class InfoRegInstrEGRULULType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateChange;
    @XmlAttribute(name = "\u041e\u041a\u0421\u041c", required = true)
    protected OKSMType oksm;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d", required = true)
    protected String nameContry;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date dateReg;
    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c\u0435\u0440")
    protected String numberReg;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u0435\u0433\u041e\u0440\u0433")
    protected String nameRegOrgan;
    @XmlAttribute(name = "\u0410\u0434\u0440\u0421\u0442\u0440")
    protected String address;

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
     * Gets the value of the oksm property.
     * 
     * @return
     *     possible object is
     *     {@link OKSMType }
     *     
     */
    public OKSMType getOKSM() {
        return oksm;
    }

    /**
     * Sets the value of the oksm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKSMType }
     *     
     */
    public void setOKSM(OKSMType value) {
        this.oksm = value;
    }

    /**
     * Gets the value of the nameContry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameContry() {
        return nameContry;
    }

    /**
     * Sets the value of the nameContry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameContry(String value) {
        this.nameContry = value;
    }

    /**
     * Gets the value of the dateReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateReg() {
        return dateReg;
    }

    /**
     * Sets the value of the dateReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReg(Date value) {
        this.dateReg = value;
    }

    /**
     * Gets the value of the numberReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberReg() {
        return numberReg;
    }

    /**
     * Sets the value of the numberReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberReg(String value) {
        this.numberReg = value;
    }

    /**
     * Gets the value of the nameRegOrgan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRegOrgan() {
        return nameRegOrgan;
    }

    /**
     * Sets the value of the nameRegOrgan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRegOrgan(String value) {
        this.nameRegOrgan = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
