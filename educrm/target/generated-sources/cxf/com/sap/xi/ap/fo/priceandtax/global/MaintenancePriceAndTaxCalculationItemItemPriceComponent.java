
package com.sap.xi.ap.fo.priceandtax.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.PriceSpecificationElementTypeCode;
import com.sap.xi.ap.common.gdt.QuantityTypeCode;
import com.sap.xi.ap.common.gdt.Rate;


/**
 * <p>Java class for MaintenancePriceAndTaxCalculationItemItemPriceComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenancePriceAndTaxCalculationItemItemPriceComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}PriceSpecificationElementTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://sap.com/xi/AP/Common/GDT}Rate" minOccurs="0"/&gt;
 *         &lt;element name="RateMeasureUnitName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="RateCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="RateBaseMeasureUnitName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="RateBaseCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="RateBaseQuantityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenancePriceAndTaxCalculationItemItemPriceComponent", propOrder = {
    "technicalID",
    "typeCode",
    "rate",
    "rateMeasureUnitName",
    "rateCurrencyName",
    "rateBaseMeasureUnitName",
    "rateBaseCurrencyName",
    "rateBaseQuantityTypeCode"
})
public class MaintenancePriceAndTaxCalculationItemItemPriceComponent {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "TypeCode")
    protected PriceSpecificationElementTypeCode typeCode;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "RateMeasureUnitName")
    protected String rateMeasureUnitName;
    @XmlElement(name = "RateCurrencyName")
    protected String rateCurrencyName;
    @XmlElement(name = "RateBaseMeasureUnitName")
    protected String rateBaseMeasureUnitName;
    @XmlElement(name = "RateBaseCurrencyName")
    protected String rateBaseCurrencyName;
    @XmlElement(name = "RateBaseQuantityTypeCode")
    protected QuantityTypeCode rateBaseQuantityTypeCode;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the technicalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalID() {
        return technicalID;
    }

    /**
     * Sets the value of the technicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalID(String value) {
        this.technicalID = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationElementTypeCode }
     *     
     */
    public PriceSpecificationElementTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationElementTypeCode }
     *     
     */
    public void setTypeCode(PriceSpecificationElementTypeCode value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rateMeasureUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateMeasureUnitName() {
        return rateMeasureUnitName;
    }

    /**
     * Sets the value of the rateMeasureUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateMeasureUnitName(String value) {
        this.rateMeasureUnitName = value;
    }

    /**
     * Gets the value of the rateCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCurrencyName() {
        return rateCurrencyName;
    }

    /**
     * Sets the value of the rateCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCurrencyName(String value) {
        this.rateCurrencyName = value;
    }

    /**
     * Gets the value of the rateBaseMeasureUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateBaseMeasureUnitName() {
        return rateBaseMeasureUnitName;
    }

    /**
     * Sets the value of the rateBaseMeasureUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateBaseMeasureUnitName(String value) {
        this.rateBaseMeasureUnitName = value;
    }

    /**
     * Gets the value of the rateBaseCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateBaseCurrencyName() {
        return rateBaseCurrencyName;
    }

    /**
     * Sets the value of the rateBaseCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateBaseCurrencyName(String value) {
        this.rateBaseCurrencyName = value;
    }

    /**
     * Gets the value of the rateBaseQuantityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeCode }
     *     
     */
    public QuantityTypeCode getRateBaseQuantityTypeCode() {
        return rateBaseQuantityTypeCode;
    }

    /**
     * Sets the value of the rateBaseQuantityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeCode }
     *     
     */
    public void setRateBaseQuantityTypeCode(QuantityTypeCode value) {
        this.rateBaseQuantityTypeCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
