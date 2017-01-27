
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведенияо о адресообразующем элементе населенный пункт
 * 
 * <p>Java class for НаселПунктТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="НаселПунктТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ТипНаселПункт">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="29"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимНаселПункт" use="required">
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
@XmlType(name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442\u0422\u0438\u043f")
public class LocalityType {

    @XmlAttribute(name = "\u0422\u0438\u043f\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442")
    protected String typeLocality;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442", required = true)
    protected String nameLocality;

    /**
     * Gets the value of the typeLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLocality() {
        return typeLocality;
    }

    /**
     * Sets the value of the typeLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLocality(String value) {
        this.typeLocality = value;
    }

    /**
     * Gets the value of the nameLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLocality() {
        return nameLocality;
    }

    /**
     * Sets the value of the nameLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLocality(String value) {
        this.nameLocality = value;
    }

}
