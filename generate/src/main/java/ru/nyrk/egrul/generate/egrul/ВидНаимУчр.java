
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="КодУчрРФСубМО" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимМО">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодРегион" type="{}CCРФТип" />
 *       &lt;attribute name="НаимРегион">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="100"/>
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
@XmlType(name = "")
public class ВидНаимУчр {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0423\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e", required = true)
    protected String кодУчрРФСубМО;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041c\u041e")
    protected String наимМО;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d")
    protected String кодРегион;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u0435\u0433\u0438\u043e\u043d")
    protected String наимРегион;

    /**
     * Gets the value of the кодУчрРФСубМО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодУчрРФСубМО() {
        return кодУчрРФСубМО;
    }

    /**
     * Sets the value of the кодУчрРФСубМО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодУчрРФСубМО(String value) {
        this.кодУчрРФСубМО = value;
    }

    /**
     * Gets the value of the наимМО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимМО() {
        return наимМО;
    }

    /**
     * Sets the value of the наимМО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимМО(String value) {
        this.наимМО = value;
    }

    /**
     * Gets the value of the кодРегион property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодРегион() {
        return кодРегион;
    }

    /**
     * Sets the value of the кодРегион property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодРегион(String value) {
        this.кодРегион = value;
    }

    /**
     * Gets the value of the наимРегион property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимРегион() {
        return наимРегион;
    }

    /**
     * Sets the value of the наимРегион property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимРегион(String value) {
        this.наимРегион = value;
    }

}
