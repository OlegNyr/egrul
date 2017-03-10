
package ru.nyrk.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="РегНом">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаРег">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимРО">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
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
@XmlType(name = "", propOrder = {
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440"
})
public class DocInfoUcheredULRFRegOldType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c")
    protected String регНом;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаРег;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u041e")
    protected String наимРО;

    /**
     * Gets the value of the грнДата property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДата() {
        return грнДата;
    }

    /**
     * Sets the value of the грнДата property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДата(GRNDateType value) {
        this.грнДата = value;
    }

    /**
     * Gets the value of the грнДатаИспр property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДатаИспр() {
        return грнДатаИспр;
    }

    /**
     * Sets the value of the грнДатаИспр property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДатаИспр(GRNDateType value) {
        this.грнДатаИспр = value;
    }

    /**
     * Gets the value of the регНом property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getРегНом() {
        return регНом;
    }

    /**
     * Sets the value of the регНом property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setРегНом(String value) {
        this.регНом = value;
    }

    /**
     * Gets the value of the датаРег property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаРег() {
        return датаРег;
    }

    /**
     * Sets the value of the датаРег property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаРег(Date value) {
        this.датаРег = value;
    }

    /**
     * Gets the value of the наимРО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимРО() {
        return наимРО;
    }

    /**
     * Sets the value of the наимРО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимРО(String value) {
        this.наимРО = value;
    }

}
