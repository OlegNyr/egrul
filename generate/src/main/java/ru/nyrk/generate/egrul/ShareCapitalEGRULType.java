
package ru.nyrk.generate.egrul;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Доля в уставном капитале (складочном капитале, уставном фонде, паевом фонде), внесенная в
 *                 ЕГРЮЛ
 *             
 * 
 * <p>Java class for ДоляУстКапЕГРЮЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ДоляУстКапЕГРЮЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="РазмерДоли" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Процент">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="18"/>
 *                         &lt;fractionDigits value="15"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ДробДесят">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="16"/>
 *                         &lt;fractionDigits value="15"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ДробПрост" type="{}ДробьТип"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="НоминСтоим" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="19"/>
 *             &lt;fractionDigits value="4"/>
 *             &lt;minInclusive value="0"/>
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
@XmlType(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f\u0415\u0413\u0420\u042e\u041b\u0422\u0438\u043f", propOrder = {
    "shareSize",
    "grnDate",
    "grnDateChange"
})
public class ShareCapitalEGRULType {

    @XmlElement(name = "\u0420\u0430\u0437\u043c\u0435\u0440\u0414\u043e\u043b\u0438")
    protected ShareSize shareSize;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateChange;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0438\u043d\u0421\u0442\u043e\u0438\u043c", required = true)
    protected BigDecimal nominalValue;

    /**
     * Gets the value of the shareSize property.
     * 
     * @return
     *     possible object is
     *     {@link ShareSize }
     *     
     */
    public ShareSize getShareSize() {
        return shareSize;
    }

    /**
     * Sets the value of the shareSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareSize }
     *     
     */
    public void setShareSize(ShareSize value) {
        this.shareSize = value;
    }

    /**
     * Gets the value of the grnDate property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDate() {
        return grnDate;
    }

    /**
     * Sets the value of the grnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDate(GRNDateType value) {
        this.grnDate = value;
    }

    /**
     * Gets the value of the grnDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDateChange() {
        return grnDateChange;
    }

    /**
     * Sets the value of the grnDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDateChange(GRNDateType value) {
        this.grnDateChange = value;
    }

    /**
     * Gets the value of the nominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNominalValue() {
        return nominalValue;
    }

    /**
     * Sets the value of the nominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNominalValue(BigDecimal value) {
        this.nominalValue = value;
    }

}
