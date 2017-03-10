
package ru.nyrk.generate.egrul;

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
 *         &lt;element name="ДержРеестрАО" type="{}СвЮЛЕГРЮЛТип"/>
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
    "\u0434\u0435\u0440\u0436\u0420\u0435\u0435\u0441\u0442\u0440\u0410\u041e"
})
public class DocInfoReestrAOType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u0414\u0435\u0440\u0436\u0420\u0435\u0435\u0441\u0442\u0440\u0410\u041e", required = true)
    protected InfoULEGRULType держРеестрАО;

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
     * Gets the value of the держРеестрАО property.
     * 
     * @return
     *     possible object is
     *     {@link InfoULEGRULType }
     *     
     */
    public InfoULEGRULType getДержРеестрАО() {
        return держРеестрАО;
    }

    /**
     * Sets the value of the держРеестрАО property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoULEGRULType }
     *     
     */
    public void setДержРеестрАО(InfoULEGRULType value) {
        this.держРеестрАО = value;
    }

}
