
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об адресе в РФ, внесенные в ЕГРЮЛ
 * 
 * <p>Java class for АдрРФЕГРЮЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдрРФЕГРЮЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Регион" type="{}РегионТип"/>
 *         &lt;element name="Район" type="{}РайонТип" minOccurs="0"/>
 *         &lt;element name="Город" type="{}ГородТип" minOccurs="0"/>
 *         &lt;element name="НаселПункт" type="{}НаселПунктТип" minOccurs="0"/>
 *         &lt;element name="Улица" type="{}УлицаТип" minOccurs="0"/>
 *         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Индекс">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="6"/>
 *             &lt;pattern value="[0-9]{6}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодРегион" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{}CCРФТип">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодАдрКладр">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="11"/>
 *             &lt;maxLength value="19"/>
 *             &lt;pattern value="[0-9]{11}"/>
 *             &lt;pattern value="[0-9]{15}"/>
 *             &lt;pattern value="[0-9]{19}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Дом">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Корпус">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Кварт">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
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
@XmlType(name = "\u0410\u0434\u0440\u0420\u0424\u0415\u0413\u0420\u042e\u041b\u0422\u0438\u043f", propOrder = {
    "regionType",
    "districtType",
    "cityType",
    "localityType",
    "streetType",
    "grnType",
    "grnDateType"
})
public class AddressRFEGRULType {

    @XmlElement(name = "\u0420\u0435\u0433\u0438\u043e\u043d", required = true)
    protected RegionType regionType;
    @XmlElement(name = "\u0420\u0430\u0439\u043e\u043d")
    protected DistrictType districtType;
    @XmlElement(name = "\u0413\u043e\u0440\u043e\u0434")
    protected CityType cityType;
    @XmlElement(name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442")
    protected LocalityType localityType;
    @XmlElement(name = "\u0423\u043b\u0438\u0446\u0430")
    protected StreetType streetType;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430", required = true)
    protected GRNDateType grnType;
    @XmlElement(name = "\u0413\u0420\u041d\u0414\u0430\u0442\u0430\u0418\u0441\u043f\u0440")
    protected GRNDateType grnDateType;
    @XmlAttribute(name = "\u0418\u043d\u0434\u0435\u043a\u0441")
    protected String index;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d", required = true)
    protected String kodRegion;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0410\u0434\u0440\u041a\u043b\u0430\u0434\u0440")
    protected String kodKLADR;
    @XmlAttribute(name = "\u0414\u043e\u043c")
    protected String house;
    @XmlAttribute(name = "\u041a\u043e\u0440\u043f\u0443\u0441")
    protected String korpus;
    @XmlAttribute(name = "\u041a\u0432\u0430\u0440\u0442")
    protected String kwart;

    /**
     * Gets the value of the regionType property.
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegionType() {
        return regionType;
    }

    /**
     * Sets the value of the regionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     */
    public void setRegionType(RegionType value) {
        this.regionType = value;
    }

    /**
     * Gets the value of the districtType property.
     * 
     * @return
     *     possible object is
     *     {@link DistrictType }
     *     
     */
    public DistrictType getDistrictType() {
        return districtType;
    }

    /**
     * Sets the value of the districtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictType }
     *     
     */
    public void setDistrictType(DistrictType value) {
        this.districtType = value;
    }

    /**
     * Gets the value of the cityType property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCityType() {
        return cityType;
    }

    /**
     * Sets the value of the cityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCityType(CityType value) {
        this.cityType = value;
    }

    /**
     * Gets the value of the localityType property.
     * 
     * @return
     *     possible object is
     *     {@link LocalityType }
     *     
     */
    public LocalityType getLocalityType() {
        return localityType;
    }

    /**
     * Sets the value of the localityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalityType }
     *     
     */
    public void setLocalityType(LocalityType value) {
        this.localityType = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link StreetType }
     *     
     */
    public StreetType getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetType }
     *     
     */
    public void setStreetType(StreetType value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the grnType property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNType() {
        return grnType;
    }

    /**
     * Sets the value of the grnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNType(GRNDateType value) {
        this.grnType = value;
    }

    /**
     * Gets the value of the grnDateType property.
     * 
     * @return
     *     possible object is
     *     {@link GRNDateType }
     *     
     */
    public GRNDateType getGRNDateType() {
        return grnDateType;
    }

    /**
     * Sets the value of the grnDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRNDateType }
     *     
     */
    public void setGRNDateType(GRNDateType value) {
        this.grnDateType = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the kodRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodRegion() {
        return kodRegion;
    }

    /**
     * Sets the value of the kodRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodRegion(String value) {
        this.kodRegion = value;
    }

    /**
     * Gets the value of the kodKLADR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodKLADR() {
        return kodKLADR;
    }

    /**
     * Sets the value of the kodKLADR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodKLADR(String value) {
        this.kodKLADR = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the korpus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKorpus() {
        return korpus;
    }

    /**
     * Sets the value of the korpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorpus(String value) {
        this.korpus = value;
    }

    /**
     * Gets the value of the kwart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKwart() {
        return kwart;
    }

    /**
     * Sets the value of the kwart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKwart(String value) {
        this.kwart = value;
    }

}
