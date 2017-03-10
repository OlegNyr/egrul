
package ru.nyrk.generate.egrul;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения об учете в налоговом органе по месту нахождения обособленного подразделения
 *                 (филиала/представительства)
 *             
 * 
 * <p>Java class for СвУчетНОПодраздТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвУчетНОПодраздТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="СвНО" type="{}СвНОТип"/>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="КПП" use="required" type="{}КППТип" />
 *       &lt;attribute name="ДатаПостУч" use="required">
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
@XmlType(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e\u041f\u043e\u0434\u0440\u0430\u0437\u0434\u0422\u0438\u043f", propOrder = {
    "infoNalogOrgan",
    "grnDate",
    "grnDateChange"
})
public class InfoUchetNalogOraganPodrazdlType {

    @XmlElement(name = "\u0421\u0432\u041d\u041e", required = true)
    protected InfoNalogType infoNalogOrgan;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnDate;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateChange;
    @XmlAttribute(name = "\u041a\u041f\u041f", required = true)
    protected String kpp;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442\u0423\u0447", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date dateRegUchet;

    /**
     * Gets the value of the infoNalogOrgan property.
     * 
     * @return
     *     possible object is
     *     {@link InfoNalogType }
     *     
     */
    public InfoNalogType getInfoNalogOrgan() {
        return infoNalogOrgan;
    }

    /**
     * Sets the value of the infoNalogOrgan property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoNalogType }
     *     
     */
    public void setInfoNalogOrgan(InfoNalogType value) {
        this.infoNalogOrgan = value;
    }

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
     * Gets the value of the grnDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDateChange() {
        return grnDateChange;
    }

    /**
     * Sets the value of the grnDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDateChange(GRNDateType value) {
        this.grnDateChange = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the dateRegUchet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateRegUchet() {
        return dateRegUchet;
    }

    /**
     * Sets the value of the dateRegUchet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRegUchet(Date value) {
        this.dateRegUchet = value;
    }

}
