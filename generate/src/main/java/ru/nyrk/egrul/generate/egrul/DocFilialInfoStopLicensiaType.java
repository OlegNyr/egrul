
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *         &lt;element name="СвНаим" type="{}СвНаимПодраздТип" minOccurs="0"/>
 *         &lt;element name="АдрМНРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="АдрМНИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвУчетНОФилиал" type="{}СвУчетНОПодраздТип" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432",
    "\u0441\u0432\u041d\u0430\u0438\u043c",
    "\u0430\u0434\u0440\u041c\u041d\u0420\u0424",
    "\u0430\u0434\u0440\u041c\u041d\u0418\u043d",
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e\u0424\u0438\u043b\u0438\u0430\u043b"
})
public class DocFilialInfoStopLicensiaType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c")
    protected InformNameBranchType свНаим;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u041d\u0420\u0424")
    protected AddressRFEGRULType адрМНРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u041d\u0418\u043d")
    protected AddrrInEGRULType адрМНИн;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e\u0424\u0438\u043b\u0438\u0430\u043b")
    protected InfoUchetNalogOraganPodrazdlType свУчетНОФилиал;

    /**
     * Gets the value of the грнДатаПерв property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДатаПерв() {
        return грнДатаПерв;
    }

    /**
     * Sets the value of the грнДатаПерв property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДатаПерв(GRNDateType value) {
        this.грнДатаПерв = value;
    }

    /**
     * Gets the value of the свНаим property.
     * 
     * @return
     *     possible object is
     *     {@link InformNameBranchType }
     *     
     */
    public InformNameBranchType getСвНаим() {
        return свНаим;
    }

    /**
     * Sets the value of the свНаим property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformNameBranchType }
     *     
     */
    public void setСвНаим(InformNameBranchType value) {
        this.свНаим = value;
    }

    /**
     * Gets the value of the адрМНРФ property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public AddressRFEGRULType getАдрМНРФ() {
        return адрМНРФ;
    }

    /**
     * Sets the value of the адрМНРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRFEGRULType }
     *     
     */
    public void setАдрМНРФ(AddressRFEGRULType value) {
        this.адрМНРФ = value;
    }

    /**
     * Gets the value of the адрМНИн property.
     * 
     * @return
     *     possible object is
     *     {@link AddrrInEGRULType }
     *     
     */
    public AddrrInEGRULType getАдрМНИн() {
        return адрМНИн;
    }

    /**
     * Sets the value of the адрМНИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrrInEGRULType }
     *     
     */
    public void setАдрМНИн(AddrrInEGRULType value) {
        this.адрМНИн = value;
    }

    /**
     * Gets the value of the свУчетНОФилиал property.
     * 
     * @return
     *     possible object is
     *     {@link InfoUchetNalogOraganPodrazdlType }
     *     
     */
    public InfoUchetNalogOraganPodrazdlType getСвУчетНОФилиал() {
        return свУчетНОФилиал;
    }

    /**
     * Sets the value of the свУчетНОФилиал property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoUchetNalogOraganPodrazdlType }
     *     
     */
    public void setСвУчетНОФилиал(InfoUchetNalogOraganPodrazdlType value) {
        this.свУчетНОФилиал = value;
    }

}
