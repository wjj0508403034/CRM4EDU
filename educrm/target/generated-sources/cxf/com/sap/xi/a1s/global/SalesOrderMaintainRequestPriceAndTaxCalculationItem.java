
package com.sap.xi.a1s.global;

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
import com.sap.xi.ap.common.gdt.ProductTaxationCharacteristicsCode;
import com.sap.xi.ap.common.gdt.TaxJurisdictionCode;
import com.sap.xi.ap.common.gdt.WithholdingTaxationCharacteristicsCode;


/**
 * <p>Java class for SalesOrderMaintainRequestPriceAndTaxCalculationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPriceAndTaxCalculationItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxationCharacteristicsCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxJurisdictionCode" type="{http://sap.com/xi/AP/Common/GDT}TaxJurisdictionCode" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxationCharacteristicsCode" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="ItemMainDiscount" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount" minOccurs="0"/&gt;
 *         &lt;element name="ItemMainPrice" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainPrice" minOccurs="0"/&gt;
 *         &lt;element name="ItemPriceComponent" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationItemItemPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemProductTaxDetails" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationItemItemProductTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemTaxationTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationItemItemTaxationTerms" minOccurs="0"/&gt;
 *         &lt;element name="ItemWithholdingTaxDetails" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationItemItemWithholdingTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itemPriceComponentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="itemProductTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="itemWithholdingTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPriceAndTaxCalculationItem", propOrder = {
    "countryCode",
    "taxationCharacteristicsCode",
    "taxJurisdictionCode",
    "withholdingTaxationCharacteristicsCode",
    "itemMainDiscount",
    "itemMainPrice",
    "itemPriceComponent",
    "itemProductTaxDetails",
    "itemTaxationTerms",
    "itemWithholdingTaxDetails"
})
public class SalesOrderMaintainRequestPriceAndTaxCalculationItem {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "TaxationCharacteristicsCode")
    protected ProductTaxationCharacteristicsCode taxationCharacteristicsCode;
    @XmlElement(name = "TaxJurisdictionCode")
    protected TaxJurisdictionCode taxJurisdictionCode;
    @XmlElement(name = "WithholdingTaxationCharacteristicsCode")
    protected WithholdingTaxationCharacteristicsCode withholdingTaxationCharacteristicsCode;
    @XmlElement(name = "ItemMainDiscount")
    protected SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount itemMainDiscount;
    @XmlElement(name = "ItemMainPrice")
    protected SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainPrice itemMainPrice;
    @XmlElement(name = "ItemPriceComponent")
    protected List<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemPriceComponent> itemPriceComponent;
    @XmlElement(name = "ItemProductTaxDetails")
    protected List<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemProductTaxDetails> itemProductTaxDetails;
    @XmlElement(name = "ItemTaxationTerms")
    protected SalesOrderMaintainRequestPriceAndTaxCalculationItemItemTaxationTerms itemTaxationTerms;
    @XmlElement(name = "ItemWithholdingTaxDetails")
    protected List<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemWithholdingTaxDetails> itemWithholdingTaxDetails;
    @XmlAttribute(name = "itemPriceComponentListCompleteTransmissionIndicator")
    protected Boolean itemPriceComponentListCompleteTransmissionIndicator;
    @XmlAttribute(name = "itemProductTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean itemProductTaxDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "itemWithholdingTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean itemWithholdingTaxDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

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
     * Gets the value of the taxationCharacteristicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTaxationCharacteristicsCode }
     *     
     */
    public ProductTaxationCharacteristicsCode getTaxationCharacteristicsCode() {
        return taxationCharacteristicsCode;
    }

    /**
     * Sets the value of the taxationCharacteristicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTaxationCharacteristicsCode }
     *     
     */
    public void setTaxationCharacteristicsCode(ProductTaxationCharacteristicsCode value) {
        this.taxationCharacteristicsCode = value;
    }

    /**
     * Gets the value of the taxJurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public TaxJurisdictionCode getTaxJurisdictionCode() {
        return taxJurisdictionCode;
    }

    /**
     * Sets the value of the taxJurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public void setTaxJurisdictionCode(TaxJurisdictionCode value) {
        this.taxJurisdictionCode = value;
    }

    /**
     * Gets the value of the withholdingTaxationCharacteristicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTaxationCharacteristicsCode }
     *     
     */
    public WithholdingTaxationCharacteristicsCode getWithholdingTaxationCharacteristicsCode() {
        return withholdingTaxationCharacteristicsCode;
    }

    /**
     * Sets the value of the withholdingTaxationCharacteristicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTaxationCharacteristicsCode }
     *     
     */
    public void setWithholdingTaxationCharacteristicsCode(WithholdingTaxationCharacteristicsCode value) {
        this.withholdingTaxationCharacteristicsCode = value;
    }

    /**
     * Gets the value of the itemMainDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount }
     *     
     */
    public SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount getItemMainDiscount() {
        return itemMainDiscount;
    }

    /**
     * Sets the value of the itemMainDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount }
     *     
     */
    public void setItemMainDiscount(SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount value) {
        this.itemMainDiscount = value;
    }

    /**
     * Gets the value of the itemMainPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainPrice }
     *     
     */
    public SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainPrice getItemMainPrice() {
        return itemMainPrice;
    }

    /**
     * Sets the value of the itemMainPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainPrice }
     *     
     */
    public void setItemMainPrice(SalesOrderMaintainRequestPriceAndTaxCalculationItemItemMainPrice value) {
        this.itemMainPrice = value;
    }

    /**
     * Gets the value of the itemPriceComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPriceComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPriceComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemPriceComponent }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemPriceComponent> getItemPriceComponent() {
        if (itemPriceComponent == null) {
            itemPriceComponent = new ArrayList<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemPriceComponent>();
        }
        return this.itemPriceComponent;
    }

    /**
     * Gets the value of the itemProductTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemProductTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemProductTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemProductTaxDetails }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemProductTaxDetails> getItemProductTaxDetails() {
        if (itemProductTaxDetails == null) {
            itemProductTaxDetails = new ArrayList<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemProductTaxDetails>();
        }
        return this.itemProductTaxDetails;
    }

    /**
     * Gets the value of the itemTaxationTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemTaxationTerms }
     *     
     */
    public SalesOrderMaintainRequestPriceAndTaxCalculationItemItemTaxationTerms getItemTaxationTerms() {
        return itemTaxationTerms;
    }

    /**
     * Sets the value of the itemTaxationTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemTaxationTerms }
     *     
     */
    public void setItemTaxationTerms(SalesOrderMaintainRequestPriceAndTaxCalculationItemItemTaxationTerms value) {
        this.itemTaxationTerms = value;
    }

    /**
     * Gets the value of the itemWithholdingTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemWithholdingTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemWithholdingTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPriceAndTaxCalculationItemItemWithholdingTaxDetails }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemWithholdingTaxDetails> getItemWithholdingTaxDetails() {
        if (itemWithholdingTaxDetails == null) {
            itemWithholdingTaxDetails = new ArrayList<SalesOrderMaintainRequestPriceAndTaxCalculationItemItemWithholdingTaxDetails>();
        }
        return this.itemWithholdingTaxDetails;
    }

    /**
     * Gets the value of the itemPriceComponentListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemPriceComponentListCompleteTransmissionIndicator() {
        return itemPriceComponentListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemPriceComponentListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemPriceComponentListCompleteTransmissionIndicator(Boolean value) {
        this.itemPriceComponentListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the itemProductTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemProductTaxDetailsListCompleteTransmissionIndicator() {
        return itemProductTaxDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemProductTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemProductTaxDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.itemProductTaxDetailsListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the itemWithholdingTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemWithholdingTaxDetailsListCompleteTransmissionIndicator() {
        return itemWithholdingTaxDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemWithholdingTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemWithholdingTaxDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.itemWithholdingTaxDetailsListCompleteTransmissionIndicator = value;
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
