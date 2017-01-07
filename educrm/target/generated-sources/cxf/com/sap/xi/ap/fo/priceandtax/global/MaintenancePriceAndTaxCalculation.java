
package com.sap.xi.ap.fo.priceandtax.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.PriceAndTaxCalculationScopeCode;
import com.sap.xi.ap.common.gdt.PriceSpecificationElementPropertyDefinitionClassCode;
import com.sap.xi.ap.common.gdt.PricingProcedureCode;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for MaintenancePriceAndTaxCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenancePriceAndTaxCalculation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ScopeCode" type="{http://sap.com/xi/AP/Common/GDT}PriceAndTaxCalculationScopeCode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyDefinitionClassCode" type="{http://sap.com/xi/AP/Common/GDT}PriceSpecificationElementPropertyDefinitionClassCode" minOccurs="0"/&gt;
 *         &lt;element name="PricingProcedureCode" type="{http://sap.com/xi/AP/Common/GDT}PricingProcedureCode" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriceComponent" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductTaxDetails" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationProductTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxationTerms" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationTaxationTerms" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxDetails" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationWithholdingTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ItemListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="PriceComponentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ProductTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="WithholdingTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenancePriceAndTaxCalculation", propOrder = {
    "uuid",
    "scopeCode",
    "propertyDefinitionClassCode",
    "pricingProcedureCode",
    "currencyCode",
    "item",
    "priceComponent",
    "productTaxDetails",
    "taxationTerms",
    "withholdingTaxDetails"
})
public class MaintenancePriceAndTaxCalculation {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ScopeCode")
    protected PriceAndTaxCalculationScopeCode scopeCode;
    @XmlElement(name = "PropertyDefinitionClassCode")
    protected PriceSpecificationElementPropertyDefinitionClassCode propertyDefinitionClassCode;
    @XmlElement(name = "PricingProcedureCode")
    protected PricingProcedureCode pricingProcedureCode;
    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "Item")
    protected List<MaintenancePriceAndTaxCalculationItem> item;
    @XmlElement(name = "PriceComponent")
    protected List<MaintenancePriceAndTaxCalculationPriceComponent> priceComponent;
    @XmlElement(name = "ProductTaxDetails")
    protected List<MaintenancePriceAndTaxCalculationProductTaxDetails> productTaxDetails;
    @XmlElement(name = "TaxationTerms")
    protected MaintenancePriceAndTaxCalculationTaxationTerms taxationTerms;
    @XmlElement(name = "WithholdingTaxDetails")
    protected List<MaintenancePriceAndTaxCalculationWithholdingTaxDetails> withholdingTaxDetails;
    @XmlAttribute(name = "ItemListCompleteTransmissionIndicator")
    protected Boolean itemListCompleteTransmissionIndicator;
    @XmlAttribute(name = "PriceComponentListCompleteTransmissionIndicator")
    protected Boolean priceComponentListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ProductTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean productTaxDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "WithholdingTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean withholdingTaxDetailsListCompleteTransmissionIndicator;
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
     * Gets the value of the scopeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndTaxCalculationScopeCode }
     *     
     */
    public PriceAndTaxCalculationScopeCode getScopeCode() {
        return scopeCode;
    }

    /**
     * Sets the value of the scopeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndTaxCalculationScopeCode }
     *     
     */
    public void setScopeCode(PriceAndTaxCalculationScopeCode value) {
        this.scopeCode = value;
    }

    /**
     * Gets the value of the propertyDefinitionClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationElementPropertyDefinitionClassCode }
     *     
     */
    public PriceSpecificationElementPropertyDefinitionClassCode getPropertyDefinitionClassCode() {
        return propertyDefinitionClassCode;
    }

    /**
     * Sets the value of the propertyDefinitionClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationElementPropertyDefinitionClassCode }
     *     
     */
    public void setPropertyDefinitionClassCode(PriceSpecificationElementPropertyDefinitionClassCode value) {
        this.propertyDefinitionClassCode = value;
    }

    /**
     * Gets the value of the pricingProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link PricingProcedureCode }
     *     
     */
    public PricingProcedureCode getPricingProcedureCode() {
        return pricingProcedureCode;
    }

    /**
     * Sets the value of the pricingProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingProcedureCode }
     *     
     */
    public void setPricingProcedureCode(PricingProcedureCode value) {
        this.pricingProcedureCode = value;
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
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenancePriceAndTaxCalculationItem }
     * 
     * 
     */
    public List<MaintenancePriceAndTaxCalculationItem> getItem() {
        if (item == null) {
            item = new ArrayList<MaintenancePriceAndTaxCalculationItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the priceComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenancePriceAndTaxCalculationPriceComponent }
     * 
     * 
     */
    public List<MaintenancePriceAndTaxCalculationPriceComponent> getPriceComponent() {
        if (priceComponent == null) {
            priceComponent = new ArrayList<MaintenancePriceAndTaxCalculationPriceComponent>();
        }
        return this.priceComponent;
    }

    /**
     * Gets the value of the productTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenancePriceAndTaxCalculationProductTaxDetails }
     * 
     * 
     */
    public List<MaintenancePriceAndTaxCalculationProductTaxDetails> getProductTaxDetails() {
        if (productTaxDetails == null) {
            productTaxDetails = new ArrayList<MaintenancePriceAndTaxCalculationProductTaxDetails>();
        }
        return this.productTaxDetails;
    }

    /**
     * Gets the value of the taxationTerms property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenancePriceAndTaxCalculationTaxationTerms }
     *     
     */
    public MaintenancePriceAndTaxCalculationTaxationTerms getTaxationTerms() {
        return taxationTerms;
    }

    /**
     * Sets the value of the taxationTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenancePriceAndTaxCalculationTaxationTerms }
     *     
     */
    public void setTaxationTerms(MaintenancePriceAndTaxCalculationTaxationTerms value) {
        this.taxationTerms = value;
    }

    /**
     * Gets the value of the withholdingTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenancePriceAndTaxCalculationWithholdingTaxDetails }
     * 
     * 
     */
    public List<MaintenancePriceAndTaxCalculationWithholdingTaxDetails> getWithholdingTaxDetails() {
        if (withholdingTaxDetails == null) {
            withholdingTaxDetails = new ArrayList<MaintenancePriceAndTaxCalculationWithholdingTaxDetails>();
        }
        return this.withholdingTaxDetails;
    }

    /**
     * Gets the value of the itemListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemListCompleteTransmissionIndicator() {
        return itemListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemListCompleteTransmissionIndicator(Boolean value) {
        this.itemListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the priceComponentListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceComponentListCompleteTransmissionIndicator() {
        return priceComponentListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the priceComponentListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceComponentListCompleteTransmissionIndicator(Boolean value) {
        this.priceComponentListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the productTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTaxDetailsListCompleteTransmissionIndicator() {
        return productTaxDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the productTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTaxDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.productTaxDetailsListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the withholdingTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithholdingTaxDetailsListCompleteTransmissionIndicator() {
        return withholdingTaxDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the withholdingTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithholdingTaxDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.withholdingTaxDetailsListCompleteTransmissionIndicator = value;
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
