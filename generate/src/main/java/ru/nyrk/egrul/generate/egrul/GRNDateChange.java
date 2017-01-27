
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
 *         &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *         &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвНотУдДогЗал" type="{}СвНотУдДогЗалТип" minOccurs="0"/>
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
    "grnDateChange",
    "infoNameInnUL",
    "infoRegNotRezident",
    "infoNotariusUdDogZal"
})
public class GRNDateChange {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType grnDateChange;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0418\u041d\u041d\u042e\u041b", required = true)
    protected InfoULEGRULType infoNameInnUL;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u043d")
    protected InfoRegInstrEGRULULType infoRegNotRezident;
    @XmlElement(name = "\u0421\u0432\u041d\u043e\u0442\u0423\u0434\u0414\u043e\u0433\u0417\u0430\u043b")
    protected InfoNotarialDogZalog infoNotariusUdDogZal;

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
     * Gets the value of the infoNameInnUL property.
     * 
     * @return
     *     possible object is
     *     {@link InfoULEGRULType }
     *     
     */
    public InfoULEGRULType getInfoNameInnUL() {
        return infoNameInnUL;
    }

    /**
     * Sets the value of the infoNameInnUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoULEGRULType }
     *     
     */
    public void setInfoNameInnUL(InfoULEGRULType value) {
        this.infoNameInnUL = value;
    }

    /**
     * Gets the value of the infoRegNotRezident property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRegInstrEGRULULType }
     *     
     */
    public InfoRegInstrEGRULULType getInfoRegNotRezident() {
        return infoRegNotRezident;
    }

    /**
     * Sets the value of the infoRegNotRezident property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRegInstrEGRULULType }
     *     
     */
    public void setInfoRegNotRezident(InfoRegInstrEGRULULType value) {
        this.infoRegNotRezident = value;
    }

    /**
     * Gets the value of the infoNotariusUdDogZal property.
     * 
     * @return
     *     possible object is
     *     {@link InfoNotarialDogZalog }
     *     
     */
    public InfoNotarialDogZalog getInfoNotariusUdDogZal() {
        return infoNotariusUdDogZal;
    }

    /**
     * Sets the value of the infoNotariusUdDogZal property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoNotarialDogZalog }
     *     
     */
    public void setInfoNotariusUdDogZal(InfoNotarialDogZalog value) {
        this.infoNotariusUdDogZal = value;
    }

}
