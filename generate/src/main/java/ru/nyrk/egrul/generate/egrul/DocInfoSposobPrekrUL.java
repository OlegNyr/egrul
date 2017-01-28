
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
 *       &lt;attribute name="КодСпПрекрЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимСпПрекрЮЛ" use="required">
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
public class DocInfoSposobPrekrUL {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u043f\u041f\u0440\u0435\u043a\u0440\u042e\u041b", required = true)
    protected String кодСпПрекрЮЛ;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u043f\u041f\u0440\u0435\u043a\u0440\u042e\u041b", required = true)
    protected String наимСпПрекрЮЛ;

    /**
     * Gets the value of the кодСпПрекрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодСпПрекрЮЛ() {
        return кодСпПрекрЮЛ;
    }

    /**
     * Sets the value of the кодСпПрекрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодСпПрекрЮЛ(String value) {
        this.кодСпПрекрЮЛ = value;
    }

    /**
     * Gets the value of the наимСпПрекрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимСпПрекрЮЛ() {
        return наимСпПрекрЮЛ;
    }

    /**
     * Sets the value of the наимСпПрекрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимСпПрекрЮЛ(String value) {
        this.наимСпПрекрЮЛ = value;
    }

}
