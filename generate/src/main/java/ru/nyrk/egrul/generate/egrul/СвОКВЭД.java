
package ru.nyrk.egrul.generate.egrul;

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
 *         &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
 *         &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
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
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414\u041e\u0441\u043d",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414\u0414\u043e\u043f"
})
public class СвОКВЭД {

    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414\u041e\u0441\u043d")
    protected InfoOKVEDType свОКВЭДОсн;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414\u0414\u043e\u043f")
    protected List<InfoOKVEDType> свОКВЭДДоп;

    /**
     * Gets the value of the свОКВЭДОсн property.
     * 
     * @return
     *     possible object is
     *     {@link InfoOKVEDType }
     *     
     */
    public InfoOKVEDType getСвОКВЭДОсн() {
        return свОКВЭДОсн;
    }

    /**
     * Sets the value of the свОКВЭДОсн property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoOKVEDType }
     *     
     */
    public void setСвОКВЭДОсн(InfoOKVEDType value) {
        this.свОКВЭДОсн = value;
    }

    /**
     * Gets the value of the свОКВЭДДоп property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свОКВЭДДоп property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвОКВЭДДоп().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoOKVEDType }
     * 
     * 
     */
    public List<InfoOKVEDType> getСвОКВЭДДоп() {
        if (свОКВЭДДоп == null) {
            свОКВЭДДоп = new ArrayList<InfoOKVEDType>();
        }
        return this.свОКВЭДДоп;
    }

}
