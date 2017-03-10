
package ru.nyrk.generate.egrul;

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
 *       &lt;attribute name="КодСтатусЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимСтатусЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *             &lt;maxLength value="500"/>
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
public class DocInfoStatusReorganType {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0430\u0442\u0443\u0441\u042e\u041b", required = true)
    protected String кодСтатусЮЛ;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0430\u0442\u0443\u0441\u042e\u041b", required = true)
    protected String наимСтатусЮЛ;

    /**
     * Gets the value of the кодСтатусЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодСтатусЮЛ() {
        return кодСтатусЮЛ;
    }

    /**
     * Sets the value of the кодСтатусЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодСтатусЮЛ(String value) {
        this.кодСтатусЮЛ = value;
    }

    /**
     * Gets the value of the наимСтатусЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимСтатусЮЛ() {
        return наимСтатусЮЛ;
    }

    /**
     * Sets the value of the наимСтатусЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимСтатусЮЛ(String value) {
        this.наимСтатусЮЛ = value;
    }

}
