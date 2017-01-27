
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="ФИООтв" type="{}ФИОТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДолжОтв">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="100"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Тлф">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="E-mail">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="45"/>
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
    "fioOtv"
})
public class IdOtpr {

    @XmlElement(name = "\u0424\u0418\u041e\u041e\u0442\u0432", required = true)
    protected FIOType fioOtv;
    @XmlAttribute(name = "\u0414\u043e\u043b\u0436\u041e\u0442\u0432")
    protected String dolgnOtv;
    @XmlAttribute(name = "\u0422\u043b\u0444")
    protected String tlf;
    @XmlAttribute(name = "E-mail")
    protected String email;

    /**
     * Gets the value of the fioOtv property.
     * 
     * @return
     *     possible object is
     *     {@link FIOType }
     *     
     */
    public FIOType getFIOOtv() {
        return fioOtv;
    }

    /**
     * Sets the value of the fioOtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIOType }
     *     
     */
    public void setFIOOtv(FIOType value) {
        this.fioOtv = value;
    }

    /**
     * Gets the value of the dolgnOtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDolgnOtv() {
        return dolgnOtv;
    }

    /**
     * Sets the value of the dolgnOtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDolgnOtv(String value) {
        this.dolgnOtv = value;
    }

    /**
     * Gets the value of the tlf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlf() {
        return tlf;
    }

    /**
     * Sets the value of the tlf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlf(String value) {
        this.tlf = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
