
package com.sap.xi.ap.fo.priceandtax.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.common.gdt.WithholdingTax;


/**
 * <p>Java class for MaintenancePriceAndTaxCalculationWithholdingTaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenancePriceAndTaxCalculationWithholdingTaxDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTax" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTax" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExchangeRateUnitCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExchangeRateQuotedCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxIncomeTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyWithholdingTax" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTax" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyWithholdingTaxIncomeTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
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
@XmlType(name = "MaintenancePriceAndTaxCalculationWithholdingTaxDetails", propOrder = {
    "uuid",
    "withholdingTax",
    "withholdingTaxExchangeRateUnitCurrencyName",
    "withholdingTaxExchangeRateQuotedCurrencyName",
    "withholdingTaxIncomeTypeName",
    "transactionCurrencyWithholdingTax",
    "transactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName",
    "transactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName",
    "transactionCurrencyWithholdingTaxIncomeTypeName"
})
public class MaintenancePriceAndTaxCalculationWithholdingTaxDetails {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "WithholdingTax")
    protected WithholdingTax withholdingTax;
    @XmlElement(name = "WithholdingTaxExchangeRateUnitCurrencyName")
    protected String withholdingTaxExchangeRateUnitCurrencyName;
    @XmlElement(name = "WithholdingTaxExchangeRateQuotedCurrencyName")
    protected String withholdingTaxExchangeRateQuotedCurrencyName;
    @XmlElement(name = "WithholdingTaxIncomeTypeName")
    protected String withholdingTaxIncomeTypeName;
    @XmlElement(name = "TransactionCurrencyWithholdingTax")
    protected WithholdingTax transactionCurrencyWithholdingTax;
    @XmlElement(name = "TransactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName")
    protected String transactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName;
    @XmlElement(name = "TransactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName")
    protected String transactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName;
    @XmlElement(name = "TransactionCurrencyWithholdingTaxIncomeTypeName")
    protected String transactionCurrencyWithholdingTaxIncomeTypeName;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the withholdingTax property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTax }
     *     
     */
    public WithholdingTax getWithholdingTax() {
        return withholdingTax;
    }

    /**
     * Sets the value of the withholdingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTax }
     *     
     */
    public void setWithholdingTax(WithholdingTax value) {
        this.withholdingTax = value;
    }

    /**
     * Gets the value of the withholdingTaxExchangeRateUnitCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxExchangeRateUnitCurrencyName() {
        return withholdingTaxExchangeRateUnitCurrencyName;
    }

    /**
     * Sets the value of the withholdingTaxExchangeRateUnitCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxExchangeRateUnitCurrencyName(String value) {
        this.withholdingTaxExchangeRateUnitCurrencyName = value;
    }

    /**
     * Gets the value of the withholdingTaxExchangeRateQuotedCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxExchangeRateQuotedCurrencyName() {
        return withholdingTaxExchangeRateQuotedCurrencyName;
    }

    /**
     * Sets the value of the withholdingTaxExchangeRateQuotedCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxExchangeRateQuotedCurrencyName(String value) {
        this.withholdingTaxExchangeRateQuotedCurrencyName = value;
    }

    /**
     * Gets the value of the withholdingTaxIncomeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxIncomeTypeName() {
        return withholdingTaxIncomeTypeName;
    }

    /**
     * Sets the value of the withholdingTaxIncomeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxIncomeTypeName(String value) {
        this.withholdingTaxIncomeTypeName = value;
    }

    /**
     * Gets the value of the transactionCurrencyWithholdingTax property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTax }
     *     
     */
    public WithholdingTax getTransactionCurrencyWithholdingTax() {
        return transactionCurrencyWithholdingTax;
    }

    /**
     * Sets the value of the transactionCurrencyWithholdingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTax }
     *     
     */
    public void setTransactionCurrencyWithholdingTax(WithholdingTax value) {
        this.transactionCurrencyWithholdingTax = value;
    }

    /**
     * Gets the value of the transactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName() {
        return transactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName;
    }

    /**
     * Sets the value of the transactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName(String value) {
        this.transactionCurrencyWithholdingTaxExchangeRateUnitCurrencyName = value;
    }

    /**
     * Gets the value of the transactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName() {
        return transactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName;
    }

    /**
     * Sets the value of the transactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName(String value) {
        this.transactionCurrencyWithholdingTaxExchangeRateQuotedCurrencyName = value;
    }

    /**
     * Gets the value of the transactionCurrencyWithholdingTaxIncomeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyWithholdingTaxIncomeTypeName() {
        return transactionCurrencyWithholdingTaxIncomeTypeName;
    }

    /**
     * Sets the value of the transactionCurrencyWithholdingTaxIncomeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyWithholdingTaxIncomeTypeName(String value) {
        this.transactionCurrencyWithholdingTaxIncomeTypeName = value;
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
