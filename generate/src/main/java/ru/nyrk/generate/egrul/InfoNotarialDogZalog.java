
package ru.nyrk.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о нотариальном удостоверении договора залога
 * 
 * <p>Java class for СвНотУдДогЗалТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвНотУдДогЗалТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="СвНотариус" type="{}СвФЛЕГРЮЛТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Номер" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Дата" use="required">
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
@XmlType(name = "\u0421\u0432\u041d\u043e\u0442\u0423\u0434\u0414\u043e\u0433\u0417\u0430\u043b\u0422\u0438\u043f", propOrder = {
    "infoNatarirus"
})
public class InfoNotarialDogZalog {

    @XmlElement(name = "\u0421\u0432\u041d\u043e\u0442\u0430\u0440\u0438\u0443\u0441", required = true)
    protected InfoFLEGRULType infoNatarirus;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440", required = true)
    protected String number;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date date;

    /**
     * Gets the value of the infoNatarirus property.
     * 
     * @return
     *     possible object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public InfoFLEGRULType getInfoNatarirus() {
        return infoNatarirus;
    }

    /**
     * Sets the value of the infoNatarirus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoFLEGRULType }
     *     
     */
    public void setInfoNatarirus(InfoFLEGRULType value) {
        this.infoNatarirus = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

}
