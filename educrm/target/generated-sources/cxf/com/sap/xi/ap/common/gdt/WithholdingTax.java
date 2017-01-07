
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
 * <p>Java class for WithholdingTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithholdingTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="EventTypeCode" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTaxEventTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="RateTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxRateTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="BaseAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount"/&gt;
 *         &lt;element name="Percent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ExcludedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTransactionDocumentItemGroupID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemGroupID" minOccurs="0"/&gt;
 *         &lt;element name="StatisticRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="PlannedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://sap.com/xi/AP/Common/GDT}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element name="IncomeTypeCode" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTaxIncomeTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithholdingTax", propOrder = {
    "countryCode",
    "regionCode",
    "eventTypeCode",
    "typeCode",
    "rateTypeCode",
    "currencyCode",
    "baseAmount",
    "percent",
    "amount",
    "excludedAmount",
    "businessTransactionDocumentItemGroupID",
    "statisticRelevanceIndicator",
    "plannedIndicator",
    "exchangeRate",
    "incomeTypeCode"
})
public class WithholdingTax {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "EventTypeCode")
    protected WithholdingTaxEventTypeCode eventTypeCode;
    @XmlElement(name = "TypeCode")
    protected TaxTypeCode typeCode;
    @XmlElement(name = "RateTypeCode")
    protected TaxRateTypeCode rateTypeCode;
    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "BaseAmount", required = true)
    protected Amount baseAmount;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "ExcludedAmount")
    protected Amount excludedAmount;
    @XmlElement(name = "BusinessTransactionDocumentItemGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessTransactionDocumentItemGroupID;
    @XmlElement(name = "StatisticRelevanceIndicator")
    protected Boolean statisticRelevanceIndicator;
    @XmlElement(name = "PlannedIndicator")
    protected Boolean plannedIndicator;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRate exchangeRate;
    @XmlElement(name = "IncomeTypeCode")
    protected WithholdingTaxIncomeTypeCode incomeTypeCode;

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
     * Gets the value of the eventTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTaxEventTypeCode }
     *     
     */
    public WithholdingTaxEventTypeCode getEventTypeCode() {
        return eventTypeCode;
    }

    /**
     * Sets the value of the eventTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTaxEventTypeCode }
     *     
     */
    public void setEventTypeCode(WithholdingTaxEventTypeCode value) {
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
     * Gets the value of the excludedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getExcludedAmount() {
        return excludedAmount;
    }

    /**
     * Sets the value of the excludedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setExcludedAmount(Amount value) {
        this.excludedAmount = value;
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
     * Gets the value of the plannedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedIndicator() {
        return plannedIndicator;
    }

    /**
     * Sets the value of the plannedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedIndicator(Boolean value) {
        this.plannedIndicator = value;
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

    /**
     * Gets the value of the incomeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTaxIncomeTypeCode }
     *     
     */
    public WithholdingTaxIncomeTypeCode getIncomeTypeCode() {
        return incomeTypeCode;
    }

    /**
     * Sets the value of the incomeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTaxIncomeTypeCode }
     *     
     */
    public void setIncomeTypeCode(WithholdingTaxIncomeTypeCode value) {
        this.incomeTypeCode = value;
    }

}
