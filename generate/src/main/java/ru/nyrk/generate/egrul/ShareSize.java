
package ru.nyrk.generate.egrul;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Размер доли в процентах
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Процент">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="15"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ДробДесят">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="16"/>
 *               &lt;fractionDigits value="15"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ДробПрост" type="{}ДробьТип"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "procent",
    "drobDeset",
    "drobProst"
})
public class ShareSize {

    @XmlElement(name = "\u041f\u0440\u043e\u0446\u0435\u043d\u0442")
    protected BigDecimal procent;
    @XmlElement(name = "\u0414\u0440\u043e\u0431\u0414\u0435\u0441\u044f\u0442")
    protected BigDecimal drobDeset;
    @XmlElement(name = "\u0414\u0440\u043e\u0431\u041f\u0440\u043e\u0441\u0442")
    protected DrobType drobProst;

    /**
     * Gets the value of the procent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProcent() {
        return procent;
    }

    /**
     * Sets the value of the procent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProcent(BigDecimal value) {
        this.procent = value;
    }

    /**
     * Gets the value of the drobDeset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrobDeset() {
        return drobDeset;
    }

    /**
     * Sets the value of the drobDeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrobDeset(BigDecimal value) {
        this.drobDeset = value;
    }

    /**
     * Gets the value of the drobProst property.
     * 
     * @return
     *     possible object is
     *     {@link DrobType }
     *     
     */
    public DrobType getDrobProst() {
        return drobProst;
    }

    /**
     * Sets the value of the drobProst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrobType }
     *     
     */
    public void setDrobProst(DrobType value) {
        this.drobProst = value;
    }

}
