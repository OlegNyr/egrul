
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
 *         &lt;element name="ГРНДатаСвидНед" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Серия" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Номер" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="7"/>
 *             &lt;maxLength value="9"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаВыдСвид" use="required">
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
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0421\u0432\u0438\u0434\u041d\u0435\u0434"
})
public class СвСвид {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0421\u0432\u0438\u0434\u041d\u0435\u0434")
    protected GRNDateType грнДатаСвидНед;
    @XmlAttribute(name = "\u0421\u0435\u0440\u0438\u044f", required = true)
    protected String серия;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440", required = true)
    protected String номер;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u044b\u0434\u0421\u0432\u0438\u0434", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаВыдСвид;

    /**
     * Gets the value of the грнДатаСвидНед property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДатаСвидНед() {
        return грнДатаСвидНед;
    }

    /**
     * Sets the value of the грнДатаСвидНед property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДатаСвидНед(GRNDateType value) {
        this.грнДатаСвидНед = value;
    }

    /**
     * Gets the value of the серия property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСерия() {
        return серия;
    }

    /**
     * Sets the value of the серия property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСерия(String value) {
        this.серия = value;
    }

    /**
     * Gets the value of the номер property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомер() {
        return номер;
    }

    /**
     * Sets the value of the номер property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомер(String value) {
        this.номер = value;
    }

    /**
     * Gets the value of the датаВыдСвид property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаВыдСвид() {
        return датаВыдСвид;
    }

    /**
     * Sets the value of the датаВыдСвид property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаВыдСвид(Date value) {
        this.датаВыдСвид = value;
    }

}
