
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о виде записи, внесенной в ЕГРЮЛ
 * 
 * <p>Java class for ВидЗапТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ВидЗапТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодСПВЗ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="5"/>
 *             &lt;pattern value="[0-9]{5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимВидЗап" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *             &lt;maxLength value="500"/>
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
@XmlType(name = "\u0412\u0438\u0434\u0417\u0430\u043f\u0422\u0438\u043f")
public class VidRecord {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u041f\u0412\u0417", required = true)
    protected String kodSPVZ;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0417\u0430\u043f", required = true)
    protected String nameVidRecord;

    /**
     * Gets the value of the kodSPVZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodSPVZ() {
        return kodSPVZ;
    }

    /**
     * Sets the value of the kodSPVZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodSPVZ(String value) {
        this.kodSPVZ = value;
    }

    /**
     * Gets the value of the nameVidRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameVidRecord() {
        return nameVidRecord;
    }

    /**
     * Sets the value of the nameVidRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameVidRecord(String value) {
        this.nameVidRecord = value;
    }

}
