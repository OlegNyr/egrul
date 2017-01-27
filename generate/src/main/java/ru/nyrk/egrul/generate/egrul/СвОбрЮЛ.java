
package ru.nyrk.egrul.generate.egrul;

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
 *         &lt;element name="СпОбрЮЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодСпОбрЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимСпОбрЮЛ">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="5"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *       &lt;attribute name="ДатаОГРН" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "\u0441\u043f\u041e\u0431\u0440\u042e\u041b",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440"
})
public class СвОбрЮЛ {

    @XmlElement(name = "\u0421\u043f\u041e\u0431\u0440\u042e\u041b", required = true)
    protected СпОбрЮЛ спОбрЮЛ;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d", required = true)
    protected String огрн;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0413\u0420\u041d", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаОГРН;
    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c")
    protected String регНом;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаРег;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u041e")
    protected String наимРО;

    /**
     * Gets the value of the спОбрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СпОбрЮЛ }
     *     
     */
    public СпОбрЮЛ getСпОбрЮЛ() {
        return спОбрЮЛ;
    }

    /**
     * Sets the value of the спОбрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СпОбрЮЛ }
     *     
     */
    public void setСпОбрЮЛ(СпОбрЮЛ value) {
        this.спОбрЮЛ = value;
    }

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
     * Gets the value of the огрн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОГРН() {
        return огрн;
    }

    /**
     * Sets the value of the огрн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОГРН(String value) {
        this.огрн = value;
    }

    /**
     * Gets the value of the датаОГРН property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаОГРН() {
        return датаОГРН;
    }

    /**
     * Sets the value of the датаОГРН property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаОГРН(Date value) {
        this.датаОГРН = value;
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
