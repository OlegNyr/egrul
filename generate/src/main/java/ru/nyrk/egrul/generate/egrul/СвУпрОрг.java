
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *       &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *       &lt;attribute name="НаимЮЛПолн" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1000"/>
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
@XmlType(name = "")
public class СвУпрОрг {

    @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
    protected String огрн;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String инн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d", required = true)
    protected String наимЮЛПолн;

    /**
     * Gets the value of the огрн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОГРН() {
        return огрн;
    }

    /**
     * Sets the value of the огрн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОГРН(String value) {
        this.огрн = value;
    }

    /**
     * Gets the value of the инн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИНН() {
        return инн;
    }

    /**
     * Sets the value of the инн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИНН(String value) {
        this.инн = value;
    }

    /**
     * Gets the value of the наимЮЛПолн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимЮЛПолн() {
        return наимЮЛПолн;
    }

    /**
     * Sets the value of the наимЮЛПолн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимЮЛПолн(String value) {
        this.наимЮЛПолн = value;
    }

}
