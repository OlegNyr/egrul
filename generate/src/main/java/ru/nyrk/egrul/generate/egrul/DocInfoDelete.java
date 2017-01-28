
package ru.nyrk.egrul.generate.egrul;

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
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ДатаОкончДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ДатаРеш" use="required">
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
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440"
})
public class DocInfoDelete {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0438\u0441\u043a\u0432", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date датаНачДискв;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u043a\u043e\u043d\u0447\u0414\u0438\u0441\u043a\u0432", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date датаОкончДискв;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0448", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаРеш;

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
     * Gets the value of the датаНачДискв property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаНачДискв() {
        return датаНачДискв;
    }

    /**
     * Sets the value of the датаНачДискв property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаНачДискв(Date value) {
        this.датаНачДискв = value;
    }

    /**
     * Gets the value of the датаОкончДискв property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаОкончДискв() {
        return датаОкончДискв;
    }

    /**
     * Sets the value of the датаОкончДискв property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаОкончДискв(Date value) {
        this.датаОкончДискв = value;
    }

    /**
     * Gets the value of the датаРеш property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаРеш() {
        return датаРеш;
    }

    /**
     * Sets the value of the датаРеш property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаРеш(Date value) {
        this.датаРеш = value;
    }

}
