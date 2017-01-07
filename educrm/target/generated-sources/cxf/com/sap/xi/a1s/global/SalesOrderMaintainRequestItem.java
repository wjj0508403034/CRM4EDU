
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
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.FulfilmentPartyCategoryCode;
import com.sap.xi.ap.common.gdt.SHORTDescription;
import com.sap.xi.documentservices.global.MaintenanceAttachmentFolder;


/**
 * <p>Java class for SalesOrderMaintainRequestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="BuyerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemProcessingTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PostingDate" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="FulfilmentPartyCategoryCode" type="{http://sap.com/xi/AP/Common/GDT}FulfilmentPartyCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseToExecute" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FinishFulfilmentProcessing" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ItemBusinessTransactionDocumentReference" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestBusinessTransactionDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemProduct" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemProduct" minOccurs="0"/&gt;
 *         &lt;element name="ItemDeliveryTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemDeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element name="ItemSalesTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemSalesTerms" minOccurs="0"/&gt;
 *         &lt;element name="ItemServiceTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemServiceTerms" minOccurs="0"/&gt;
 *         &lt;element name="ItemScheduleLine" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemScheduleLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductRecipientItemParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyParty" minOccurs="0"/&gt;
 *         &lt;element name="VendorItemParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="ServicePerformerItemParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="ShipFromItemLocation" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemLocation" minOccurs="0"/&gt;
 *         &lt;element name="ItemAccountingCodingBlockDistribution" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemAccountingCodingBlockDistribution" minOccurs="0"/&gt;
 *         &lt;element name="PriceAndTaxCalculationItem" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationItem" minOccurs="0"/&gt;
 *         &lt;element name="ItemTextCollection" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestTextCollection" minOccurs="0"/&gt;
 *         &lt;element name="ItemAttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itemScheduleLineListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="itemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestItem", propOrder = {
    "objectNodeSenderTechnicalID",
    "id",
    "buyerID",
    "processingTypeCode",
    "postingDate",
    "description",
    "fulfilmentPartyCategoryCode",
    "releaseToExecute",
    "finishFulfilmentProcessing",
    "itemBusinessTransactionDocumentReference",
    "itemProduct",
    "itemDeliveryTerms",
    "itemSalesTerms",
    "itemServiceTerms",
    "itemScheduleLine",
    "productRecipientItemParty",
    "vendorItemParty",
    "servicePerformerItemParty",
    "shipFromItemLocation",
    "itemAccountingCodingBlockDistribution",
    "priceAndTaxCalculationItem",
    "itemTextCollection",
    "itemAttachmentFolder"
})
public class SalesOrderMaintainRequestItem {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "BuyerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyerID;
    @XmlElement(name = "ProcessingTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String processingTypeCode;
    @XmlElement(name = "PostingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDate;
    @XmlElement(name = "Description")
    protected SHORTDescription description;
    @XmlElement(name = "FulfilmentPartyCategoryCode")
    protected FulfilmentPartyCategoryCode fulfilmentPartyCategoryCode;
    @XmlElement(name = "ReleaseToExecute")
    protected Boolean releaseToExecute;
    @XmlElement(name = "FinishFulfilmentProcessing")
    protected Boolean finishFulfilmentProcessing;
    @XmlElement(name = "ItemBusinessTransactionDocumentReference")
    protected List<SalesOrderMaintainRequestBusinessTransactionDocumentReference> itemBusinessTransactionDocumentReference;
    @XmlElement(name = "ItemProduct")
    protected SalesOrderMaintainRequestItemProduct itemProduct;
    @XmlElement(name = "ItemDeliveryTerms")
    protected SalesOrderMaintainRequestItemDeliveryTerms itemDeliveryTerms;
    @XmlElement(name = "ItemSalesTerms")
    protected SalesOrderMaintainRequestItemSalesTerms itemSalesTerms;
    @XmlElement(name = "ItemServiceTerms")
    protected SalesOrderMaintainRequestItemServiceTerms itemServiceTerms;
    @XmlElement(name = "ItemScheduleLine")
    protected List<SalesOrderMaintainRequestItemScheduleLine> itemScheduleLine;
    @XmlElement(name = "ProductRecipientItemParty")
    protected SalesOrderMaintainRequestPartyParty productRecipientItemParty;
    @XmlElement(name = "VendorItemParty")
    protected SalesOrderMaintainRequestPartyIDParty vendorItemParty;
    @XmlElement(name = "ServicePerformerItemParty")
    protected SalesOrderMaintainRequestPartyIDParty servicePerformerItemParty;
    @XmlElement(name = "ShipFromItemLocation")
    protected SalesOrderMaintainRequestItemLocation shipFromItemLocation;
    @XmlElement(name = "ItemAccountingCodingBlockDistribution")
    protected SalesOrderMaintainRequestItemAccountingCodingBlockDistribution itemAccountingCodingBlockDistribution;
    @XmlElement(name = "PriceAndTaxCalculationItem")
    protected SalesOrderMaintainRequestPriceAndTaxCalculationItem priceAndTaxCalculationItem;
    @XmlElement(name = "ItemTextCollection")
    protected SalesOrderMaintainRequestTextCollection itemTextCollection;
    @XmlElement(name = "ItemAttachmentFolder")
    protected MaintenanceAttachmentFolder itemAttachmentFolder;
    @XmlAttribute(name = "itemScheduleLineListCompleteTransmissionIndicator")
    protected Boolean itemScheduleLineListCompleteTransmissionIndicator;
    @XmlAttribute(name = "itemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator")
    protected Boolean itemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the objectNodeSenderTechnicalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNodeSenderTechnicalID() {
        return objectNodeSenderTechnicalID;
    }

    /**
     * Sets the value of the objectNodeSenderTechnicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNodeSenderTechnicalID(String value) {
        this.objectNodeSenderTechnicalID = value;
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
     * Gets the value of the buyerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerID() {
        return buyerID;
    }

    /**
     * Sets the value of the buyerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerID(String value) {
        this.buyerID = value;
    }

    /**
     * Gets the value of the processingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingTypeCode() {
        return processingTypeCode;
    }

    /**
     * Sets the value of the processingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingTypeCode(String value) {
        this.processingTypeCode = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
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
     * Gets the value of the fulfilmentPartyCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentPartyCategoryCode }
     *     
     */
    public FulfilmentPartyCategoryCode getFulfilmentPartyCategoryCode() {
        return fulfilmentPartyCategoryCode;
    }

    /**
     * Sets the value of the fulfilmentPartyCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentPartyCategoryCode }
     *     
     */
    public void setFulfilmentPartyCategoryCode(FulfilmentPartyCategoryCode value) {
        this.fulfilmentPartyCategoryCode = value;
    }

    /**
     * Gets the value of the releaseToExecute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseToExecute() {
        return releaseToExecute;
    }

    /**
     * Sets the value of the releaseToExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseToExecute(Boolean value) {
        this.releaseToExecute = value;
    }

    /**
     * Gets the value of the finishFulfilmentProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinishFulfilmentProcessing() {
        return finishFulfilmentProcessing;
    }

    /**
     * Sets the value of the finishFulfilmentProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinishFulfilmentProcessing(Boolean value) {
        this.finishFulfilmentProcessing = value;
    }

    /**
     * Gets the value of the itemBusinessTransactionDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemBusinessTransactionDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemBusinessTransactionDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestBusinessTransactionDocumentReference }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestBusinessTransactionDocumentReference> getItemBusinessTransactionDocumentReference() {
        if (itemBusinessTransactionDocumentReference == null) {
            itemBusinessTransactionDocumentReference = new ArrayList<SalesOrderMaintainRequestBusinessTransactionDocumentReference>();
        }
        return this.itemBusinessTransactionDocumentReference;
    }

    /**
     * Gets the value of the itemProduct property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestItemProduct }
     *     
     */
    public SalesOrderMaintainRequestItemProduct getItemProduct() {
        return itemProduct;
    }

    /**
     * Sets the value of the itemProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestItemProduct }
     *     
     */
    public void setItemProduct(SalesOrderMaintainRequestItemProduct value) {
        this.itemProduct = value;
    }

    /**
     * Gets the value of the itemDeliveryTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestItemDeliveryTerms }
     *     
     */
    public SalesOrderMaintainRequestItemDeliveryTerms getItemDeliveryTerms() {
        return itemDeliveryTerms;
    }

    /**
     * Sets the value of the itemDeliveryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestItemDeliveryTerms }
     *     
     */
    public void setItemDeliveryTerms(SalesOrderMaintainRequestItemDeliveryTerms value) {
        this.itemDeliveryTerms = value;
    }

    /**
     * Gets the value of the itemSalesTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestItemSalesTerms }
     *     
     */
    public SalesOrderMaintainRequestItemSalesTerms getItemSalesTerms() {
        return itemSalesTerms;
    }

    /**
     * Sets the value of the itemSalesTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestItemSalesTerms }
     *     
     */
    public void setItemSalesTerms(SalesOrderMaintainRequestItemSalesTerms value) {
        this.itemSalesTerms = value;
    }

    /**
     * Gets the value of the itemServiceTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestItemServiceTerms }
     *     
     */
    public SalesOrderMaintainRequestItemServiceTerms getItemServiceTerms() {
        return itemServiceTerms;
    }

    /**
     * Sets the value of the itemServiceTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestItemServiceTerms }
     *     
     */
    public void setItemServiceTerms(SalesOrderMaintainRequestItemServiceTerms value) {
        this.itemServiceTerms = value;
    }

    /**
     * Gets the value of the itemScheduleLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemScheduleLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemScheduleLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestItemScheduleLine }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestItemScheduleLine> getItemScheduleLine() {
        if (itemScheduleLine == null) {
            itemScheduleLine = new ArrayList<SalesOrderMaintainRequestItemScheduleLine>();
        }
        return this.itemScheduleLine;
    }

    /**
     * Gets the value of the productRecipientItemParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public SalesOrderMaintainRequestPartyParty getProductRecipientItemParty() {
        return productRecipientItemParty;
    }

    /**
     * Sets the value of the productRecipientItemParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public void setProductRecipientItemParty(SalesOrderMaintainRequestPartyParty value) {
        this.productRecipientItemParty = value;
    }

    /**
     * Gets the value of the vendorItemParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getVendorItemParty() {
        return vendorItemParty;
    }

    /**
     * Sets the value of the vendorItemParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setVendorItemParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.vendorItemParty = value;
    }

    /**
     * Gets the value of the servicePerformerItemParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getServicePerformerItemParty() {
        return servicePerformerItemParty;
    }

    /**
     * Sets the value of the servicePerformerItemParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setServicePerformerItemParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.servicePerformerItemParty = value;
    }

    /**
     * Gets the value of the shipFromItemLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestItemLocation }
     *     
     */
    public SalesOrderMaintainRequestItemLocation getShipFromItemLocation() {
        return shipFromItemLocation;
    }

    /**
     * Sets the value of the shipFromItemLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestItemLocation }
     *     
     */
    public void setShipFromItemLocation(SalesOrderMaintainRequestItemLocation value) {
        this.shipFromItemLocation = value;
    }

    /**
     * Gets the value of the itemAccountingCodingBlockDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestItemAccountingCodingBlockDistribution }
     *     
     */
    public SalesOrderMaintainRequestItemAccountingCodingBlockDistribution getItemAccountingCodingBlockDistribution() {
        return itemAccountingCodingBlockDistribution;
    }

    /**
     * Sets the value of the itemAccountingCodingBlockDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestItemAccountingCodingBlockDistribution }
     *     
     */
    public void setItemAccountingCodingBlockDistribution(SalesOrderMaintainRequestItemAccountingCodingBlockDistribution value) {
        this.itemAccountingCodingBlockDistribution = value;
    }

    /**
     * Gets the value of the priceAndTaxCalculationItem property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItem }
     *     
     */
    public SalesOrderMaintainRequestPriceAndTaxCalculationItem getPriceAndTaxCalculationItem() {
        return priceAndTaxCalculationItem;
    }

    /**
     * Sets the value of the priceAndTaxCalculationItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationItem }
     *     
     */
    public void setPriceAndTaxCalculationItem(SalesOrderMaintainRequestPriceAndTaxCalculationItem value) {
        this.priceAndTaxCalculationItem = value;
    }

    /**
     * Gets the value of the itemTextCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestTextCollection }
     *     
     */
    public SalesOrderMaintainRequestTextCollection getItemTextCollection() {
        return itemTextCollection;
    }

    /**
     * Sets the value of the itemTextCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestTextCollection }
     *     
     */
    public void setItemTextCollection(SalesOrderMaintainRequestTextCollection value) {
        this.itemTextCollection = value;
    }

    /**
     * Gets the value of the itemAttachmentFolder property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public MaintenanceAttachmentFolder getItemAttachmentFolder() {
        return itemAttachmentFolder;
    }

    /**
     * Sets the value of the itemAttachmentFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public void setItemAttachmentFolder(MaintenanceAttachmentFolder value) {
        this.itemAttachmentFolder = value;
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
     * Gets the value of the itemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator() {
        return itemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator(Boolean value) {
        this.itemBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator = value;
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
