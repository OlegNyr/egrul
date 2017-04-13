
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
 *         &lt;element name="СпПрекрЮЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодСпПрекрЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="3"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимСпПрекрЮЛ" use="required">
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
 *         &lt;element name="СвРегОрг" type="{}СвРегОргТип"/>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаПрекрЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateError">
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
    "\u0441\u043f\u041f\u0440\u0435\u043a\u0440\u042e\u041b",
    "\u0441\u0432\u0420\u0435\u0433\u041e\u0440\u0433",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430"
})
public class DocInfoEndULType {

    @XmlElement(name = "\u0421\u043f\u041f\u0440\u0435\u043a\u0440\u042e\u041b", required = true)
    protected DocInfoSposobPrekrUL спПрекрЮЛ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433", required = true)
    protected InfoRegOrganType свРегОрг;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u0435\u043a\u0440\u042e\u041b", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаПрекрЮЛ;

    /**
     * Gets the value of the спПрекрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoSposobPrekrUL }
     *     
     */
    public DocInfoSposobPrekrUL getСпПрекрЮЛ() {
        return спПрекрЮЛ;
    }

    /**
     * Sets the value of the спПрекрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoSposobPrekrUL }
     *     
     */
    public void setСпПрекрЮЛ(DocInfoSposobPrekrUL value) {
        this.спПрекрЮЛ = value;
    }

    /**
     * Gets the value of the свРегОрг property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRegOrganType }
     *     
     */
    public InfoRegOrganType getСвРегОрг() {
        return свРегОрг;
    }

    /**
     * Sets the value of the свРегОрг property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRegOrganType }
     *     
     */
    public void setСвРегОрг(InfoRegOrganType value) {
        this.свРегОрг = value;
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
     * Gets the value of the датаПрекрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаПрекрЮЛ() {
        return датаПрекрЮЛ;
    }

    /**
     * Sets the value of the датаПрекрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаПрекрЮЛ(Date value) {
        this.датаПрекрЮЛ = value;
    }

}
