
package com.sap.xi.ap.common.gdt;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="JurisdictionCode" type="{http://sap.com/xi/AP/Common/GDT}TaxJurisdictionCode" minOccurs="0"/&gt;
 *         &lt;element name="JurisdictionSubdivisionCode" type="{http://sap.com/xi/AP/Common/GDT}TaxJurisdictionSubdivisionCode" minOccurs="0"/&gt;
 *         &lt;element name="JurisdictionSubdivisionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxJurisdictionSubdivisionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="EventTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxEventTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="RateTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxRateTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="BaseAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="BaseQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="BaseQuantityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://sap.com/xi/AP/Common/GDT}Rate" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="InternalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="NonDeductiblePercent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="NonDeductibleAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="DeductibleAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="DeductibilityCode" type="{http://sap.com/xi/AP/Common/GDT}TaxDeductibilityCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTransactionDocumentItemGroupID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemGroupID" minOccurs="0"/&gt;
 *         &lt;element name="EuropeanCommunityVATTriangulationIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DueCategoryCode" type="{http://sap.com/xi/AP/Common/GDT}DueCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="StatisticRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DeferredIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="Exemption" type="{http://sap.com/xi/AP/Common/GDT}TaxExemption" minOccurs="0"/&gt;
 *         &lt;element name="FollowUpExemption" type="{http://sap.com/xi/AP/Common/GDT}TaxExemption" minOccurs="0"/&gt;
 *         &lt;element name="LegallyRequiredPhrase" type="{http://sap.com/xi/AP/Common/GDT}LegallyRequiredPhraseText" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://sap.com/xi/AP/Common/GDT}ExchangeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTax", propOrder = {
    "countryCode",
    "regionCode",
    "jurisdictionCode",
    "jurisdictionSubdivisionCode",
    "jurisdictionSubdivisionTypeCode",
    "eventTypeCode",
    "typeCode",
    "rateTypeCode",
    "currencyCode",
    "baseAmount",
    "percent",
    "baseQuantity",
    "baseQuantityTypeCode",
    "rate",
    "amount",
    "internalAmount",
    "nonDeductiblePercent",
    "nonDeductibleAmount",
    "deductibleAmount",
    "deductibilityCode",
    "businessTransactionDocumentItemGroupID",
    "europeanCommunityVATTriangulationIndicator",
    "dueCategoryCode",
    "statisticRelevanceIndicator",
    "deferredIndicator",
    "exemption",
    "followUpExemption",
    "legallyRequiredPhrase",
    "exchangeRate"
})
public class ProductTax {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "JurisdictionCode")
    protected TaxJurisdictionCode jurisdictionCode;
    @XmlElement(name = "JurisdictionSubdivisionCode")
    protected TaxJurisdictionSubdivisionCode jurisdictionSubdivisionCode;
    @XmlElement(name = "JurisdictionSubdivisionTypeCode")
    protected TaxJurisdictionSubdivisionTypeCode jurisdictionSubdivisionTypeCode;
    @XmlElement(name = "EventTypeCode")
    protected ProductTaxEventTypeCode eventTypeCode;
    @XmlElement(name = "TypeCode")
    protected TaxTypeCode typeCode;
    @XmlElement(name = "RateTypeCode")
    protected TaxRateTypeCode rateTypeCode;
    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "BaseAmount")
    protected Amount baseAmount;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "BaseQuantity")
    protected Quantity baseQuantity;
    @XmlElement(name = "BaseQuantityTypeCode")
    protected QuantityTypeCode baseQuantityTypeCode;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "InternalAmount")
    protected Amount internalAmount;
    @XmlElement(name = "NonDeductiblePercent")
    protected BigDecimal nonDeductiblePercent;
    @XmlElement(name = "NonDeductibleAmount")
    protected Amount nonDeductibleAmount;
    @XmlElement(name = "DeductibleAmount")
    protected Amount deductibleAmount;
    @XmlElement(name = "DeductibilityCode")
    protected TaxDeductibilityCode deductibilityCode;
    @XmlElement(name = "BusinessTransactionDocumentItemGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessTransactionDocumentItemGroupID;
    @XmlElement(name = "EuropeanCommunityVATTriangulationIndicator")
    protected Boolean europeanCommunityVATTriangulationIndicator;
    @XmlElement(name = "DueCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dueCategoryCode;
    @XmlElement(name = "StatisticRelevanceIndicator")
    protected Boolean statisticRelevanceIndicator;
    @XmlElement(name = "DeferredIndicator")
    protected Boolean deferredIndicator;
    @XmlElement(name = "Exemption")
    protected TaxExemption exemption;
    @XmlElement(name = "FollowUpExemption")
    protected TaxExemption followUpExemption;
    @XmlElement(name = "LegallyRequiredPhrase")
    protected String legallyRequiredPhrase;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRate exchangeRate;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the jurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public TaxJurisdictionCode getJurisdictionCode() {
        return jurisdictionCode;
    }

    /**
     * Sets the value of the jurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public void setJurisdictionCode(TaxJurisdictionCode value) {
        this.jurisdictionCode = value;
    }

    /**
     * Gets the value of the jurisdictionSubdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionSubdivisionCode }
     *     
     */
    public TaxJurisdictionSubdivisionCode getJurisdictionSubdivisionCode() {
        return jurisdictionSubdivisionCode;
    }

    /**
     * Sets the value of the jurisdictionSubdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionSubdivisionCode }
     *     
     */
    public void setJurisdictionSubdivisionCode(TaxJurisdictionSubdivisionCode value) {
        this.jurisdictionSubdivisionCode = value;
    }

    /**
     * Gets the value of the jurisdictionSubdivisionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionSubdivisionTypeCode }
     *     
     */
    public TaxJurisdictionSubdivisionTypeCode getJurisdictionSubdivisionTypeCode() {
        return jurisdictionSubdivisionTypeCode;
    }

    /**
     * Sets the value of the jurisdictionSubdivisionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionSubdivisionTypeCode }
     *     
     */
    public void setJurisdictionSubdivisionTypeCode(TaxJurisdictionSubdivisionTypeCode value) {
        this.jurisdictionSubdivisionTypeCode = value;
    }

    /**
     * Gets the value of the eventTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTaxEventTypeCode }
     *     
     */
    public ProductTaxEventTypeCode getEventTypeCode() {
        return eventTypeCode;
    }

    /**
     * Sets the value of the eventTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTaxEventTypeCode }
     *     
     */
    public void setEventTypeCode(ProductTaxEventTypeCode value) {
        this.eventTypeCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCode }
     *     
     */
    public TaxTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCode }
     *     
     */
    public void setTypeCode(TaxTypeCode value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the rateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateTypeCode }
     *     
     */
    public TaxRateTypeCode getRateTypeCode() {
        return rateTypeCode;
    }

    /**
     * Sets the value of the rateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateTypeCode }
     *     
     */
    public void setRateTypeCode(TaxRateTypeCode value) {
        this.rateTypeCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBaseAmount(Amount value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the baseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * Sets the value of the baseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setBaseQuantity(Quantity value) {
        this.baseQuantity = value;
    }

    /**
     * Gets the value of the baseQuantityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeCode }
     *     
     */
    public QuantityTypeCode getBaseQuantityTypeCode() {
        return baseQuantityTypeCode;
    }

    /**
     * Sets the value of the baseQuantityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeCode }
     *     
     */
    public void setBaseQuantityTypeCode(QuantityTypeCode value) {
        this.baseQuantityTypeCode = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the internalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getInternalAmount() {
        return internalAmount;
    }

    /**
     * Sets the value of the internalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setInternalAmount(Amount value) {
        this.internalAmount = value;
    }

    /**
     * Gets the value of the nonDeductiblePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonDeductiblePercent() {
        return nonDeductiblePercent;
    }

    /**
     * Sets the value of the nonDeductiblePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonDeductiblePercent(BigDecimal value) {
        this.nonDeductiblePercent = value;
    }

    /**
     * Gets the value of the nonDeductibleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNonDeductibleAmount() {
        return nonDeductibleAmount;
    }

    /**
     * Sets the value of the nonDeductibleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNonDeductibleAmount(Amount value) {
        this.nonDeductibleAmount = value;
    }

    /**
     * Gets the value of the deductibleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getDeductibleAmount() {
        return deductibleAmount;
    }

    /**
     * Sets the value of the deductibleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setDeductibleAmount(Amount value) {
        this.deductibleAmount = value;
    }

    /**
     * Gets the value of the deductibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeductibilityCode }
     *     
     */
    public TaxDeductibilityCode getDeductibilityCode() {
        return deductibilityCode;
    }

    /**
     * Sets the value of the deductibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeductibilityCode }
     *     
     */
    public void setDeductibilityCode(TaxDeductibilityCode value) {
        this.deductibilityCode = value;
    }

    /**
     * Gets the value of the businessTransactionDocumentItemGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionDocumentItemGroupID() {
        return businessTransactionDocumentItemGroupID;
    }

    /**
     * Sets the value of the businessTransactionDocumentItemGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionDocumentItemGroupID(String value) {
        this.businessTransactionDocumentItemGroupID = value;
    }

    /**
     * Gets the value of the europeanCommunityVATTriangulationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEuropeanCommunityVATTriangulationIndicator() {
        return europeanCommunityVATTriangulationIndicator;
    }

    /**
     * Sets the value of the europeanCommunityVATTriangulationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEuropeanCommunityVATTriangulationIndicator(Boolean value) {
        this.europeanCommunityVATTriangulationIndicator = value;
    }

    /**
     * Gets the value of the dueCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueCategoryCode() {
        return dueCategoryCode;
    }

    /**
     * Sets the value of the dueCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueCategoryCode(String value) {
        this.dueCategoryCode = value;
    }

    /**
     * Gets the value of the statisticRelevanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatisticRelevanceIndicator() {
        return statisticRelevanceIndicator;
    }

    /**
     * Sets the value of the statisticRelevanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatisticRelevanceIndicator(Boolean value) {
        this.statisticRelevanceIndicator = value;
    }

    /**
     * Gets the value of the deferredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferredIndicator() {
        return deferredIndicator;
    }

    /**
     * Sets the value of the deferredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferredIndicator(Boolean value) {
        this.deferredIndicator = value;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getExemption() {
        return exemption;
    }

    /**
     * Sets the value of the exemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setExemption(TaxExemption value) {
        this.exemption = value;
    }

    /**
     * Gets the value of the followUpExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getFollowUpExemption() {
        return followUpExemption;
    }

    /**
     * Sets the value of the followUpExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setFollowUpExemption(TaxExemption value) {
        this.followUpExemption = value;
    }

    /**
     * Gets the value of the legallyRequiredPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegallyRequiredPhrase() {
        return legallyRequiredPhrase;
    }

    /**
     * Sets the value of the legallyRequiredPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegallyRequiredPhrase(String value) {
        this.legallyRequiredPhrase = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate }
     *     
     */
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate }
     *     
     */
    public void setExchangeRate(ExchangeRate value) {
        this.exchangeRate = value;
    }

}
