
package ru.nyrk.egrul.generate.egrul;

import java.math.BigDecimal;
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
 *         &lt;element name="ДоляРубля" type="{}ДробьТип" minOccurs="0"/>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *         &lt;element name="СведУмУК" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ВелУмУК" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;totalDigits value="19"/>
 *                       &lt;fractionDigits value="4"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаРеш" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="НаимВидКап" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="10"/>
 *             &lt;maxLength value="20"/>
 *             &lt;enumeration value="УСТАВНЫЙ КАПИТАЛ"/>
 *             &lt;enumeration value="СКЛАДОЧНЫЙ КАПИТАЛ"/>
 *             &lt;enumeration value="УСТАВНЫЙ ФОНД"/>
 *             &lt;enumeration value="ПАЕВЫЕ ВЗНОСЫ"/>
 *             &lt;enumeration value="ПАЕВОЙ ФОНД"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="СумКап" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="19"/>
 *             &lt;fractionDigits value="4"/>
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
    "\u0434\u043e\u043b\u044f\u0420\u0443\u0431\u043b\u044f",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440",
    "\u0441\u0432\u0435\u0434\u0423\u043c\u0423\u041a"
})
public class СвУстКап {

    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0420\u0443\u0431\u043b\u044f")
    protected DrobType доляРубля;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType грнДатаИспр;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u0423\u043c\u0423\u041a")
    protected СведУмУК сведУмУК;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u041a\u0430\u043f", required = true)
    protected String наимВидКап;
    @XmlAttribute(name = "\u0421\u0443\u043c\u041a\u0430\u043f", required = true)
    protected BigDecimal сумКап;

    /**
     * Gets the value of the доляРубля property.
     * 
     * @return
     *     possible object is
     *     {@link DrobType }
     *     
     */
    public DrobType getДоляРубля() {
        return доляРубля;
    }

    /**
     * Sets the value of the доляРубля property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrobType }
     *     
     */
    public void setДоляРубля(DrobType value) {
        this.доляРубля = value;
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
     * Gets the value of the сведУмУК property.
     * 
     * @return
     *     possible object is
     *     {@link СведУмУК }
     *     
     */
    public СведУмУК getСведУмУК() {
        return сведУмУК;
    }

    /**
     * Sets the value of the сведУмУК property.
     * 
     * @param value
     *     allowed object is
     *     {@link СведУмУК }
     *     
     */
    public void setСведУмУК(СведУмУК value) {
        this.сведУмУК = value;
    }

    /**
     * Gets the value of the наимВидКап property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимВидКап() {
        return наимВидКап;
    }

    /**
     * Sets the value of the наимВидКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимВидКап(String value) {
        this.наимВидКап = value;
    }

    /**
     * Gets the value of the сумКап property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getСумКап() {
        return сумКап;
    }

    /**
     * Sets the value of the сумКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setСумКап(BigDecimal value) {
        this.сумКап = value;
    }

}
