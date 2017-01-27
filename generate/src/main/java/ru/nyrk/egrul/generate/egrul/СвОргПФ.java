
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
 *       &lt;attribute name="КодПФ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="3"/>
 *             &lt;maxLength value="6"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимПФ" use="required">
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
public class СвОргПФ {

    @XmlAttribute(name = "\u041a\u043e\u0434\u041f\u0424", required = true)
    protected String кодПФ;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041f\u0424", required = true)
    protected String наимПФ;

    /**
     * Gets the value of the кодПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодПФ() {
        return кодПФ;
    }

    /**
     * Sets the value of the кодПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодПФ(String value) {
        this.кодПФ = value;
    }

    /**
     * Gets the value of the наимПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимПФ() {
        return наимПФ;
    }

    /**
     * Sets the value of the наимПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимПФ(String value) {
        this.наимПФ = value;
    }

}
