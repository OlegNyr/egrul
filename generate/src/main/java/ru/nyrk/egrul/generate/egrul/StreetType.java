
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о адресообразующем элементе улица
 * 
 * <p>Java class for УлицаТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="УлицаТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ТипУлица">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="29"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимУлица" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
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
@XmlType(name = "\u0423\u043b\u0438\u0446\u0430\u0422\u0438\u043f")
public class StreetType {

    @XmlAttribute(name = "\u0422\u0438\u043f\u0423\u043b\u0438\u0446\u0430")
    protected String typeStreet;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0423\u043b\u0438\u0446\u0430", required = true)
    protected String nameStreet;

    /**
     * Gets the value of the typeStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeStreet() {
        return typeStreet;
    }

    /**
     * Sets the value of the typeStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeStreet(String value) {
        this.typeStreet = value;
    }

    /**
     * Gets the value of the nameStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameStreet() {
        return nameStreet;
    }

    /**
     * Sets the value of the nameStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameStreet(String value) {
        this.nameStreet = value;
    }

}
