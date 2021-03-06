
package ru.nyrk.generate.egrul;

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
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="КодНО" use="required" type="{}СОНОТип" />
 *       &lt;attribute name="НаимНО" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="10"/>
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="АдрРО">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="10"/>
 *             &lt;maxLength value="128"/>
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
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430"
})
public class DocInfoRegistratorType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e", required = true)
    protected String кодНО;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e", required = true)
    protected String наимНО;
    @XmlAttribute(name = "\u0410\u0434\u0440\u0420\u041e")
    protected String адрРО;

    /**
     * Gets the value of the грнДата property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДата() {
        return грнДата;
    }

    /**
     * Sets the value of the грнДата property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДата(GRNDateType value) {
        this.грнДата = value;
    }

    /**
     * Gets the value of the кодНО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодНО() {
        return кодНО;
    }

    /**
     * Sets the value of the кодНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодНО(String value) {
        this.кодНО = value;
    }

    /**
     * Gets the value of the наимНО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимНО() {
        return наимНО;
    }

    /**
     * Sets the value of the наимНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимНО(String value) {
        this.наимНО = value;
    }

    /**
     * Gets the value of the адрРО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getАдрРО() {
        return адрРО;
    }

    /**
     * Sets the value of the адрРО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setАдрРО(String value) {
        this.адрРО = value;
    }

}
