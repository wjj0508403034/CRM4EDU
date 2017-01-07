
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
import com.sap.xi.ap.common.gdt.CustomerABCClassificationCode;
import com.sap.xi.ap.common.gdt.IndustrialSectorCode;
import com.sap.xi.ap.common.gdt.NielsenRegionCode;
import com.sap.xi.ap.common.gdt.TaxPayerCategoryCode;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.globalization.JPLogisticsInvoiceSummaryBusinessPartnerTypeCode;
import com.sap.xi.ap.globalization.MoveDueDate;
import com.sap.xi.documentservices.global.MaintenanceAttachmentFolder;


/**
 * <p>Java class for CustomerMaintainRequestBundleCustomer_V1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleCustomer_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="InternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ProspectIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}PartyLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundlePerson" minOccurs="0"/&gt;
 *         &lt;element name="Organisation" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleOrganisation" minOccurs="0"/&gt;
 *         &lt;element name="VerbalCommunicationLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="ContactAllowedCode" type="{http://sap.com/xi/AP/Common/GDT}ContactAllowedCode" minOccurs="0"/&gt;
 *         &lt;element name="LegalCompetenceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DunAndBradstreetNumberID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLocationNumberID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="NationalProviderID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="ABCClassificationCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerABCClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="NielsenRegionCode" type="{http://sap.com/xi/AP/Common/GDT}NielsenRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="IndustrialSectorCode" type="{http://sap.com/xi/AP/Common/GDT}IndustrialSectorCode" minOccurs="0"/&gt;
 *         &lt;element name="AddressInformation" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleAddressInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Relationship" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactPerson" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleContactPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationArrangement" type="{http://sap.com/xi/A1S/Global}CommunicationArrangement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DirectResponsibility" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleDirectResponsibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesArrangement" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleSalesArrangement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InvoicingBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}InvoicingBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="CustomerTransactionDocumentFulfilmentBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentFulfilmentBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="CustomerBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="BankDetails" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleBankDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardDetails" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundlePaymentCardDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentData" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundlePaymentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxNumber" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleTaxNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralProductTaxExemption" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleGeneralProductTaxExemption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperatingHoursInformation" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleOperatingHoursInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateCheckApplyIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CreateFromBusinessPartnerIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="EnterpriseIdentificationNumber" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}CustomerCommonExtensionElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" use="required" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *       &lt;attribute name="addressInformationListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="bankDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="communicationArrangementListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="directResponsibilityListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="operatingHoursInformationListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="paymentCardDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="relationshipListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="salesArrangementListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="taxNumberListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="generalProductTaxExemptionListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="contactPersonListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="paymentDataListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="textListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMaintainRequestBundleCustomer_V1", propOrder = {
    "objectNodeSenderTechnicalID",
    "changeStateID",
    "uuid",
    "internalID",
    "categoryCode",
    "prospectIndicator",
    "customerIndicator",
    "lifeCycleStatusCode",
    "person",
    "organisation",
    "verbalCommunicationLanguageCode",
    "contactAllowedCode",
    "legalCompetenceIndicator",
    "dunAndBradstreetNumberID",
    "globalLocationNumberID",
    "nationalProviderID",
    "abcClassificationCode",
    "nielsenRegionCode",
    "industrialSectorCode",
    "addressInformation",
    "relationship",
    "contactPerson",
    "communicationArrangement",
    "directResponsibility",
    "salesArrangement",
    "invoicingBlockingReasonCode",
    "customerTransactionDocumentFulfilmentBlockingReasonCode",
    "customerBlockingReasonCode",
    "bankDetails",
    "paymentCardDetails",
    "paymentData",
    "taxNumber",
    "generalProductTaxExemption",
    "operatingHoursInformation",
    "text",
    "attachmentFolder",
    "duplicateCheckApplyIndicator",
    "createFromBusinessPartnerIndicator",
    "enterpriseIdentificationNumber",
    "taxPayerCategoryCode",
    "withHoldingTaxOfficeName",
    "enterpriseIdentificationSupplementCode",
    "invoiceSummaryRole",
    "taxRecalculationIndicator",
    "monthlyInvoiceNumberRangeInterval",
    "summaryInvoiceNumberRangeInterval",
    "moveDueDate",
    "invoiceSummaryPartyID"
})
public class CustomerMaintainRequestBundleCustomerV1 {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "InternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalID;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "ProspectIndicator")
    protected Boolean prospectIndicator;
    @XmlElement(name = "CustomerIndicator")
    protected Boolean customerIndicator;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "Person")
    protected CustomerMaintainRequestBundlePerson person;
    @XmlElement(name = "Organisation")
    protected CustomerMaintainRequestBundleOrganisation organisation;
    @XmlElement(name = "VerbalCommunicationLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String verbalCommunicationLanguageCode;
    @XmlElement(name = "ContactAllowedCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactAllowedCode;
    @XmlElement(name = "LegalCompetenceIndicator")
    protected Boolean legalCompetenceIndicator;
    @XmlElement(name = "DunAndBradstreetNumberID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dunAndBradstreetNumberID;
    @XmlElement(name = "GlobalLocationNumberID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String globalLocationNumberID;
    @XmlElement(name = "NationalProviderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nationalProviderID;
    @XmlElement(name = "ABCClassificationCode")
    protected CustomerABCClassificationCode abcClassificationCode;
    @XmlElement(name = "NielsenRegionCode")
    protected NielsenRegionCode nielsenRegionCode;
    @XmlElement(name = "IndustrialSectorCode")
    protected IndustrialSectorCode industrialSectorCode;
    @XmlElement(name = "AddressInformation")
    protected List<CustomerMaintainRequestBundleAddressInformation> addressInformation;
    @XmlElement(name = "Relationship")
    protected List<CustomerMaintainRequestBundleRelationship> relationship;
    @XmlElement(name = "ContactPerson")
    protected List<CustomerMaintainRequestBundleContactPerson> contactPerson;
    @XmlElement(name = "CommunicationArrangement")
    protected List<CommunicationArrangement> communicationArrangement;
    @XmlElement(name = "DirectResponsibility")
    protected List<CustomerMaintainRequestBundleDirectResponsibility> directResponsibility;
    @XmlElement(name = "SalesArrangement")
    protected List<CustomerMaintainRequestBundleSalesArrangement> salesArrangement;
    @XmlElement(name = "InvoicingBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoicingBlockingReasonCode;
    @XmlElement(name = "CustomerTransactionDocumentFulfilmentBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerTransactionDocumentFulfilmentBlockingReasonCode;
    @XmlElement(name = "CustomerBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerBlockingReasonCode;
    @XmlElement(name = "BankDetails")
    protected List<CustomerMaintainRequestBundleBankDetails> bankDetails;
    @XmlElement(name = "PaymentCardDetails")
    protected List<CustomerMaintainRequestBundlePaymentCardDetails> paymentCardDetails;
    @XmlElement(name = "PaymentData")
    protected List<CustomerMaintainRequestBundlePaymentData> paymentData;
    @XmlElement(name = "TaxNumber")
    protected List<CustomerMaintainRequestBundleTaxNumber> taxNumber;
    @XmlElement(name = "GeneralProductTaxExemption")
    protected List<CustomerMaintainRequestBundleGeneralProductTaxExemption> generalProductTaxExemption;
    @XmlElement(name = "OperatingHoursInformation")
    protected List<CustomerMaintainRequestBundleOperatingHoursInformation> operatingHoursInformation;
    @XmlElement(name = "Text")
    protected List<CustomerMaintainRequestBundleText> text;
    @XmlElement(name = "AttachmentFolder")
    protected MaintenanceAttachmentFolder attachmentFolder;
    @XmlElement(name = "DuplicateCheckApplyIndicator")
    protected Boolean duplicateCheckApplyIndicator;
    @XmlElement(name = "CreateFromBusinessPartnerIndicator")
    protected Boolean createFromBusinessPartnerIndicator;
    @XmlElement(name = "EnterpriseIdentificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String enterpriseIdentificationNumber;
    @XmlElement(name = "TaxPayerCategoryCode", namespace = "http://sap.com/xi/AP/Globalization")
    protected TaxPayerCategoryCode taxPayerCategoryCode;
    @XmlElement(name = "WithHoldingTaxOfficeName", namespace = "http://sap.com/xi/AP/Globalization")
    protected String withHoldingTaxOfficeName;
    @XmlElement(name = "EnterpriseIdentificationSupplementCode", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String enterpriseIdentificationSupplementCode;
    @XmlElement(name = "InvoiceSummaryRole", namespace = "http://sap.com/xi/AP/Globalization")
    protected JPLogisticsInvoiceSummaryBusinessPartnerTypeCode invoiceSummaryRole;
    @XmlElement(name = "TaxRecalculationIndicator", namespace = "http://sap.com/xi/AP/Globalization")
    protected Boolean taxRecalculationIndicator;
    @XmlElement(name = "MonthlyInvoiceNumberRangeInterval", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String monthlyInvoiceNumberRangeInterval;
    @XmlElement(name = "SummaryInvoiceNumberRangeInterval", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String summaryInvoiceNumberRangeInterval;
    @XmlElement(name = "MoveDueDate", namespace = "http://sap.com/xi/AP/Globalization")
    protected MoveDueDate moveDueDate;
    @XmlElement(name = "InvoiceSummaryPartyID", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoiceSummaryPartyID;
    @XmlAttribute(name = "actionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "addressInformationListCompleteTransmissionIndicator")
    protected Boolean addressInformationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "bankDetailsListCompleteTransmissionIndicator")
    protected Boolean bankDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "communicationArrangementListCompleteTransmissionIndicator")
    protected Boolean communicationArrangementListCompleteTransmissionIndicator;
    @XmlAttribute(name = "directResponsibilityListCompleteTransmissionIndicator")
    protected Boolean directResponsibilityListCompleteTransmissionIndicator;
    @XmlAttribute(name = "operatingHoursInformationListCompleteTransmissionIndicator")
    protected Boolean operatingHoursInformationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "paymentCardDetailsListCompleteTransmissionIndicator")
    protected Boolean paymentCardDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "relationshipListCompleteTransmissionIndicator")
    protected Boolean relationshipListCompleteTransmissionIndicator;
    @XmlAttribute(name = "salesArrangementListCompleteTransmissionIndicator")
    protected Boolean salesArrangementListCompleteTransmissionIndicator;
    @XmlAttribute(name = "taxNumberListCompleteTransmissionIndicator")
    protected Boolean taxNumberListCompleteTransmissionIndicator;
    @XmlAttribute(name = "generalProductTaxExemptionListCompleteTransmissionIndicator")
    protected Boolean generalProductTaxExemptionListCompleteTransmissionIndicator;
    @XmlAttribute(name = "contactPersonListCompleteTransmissionIndicator")
    protected Boolean contactPersonListCompleteTransmissionIndicator;
    @XmlAttribute(name = "paymentDataListCompleteTransmissionIndicator")
    protected Boolean paymentDataListCompleteTransmissionIndicator;
    @XmlAttribute(name = "textListCompleteTransmissionIndicator")
    protected Boolean textListCompleteTransmissionIndicator;

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
     * Gets the value of the internalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * Sets the value of the internalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the prospectIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProspectIndicator() {
        return prospectIndicator;
    }

    /**
     * Sets the value of the prospectIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProspectIndicator(Boolean value) {
        this.prospectIndicator = value;
    }

    /**
     * Gets the value of the customerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerIndicator() {
        return customerIndicator;
    }

    /**
     * Sets the value of the customerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerIndicator(Boolean value) {
        this.customerIndicator = value;
    }

    /**
     * Gets the value of the lifeCycleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Sets the value of the lifeCycleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMaintainRequestBundlePerson }
     *     
     */
    public CustomerMaintainRequestBundlePerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMaintainRequestBundlePerson }
     *     
     */
    public void setPerson(CustomerMaintainRequestBundlePerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMaintainRequestBundleOrganisation }
     *     
     */
    public CustomerMaintainRequestBundleOrganisation getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMaintainRequestBundleOrganisation }
     *     
     */
    public void setOrganisation(CustomerMaintainRequestBundleOrganisation value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the verbalCommunicationLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbalCommunicationLanguageCode() {
        return verbalCommunicationLanguageCode;
    }

    /**
     * Sets the value of the verbalCommunicationLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbalCommunicationLanguageCode(String value) {
        this.verbalCommunicationLanguageCode = value;
    }

    /**
     * Gets the value of the contactAllowedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAllowedCode() {
        return contactAllowedCode;
    }

    /**
     * Sets the value of the contactAllowedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAllowedCode(String value) {
        this.contactAllowedCode = value;
    }

    /**
     * Gets the value of the legalCompetenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalCompetenceIndicator() {
        return legalCompetenceIndicator;
    }

    /**
     * Sets the value of the legalCompetenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalCompetenceIndicator(Boolean value) {
        this.legalCompetenceIndicator = value;
    }

    /**
     * Gets the value of the dunAndBradstreetNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunAndBradstreetNumberID() {
        return dunAndBradstreetNumberID;
    }

    /**
     * Sets the value of the dunAndBradstreetNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunAndBradstreetNumberID(String value) {
        this.dunAndBradstreetNumberID = value;
    }

    /**
     * Gets the value of the globalLocationNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalLocationNumberID() {
        return globalLocationNumberID;
    }

    /**
     * Sets the value of the globalLocationNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalLocationNumberID(String value) {
        this.globalLocationNumberID = value;
    }

    /**
     * Gets the value of the nationalProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalProviderID() {
        return nationalProviderID;
    }

    /**
     * Sets the value of the nationalProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalProviderID(String value) {
        this.nationalProviderID = value;
    }

    /**
     * Gets the value of the abcClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerABCClassificationCode }
     *     
     */
    public CustomerABCClassificationCode getABCClassificationCode() {
        return abcClassificationCode;
    }

    /**
     * Sets the value of the abcClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerABCClassificationCode }
     *     
     */
    public void setABCClassificationCode(CustomerABCClassificationCode value) {
        this.abcClassificationCode = value;
    }

    /**
     * Gets the value of the nielsenRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link NielsenRegionCode }
     *     
     */
    public NielsenRegionCode getNielsenRegionCode() {
        return nielsenRegionCode;
    }

    /**
     * Sets the value of the nielsenRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NielsenRegionCode }
     *     
     */
    public void setNielsenRegionCode(NielsenRegionCode value) {
        this.nielsenRegionCode = value;
    }

    /**
     * Gets the value of the industrialSectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getIndustrialSectorCode() {
        return industrialSectorCode;
    }

    /**
     * Sets the value of the industrialSectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setIndustrialSectorCode(IndustrialSectorCode value) {
        this.industrialSectorCode = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleAddressInformation }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleAddressInformation> getAddressInformation() {
        if (addressInformation == null) {
            addressInformation = new ArrayList<CustomerMaintainRequestBundleAddressInformation>();
        }
        return this.addressInformation;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleRelationship }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleRelationship> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<CustomerMaintainRequestBundleRelationship>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleContactPerson }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleContactPerson> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<CustomerMaintainRequestBundleContactPerson>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the communicationArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationArrangement }
     * 
     * 
     */
    public List<CommunicationArrangement> getCommunicationArrangement() {
        if (communicationArrangement == null) {
            communicationArrangement = new ArrayList<CommunicationArrangement>();
        }
        return this.communicationArrangement;
    }

    /**
     * Gets the value of the directResponsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directResponsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleDirectResponsibility }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleDirectResponsibility> getDirectResponsibility() {
        if (directResponsibility == null) {
            directResponsibility = new ArrayList<CustomerMaintainRequestBundleDirectResponsibility>();
        }
        return this.directResponsibility;
    }

    /**
     * Gets the value of the salesArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleSalesArrangement }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleSalesArrangement> getSalesArrangement() {
        if (salesArrangement == null) {
            salesArrangement = new ArrayList<CustomerMaintainRequestBundleSalesArrangement>();
        }
        return this.salesArrangement;
    }

    /**
     * Gets the value of the invoicingBlockingReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicingBlockingReasonCode() {
        return invoicingBlockingReasonCode;
    }

    /**
     * Sets the value of the invoicingBlockingReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicingBlockingReasonCode(String value) {
        this.invoicingBlockingReasonCode = value;
    }

    /**
     * Gets the value of the customerTransactionDocumentFulfilmentBlockingReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTransactionDocumentFulfilmentBlockingReasonCode() {
        return customerTransactionDocumentFulfilmentBlockingReasonCode;
    }

    /**
     * Sets the value of the customerTransactionDocumentFulfilmentBlockingReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTransactionDocumentFulfilmentBlockingReasonCode(String value) {
        this.customerTransactionDocumentFulfilmentBlockingReasonCode = value;
    }

    /**
     * Gets the value of the customerBlockingReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBlockingReasonCode() {
        return customerBlockingReasonCode;
    }

    /**
     * Sets the value of the customerBlockingReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBlockingReasonCode(String value) {
        this.customerBlockingReasonCode = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleBankDetails }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleBankDetails> getBankDetails() {
        if (bankDetails == null) {
            bankDetails = new ArrayList<CustomerMaintainRequestBundleBankDetails>();
        }
        return this.bankDetails;
    }

    /**
     * Gets the value of the paymentCardDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCardDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCardDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundlePaymentCardDetails }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundlePaymentCardDetails> getPaymentCardDetails() {
        if (paymentCardDetails == null) {
            paymentCardDetails = new ArrayList<CustomerMaintainRequestBundlePaymentCardDetails>();
        }
        return this.paymentCardDetails;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundlePaymentData }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundlePaymentData> getPaymentData() {
        if (paymentData == null) {
            paymentData = new ArrayList<CustomerMaintainRequestBundlePaymentData>();
        }
        return this.paymentData;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleTaxNumber }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleTaxNumber> getTaxNumber() {
        if (taxNumber == null) {
            taxNumber = new ArrayList<CustomerMaintainRequestBundleTaxNumber>();
        }
        return this.taxNumber;
    }

    /**
     * Gets the value of the generalProductTaxExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalProductTaxExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralProductTaxExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleGeneralProductTaxExemption }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleGeneralProductTaxExemption> getGeneralProductTaxExemption() {
        if (generalProductTaxExemption == null) {
            generalProductTaxExemption = new ArrayList<CustomerMaintainRequestBundleGeneralProductTaxExemption>();
        }
        return this.generalProductTaxExemption;
    }

    /**
     * Gets the value of the operatingHoursInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingHoursInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingHoursInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleOperatingHoursInformation }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleOperatingHoursInformation> getOperatingHoursInformation() {
        if (operatingHoursInformation == null) {
            operatingHoursInformation = new ArrayList<CustomerMaintainRequestBundleOperatingHoursInformation>();
        }
        return this.operatingHoursInformation;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleText }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleText> getText() {
        if (text == null) {
            text = new ArrayList<CustomerMaintainRequestBundleText>();
        }
        return this.text;
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
     * Gets the value of the duplicateCheckApplyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateCheckApplyIndicator() {
        return duplicateCheckApplyIndicator;
    }

    /**
     * Sets the value of the duplicateCheckApplyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateCheckApplyIndicator(Boolean value) {
        this.duplicateCheckApplyIndicator = value;
    }

    /**
     * Gets the value of the createFromBusinessPartnerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateFromBusinessPartnerIndicator() {
        return createFromBusinessPartnerIndicator;
    }

    /**
     * Sets the value of the createFromBusinessPartnerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateFromBusinessPartnerIndicator(Boolean value) {
        this.createFromBusinessPartnerIndicator = value;
    }

    /**
     * Gets the value of the enterpriseIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseIdentificationNumber() {
        return enterpriseIdentificationNumber;
    }

    /**
     * Sets the value of the enterpriseIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseIdentificationNumber(String value) {
        this.enterpriseIdentificationNumber = value;
    }

    /**
     * Gets the value of the taxPayerCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPayerCategoryCode }
     *     
     */
    public TaxPayerCategoryCode getTaxPayerCategoryCode() {
        return taxPayerCategoryCode;
    }

    /**
     * Sets the value of the taxPayerCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPayerCategoryCode }
     *     
     */
    public void setTaxPayerCategoryCode(TaxPayerCategoryCode value) {
        this.taxPayerCategoryCode = value;
    }

    /**
     * Gets the value of the withHoldingTaxOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithHoldingTaxOfficeName() {
        return withHoldingTaxOfficeName;
    }

    /**
     * Sets the value of the withHoldingTaxOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithHoldingTaxOfficeName(String value) {
        this.withHoldingTaxOfficeName = value;
    }

    /**
     * Gets the value of the enterpriseIdentificationSupplementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseIdentificationSupplementCode() {
        return enterpriseIdentificationSupplementCode;
    }

    /**
     * Sets the value of the enterpriseIdentificationSupplementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseIdentificationSupplementCode(String value) {
        this.enterpriseIdentificationSupplementCode = value;
    }

    /**
     * Gets the value of the invoiceSummaryRole property.
     * 
     * @return
     *     possible object is
     *     {@link JPLogisticsInvoiceSummaryBusinessPartnerTypeCode }
     *     
     */
    public JPLogisticsInvoiceSummaryBusinessPartnerTypeCode getInvoiceSummaryRole() {
        return invoiceSummaryRole;
    }

    /**
     * Sets the value of the invoiceSummaryRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPLogisticsInvoiceSummaryBusinessPartnerTypeCode }
     *     
     */
    public void setInvoiceSummaryRole(JPLogisticsInvoiceSummaryBusinessPartnerTypeCode value) {
        this.invoiceSummaryRole = value;
    }

    /**
     * Gets the value of the taxRecalculationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxRecalculationIndicator() {
        return taxRecalculationIndicator;
    }

    /**
     * Sets the value of the taxRecalculationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxRecalculationIndicator(Boolean value) {
        this.taxRecalculationIndicator = value;
    }

    /**
     * Gets the value of the monthlyInvoiceNumberRangeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyInvoiceNumberRangeInterval() {
        return monthlyInvoiceNumberRangeInterval;
    }

    /**
     * Sets the value of the monthlyInvoiceNumberRangeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyInvoiceNumberRangeInterval(String value) {
        this.monthlyInvoiceNumberRangeInterval = value;
    }

    /**
     * Gets the value of the summaryInvoiceNumberRangeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryInvoiceNumberRangeInterval() {
        return summaryInvoiceNumberRangeInterval;
    }

    /**
     * Sets the value of the summaryInvoiceNumberRangeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryInvoiceNumberRangeInterval(String value) {
        this.summaryInvoiceNumberRangeInterval = value;
    }

    /**
     * Gets the value of the moveDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link MoveDueDate }
     *     
     */
    public MoveDueDate getMoveDueDate() {
        return moveDueDate;
    }

    /**
     * Sets the value of the moveDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveDueDate }
     *     
     */
    public void setMoveDueDate(MoveDueDate value) {
        this.moveDueDate = value;
    }

    /**
     * Gets the value of the invoiceSummaryPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSummaryPartyID() {
        return invoiceSummaryPartyID;
    }

    /**
     * Sets the value of the invoiceSummaryPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSummaryPartyID(String value) {
        this.invoiceSummaryPartyID = value;
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

    /**
     * Gets the value of the addressInformationListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressInformationListCompleteTransmissionIndicator() {
        return addressInformationListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the addressInformationListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressInformationListCompleteTransmissionIndicator(Boolean value) {
        this.addressInformationListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the bankDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankDetailsListCompleteTransmissionIndicator() {
        return bankDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the bankDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.bankDetailsListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the communicationArrangementListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommunicationArrangementListCompleteTransmissionIndicator() {
        return communicationArrangementListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the communicationArrangementListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommunicationArrangementListCompleteTransmissionIndicator(Boolean value) {
        this.communicationArrangementListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the directResponsibilityListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectResponsibilityListCompleteTransmissionIndicator() {
        return directResponsibilityListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the directResponsibilityListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectResponsibilityListCompleteTransmissionIndicator(Boolean value) {
        this.directResponsibilityListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the operatingHoursInformationListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperatingHoursInformationListCompleteTransmissionIndicator() {
        return operatingHoursInformationListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the operatingHoursInformationListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperatingHoursInformationListCompleteTransmissionIndicator(Boolean value) {
        this.operatingHoursInformationListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the paymentCardDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentCardDetailsListCompleteTransmissionIndicator() {
        return paymentCardDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the paymentCardDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentCardDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.paymentCardDetailsListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the relationshipListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelationshipListCompleteTransmissionIndicator() {
        return relationshipListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the relationshipListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelationshipListCompleteTransmissionIndicator(Boolean value) {
        this.relationshipListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the salesArrangementListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesArrangementListCompleteTransmissionIndicator() {
        return salesArrangementListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the salesArrangementListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesArrangementListCompleteTransmissionIndicator(Boolean value) {
        this.salesArrangementListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the taxNumberListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxNumberListCompleteTransmissionIndicator() {
        return taxNumberListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the taxNumberListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxNumberListCompleteTransmissionIndicator(Boolean value) {
        this.taxNumberListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the generalProductTaxExemptionListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneralProductTaxExemptionListCompleteTransmissionIndicator() {
        return generalProductTaxExemptionListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the generalProductTaxExemptionListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneralProductTaxExemptionListCompleteTransmissionIndicator(Boolean value) {
        this.generalProductTaxExemptionListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the contactPersonListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactPersonListCompleteTransmissionIndicator() {
        return contactPersonListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the contactPersonListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactPersonListCompleteTransmissionIndicator(Boolean value) {
        this.contactPersonListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the paymentDataListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentDataListCompleteTransmissionIndicator() {
        return paymentDataListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the paymentDataListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentDataListCompleteTransmissionIndicator(Boolean value) {
        this.paymentDataListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the textListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextListCompleteTransmissionIndicator() {
        return textListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the textListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextListCompleteTransmissionIndicator(Boolean value) {
        this.textListCompleteTransmissionIndicator = value;
    }

}
