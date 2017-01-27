
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о налоговом органе, в котором юридическое лицо или обособленное подразделение
 *                 состоит (состояло) на учете
 *             
 * 
 * <p>Java class for СвНОТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвНОТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодНО" use="required" type="{}СОНОТип" />
 *       &lt;attribute name="НаимНО" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="10"/>
 *             &lt;maxLength value="250"/>
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
@XmlType(name = "\u0421\u0432\u041d\u041e\u0422\u0438\u043f")
public class InfoNalogType {

    @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e", required = true)
    protected String kodNalog;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e", required = true)
    protected String nameNalog;

    /**
     * Gets the value of the kodNalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodNalog() {
        return kodNalog;
    }

    /**
     * Sets the value of the kodNalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodNalog(String value) {
        this.kodNalog = value;
    }

    /**
     * Gets the value of the nameNalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNalog() {
        return nameNalog;
    }

    /**
     * Sets the value of the nameNalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameNalog(String value) {
        this.nameNalog = value;
    }

}
