
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
 *         &lt;element name="СвОргФСС">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодФСС" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="4"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимФСС" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="10"/>
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
 *       &lt;attribute name="РегНомФСС" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="15"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаРег" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
    "\u0441\u0432\u041e\u0440\u0433\u0424\u0421\u0421",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440"
})
public class DocInfoRegisterFSSType {

    @XmlElement(name = "\u0421\u0432\u041e\u0440\u0433\u0424\u0421\u0421", required = true)
    protected DocInfoRegisterOrganFSSType свОргФСС;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c\u0424\u0421\u0421", required = true)
    protected String регНомФСС;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаРег;

    /**
     * Gets the value of the свОргФСС property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoRegisterOrganFSSType }
     *     
     */
    public DocInfoRegisterOrganFSSType getСвОргФСС() {
        return свОргФСС;
    }

    /**
     * Sets the value of the свОргФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoRegisterOrganFSSType }
     *     
     */
    public void setСвОргФСС(DocInfoRegisterOrganFSSType value) {
        this.свОргФСС = value;
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
     * Gets the value of the регНомФСС property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getРегНомФСС() {
        return регНомФСС;
    }

    /**
     * Sets the value of the регНомФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setРегНомФСС(String value) {
        this.регНомФСС = value;
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

}
