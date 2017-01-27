
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
 *         &lt;element name="НаимИННДовУпр" type="{}СвЮЛЕГРЮЛТип"/>
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
    "\u043d\u0430\u0438\u043c\u0418\u041d\u041d\u0414\u043e\u0432\u0423\u043f\u0440"
})
public class СвДовУпрЮЛ {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0418\u041d\u041d\u0414\u043e\u0432\u0423\u043f\u0440", required = true)
    protected InfoULEGRULType наимИННДовУпр;

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
     * Gets the value of the наимИННДовУпр property.
     * 
     * @return
     *     possible object is
     *     {@link InfoULEGRULType }
     *     
     */
    public InfoULEGRULType getНаимИННДовУпр() {
        return наимИННДовУпр;
    }

    /**
     * Sets the value of the наимИННДовУпр property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoULEGRULType }
     *     
     */
    public void setНаимИННДовУпр(InfoULEGRULType value) {
        this.наимИННДовУпр = value;
    }

}
