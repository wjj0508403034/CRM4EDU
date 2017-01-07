
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
import com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID;
import com.sap.xi.ap.common.gdt.EXTENDEDName;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.documentservices.global.MaintenanceAttachmentFolder;


/**
 * <p>Java class for SalesOrderMaintainRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="BuyerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="PostingDate" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="DataOriginTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentDataOriginTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentFulfilmentBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseCustomerRequest" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseAllItemsToExecution" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FinishFulfilmentProcessingOfAllItems" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTransactionDocumentReference" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestBusinessTransactionDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesAndServiceBusinessArea" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestSalesAndServiceBusinessArea" minOccurs="0"/&gt;
 *         &lt;element name="BillToParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyParty" minOccurs="0"/&gt;
 *         &lt;element name="AccountParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyParty" minOccurs="0"/&gt;
 *         &lt;element name="PayerParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyParty" minOccurs="0"/&gt;
 *         &lt;element name="ProductRecipientParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyParty" minOccurs="0"/&gt;
 *         &lt;element name="SalesPartnerParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyParty" minOccurs="0"/&gt;
 *         &lt;element name="FreightForwarderParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyParty" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsibleParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="SellerParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="ServiceExecutionTeamParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="ServicePerformerParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="SalesEmployeeParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="BillFromParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyIDParty" minOccurs="0"/&gt;
 *         &lt;element name="RequestedFulfillmentPeriodPeriodTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestRequestedFulfillmentPeriodPeriodTerms" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestDeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element name="PricingTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPricingTerms" minOccurs="0"/&gt;
 *         &lt;element name="SalesTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestSalesTerms" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestInvoiceTerms" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestCashDiscountTerms" minOccurs="0"/&gt;
 *         &lt;element name="PaymentControl" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPaymentControl" minOccurs="0"/&gt;
 *         &lt;element name="PriceAndTaxCalculation" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculation" minOccurs="0"/&gt;
 *         &lt;element name="TextCollection" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestTextCollection" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itemListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="businessTransactionDocumentReferenceListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequest", propOrder = {
    "objectNodeSenderTechnicalID",
    "id",
    "buyerID",
    "postingDate",
    "name",
    "uuid",
    "dataOriginTypeCode",
    "fulfillmentBlockingReasonCode",
    "releaseCustomerRequest",
    "releaseAllItemsToExecution",
    "finishFulfilmentProcessingOfAllItems",
    "businessTransactionDocumentReference",
    "salesAndServiceBusinessArea",
    "billToParty",
    "accountParty",
    "payerParty",
    "productRecipientParty",
    "salesPartnerParty",
    "freightForwarderParty",
    "employeeResponsibleParty",
    "sellerParty",
    "salesUnitParty",
    "serviceExecutionTeamParty",
    "servicePerformerParty",
    "salesEmployeeParty",
    "billFromParty",
    "requestedFulfillmentPeriodPeriodTerms",
    "deliveryTerms",
    "pricingTerms",
    "salesTerms",
    "invoiceTerms",
    "item",
    "cashDiscountTerms",
    "paymentControl",
    "priceAndTaxCalculation",
    "textCollection",
    "attachmentFolder",
    "changeStateID"
})
public class SalesOrderMaintainRequest {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ID")
    protected BusinessTransactionDocumentID id;
    @XmlElement(name = "BuyerID")
    protected BusinessTransactionDocumentID buyerID;
    @XmlElement(name = "PostingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDate;
    @XmlElement(name = "Name")
    protected EXTENDEDName name;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "DataOriginTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataOriginTypeCode;
    @XmlElement(name = "FulfillmentBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fulfillmentBlockingReasonCode;
    @XmlElement(name = "ReleaseCustomerRequest")
    protected Boolean releaseCustomerRequest;
    @XmlElement(name = "ReleaseAllItemsToExecution")
    protected Boolean releaseAllItemsToExecution;
    @XmlElement(name = "FinishFulfilmentProcessingOfAllItems")
    protected Boolean finishFulfilmentProcessingOfAllItems;
    @XmlElement(name = "BusinessTransactionDocumentReference")
    protected List<SalesOrderMaintainRequestBusinessTransactionDocumentReference> businessTransactionDocumentReference;
    @XmlElement(name = "SalesAndServiceBusinessArea")
    protected SalesOrderMaintainRequestSalesAndServiceBusinessArea salesAndServiceBusinessArea;
    @XmlElement(name = "BillToParty")
    protected SalesOrderMaintainRequestPartyParty billToParty;
    @XmlElement(name = "AccountParty")
    protected SalesOrderMaintainRequestPartyParty accountParty;
    @XmlElement(name = "PayerParty")
    protected SalesOrderMaintainRequestPartyParty payerParty;
    @XmlElement(name = "ProductRecipientParty")
    protected SalesOrderMaintainRequestPartyParty productRecipientParty;
    @XmlElement(name = "SalesPartnerParty")
    protected SalesOrderMaintainRequestPartyParty salesPartnerParty;
    @XmlElement(name = "FreightForwarderParty")
    protected SalesOrderMaintainRequestPartyParty freightForwarderParty;
    @XmlElement(name = "EmployeeResponsibleParty")
    protected SalesOrderMaintainRequestPartyIDParty employeeResponsibleParty;
    @XmlElement(name = "SellerParty")
    protected SalesOrderMaintainRequestPartyIDParty sellerParty;
    @XmlElement(name = "SalesUnitParty")
    protected SalesOrderMaintainRequestPartyIDParty salesUnitParty;
    @XmlElement(name = "ServiceExecutionTeamParty")
    protected SalesOrderMaintainRequestPartyIDParty serviceExecutionTeamParty;
    @XmlElement(name = "ServicePerformerParty")
    protected SalesOrderMaintainRequestPartyIDParty servicePerformerParty;
    @XmlElement(name = "SalesEmployeeParty")
    protected SalesOrderMaintainRequestPartyIDParty salesEmployeeParty;
    @XmlElement(name = "BillFromParty")
    protected SalesOrderMaintainRequestPartyIDParty billFromParty;
    @XmlElement(name = "RequestedFulfillmentPeriodPeriodTerms")
    protected SalesOrderMaintainRequestRequestedFulfillmentPeriodPeriodTerms requestedFulfillmentPeriodPeriodTerms;
    @XmlElement(name = "DeliveryTerms")
    protected SalesOrderMaintainRequestDeliveryTerms deliveryTerms;
    @XmlElement(name = "PricingTerms")
    protected SalesOrderMaintainRequestPricingTerms pricingTerms;
    @XmlElement(name = "SalesTerms")
    protected SalesOrderMaintainRequestSalesTerms salesTerms;
    @XmlElement(name = "InvoiceTerms")
    protected SalesOrderMaintainRequestInvoiceTerms invoiceTerms;
    @XmlElement(name = "Item")
    protected List<SalesOrderMaintainRequestItem> item;
    @XmlElement(name = "CashDiscountTerms")
    protected SalesOrderMaintainRequestCashDiscountTerms cashDiscountTerms;
    @XmlElement(name = "PaymentControl")
    protected SalesOrderMaintainRequestPaymentControl paymentControl;
    @XmlElement(name = "PriceAndTaxCalculation")
    protected SalesOrderMaintainRequestPriceAndTaxCalculation priceAndTaxCalculation;
    @XmlElement(name = "TextCollection")
    protected SalesOrderMaintainRequestTextCollection textCollection;
    @XmlElement(name = "AttachmentFolder")
    protected MaintenanceAttachmentFolder attachmentFolder;
    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlAttribute(name = "itemListCompleteTransmissionIndicator")
    protected Boolean itemListCompleteTransmissionIndicator;
    @XmlAttribute(name = "businessTransactionDocumentReferenceListCompleteTransmissionIndicator")
    protected Boolean businessTransactionDocumentReferenceListCompleteTransmissionIndicator;
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
     * Gets the value of the dataOriginTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOriginTypeCode() {
        return dataOriginTypeCode;
    }

    /**
     * Sets the value of the dataOriginTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOriginTypeCode(String value) {
        this.dataOriginTypeCode = value;
    }

    /**
     * Gets the value of the fulfillmentBlockingReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentBlockingReasonCode() {
        return fulfillmentBlockingReasonCode;
    }

    /**
     * Sets the value of the fulfillmentBlockingReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentBlockingReasonCode(String value) {
        this.fulfillmentBlockingReasonCode = value;
    }

    /**
     * Gets the value of the releaseCustomerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseCustomerRequest() {
        return releaseCustomerRequest;
    }

    /**
     * Sets the value of the releaseCustomerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseCustomerRequest(Boolean value) {
        this.releaseCustomerRequest = value;
    }

    /**
     * Gets the value of the releaseAllItemsToExecution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseAllItemsToExecution() {
        return releaseAllItemsToExecution;
    }

    /**
     * Sets the value of the releaseAllItemsToExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseAllItemsToExecution(Boolean value) {
        this.releaseAllItemsToExecution = value;
    }

    /**
     * Gets the value of the finishFulfilmentProcessingOfAllItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinishFulfilmentProcessingOfAllItems() {
        return finishFulfilmentProcessingOfAllItems;
    }

    /**
     * Sets the value of the finishFulfilmentProcessingOfAllItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinishFulfilmentProcessingOfAllItems(Boolean value) {
        this.finishFulfilmentProcessingOfAllItems = value;
    }

    /**
     * Gets the value of the businessTransactionDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessTransactionDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessTransactionDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestBusinessTransactionDocumentReference }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestBusinessTransactionDocumentReference> getBusinessTransactionDocumentReference() {
        if (businessTransactionDocumentReference == null) {
            businessTransactionDocumentReference = new ArrayList<SalesOrderMaintainRequestBusinessTransactionDocumentReference>();
        }
        return this.businessTransactionDocumentReference;
    }

    /**
     * Gets the value of the salesAndServiceBusinessArea property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestSalesAndServiceBusinessArea }
     *     
     */
    public SalesOrderMaintainRequestSalesAndServiceBusinessArea getSalesAndServiceBusinessArea() {
        return salesAndServiceBusinessArea;
    }

    /**
     * Sets the value of the salesAndServiceBusinessArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestSalesAndServiceBusinessArea }
     *     
     */
    public void setSalesAndServiceBusinessArea(SalesOrderMaintainRequestSalesAndServiceBusinessArea value) {
        this.salesAndServiceBusinessArea = value;
    }

    /**
     * Gets the value of the billToParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public SalesOrderMaintainRequestPartyParty getBillToParty() {
        return billToParty;
    }

    /**
     * Sets the value of the billToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public void setBillToParty(SalesOrderMaintainRequestPartyParty value) {
        this.billToParty = value;
    }

    /**
     * Gets the value of the accountParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public SalesOrderMaintainRequestPartyParty getAccountParty() {
        return accountParty;
    }

    /**
     * Sets the value of the accountParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public void setAccountParty(SalesOrderMaintainRequestPartyParty value) {
        this.accountParty = value;
    }

    /**
     * Gets the value of the payerParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public SalesOrderMaintainRequestPartyParty getPayerParty() {
        return payerParty;
    }

    /**
     * Sets the value of the payerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public void setPayerParty(SalesOrderMaintainRequestPartyParty value) {
        this.payerParty = value;
    }

    /**
     * Gets the value of the productRecipientParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public SalesOrderMaintainRequestPartyParty getProductRecipientParty() {
        return productRecipientParty;
    }

    /**
     * Sets the value of the productRecipientParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public void setProductRecipientParty(SalesOrderMaintainRequestPartyParty value) {
        this.productRecipientParty = value;
    }

    /**
     * Gets the value of the salesPartnerParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public SalesOrderMaintainRequestPartyParty getSalesPartnerParty() {
        return salesPartnerParty;
    }

    /**
     * Sets the value of the salesPartnerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public void setSalesPartnerParty(SalesOrderMaintainRequestPartyParty value) {
        this.salesPartnerParty = value;
    }

    /**
     * Gets the value of the freightForwarderParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public SalesOrderMaintainRequestPartyParty getFreightForwarderParty() {
        return freightForwarderParty;
    }

    /**
     * Sets the value of the freightForwarderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyParty }
     *     
     */
    public void setFreightForwarderParty(SalesOrderMaintainRequestPartyParty value) {
        this.freightForwarderParty = value;
    }

    /**
     * Gets the value of the employeeResponsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getEmployeeResponsibleParty() {
        return employeeResponsibleParty;
    }

    /**
     * Sets the value of the employeeResponsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setEmployeeResponsibleParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.employeeResponsibleParty = value;
    }

    /**
     * Gets the value of the sellerParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getSellerParty() {
        return sellerParty;
    }

    /**
     * Sets the value of the sellerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setSellerParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.sellerParty = value;
    }

    /**
     * Gets the value of the salesUnitParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getSalesUnitParty() {
        return salesUnitParty;
    }

    /**
     * Sets the value of the salesUnitParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setSalesUnitParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.salesUnitParty = value;
    }

    /**
     * Gets the value of the serviceExecutionTeamParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getServiceExecutionTeamParty() {
        return serviceExecutionTeamParty;
    }

    /**
     * Sets the value of the serviceExecutionTeamParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setServiceExecutionTeamParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.serviceExecutionTeamParty = value;
    }

    /**
     * Gets the value of the servicePerformerParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getServicePerformerParty() {
        return servicePerformerParty;
    }

    /**
     * Sets the value of the servicePerformerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setServicePerformerParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.servicePerformerParty = value;
    }

    /**
     * Gets the value of the salesEmployeeParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getSalesEmployeeParty() {
        return salesEmployeeParty;
    }

    /**
     * Sets the value of the salesEmployeeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setSalesEmployeeParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.salesEmployeeParty = value;
    }

    /**
     * Gets the value of the billFromParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public SalesOrderMaintainRequestPartyIDParty getBillFromParty() {
        return billFromParty;
    }

    /**
     * Sets the value of the billFromParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyIDParty }
     *     
     */
    public void setBillFromParty(SalesOrderMaintainRequestPartyIDParty value) {
        this.billFromParty = value;
    }

    /**
     * Gets the value of the requestedFulfillmentPeriodPeriodTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestRequestedFulfillmentPeriodPeriodTerms }
     *     
     */
    public SalesOrderMaintainRequestRequestedFulfillmentPeriodPeriodTerms getRequestedFulfillmentPeriodPeriodTerms() {
        return requestedFulfillmentPeriodPeriodTerms;
    }

    /**
     * Sets the value of the requestedFulfillmentPeriodPeriodTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestRequestedFulfillmentPeriodPeriodTerms }
     *     
     */
    public void setRequestedFulfillmentPeriodPeriodTerms(SalesOrderMaintainRequestRequestedFulfillmentPeriodPeriodTerms value) {
        this.requestedFulfillmentPeriodPeriodTerms = value;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestDeliveryTerms }
     *     
     */
    public SalesOrderMaintainRequestDeliveryTerms getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Sets the value of the deliveryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestDeliveryTerms }
     *     
     */
    public void setDeliveryTerms(SalesOrderMaintainRequestDeliveryTerms value) {
        this.deliveryTerms = value;
    }

    /**
     * Gets the value of the pricingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPricingTerms }
     *     
     */
    public SalesOrderMaintainRequestPricingTerms getPricingTerms() {
        return pricingTerms;
    }

    /**
     * Sets the value of the pricingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPricingTerms }
     *     
     */
    public void setPricingTerms(SalesOrderMaintainRequestPricingTerms value) {
        this.pricingTerms = value;
    }

    /**
     * Gets the value of the salesTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestSalesTerms }
     *     
     */
    public SalesOrderMaintainRequestSalesTerms getSalesTerms() {
        return salesTerms;
    }

    /**
     * Sets the value of the salesTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestSalesTerms }
     *     
     */
    public void setSalesTerms(SalesOrderMaintainRequestSalesTerms value) {
        this.salesTerms = value;
    }

    /**
     * Gets the value of the invoiceTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestInvoiceTerms }
     *     
     */
    public SalesOrderMaintainRequestInvoiceTerms getInvoiceTerms() {
        return invoiceTerms;
    }

    /**
     * Sets the value of the invoiceTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestInvoiceTerms }
     *     
     */
    public void setInvoiceTerms(SalesOrderMaintainRequestInvoiceTerms value) {
        this.invoiceTerms = value;
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
     * {@link SalesOrderMaintainRequestItem }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestItem> getItem() {
        if (item == null) {
            item = new ArrayList<SalesOrderMaintainRequestItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the cashDiscountTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestCashDiscountTerms }
     *     
     */
    public SalesOrderMaintainRequestCashDiscountTerms getCashDiscountTerms() {
        return cashDiscountTerms;
    }

    /**
     * Sets the value of the cashDiscountTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestCashDiscountTerms }
     *     
     */
    public void setCashDiscountTerms(SalesOrderMaintainRequestCashDiscountTerms value) {
        this.cashDiscountTerms = value;
    }

    /**
     * Gets the value of the paymentControl property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPaymentControl }
     *     
     */
    public SalesOrderMaintainRequestPaymentControl getPaymentControl() {
        return paymentControl;
    }

    /**
     * Sets the value of the paymentControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPaymentControl }
     *     
     */
    public void setPaymentControl(SalesOrderMaintainRequestPaymentControl value) {
        this.paymentControl = value;
    }

    /**
     * Gets the value of the priceAndTaxCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculation }
     *     
     */
    public SalesOrderMaintainRequestPriceAndTaxCalculation getPriceAndTaxCalculation() {
        return priceAndTaxCalculation;
    }

    /**
     * Sets the value of the priceAndTaxCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculation }
     *     
     */
    public void setPriceAndTaxCalculation(SalesOrderMaintainRequestPriceAndTaxCalculation value) {
        this.priceAndTaxCalculation = value;
    }

    /**
     * Gets the value of the textCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestTextCollection }
     *     
     */
    public SalesOrderMaintainRequestTextCollection getTextCollection() {
        return textCollection;
    }

    /**
     * Sets the value of the textCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestTextCollection }
     *     
     */
    public void setTextCollection(SalesOrderMaintainRequestTextCollection value) {
        this.textCollection = value;
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
     * Gets the value of the businessTransactionDocumentReferenceListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator() {
        return businessTransactionDocumentReferenceListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the businessTransactionDocumentReferenceListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator(Boolean value) {
        this.businessTransactionDocumentReferenceListCompleteTransmissionIndicator = value;
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
