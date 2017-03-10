
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
 *         &lt;element name="СвСтатус">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодСтатусЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="3"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимСтатусЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="5"/>
 *                       &lt;maxLength value="500"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИзмСостРеоргЮЛ" type="{}ГРНДатаТип" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвРеоргЮЛ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                 &lt;attribute name="ИНН" use="required" type="{}ИННЮЛТип" />
 *                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="СостЮЛпосле">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="30"/>
 *                       &lt;maxLength value="50"/>
 *                       &lt;enumeration value="ПРЕКРАТИТ ДЕЯТЕЛЬНОСТЬ ПОСЛЕ РЕОРГАНИЗАЦИИ"/>
 *                       &lt;enumeration value="ПРОДОЛЖИТ ДЕЯТЕЛЬНОСТЬ ПОСЛЕ РЕОРГАНИЗАЦИИ"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430",
    "\u0433\u0440\u043d\u0414\u0430\u0442\u0430\u0418\u0437\u043c\u0421\u043e\u0441\u0442\u0420\u0435\u043e\u0440\u0433\u042e\u041b",
    "\u0441\u0432\u0420\u0435\u043e\u0440\u0433\u042e\u041b"
})
public class DocInfoReorganType {

    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441", required = true)
    protected DocInfoStatusReorganType свСтатус;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType грнДата;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0437\u043c\u0421\u043e\u0441\u0442\u0420\u0435\u043e\u0440\u0433\u042e\u041b")
    protected List<GRNDateType> грнДатаИзмСостРеоргЮЛ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u043e\u0440\u0433\u042e\u041b")
    protected List<DocInfoReorganULType> свРеоргЮЛ;

    /**
     * Gets the value of the свСтатус property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoStatusReorganType }
     *     
     */
    public DocInfoStatusReorganType getСвСтатус() {
        return свСтатус;
    }

    /**
     * Sets the value of the свСтатус property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoStatusReorganType }
     *     
     */
    public void setСвСтатус(DocInfoStatusReorganType value) {
        this.свСтатус = value;
    }

    /**
     * Gets the value of the грнДата property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getГРНДата() {
        return грнДата;
    }

    /**
     * Sets the value of the грнДата property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setГРНДата(GRNDateType value) {
        this.грнДата = value;
    }

    /**
     * Gets the value of the грнДатаИзмСостРеоргЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the грнДатаИзмСостРеоргЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getГРНДатаИзмСостРеоргЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GRNDateType }
     * 
     * 
     */
    public List<GRNDateType> getГРНДатаИзмСостРеоргЮЛ() {
        if (грнДатаИзмСостРеоргЮЛ == null) {
            грнДатаИзмСостРеоргЮЛ = new ArrayList<GRNDateType>();
        }
        return this.грнДатаИзмСостРеоргЮЛ;
    }

    /**
     * Gets the value of the свРеоргЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свРеоргЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвРеоргЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoReorganULType }
     * 
     * 
     */
    public List<DocInfoReorganULType> getСвРеоргЮЛ() {
        if (свРеоргЮЛ == null) {
            свРеоргЮЛ = new ArrayList<DocInfoReorganULType>();
        }
        return this.свРеоргЮЛ;
    }

}
