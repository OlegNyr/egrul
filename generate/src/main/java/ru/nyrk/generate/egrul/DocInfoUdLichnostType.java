
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "", propOrder = {
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440"
})
public class DocInfoUdLichnostType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a", required = true)
    protected String кодВидДок;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043a", required = true)
    protected String наимДок;
    @XmlAttribute(name = "\u0421\u0435\u0440\u041d\u043e\u043c\u0414\u043e\u043a", required = true)
    protected String серНомДок;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateError")
    protected Date датаДок;
    @XmlAttribute(name = "\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String выдДок;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String кодВыдДок;

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
     * Gets the value of the кодВидДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВидДок() {
        return кодВидДок;
    }

    /**
     * Sets the value of the кодВидДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВидДок(String value) {
        this.кодВидДок = value;
    }

    /**
     * Gets the value of the наимДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимДок() {
        return наимДок;
    }

    /**
     * Sets the value of the наимДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимДок(String value) {
        this.наимДок = value;
    }

    /**
     * Gets the value of the серНомДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСерНомДок() {
        return серНомДок;
    }

    /**
     * Sets the value of the серНомДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСерНомДок(String value) {
        this.серНомДок = value;
    }

    /**
     * Gets the value of the датаДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаДок() {
        return датаДок;
    }

    /**
     * Sets the value of the датаДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаДок(Date value) {
        this.датаДок = value;
    }

    /**
     * Gets the value of the выдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВыдДок() {
        return выдДок;
    }

    /**
     * Sets the value of the выдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВыдДок(String value) {
        this.выдДок = value;
    }

    /**
     * Gets the value of the кодВыдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВыдДок() {
        return кодВыдДок;
    }

    /**
     * Sets the value of the кодВыдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВыдДок(String value) {
        this.кодВыдДок = value;
    }

}
