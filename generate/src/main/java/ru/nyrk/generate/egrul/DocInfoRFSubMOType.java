
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
 *         &lt;element name="ВидНаимУчр">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодУчрРФСубМО" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимМО">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="КодРегион" type="{}CCРФТип" />
 *                 &lt;attribute name="НаимРегион">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="100"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвОргОсущПр" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвФЛОсущПр" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                   &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "vidNameUchred",
    "\u0434\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f",
    "\u0441\u0432\u041e\u0440\u0433\u041e\u0441\u0443\u0449\u041f\u0440",
    "\u0441\u0432\u0424\u041b\u041e\u0441\u0443\u0449\u041f\u0440",
    "\u0441\u0432\u041e\u0431\u0440\u0435\u043c"
})
public class DocInfoRFSubMOType {

    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u041f\u0435\u0440\u0432")
    protected GRNDateType грнДатаПерв;
    @XmlElement(name = "\u0412\u0438\u0434\u041d\u0430\u0438\u043c\u0423\u0447\u0440", required = true)
    protected DocInfoVidNameUchredType vidNameUchred;
    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f")
    protected ShareCapitalEGRULType доляУстКап;
    @XmlElement(name = "\u0421\u0432\u041e\u0440\u0433\u041e\u0441\u0443\u0449\u041f\u0440")
    protected List<DocInfoOraganVlastiType> свОргОсущПр;
    @XmlElement(name = "\u0421\u0432\u0424\u041b\u041e\u0441\u0443\u0449\u041f\u0440")
    protected List<DocInfoFLOsuchestvlUcheredType> свФЛОсущПр;
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
     * Gets the value of the vidNameUchred property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoVidNameUchredType }
     *     
     */
    public DocInfoVidNameUchredType getVidNameUchred() {
        return vidNameUchred;
    }

    /**
     * Sets the value of the vidNameUchred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoVidNameUchredType }
     *     
     */
    public void setVidNameUchred(DocInfoVidNameUchredType value) {
        this.vidNameUchred = value;
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
     * Gets the value of the свОргОсущПр property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свОргОсущПр property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвОргОсущПр().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoOraganVlastiType }
     * 
     * 
     */
    public List<DocInfoOraganVlastiType> getСвОргОсущПр() {
        if (свОргОсущПр == null) {
            свОргОсущПр = new ArrayList<DocInfoOraganVlastiType>();
        }
        return this.свОргОсущПр;
    }

    /**
     * Gets the value of the свФЛОсущПр property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФЛОсущПр property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФЛОсущПр().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoFLOsuchestvlUcheredType }
     * 
     * 
     */
    public List<DocInfoFLOsuchestvlUcheredType> getСвФЛОсущПр() {
        if (свФЛОсущПр == null) {
            свФЛОсущПр = new ArrayList<DocInfoFLOsuchestvlUcheredType>();
        }
        return this.свФЛОсущПр;
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
