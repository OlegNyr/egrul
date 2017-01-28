
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
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРНИП" type="{}ОГРНИПТип" />
 *       &lt;attribute name="ВидДолжн" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимВидДолжн" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *             &lt;maxLength value="100"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимДолжн" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="255"/>
 *             &lt;minLength value="1"/>
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
public class DocInfoDolgnostFL {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d\u0418\u041f")
    protected String огрнип;
    @XmlAttribute(name = "\u0412\u0438\u0434\u0414\u043e\u043b\u0436\u043d", required = true)
    protected String видДолжн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0414\u043e\u043b\u0436\u043d", required = true)
    protected String наимВидДолжн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043b\u0436\u043d", required = true)
    protected String наимДолжн;

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

    /**
     * Gets the value of the видДолжн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВидДолжн() {
        return видДолжн;
    }

    /**
     * Sets the value of the видДолжн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВидДолжн(String value) {
        this.видДолжн = value;
    }

    /**
     * Gets the value of the наимВидДолжн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимВидДолжн() {
        return наимВидДолжн;
    }

    /**
     * Sets the value of the наимВидДолжн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимВидДолжн(String value) {
        this.наимВидДолжн = value;
    }

    /**
     * Gets the value of the наимДолжн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимДолжн() {
        return наимДолжн;
    }

    /**
     * Sets the value of the наимДолжн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимДолжн(String value) {
        this.наимДолжн = value;
    }

}
