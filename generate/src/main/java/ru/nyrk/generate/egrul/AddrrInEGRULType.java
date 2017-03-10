
package ru.nyrk.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об адресе за пределами территории РФ, внесенные в ЕГРЮЛ
 * 
 * <p>Java class for АдрИнЕГРЮЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдрИнЕГРЮЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОКСМ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{}ОКСМТип">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимСтран" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="АдрИн">
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
@XmlType(name = "\u0410\u0434\u0440\u0418\u043d\u0415\u0413\u0420\u042e\u041b\u0422\u0438\u043f", propOrder = {
    "grnDate",
    "grnDateIsp"
})
public class AddrrInEGRULType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateIsp;
    @XmlAttribute(name = "\u041e\u041a\u0421\u041c", required = true)
    protected OKSMType oksm;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d", required = true)
    protected String nameCountry;
    @XmlAttribute(name = "\u0410\u0434\u0440\u0418\u043d")
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
     * Gets the value of the grnDateIsp property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDateIsp() {
        return grnDateIsp;
    }

    /**
     * Sets the value of the grnDateIsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDateIsp(GRNDateType value) {
        this.grnDateIsp = value;
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
     * Gets the value of the nameCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCountry() {
        return nameCountry;
    }

    /**
     * Sets the value of the nameCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCountry(String value) {
        this.nameCountry = value;
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
