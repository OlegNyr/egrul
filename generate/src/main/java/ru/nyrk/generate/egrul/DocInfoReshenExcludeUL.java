
package ru.nyrk.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="ДатаРеш" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НомерРеш" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаПубликации" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;minInclusive value="2005-07-06"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НомерЖурнала">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
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
@XmlType(name = "")
public class DocInfoReshenExcludeUL {

    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0448", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаРеш;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0420\u0435\u0448", required = true)
    protected String номерРеш;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0443\u0431\u043b\u0438\u043a\u0430\u0446\u0438\u0438", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаПубликации;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0416\u0443\u0440\u043d\u0430\u043b\u0430")
    protected String номерЖурнала;

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

    /**
     * Gets the value of the номерРеш property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомерРеш() {
        return номерРеш;
    }

    /**
     * Sets the value of the номерРеш property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомерРеш(String value) {
        this.номерРеш = value;
    }

    /**
     * Gets the value of the датаПубликации property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаПубликации() {
        return датаПубликации;
    }

    /**
     * Sets the value of the датаПубликации property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаПубликации(Date value) {
        this.датаПубликации = value;
    }

    /**
     * Gets the value of the номерЖурнала property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомерЖурнала() {
        return номерЖурнала;
    }

    /**
     * Sets the value of the номерЖурнала property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомерЖурнала(String value) {
        this.номерЖурнала = value;
    }

}
