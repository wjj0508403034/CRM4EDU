
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
import com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID;
import com.sap.xi.ap.common.gdt.EXTENDEDName;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.fo.priceandtax.global.MaintenancePriceAndTaxCalculation;
import com.sap.xi.documentservices.global.MaintenanceAttachmentFolder;
import com.sap.xi.documentservices.global.MaintenanceTextCollection;


/**
 * <p>Java class for ServiceConfirmationMaintainRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationMaintainRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateWithReferenceToServiceOrder" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BaseServiceOrderID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="BuyerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="IncidentServiceIssueCategory" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestIncidentServiceIssueCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationMaintainBundleRequestItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServicePerformerParty" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestServicePerformerParty" minOccurs="0"/&gt;
 *         &lt;element name="SalesTerms" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestSalesTerms" minOccurs="0"/&gt;
 *         &lt;element name="ServiceReferenceObject" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestServiceReferenceObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTerms" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestServiceTerms" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceTerms" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationMaintainRequestInvoiceTerms" minOccurs="0"/&gt;
 *         &lt;element name="IncidentCompletionTimePointTimePointTerms" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestIncidentCompletionTimePointTimePointTerms" minOccurs="0"/&gt;
 *         &lt;element name="ActualArrivalAtCustomerTimePointTerms" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestActualArrivalAtCustomerTimePointTerms" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="PriceAndTaxCalculation" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}MaintenancePriceAndTaxCalculation" minOccurs="0"/&gt;
 *         &lt;element name="TextCollection" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceTextCollection" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IncidentServiceIssueCategoryListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ItemListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ServiceReferenceObjectListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfirmationMaintainRequest", propOrder = {
    "createWithReferenceToServiceOrder",
    "baseServiceOrderID",
    "id",
    "buyerID",
    "name",
    "uuid",
    "incidentServiceIssueCategory",
    "item",
    "servicePerformerParty",
    "salesTerms",
    "serviceReferenceObject",
    "serviceTerms",
    "invoiceTerms",
    "incidentCompletionTimePointTimePointTerms",
    "actualArrivalAtCustomerTimePointTerms",
    "attachmentFolder",
    "priceAndTaxCalculation",
    "textCollection",
    "changeStateID"
})
public class ServiceConfirmationMaintainRequest {

    @XmlElement(name = "CreateWithReferenceToServiceOrder")
    protected Boolean createWithReferenceToServiceOrder;
    @XmlElement(name = "BaseServiceOrderID")
    protected BusinessTransactionDocumentID baseServiceOrderID;
    @XmlElement(name = "ID")
    protected BusinessTransactionDocumentID id;
    @XmlElement(name = "BuyerID")
    protected BusinessTransactionDocumentID buyerID;
    @XmlElement(name = "Name")
    protected EXTENDEDName name;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "IncidentServiceIssueCategory")
    protected List<ServiceConfirmationUpdateRequestIncidentServiceIssueCategory> incidentServiceIssueCategory;
    @XmlElement(name = "Item")
    protected List<ServiceConfirmationMaintainBundleRequestItem> item;
    @XmlElement(name = "ServicePerformerParty")
    protected ServiceConfirmationUpdateRequestServicePerformerParty servicePerformerParty;
    @XmlElement(name = "SalesTerms")
    protected ServiceConfirmationUpdateRequestSalesTerms salesTerms;
    @XmlElement(name = "ServiceReferenceObject")
    protected List<ServiceConfirmationUpdateRequestServiceReferenceObject> serviceReferenceObject;
    @XmlElement(name = "ServiceTerms")
    protected ServiceConfirmationUpdateRequestServiceTerms serviceTerms;
    @XmlElement(name = "InvoiceTerms")
    protected ServiceConfirmationMaintainRequestInvoiceTerms invoiceTerms;
    @XmlElement(name = "IncidentCompletionTimePointTimePointTerms")
    protected ServiceConfirmationUpdateRequestIncidentCompletionTimePointTimePointTerms incidentCompletionTimePointTimePointTerms;
    @XmlElement(name = "ActualArrivalAtCustomerTimePointTerms")
    protected ServiceConfirmationUpdateRequestActualArrivalAtCustomerTimePointTerms actualArrivalAtCustomerTimePointTerms;
    @XmlElement(name = "AttachmentFolder")
    protected MaintenanceAttachmentFolder attachmentFolder;
    @XmlElement(name = "PriceAndTaxCalculation")
    protected MaintenancePriceAndTaxCalculation priceAndTaxCalculation;
    @XmlElement(name = "TextCollection")
    protected MaintenanceTextCollection textCollection;
    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlAttribute(name = "IncidentServiceIssueCategoryListCompleteTransmissionIndicator")
    protected Boolean incidentServiceIssueCategoryListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ItemListCompleteTransmissionIndicator")
    protected Boolean itemListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ServiceReferenceObjectListCompleteTransmissionIndicator")
    protected Boolean serviceReferenceObjectListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the createWithReferenceToServiceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateWithReferenceToServiceOrder() {
        return createWithReferenceToServiceOrder;
    }

    /**
     * Sets the value of the createWithReferenceToServiceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateWithReferenceToServiceOrder(Boolean value) {
        this.createWithReferenceToServiceOrder = value;
    }

    /**
     * Gets the value of the baseServiceOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getBaseServiceOrderID() {
        return baseServiceOrderID;
    }

    /**
     * Sets the value of the baseServiceOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setBaseServiceOrderID(BusinessTransactionDocumentID value) {
        this.baseServiceOrderID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setID(BusinessTransactionDocumentID value) {
        this.id = value;
    }

    /**
     * Gets the value of the buyerID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getBuyerID() {
        return buyerID;
    }

    /**
     * Sets the value of the buyerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setBuyerID(BusinessTransactionDocumentID value) {
        this.buyerID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EXTENDEDName }
     *     
     */
    public EXTENDEDName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTENDEDName }
     *     
     */
    public void setName(EXTENDEDName value) {
        this.name = value;
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
     * Gets the value of the incidentServiceIssueCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidentServiceIssueCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidentServiceIssueCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConfirmationUpdateRequestIncidentServiceIssueCategory }
     * 
     * 
     */
    public List<ServiceConfirmationUpdateRequestIncidentServiceIssueCategory> getIncidentServiceIssueCategory() {
        if (incidentServiceIssueCategory == null) {
            incidentServiceIssueCategory = new ArrayList<ServiceConfirmationUpdateRequestIncidentServiceIssueCategory>();
        }
        return this.incidentServiceIssueCategory;
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
     * {@link ServiceConfirmationMaintainBundleRequestItem }
     * 
     * 
     */
    public List<ServiceConfirmationMaintainBundleRequestItem> getItem() {
        if (item == null) {
            item = new ArrayList<ServiceConfirmationMaintainBundleRequestItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the servicePerformerParty property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestServicePerformerParty }
     *     
     */
    public ServiceConfirmationUpdateRequestServicePerformerParty getServicePerformerParty() {
        return servicePerformerParty;
    }

    /**
     * Sets the value of the servicePerformerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestServicePerformerParty }
     *     
     */
    public void setServicePerformerParty(ServiceConfirmationUpdateRequestServicePerformerParty value) {
        this.servicePerformerParty = value;
    }

    /**
     * Gets the value of the salesTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestSalesTerms }
     *     
     */
    public ServiceConfirmationUpdateRequestSalesTerms getSalesTerms() {
        return salesTerms;
    }

    /**
     * Sets the value of the salesTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestSalesTerms }
     *     
     */
    public void setSalesTerms(ServiceConfirmationUpdateRequestSalesTerms value) {
        this.salesTerms = value;
    }

    /**
     * Gets the value of the serviceReferenceObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceReferenceObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceReferenceObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConfirmationUpdateRequestServiceReferenceObject }
     * 
     * 
     */
    public List<ServiceConfirmationUpdateRequestServiceReferenceObject> getServiceReferenceObject() {
        if (serviceReferenceObject == null) {
            serviceReferenceObject = new ArrayList<ServiceConfirmationUpdateRequestServiceReferenceObject>();
        }
        return this.serviceReferenceObject;
    }

    /**
     * Gets the value of the serviceTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestServiceTerms }
     *     
     */
    public ServiceConfirmationUpdateRequestServiceTerms getServiceTerms() {
        return serviceTerms;
    }

    /**
     * Sets the value of the serviceTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestServiceTerms }
     *     
     */
    public void setServiceTerms(ServiceConfirmationUpdateRequestServiceTerms value) {
        this.serviceTerms = value;
    }

    /**
     * Gets the value of the invoiceTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationMaintainRequestInvoiceTerms }
     *     
     */
    public ServiceConfirmationMaintainRequestInvoiceTerms getInvoiceTerms() {
        return invoiceTerms;
    }

    /**
     * Sets the value of the invoiceTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationMaintainRequestInvoiceTerms }
     *     
     */
    public void setInvoiceTerms(ServiceConfirmationMaintainRequestInvoiceTerms value) {
        this.invoiceTerms = value;
    }

    /**
     * Gets the value of the incidentCompletionTimePointTimePointTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestIncidentCompletionTimePointTimePointTerms }
     *     
     */
    public ServiceConfirmationUpdateRequestIncidentCompletionTimePointTimePointTerms getIncidentCompletionTimePointTimePointTerms() {
        return incidentCompletionTimePointTimePointTerms;
    }

    /**
     * Sets the value of the incidentCompletionTimePointTimePointTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestIncidentCompletionTimePointTimePointTerms }
     *     
     */
    public void setIncidentCompletionTimePointTimePointTerms(ServiceConfirmationUpdateRequestIncidentCompletionTimePointTimePointTerms value) {
        this.incidentCompletionTimePointTimePointTerms = value;
    }

    /**
     * Gets the value of the actualArrivalAtCustomerTimePointTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestActualArrivalAtCustomerTimePointTerms }
     *     
     */
    public ServiceConfirmationUpdateRequestActualArrivalAtCustomerTimePointTerms getActualArrivalAtCustomerTimePointTerms() {
        return actualArrivalAtCustomerTimePointTerms;
    }

    /**
     * Sets the value of the actualArrivalAtCustomerTimePointTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestActualArrivalAtCustomerTimePointTerms }
     *     
     */
    public void setActualArrivalAtCustomerTimePointTerms(ServiceConfirmationUpdateRequestActualArrivalAtCustomerTimePointTerms value) {
        this.actualArrivalAtCustomerTimePointTerms = value;
    }

    /**
     * Gets the value of the attachmentFolder property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public MaintenanceAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * Sets the value of the attachmentFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public void setAttachmentFolder(MaintenanceAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * Gets the value of the priceAndTaxCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenancePriceAndTaxCalculation }
     *     
     */
    public MaintenancePriceAndTaxCalculation getPriceAndTaxCalculation() {
        return priceAndTaxCalculation;
    }

    /**
     * Sets the value of the priceAndTaxCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenancePriceAndTaxCalculation }
     *     
     */
    public void setPriceAndTaxCalculation(MaintenancePriceAndTaxCalculation value) {
        this.priceAndTaxCalculation = value;
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
     * Gets the value of the changeStateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * Sets the value of the changeStateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

    /**
     * Gets the value of the incidentServiceIssueCategoryListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidentServiceIssueCategoryListCompleteTransmissionIndicator() {
        return incidentServiceIssueCategoryListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the incidentServiceIssueCategoryListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidentServiceIssueCategoryListCompleteTransmissionIndicator(Boolean value) {
        this.incidentServiceIssueCategoryListCompleteTransmissionIndicator = value;
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
     * Gets the value of the serviceReferenceObjectListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceReferenceObjectListCompleteTransmissionIndicator() {
        return serviceReferenceObjectListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the serviceReferenceObjectListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceReferenceObjectListCompleteTransmissionIndicator(Boolean value) {
        this.serviceReferenceObjectListCompleteTransmissionIndicator = value;
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
