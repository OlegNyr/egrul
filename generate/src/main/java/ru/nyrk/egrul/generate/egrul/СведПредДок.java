
package ru.nyrk.egrul.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="НаимДок">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="НомДок" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ДатаДок" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="1900-01-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "\u043d\u0430\u0438\u043c\u0414\u043e\u043a",
    "\u043d\u043e\u043c\u0414\u043e\u043a",
    "\u0434\u0430\u0442\u0430\u0414\u043e\u043a"
})
public class СведПредДок {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043a", required = true)
    protected String наимДок;
    @XmlElement(name = "\u041d\u043e\u043c\u0414\u043e\u043a")
    protected String номДок;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаДок;

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
     * Gets the value of the номДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомДок() {
        return номДок;
    }

    /**
     * Sets the value of the номДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомДок(String value) {
        this.номДок = value;
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

}
