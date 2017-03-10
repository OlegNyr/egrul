
package ru.nyrk.generate.egrul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="НаимЛицВидДеят" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="МестоДейстЛиц" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ЛицОргВыдЛиц" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *         &lt;element name="СвПриостЛиц" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаПриостЛиц" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ЛицОргПриостЛиц" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="10"/>
 *                       &lt;maxLength value="500"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="СерЛиц">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НомЛиц" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="100"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ВидЛиц">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаЛиц" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ДатаНачЛиц" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ДатаОкончЛиц" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u043d\u0430\u0438\u043c\u041b\u0438\u0446\u0412\u0438\u0434\u0414\u0435\u044f\u0442",
    "\u043c\u0435\u0441\u0442\u043e\u0414\u0435\u0439\u0441\u0442\u041b\u0438\u0446",
    "\u043b\u0438\u0446\u041e\u0440\u0433\u0412\u044b\u0434\u041b\u0438\u0446",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440",
    "\u0441\u0432\u041f\u0440\u0438\u043e\u0441\u0442\u041b\u0438\u0446"
})
public class DocInfoLicensiaType {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u041b\u0438\u0446\u0412\u0438\u0434\u0414\u0435\u044f\u0442", required = true)
    protected List<String> наимЛицВидДеят;
    @XmlElement(name = "\u041c\u0435\u0441\u0442\u043e\u0414\u0435\u0439\u0441\u0442\u041b\u0438\u0446")
    protected List<String> местоДейстЛиц;
    @XmlElement(name = "\u041b\u0438\u0446\u041e\u0440\u0433\u0412\u044b\u0434\u041b\u0438\u0446")
    protected String лицОргВыдЛиц;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0438\u043e\u0441\u0442\u041b\u0438\u0446")
    protected DocInfoStopLicensiaType свПриостЛиц;
    @XmlAttribute(name = "\u0421\u0435\u0440\u041b\u0438\u0446")
    protected String серЛиц;
    @XmlAttribute(name = "\u041d\u043e\u043c\u041b\u0438\u0446", required = true)
    protected String номЛиц;
    @XmlAttribute(name = "\u0412\u0438\u0434\u041b\u0438\u0446")
    protected String видЛиц;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041b\u0438\u0446", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date датаЛиц;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u041b\u0438\u0446", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date датаНачЛиц;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u043a\u043e\u043d\u0447\u041b\u0438\u0446")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date датаОкончЛиц;

    /**
     * Gets the value of the наимЛицВидДеят property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the наимЛицВидДеят property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getНаимЛицВидДеят().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getНаимЛицВидДеят() {
        if (наимЛицВидДеят == null) {
            наимЛицВидДеят = new ArrayList<String>();
        }
        return this.наимЛицВидДеят;
    }

    /**
     * Gets the value of the местоДейстЛиц property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the местоДейстЛиц property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getМестоДейстЛиц().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getМестоДейстЛиц() {
        if (местоДейстЛиц == null) {
            местоДейстЛиц = new ArrayList<String>();
        }
        return this.местоДейстЛиц;
    }

    /**
     * Gets the value of the лицОргВыдЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getЛицОргВыдЛиц() {
        return лицОргВыдЛиц;
    }

    /**
     * Sets the value of the лицОргВыдЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setЛицОргВыдЛиц(String value) {
        this.лицОргВыдЛиц = value;
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
     * Gets the value of the свПриостЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoStopLicensiaType }
     *     
     */
    public DocInfoStopLicensiaType getСвПриостЛиц() {
        return свПриостЛиц;
    }

    /**
     * Sets the value of the свПриостЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoStopLicensiaType }
     *     
     */
    public void setСвПриостЛиц(DocInfoStopLicensiaType value) {
        this.свПриостЛиц = value;
    }

    /**
     * Gets the value of the серЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСерЛиц() {
        return серЛиц;
    }

    /**
     * Sets the value of the серЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСерЛиц(String value) {
        this.серЛиц = value;
    }

    /**
     * Gets the value of the номЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомЛиц() {
        return номЛиц;
    }

    /**
     * Sets the value of the номЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомЛиц(String value) {
        this.номЛиц = value;
    }

    /**
     * Gets the value of the видЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВидЛиц() {
        return видЛиц;
    }

    /**
     * Sets the value of the видЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВидЛиц(String value) {
        this.видЛиц = value;
    }

    /**
     * Gets the value of the датаЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаЛиц() {
        return датаЛиц;
    }

    /**
     * Sets the value of the датаЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаЛиц(Date value) {
        this.датаЛиц = value;
    }

    /**
     * Gets the value of the датаНачЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаНачЛиц() {
        return датаНачЛиц;
    }

    /**
     * Sets the value of the датаНачЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаНачЛиц(Date value) {
        this.датаНачЛиц = value;
    }

    /**
     * Gets the value of the датаОкончЛиц property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаОкончЛиц() {
        return датаОкончЛиц;
    }

    /**
     * Sets the value of the датаОкончЛиц property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаОкончЛиц(Date value) {
        this.датаОкончЛиц = value;
    }

}
