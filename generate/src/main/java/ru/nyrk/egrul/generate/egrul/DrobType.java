
package ru.nyrk.egrul.generate.egrul;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Представление простой дроби
 * 
 * <p>Java class for ДробьТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ДробьТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Числит" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="1"/>
 *             &lt;totalDigits value="15"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Знаменат" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="2"/>
 *             &lt;totalDigits value="15"/>
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
@XmlType(name = "\u0414\u0440\u043e\u0431\u044c\u0422\u0438\u043f")
public class DrobType {

    @XmlAttribute(name = "\u0427\u0438\u0441\u043b\u0438\u0442", required = true)
    protected BigInteger chislit;
    @XmlAttribute(name = "\u0417\u043d\u0430\u043c\u0435\u043d\u0430\u0442", required = true)
    protected BigInteger znamenatel;

    /**
     * Gets the value of the chislit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChislit() {
        return chislit;
    }

    /**
     * Sets the value of the chislit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChislit(BigInteger value) {
        this.chislit = value;
    }

    /**
     * Gets the value of the znamenatel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZnamenatel() {
        return znamenatel;
    }

    /**
     * Sets the value of the znamenatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZnamenatel(BigInteger value) {
        this.znamenatel = value;
    }

}
