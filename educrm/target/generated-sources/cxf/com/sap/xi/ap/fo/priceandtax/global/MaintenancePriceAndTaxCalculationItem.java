
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
import com.sap.xi.ap.common.gdt.ProductTaxationCharacteristicsCode;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.common.gdt.WithholdingTaxationCharacteristicsCode;


/**
 * <p>Java class for MaintenancePriceAndTaxCalculationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenancePriceAndTaxCalculationItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxationCharacteristicsCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxationCharacteristicsCode" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="ItemPriceComponent" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationItemItemPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemProductTaxDetails" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationItemItemProductTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemTaxationTerms" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationItemItemTaxationTerms" minOccurs="0"/&gt;
 *         &lt;element name="ItemWithholdingTaxDetails" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculationItemItemWithholdingTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ItemPriceComponentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ItemProductTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ItemWithholdingTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenancePriceAndTaxCalculationItem", propOrder = {
    "uuid",
    "countryCode",
    "taxationCharacteristicsCode",
    "withholdingTaxationCharacteristicsCode",
    "itemPriceComponent",
    "itemProductTaxDetails",
    "itemTaxationTerms",
    "itemWithholdingTaxDetails"
})
public class MaintenancePriceAndTaxCalculationItem {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "TaxationCharacteristicsCode")
    protected ProductTaxationCharacteristicsCode taxationCharacteristicsCode;
    @XmlElement(name = "WithholdingTaxationCharacteristicsCode")
    protected WithholdingTaxationCharacteristicsCode withholdingTaxationCharacteristicsCode;
    @XmlElement(name = "ItemPriceComponent")
    protected List<MaintenancePriceAndTaxCalculationItemItemPriceComponent> itemPriceComponent;
    @XmlElement(name = "ItemProductTaxDetails")
    protected List<MaintenancePriceAndTaxCalculationItemItemProductTaxDetails> itemProductTaxDetails;
    @XmlElement(name = "ItemTaxationTerms")
    protected MaintenancePriceAndTaxCalculationItemItemTaxationTerms itemTaxationTerms;
    @XmlElement(name = "ItemWithholdingTaxDetails")
    protected List<MaintenancePriceAndTaxCalculationItemItemWithholdingTaxDetails> itemWithholdingTaxDetails;
    @XmlAttribute(name = "ItemPriceComponentListCompleteTransmissionIndicator")
    protected Boolean itemPriceComponentListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ItemProductTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean itemProductTaxDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ItemWithholdingTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean itemWithholdingTaxDetailsListCompleteTransmissionIndicator;
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
     * {@link MaintenancePriceAndTaxCalculationItemItemPriceComponent }
     * 
     * 
     */
    public List<MaintenancePriceAndTaxCalculationItemItemPriceComponent> getItemPriceComponent() {
        if (itemPriceComponent == null) {
            itemPriceComponent = new ArrayList<MaintenancePriceAndTaxCalculationItemItemPriceComponent>();
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
     * {@link MaintenancePriceAndTaxCalculationItemItemProductTaxDetails }
     * 
     * 
     */
    public List<MaintenancePriceAndTaxCalculationItemItemProductTaxDetails> getItemProductTaxDetails() {
        if (itemProductTaxDetails == null) {
            itemProductTaxDetails = new ArrayList<MaintenancePriceAndTaxCalculationItemItemProductTaxDetails>();
        }
        return this.itemProductTaxDetails;
    }

    /**
     * Gets the value of the itemTaxationTerms property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenancePriceAndTaxCalculationItemItemTaxationTerms }
     *     
     */
    public MaintenancePriceAndTaxCalculationItemItemTaxationTerms getItemTaxationTerms() {
        return itemTaxationTerms;
    }

    /**
     * Sets the value of the itemTaxationTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenancePriceAndTaxCalculationItemItemTaxationTerms }
     *     
     */
    public void setItemTaxationTerms(MaintenancePriceAndTaxCalculationItemItemTaxationTerms value) {
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
     * {@link MaintenancePriceAndTaxCalculationItemItemWithholdingTaxDetails }
     * 
     * 
     */
    public List<MaintenancePriceAndTaxCalculationItemItemWithholdingTaxDetails> getItemWithholdingTaxDetails() {
        if (itemWithholdingTaxDetails == null) {
            itemWithholdingTaxDetails = new ArrayList<MaintenancePriceAndTaxCalculationItemItemWithholdingTaxDetails>();
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
