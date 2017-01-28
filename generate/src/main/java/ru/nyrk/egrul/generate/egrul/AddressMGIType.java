
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
@XmlType(name = "", propOrder = {
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440"
})
public class AddressMGIType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u041e\u041a\u0421\u041c", required = true)
    protected OKSMType оксм;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d", required = true)
    protected String наимСтран;
    @XmlAttribute(name = "\u0410\u0434\u0440\u0418\u043d")
    protected String адрИн;

    /**
     * Gets the value of the грнДатаИспр property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДатаИспр() {
        return грнДатаИспр;
    }

    /**
     * Sets the value of the грнДатаИспр property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДатаИспр(GRNDateType value) {
        this.грнДатаИспр = value;
    }

    /**
     * Gets the value of the оксм property.
     * 
     * @return
     *     possible object is
     *     {@link OKSMType }
     *     
     */
    public OKSMType getОКСМ() {
        return оксм;
    }

    /**
     * Sets the value of the оксм property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKSMType }
     *     
     */
    public void setОКСМ(OKSMType value) {
        this.оксм = value;
    }

    /**
     * Gets the value of the наимСтран property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимСтран() {
        return наимСтран;
    }

    /**
     * Sets the value of the наимСтран property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимСтран(String value) {
        this.наимСтран = value;
    }

    /**
     * Gets the value of the адрИн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getАдрИн() {
        return адрИн;
    }

    /**
     * Sets the value of the адрИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setАдрИн(String value) {
        this.адрИн = value;
    }

}
