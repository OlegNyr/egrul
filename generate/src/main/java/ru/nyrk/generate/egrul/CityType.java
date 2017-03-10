
package ru.nyrk.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведенияо о адресообразующем элементе город
 * 
 * <p>Java class for ГородТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ГородТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ТипГород" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="29"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимГород" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="40"/>
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
@XmlType(name = "\u0413\u043e\u0440\u043e\u0434\u0422\u0438\u043f")
public class CityType {

    @XmlAttribute(name = "\u0422\u0438\u043f\u0413\u043e\u0440\u043e\u0434", required = true)
    protected String cityType;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0413\u043e\u0440\u043e\u0434", required = true)
    protected String nameCity;

    /**
     * Gets the value of the cityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityType() {
        return cityType;
    }

    /**
     * Sets the value of the cityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityType(String value) {
        this.cityType = value;
    }

    /**
     * Gets the value of the nameCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCity() {
        return nameCity;
    }

    /**
     * Sets the value of the nameCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCity(String value) {
        this.nameCity = value;
    }

}
