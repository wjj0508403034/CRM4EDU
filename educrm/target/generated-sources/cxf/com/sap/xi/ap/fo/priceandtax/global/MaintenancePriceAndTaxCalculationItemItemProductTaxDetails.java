
package com.sap.xi.ap.fo.priceandtax.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.ProductTax;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for MaintenancePriceAndTaxCalculationItemItemProductTaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenancePriceAndTaxCalculationItemItemProductTaxDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyProductTax" type="{http://sap.com/xi/AP/Common/GDT}ProductTax" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyProductTaxExchangeRateUnitCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyProductTaxExchangeRateQuotedCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
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
@XmlType(name = "MaintenancePriceAndTaxCalculationItemItemProductTaxDetails", propOrder = {
    "uuid",
    "transactionCurrencyProductTax",
    "transactionCurrencyProductTaxExchangeRateUnitCurrencyName",
    "transactionCurrencyProductTaxExchangeRateQuotedCurrencyName"
})
public class MaintenancePriceAndTaxCalculationItemItemProductTaxDetails {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "TransactionCurrencyProductTax")
    protected ProductTax transactionCurrencyProductTax;
    @XmlElement(name = "TransactionCurrencyProductTaxExchangeRateUnitCurrencyName")
    protected String transactionCurrencyProductTaxExchangeRateUnitCurrencyName;
    @XmlElement(name = "TransactionCurrencyProductTaxExchangeRateQuotedCurrencyName")
    protected String transactionCurrencyProductTaxExchangeRateQuotedCurrencyName;
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
     * Gets the value of the transactionCurrencyProductTax property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTax }
     *     
     */
    public ProductTax getTransactionCurrencyProductTax() {
        return transactionCurrencyProductTax;
    }

    /**
     * Sets the value of the transactionCurrencyProductTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTax }
     *     
     */
    public void setTransactionCurrencyProductTax(ProductTax value) {
        this.transactionCurrencyProductTax = value;
    }

    /**
     * Gets the value of the transactionCurrencyProductTaxExchangeRateUnitCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyProductTaxExchangeRateUnitCurrencyName() {
        return transactionCurrencyProductTaxExchangeRateUnitCurrencyName;
    }

    /**
     * Sets the value of the transactionCurrencyProductTaxExchangeRateUnitCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyProductTaxExchangeRateUnitCurrencyName(String value) {
        this.transactionCurrencyProductTaxExchangeRateUnitCurrencyName = value;
    }

    /**
     * Gets the value of the transactionCurrencyProductTaxExchangeRateQuotedCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyProductTaxExchangeRateQuotedCurrencyName() {
        return transactionCurrencyProductTaxExchangeRateQuotedCurrencyName;
    }

    /**
     * Sets the value of the transactionCurrencyProductTaxExchangeRateQuotedCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyProductTaxExchangeRateQuotedCurrencyName(String value) {
        this.transactionCurrencyProductTaxExchangeRateQuotedCurrencyName = value;
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
