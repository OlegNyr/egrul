
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
 *       &lt;attribute name="КодСпОбрЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимСпОбрЮЛ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
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
public class DocInfoObrazovULType {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u043f\u041e\u0431\u0440\u042e\u041b", required = true)
    protected String кодСпОбрЮЛ;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u043f\u041e\u0431\u0440\u042e\u041b")
    protected String наимСпОбрЮЛ;

    /**
     * Gets the value of the кодСпОбрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодСпОбрЮЛ() {
        return кодСпОбрЮЛ;
    }

    /**
     * Sets the value of the кодСпОбрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодСпОбрЮЛ(String value) {
        this.кодСпОбрЮЛ = value;
    }

    /**
     * Gets the value of the наимСпОбрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимСпОбрЮЛ() {
        return наимСпОбрЮЛ;
    }

    /**
     * Sets the value of the наимСпОбрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимСпОбрЮЛ(String value) {
        this.наимСпОбрЮЛ = value;
    }

}
