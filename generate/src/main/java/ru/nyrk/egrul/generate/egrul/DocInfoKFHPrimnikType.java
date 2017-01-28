
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
 *         &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРНИП" use="required" type="{}ОГРНИПТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u0424\u041b"
})
public class DocInfoKFHPrimnikType {

    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected InfoFLEGRULType свФЛ;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d\u0418\u041f", required = true)
    protected String огрнип;

    /**
     * Gets the value of the свФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public InfoFLEGRULType getСвФЛ() {
        return свФЛ;
    }

    /**
     * Sets the value of the свФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public void setСвФЛ(InfoFLEGRULType value) {
        this.свФЛ = value;
    }

    /**
     * Gets the value of the огрнип property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОГРНИП() {
        return огрнип;
    }

    /**
     * Sets the value of the огрнип property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОГРНИП(String value) {
        this.огрнип = value;
    }

}
