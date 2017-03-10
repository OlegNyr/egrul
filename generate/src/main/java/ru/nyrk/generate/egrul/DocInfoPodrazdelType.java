
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
 *         &lt;element name="СвФилиал" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвНаим" type="{}СвНаимПодраздТип" minOccurs="0"/>
 *                   &lt;element name="АдрМНРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдрМНИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвУчетНОФилиал" type="{}СвУчетНОПодраздТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвПредстав" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвНаим" type="{}СвНаимПодраздТип" minOccurs="0"/>
 *                   &lt;element name="АдрМНРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдрМНИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвУчетНОПредстав" type="{}СвУчетНОПодраздТип" minOccurs="0"/>
 *                 &lt;/sequence>
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
    "\u0441\u0432\u0424\u0438\u043b\u0438\u0430\u043b",
    "\u0441\u0432\u041f\u0440\u0435\u0434\u0441\u0442\u0430\u0432"
})
public class DocInfoPodrazdelType {

    @XmlElement(name = "\u0421\u0432\u0424\u0438\u043b\u0438\u0430\u043b")
    protected List<DocFilialInfoStopLicensiaType> свФилиал;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u0434\u0441\u0442\u0430\u0432")
    protected List<DocInfoPredstavitelstvaType> свПредстав;

    /**
     * Gets the value of the свФилиал property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФилиал property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФилиал().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocFilialInfoStopLicensiaType }
     * 
     * 
     */
    public List<DocFilialInfoStopLicensiaType> getСвФилиал() {
        if (свФилиал == null) {
            свФилиал = new ArrayList<DocFilialInfoStopLicensiaType>();
        }
        return this.свФилиал;
    }

    /**
     * Gets the value of the свПредстав property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свПредстав property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвПредстав().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoPredstavitelstvaType }
     * 
     * 
     */
    public List<DocInfoPredstavitelstvaType> getСвПредстав() {
        if (свПредстав == null) {
            свПредстав = new ArrayList<DocInfoPredstavitelstvaType>();
        }
        return this.свПредстав;
    }

}
