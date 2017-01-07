
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.SHORTDescription;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.documentservices.global.MaintenanceTextCollection;


/**
 * <p>Java class for ServiceConfirmationMaintainBundleRequestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationMaintainBundleRequestItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmExecutionItem" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FinishFulfilmentProcessingItem" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestItemProduct" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleLine" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestItemScheduleLine" minOccurs="0"/&gt;
 *         &lt;element name="Confirmation" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestItemConfirmation" minOccurs="0"/&gt;
 *         &lt;element name="ServicePerformerItemParty" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestItemServicePerformerItemParty" minOccurs="0"/&gt;
 *         &lt;element name="ActualFulfillmentPeriodItemPeriodTerms" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestItemActualFulfillmentPeriodItemPeriodTerms" minOccurs="0"/&gt;
 *         &lt;element name="PricingTerms" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestItemPricingTerms" minOccurs="0"/&gt;
 *         &lt;element name="TextCollection" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceTextCollection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ItemScheduleLineListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfirmationMaintainBundleRequestItem", propOrder = {
    "confirmExecutionItem",
    "finishFulfilmentProcessingItem",
    "uuid",
    "id",
    "description",
    "product",
    "scheduleLine",
    "confirmation",
    "servicePerformerItemParty",
    "actualFulfillmentPeriodItemPeriodTerms",
    "pricingTerms",
    "textCollection"
})
public class ServiceConfirmationMaintainBundleRequestItem {

    @XmlElement(name = "ConfirmExecutionItem")
    protected Boolean confirmExecutionItem;
    @XmlElement(name = "FinishFulfilmentProcessingItem")
    protected Boolean finishFulfilmentProcessingItem;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "Description")
    protected SHORTDescription description;
    @XmlElement(name = "Product")
    protected ServiceConfirmationUpdateRequestItemProduct product;
    @XmlElement(name = "ScheduleLine")
    protected ServiceConfirmationUpdateRequestItemScheduleLine scheduleLine;
    @XmlElement(name = "Confirmation")
    protected ServiceConfirmationUpdateRequestItemConfirmation confirmation;
    @XmlElement(name = "ServicePerformerItemParty")
    protected ServiceConfirmationUpdateRequestItemServicePerformerItemParty servicePerformerItemParty;
    @XmlElement(name = "ActualFulfillmentPeriodItemPeriodTerms")
    protected ServiceConfirmationUpdateRequestItemActualFulfillmentPeriodItemPeriodTerms actualFulfillmentPeriodItemPeriodTerms;
    @XmlElement(name = "PricingTerms")
    protected ServiceConfirmationUpdateRequestItemPricingTerms pricingTerms;
    @XmlElement(name = "TextCollection")
    protected MaintenanceTextCollection textCollection;
    @XmlAttribute(name = "ItemScheduleLineListCompleteTransmissionIndicator")
    protected Boolean itemScheduleLineListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the confirmExecutionItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmExecutionItem() {
        return confirmExecutionItem;
    }

    /**
     * Sets the value of the confirmExecutionItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmExecutionItem(Boolean value) {
        this.confirmExecutionItem = value;
    }

    /**
     * Gets the value of the finishFulfilmentProcessingItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinishFulfilmentProcessingItem() {
        return finishFulfilmentProcessingItem;
    }

    /**
     * Sets the value of the finishFulfilmentProcessingItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinishFulfilmentProcessingItem(Boolean value) {
        this.finishFulfilmentProcessingItem = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link SHORTDescription }
     *     
     */
    public SHORTDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTDescription }
     *     
     */
    public void setDescription(SHORTDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestItemProduct }
     *     
     */
    public ServiceConfirmationUpdateRequestItemProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestItemProduct }
     *     
     */
    public void setProduct(ServiceConfirmationUpdateRequestItemProduct value) {
        this.product = value;
    }

    /**
     * Gets the value of the scheduleLine property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestItemScheduleLine }
     *     
     */
    public ServiceConfirmationUpdateRequestItemScheduleLine getScheduleLine() {
        return scheduleLine;
    }

    /**
     * Sets the value of the scheduleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestItemScheduleLine }
     *     
     */
    public void setScheduleLine(ServiceConfirmationUpdateRequestItemScheduleLine value) {
        this.scheduleLine = value;
    }

    /**
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestItemConfirmation }
     *     
     */
    public ServiceConfirmationUpdateRequestItemConfirmation getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestItemConfirmation }
     *     
     */
    public void setConfirmation(ServiceConfirmationUpdateRequestItemConfirmation value) {
        this.confirmation = value;
    }

    /**
     * Gets the value of the servicePerformerItemParty property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestItemServicePerformerItemParty }
     *     
     */
    public ServiceConfirmationUpdateRequestItemServicePerformerItemParty getServicePerformerItemParty() {
        return servicePerformerItemParty;
    }

    /**
     * Sets the value of the servicePerformerItemParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestItemServicePerformerItemParty }
     *     
     */
    public void setServicePerformerItemParty(ServiceConfirmationUpdateRequestItemServicePerformerItemParty value) {
        this.servicePerformerItemParty = value;
    }

    /**
     * Gets the value of the actualFulfillmentPeriodItemPeriodTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestItemActualFulfillmentPeriodItemPeriodTerms }
     *     
     */
    public ServiceConfirmationUpdateRequestItemActualFulfillmentPeriodItemPeriodTerms getActualFulfillmentPeriodItemPeriodTerms() {
        return actualFulfillmentPeriodItemPeriodTerms;
    }

    /**
     * Sets the value of the actualFulfillmentPeriodItemPeriodTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestItemActualFulfillmentPeriodItemPeriodTerms }
     *     
     */
    public void setActualFulfillmentPeriodItemPeriodTerms(ServiceConfirmationUpdateRequestItemActualFulfillmentPeriodItemPeriodTerms value) {
        this.actualFulfillmentPeriodItemPeriodTerms = value;
    }

    /**
     * Gets the value of the pricingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestItemPricingTerms }
     *     
     */
    public ServiceConfirmationUpdateRequestItemPricingTerms getPricingTerms() {
        return pricingTerms;
    }

    /**
     * Sets the value of the pricingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestItemPricingTerms }
     *     
     */
    public void setPricingTerms(ServiceConfirmationUpdateRequestItemPricingTerms value) {
        this.pricingTerms = value;
    }

    /**
     * Gets the value of the textCollection property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceTextCollection }
     *     
     */
    public MaintenanceTextCollection getTextCollection() {
        return textCollection;
    }

    /**
     * Sets the value of the textCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceTextCollection }
     *     
     */
    public void setTextCollection(MaintenanceTextCollection value) {
        this.textCollection = value;
    }

    /**
     * Gets the value of the itemScheduleLineListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemScheduleLineListCompleteTransmissionIndicator() {
        return itemScheduleLineListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemScheduleLineListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemScheduleLineListCompleteTransmissionIndicator(Boolean value) {
        this.itemScheduleLineListCompleteTransmissionIndicator = value;
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
