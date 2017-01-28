
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
 *       &lt;attribute name="КодСЗОЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимСЗОЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
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
public class DocVidZayvitelType {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0417\u041e\u042e\u041b", required = true)
    protected String кодСЗОЮЛ;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0417\u041e\u042e\u041b", required = true)
    protected String наимСЗОЮЛ;

    /**
     * Gets the value of the кодСЗОЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодСЗОЮЛ() {
        return кодСЗОЮЛ;
    }

    /**
     * Sets the value of the кодСЗОЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодСЗОЮЛ(String value) {
        this.кодСЗОЮЛ = value;
    }

    /**
     * Gets the value of the наимСЗОЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимСЗОЮЛ() {
        return наимСЗОЮЛ;
    }

    /**
     * Sets the value of the наимСЗОЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимСЗОЮЛ(String value) {
        this.наимСЗОЮЛ = value;
    }

}
