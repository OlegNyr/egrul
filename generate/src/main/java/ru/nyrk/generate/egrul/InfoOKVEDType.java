
package ru.nyrk.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о виде деятельности, внесенные в ЕГРЮЛ
 * 
 * <p>Java class for СвОКВЭДТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвОКВЭДТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="КодОКВЭД" use="required" type="{}ОКВЭДТип" />
 *       &lt;attribute name="НаимОКВЭД" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="1000"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ПрВерсОКВЭД">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="4"/>
 *             &lt;enumeration value="2001"/>
 *             &lt;enumeration value="2014"/>
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
@XmlType(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414\u0422\u0438\u043f", propOrder = {
    "grnDate",
    "grnDateChange"
})
public class InfoOKVEDType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateChange;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041a\u0412\u042d\u0414", required = true)
    protected String kodOKVED;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u041a\u0412\u042d\u0414", required = true)
    protected String nameOKVED;
    @XmlAttribute(name = "\u041f\u0440\u0412\u0435\u0440\u0441\u041e\u041a\u0412\u042d\u0414")
    protected String prVersOKVED;

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
     * Gets the value of the kodOKVED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodOKVED() {
        return kodOKVED;
    }

    /**
     * Sets the value of the kodOKVED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodOKVED(String value) {
        this.kodOKVED = value;
    }

    /**
     * Gets the value of the nameOKVED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOKVED() {
        return nameOKVED;
    }

    /**
     * Sets the value of the nameOKVED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOKVED(String value) {
        this.nameOKVED = value;
    }

    /**
     * Gets the value of the prVersOKVED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrVersOKVED() {
        return prVersOKVED;
    }

    /**
     * Sets the value of the prVersOKVED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrVersOKVED(String value) {
        this.prVersOKVED = value;
    }

}
