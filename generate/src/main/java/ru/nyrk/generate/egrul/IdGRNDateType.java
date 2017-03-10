
package ru.nyrk.generate.egrul;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Идентификатор записи, ГРН (при наличии) и дата внесения записи в ЕГРЮЛ
 * 
 * <p>Java class for ИдГРНДатаТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ИдГРНДатаТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ИдЗап" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="19"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ГРН" type="{}ОГРНТип" />
 *       &lt;attribute name="ДатаЗап" use="required">
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
@XmlType(name = "\u0418\u0434\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0422\u0438\u043f")
public class IdGRNDateType {

    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f", required = true)
    protected BigInteger idRecord;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String grn;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date dateRecord;

    /**
     * Gets the value of the idRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdRecord() {
        return idRecord;
    }

    /**
     * Sets the value of the idRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdRecord(BigInteger value) {
        this.idRecord = value;
    }

    /**
     * Gets the value of the grn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRN() {
        return grn;
    }

    /**
     * Sets the value of the grn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRN(String value) {
        this.grn = value;
    }

    /**
     * Gets the value of the dateRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateRecord() {
        return dateRecord;
    }

    /**
     * Sets the value of the dateRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRecord(Date value) {
        this.dateRecord = value;
    }

}
