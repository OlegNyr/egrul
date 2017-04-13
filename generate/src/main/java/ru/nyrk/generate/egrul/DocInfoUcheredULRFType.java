
package ru.nyrk.generate.egrul;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="СвРегСтарые" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="РегНом">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаРег">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateError">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимРО">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
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
    "\u043d\u0430\u0438\u043c\u0418\u041d\u041d\u042e\u041b",
    "\u0441\u0432\u0420\u0435\u0433\u0421\u0442\u0430\u0440\u044b\u0435",
    "\u0434\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f",
    "\u0441\u0432\u041e\u0431\u0440\u0435\u043c"
})
public class DocInfoUcheredULRFType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0418\u041d\u041d\u042e\u041b", required = true)
    protected InfoULEGRULType наимИННЮЛ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0421\u0442\u0430\u0440\u044b\u0435")
    protected DocInfoUcheredULRFRegOldType свРегСтарые;
    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f")
    protected ShareCapitalEGRULType доляУстКап;
    @XmlElement(name = "\u0421\u0432\u041e\u0431\u0440\u0435\u043c")
    protected List<InfoObremType> свОбрем;

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
     * Gets the value of the наимИННЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link InfoULEGRULType }
     *     
     */
    public InfoULEGRULType getНаимИННЮЛ() {
        return наимИННЮЛ;
    }

    /**
     * Sets the value of the наимИННЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoULEGRULType }
     *     
     */
    public void setНаимИННЮЛ(InfoULEGRULType value) {
        this.наимИННЮЛ = value;
    }

    /**
     * Gets the value of the свРегСтарые property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoUcheredULRFRegOldType }
     *     
     */
    public DocInfoUcheredULRFRegOldType getСвРегСтарые() {
        return свРегСтарые;
    }

    /**
     * Sets the value of the свРегСтарые property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoUcheredULRFRegOldType }
     *     
     */
    public void setСвРегСтарые(DocInfoUcheredULRFRegOldType value) {
        this.свРегСтарые = value;
    }

    /**
     * Gets the value of the доляУстКап property.
     * 
     * @return
     *     possible object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public ShareCapitalEGRULType getДоляУстКап() {
        return доляУстКап;
    }

    /**
     * Sets the value of the доляУстКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public void setДоляУстКап(ShareCapitalEGRULType value) {
        this.доляУстКап = value;
    }

    /**
     * Gets the value of the свОбрем property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свОбрем property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвОбрем().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoObremType }
     * 
     * 
     */
    public List<InfoObremType> getСвОбрем() {
        if (свОбрем == null) {
            свОбрем = new ArrayList<InfoObremType>();
        }
        return this.свОбрем;
    }

}
