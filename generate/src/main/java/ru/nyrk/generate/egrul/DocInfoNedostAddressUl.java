
package ru.nyrk.generate.egrul;

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
 *         &lt;element name="РешСудНедАдр" type="{}РешСудТип" minOccurs="0"/>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ПризнОтсутАдресЮЛ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
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
    "\u0440\u0435\u0448\u0421\u0443\u0434\u041d\u0435\u0434\u0410\u0434\u0440",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440"
})
public class DocInfoNedostAddressUl {

    @XmlElement(name = "\u0420\u0435\u0448\u0421\u0443\u0434\u041d\u0435\u0434\u0410\u0434\u0440")
    protected CourtDecisionType решСудНедАдр;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlAttribute(name = "\u041f\u0440\u0438\u0437\u043d\u041e\u0442\u0441\u0443\u0442\u0410\u0434\u0440\u0435\u0441\u042e\u041b", required = true)
    protected String признОтсутАдресЮЛ;

    /**
     * Gets the value of the решСудНедАдр property.
     * 
     * @return
     *     possible object is
     *     {@link CourtDecisionType }
     *     
     */
    public CourtDecisionType getРешСудНедАдр() {
        return решСудНедАдр;
    }

    /**
     * Sets the value of the решСудНедАдр property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtDecisionType }
     *     
     */
    public void setРешСудНедАдр(CourtDecisionType value) {
        this.решСудНедАдр = value;
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
     * Gets the value of the признОтсутАдресЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПризнОтсутАдресЮЛ() {
        return признОтсутАдресЮЛ;
    }

    /**
     * Sets the value of the признОтсутАдресЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПризнОтсутАдресЮЛ(String value) {
        this.признОтсутАдресЮЛ = value;
    }

}
