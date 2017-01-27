
package ru.nyrk.egrul.generate.egrul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="АдресРФ" type="{}АдрРФЕГРЮЛТип"/>
 *         &lt;element name="СведОтсутАдресЮЛ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="РешСудНедАдр" type="{}РешСудТип" minOccurs="0"/>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ПризнОтсутАдресЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0430\u0434\u0440\u0435\u0441\u0420\u0424",
    "\u0441\u0432\u0435\u0434\u041e\u0442\u0441\u0443\u0442\u0410\u0434\u0440\u0435\u0441\u042e\u041b"
})
public class СвАдресЮЛ {

    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u0420\u0424", required = true)
    protected AddressRFEGRULType адресРФ;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u041e\u0442\u0441\u0443\u0442\u0410\u0434\u0440\u0435\u0441\u042e\u041b")
    protected List<СведОтсутАдресЮЛ> сведОтсутАдресЮЛ;

    /**
     * Gets the value of the адресРФ property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public AddressRFEGRULType getАдресРФ() {
        return адресРФ;
    }

    /**
     * Sets the value of the адресРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public void setАдресРФ(AddressRFEGRULType value) {
        this.адресРФ = value;
    }

    /**
     * Gets the value of the сведОтсутАдресЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the сведОтсутАдресЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСведОтсутАдресЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СведОтсутАдресЮЛ }
     * 
     * 
     */
    public List<СведОтсутАдресЮЛ> getСведОтсутАдресЮЛ() {
        if (сведОтсутАдресЮЛ == null) {
            сведОтсутАдресЮЛ = new ArrayList<СведОтсутАдресЮЛ>();
        }
        return this.сведОтсутАдресЮЛ;
    }

}
