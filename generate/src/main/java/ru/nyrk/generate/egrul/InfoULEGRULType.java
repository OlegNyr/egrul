
package ru.nyrk.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о наименовании и (при наличии) ИНН и ОГРН ЮЛ - учредителя (участника),
 *                 управляющей организации, залогодержателя, управляющего долей участника, внесенные в ЕГРЮЛ
 *             
 * 
 * <p>Java class for СвЮЛЕГРЮЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвЮЛЕГРЮЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *       &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *       &lt;attribute name="НаимЮЛПолн" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1000"/>
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
@XmlType(name = "\u0421\u0432\u042e\u041b\u0415\u0413\u0420\u042e\u041b\u0422\u0438\u043f", propOrder = {
    "grnDate",
    "innFlChange"
})
public class InfoULEGRULType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType innFlChange;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
    protected String ogrn;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String inn;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d", required = true)
    protected String nameUlFull;

    /**
     * Gets the value of the grnDate property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDate() {
        return grnDate;
    }

    /**
     * Sets the value of the grnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDate(GRNDateType value) {
        this.grnDate = value;
    }

    /**
     * Gets the value of the innFlChange property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getInnFlChange() {
        return innFlChange;
    }

    /**
     * Sets the value of the innFlChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setInnFlChange(GRNDateType value) {
        this.innFlChange = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the nameUlFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameUlFull() {
        return nameUlFull;
    }

    /**
     * Sets the value of the nameUlFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameUlFull(String value) {
        this.nameUlFull = value;
    }

}
