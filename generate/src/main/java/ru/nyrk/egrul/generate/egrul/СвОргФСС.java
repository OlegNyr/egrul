
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
 *       &lt;attribute name="КодФСС" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимФСС" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="10"/>
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
@XmlType(name = "")
public class СвОргФСС {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0424\u0421\u0421", required = true)
    protected String кодФСС;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0424\u0421\u0421", required = true)
    protected String наимФСС;

    /**
     * Gets the value of the кодФСС property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодФСС() {
        return кодФСС;
    }

    /**
     * Sets the value of the кодФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодФСС(String value) {
        this.кодФСС = value;
    }

    /**
     * Gets the value of the наимФСС property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимФСС() {
        return наимФСС;
    }

    /**
     * Sets the value of the наимФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимФСС(String value) {
        this.наимФСС = value;
    }

}
