
package ru.nyrk.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о документе, удостоверяющем личность, внесенные в ЕГРЮЛ
 * 
 * <p>Java class for УдЛичнЕГРЮЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="УдЛичнЕГРЮЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="КодВидДок" use="required" type="{}СПДУЛТип" />
 *       &lt;attribute name="НаимДок" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="100"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="СерНомДок" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}dateError" />
 *       &lt;attribute name="ВыдДок">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодВыдДок">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="7"/>
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
@XmlType(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0415\u0413\u0420\u042e\u041b\u0422\u0438\u043f", propOrder = {
    "grnDate",
    "grnDateChange"
})
public class InfoLichEGRULType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateChange;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a", required = true)
    protected String kodVidDoc;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043a", required = true)
    protected String nameDoc;
    @XmlAttribute(name = "\u0421\u0435\u0440\u041d\u043e\u043c\u0414\u043e\u043a", required = true)
    protected String seriaNumDoc;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateError")
    protected Date dateDoc;
    @XmlAttribute(name = "\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String vadDoc;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String kodVadDoc;

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
     * Gets the value of the kodVidDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodVidDoc() {
        return kodVidDoc;
    }

    /**
     * Sets the value of the kodVidDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodVidDoc(String value) {
        this.kodVidDoc = value;
    }

    /**
     * Gets the value of the nameDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDoc() {
        return nameDoc;
    }

    /**
     * Sets the value of the nameDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDoc(String value) {
        this.nameDoc = value;
    }

    /**
     * Gets the value of the seriaNumDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriaNumDoc() {
        return seriaNumDoc;
    }

    /**
     * Sets the value of the seriaNumDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriaNumDoc(String value) {
        this.seriaNumDoc = value;
    }

    /**
     * Gets the value of the dateDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateDoc() {
        return dateDoc;
    }

    /**
     * Sets the value of the dateDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDoc(Date value) {
        this.dateDoc = value;
    }

    /**
     * Gets the value of the vadDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVadDoc() {
        return vadDoc;
    }

    /**
     * Sets the value of the vadDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVadDoc(String value) {
        this.vadDoc = value;
    }

    /**
     * Gets the value of the kodVadDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodVadDoc() {
        return kodVadDoc;
    }

    /**
     * Sets the value of the kodVadDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodVadDoc(String value) {
        this.kodVadDoc = value;
    }

}
