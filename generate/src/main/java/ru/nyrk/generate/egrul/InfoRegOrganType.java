
package ru.nyrk.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о регистрирующем органе
 * 
 * <p>Java class for СвРегОргТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвРегОргТип">
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
@XmlType(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433\u0422\u0438\u043f")
public class InfoRegOrganType {

    @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e", required = true)
    protected String infoRegOrgan;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e", required = true)
    protected String nameNalogOrgan;

    /**
     * Gets the value of the infoRegOrgan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoRegOrgan() {
        return infoRegOrgan;
    }

    /**
     * Sets the value of the infoRegOrgan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoRegOrgan(String value) {
        this.infoRegOrgan = value;
    }

    /**
     * Gets the value of the nameNalogOrgan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNalogOrgan() {
        return nameNalogOrgan;
    }

    /**
     * Sets the value of the nameNalogOrgan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameNalogOrgan(String value) {
        this.nameNalogOrgan = value;
    }

}
