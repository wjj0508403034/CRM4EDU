
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
import com.sap.xi.ap.common.gdt.Amount;
import com.sap.xi.ap.common.gdt.CLOSEDDatePeriod;
import com.sap.xi.ap.common.gdt.PaymentBlockingReasonCode;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.financialaccounting.global.AccountDeterminationDebtorGroupCode;


/**
 * <p>Java class for CustomerMaintainRequestBundlePaymentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundlePaymentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="AccountDeterminationDebtorGroupCode" type="{http://sap.com/xi/AP/FinancialAccounting/Global}AccountDeterminationDebtorGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="AccountDebtorExternalID" type="{http://sap.com/xi/AP/Common/GDT}PartyPartyID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBlockExpirationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaymentForm" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundlePaymentDataPaymentForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DirectDebitMandate" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundlePaymentDataDirectDebitMandate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreditLimitAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="DirectDebitBankDetailsID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerBankDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="DirectDebitValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardDetailsID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerPaymentCardDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="BillOfExchangeBankDetailsID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerBankDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAdviceRequiredIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FirstPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="SecondPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="FourthPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BankChargeBearerCode" type="{http://sap.com/xi/AP/Common/GDT}BankChargeBearerCode" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}CustomerPaymentDataExtensionElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *       &lt;attribute name="DirectDebitMandateListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="paymentFormListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMaintainRequestBundlePaymentData", propOrder = {
    "objectNodeSenderTechnicalID",
    "companyID",
    "uuid",
    "accountDeterminationDebtorGroupCode",
    "accountDebtorExternalID",
    "paymentBlockingReasonCode",
    "paymentBlockExpirationDateTime",
    "paymentForm",
    "directDebitMandate",
    "creditLimitAmount",
    "directDebitBankDetailsID",
    "directDebitValidityPeriod",
    "paymentCardDetailsID",
    "paymentCardValidityPeriod",
    "billOfExchangeBankDetailsID",
    "paymentAdviceRequiredIndicator",
    "firstPaymentInstructionCode",
    "secondPaymentInstructionCode",
    "thirdPaymentInstructionCode",
    "fourthPaymentInstructionCode",
    "bankChargeBearerCode",
    "bankChargeAssignmentID",
    "virtualAccountID"
})
public class CustomerMaintainRequestBundlePaymentData {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "CompanyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "AccountDeterminationDebtorGroupCode")
    protected AccountDeterminationDebtorGroupCode accountDeterminationDebtorGroupCode;
    @XmlElement(name = "AccountDebtorExternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountDebtorExternalID;
    @XmlElement(name = "PaymentBlockingReasonCode")
    protected PaymentBlockingReasonCode paymentBlockingReasonCode;
    @XmlElement(name = "PaymentBlockExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentBlockExpirationDateTime;
    @XmlElement(name = "PaymentForm")
    protected List<CustomerMaintainRequestBundlePaymentDataPaymentForm> paymentForm;
    @XmlElement(name = "DirectDebitMandate")
    protected List<CustomerMaintainRequestBundlePaymentDataDirectDebitMandate> directDebitMandate;
    @XmlElement(name = "CreditLimitAmount")
    protected Amount creditLimitAmount;
    @XmlElement(name = "DirectDebitBankDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String directDebitBankDetailsID;
    @XmlElement(name = "DirectDebitValidityPeriod")
    protected CLOSEDDatePeriod directDebitValidityPeriod;
    @XmlElement(name = "PaymentCardDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardDetailsID;
    @XmlElement(name = "PaymentCardValidityPeriod")
    protected CLOSEDDatePeriod paymentCardValidityPeriod;
    @XmlElement(name = "BillOfExchangeBankDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billOfExchangeBankDetailsID;
    @XmlElement(name = "PaymentAdviceRequiredIndicator")
    protected Boolean paymentAdviceRequiredIndicator;
    @XmlElement(name = "FirstPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstPaymentInstructionCode;
    @XmlElement(name = "SecondPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String secondPaymentInstructionCode;
    @XmlElement(name = "ThirdPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String thirdPaymentInstructionCode;
    @XmlElement(name = "FourthPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fourthPaymentInstructionCode;
    @XmlElement(name = "BankChargeBearerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankChargeBearerCode;
    @XmlElement(name = "BankChargeAssignmentID", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankChargeAssignmentID;
    @XmlElement(name = "VirtualAccountID", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String virtualAccountID;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "DirectDebitMandateListCompleteTransmissionIndicator")
    protected Boolean directDebitMandateListCompleteTransmissionIndicator;
    @XmlAttribute(name = "paymentFormListCompleteTransmissionIndicator")
    protected Boolean paymentFormListCompleteTransmissionIndicator;

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
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
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
     * Gets the value of the accountDeterminationDebtorGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDeterminationDebtorGroupCode }
     *     
     */
    public AccountDeterminationDebtorGroupCode getAccountDeterminationDebtorGroupCode() {
        return accountDeterminationDebtorGroupCode;
    }

    /**
     * Sets the value of the accountDeterminationDebtorGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDeterminationDebtorGroupCode }
     *     
     */
    public void setAccountDeterminationDebtorGroupCode(AccountDeterminationDebtorGroupCode value) {
        this.accountDeterminationDebtorGroupCode = value;
    }

    /**
     * Gets the value of the accountDebtorExternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDebtorExternalID() {
        return accountDebtorExternalID;
    }

    /**
     * Sets the value of the accountDebtorExternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDebtorExternalID(String value) {
        this.accountDebtorExternalID = value;
    }

    /**
     * Gets the value of the paymentBlockingReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentBlockingReasonCode }
     *     
     */
    public PaymentBlockingReasonCode getPaymentBlockingReasonCode() {
        return paymentBlockingReasonCode;
    }

    /**
     * Sets the value of the paymentBlockingReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentBlockingReasonCode }
     *     
     */
    public void setPaymentBlockingReasonCode(PaymentBlockingReasonCode value) {
        this.paymentBlockingReasonCode = value;
    }

    /**
     * Gets the value of the paymentBlockExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentBlockExpirationDateTime() {
        return paymentBlockExpirationDateTime;
    }

    /**
     * Sets the value of the paymentBlockExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentBlockExpirationDateTime(XMLGregorianCalendar value) {
        this.paymentBlockExpirationDateTime = value;
    }

    /**
     * Gets the value of the paymentForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundlePaymentDataPaymentForm }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundlePaymentDataPaymentForm> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<CustomerMaintainRequestBundlePaymentDataPaymentForm>();
        }
        return this.paymentForm;
    }

    /**
     * Gets the value of the directDebitMandate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directDebitMandate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectDebitMandate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundlePaymentDataDirectDebitMandate }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundlePaymentDataDirectDebitMandate> getDirectDebitMandate() {
        if (directDebitMandate == null) {
            directDebitMandate = new ArrayList<CustomerMaintainRequestBundlePaymentDataDirectDebitMandate>();
        }
        return this.directDebitMandate;
    }

    /**
     * Gets the value of the creditLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCreditLimitAmount() {
        return creditLimitAmount;
    }

    /**
     * Sets the value of the creditLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCreditLimitAmount(Amount value) {
        this.creditLimitAmount = value;
    }

    /**
     * Gets the value of the directDebitBankDetailsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitBankDetailsID() {
        return directDebitBankDetailsID;
    }

    /**
     * Sets the value of the directDebitBankDetailsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitBankDetailsID(String value) {
        this.directDebitBankDetailsID = value;
    }

    /**
     * Gets the value of the directDebitValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getDirectDebitValidityPeriod() {
        return directDebitValidityPeriod;
    }

    /**
     * Sets the value of the directDebitValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setDirectDebitValidityPeriod(CLOSEDDatePeriod value) {
        this.directDebitValidityPeriod = value;
    }

    /**
     * Gets the value of the paymentCardDetailsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardDetailsID() {
        return paymentCardDetailsID;
    }

    /**
     * Sets the value of the paymentCardDetailsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardDetailsID(String value) {
        this.paymentCardDetailsID = value;
    }

    /**
     * Gets the value of the paymentCardValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getPaymentCardValidityPeriod() {
        return paymentCardValidityPeriod;
    }

    /**
     * Sets the value of the paymentCardValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setPaymentCardValidityPeriod(CLOSEDDatePeriod value) {
        this.paymentCardValidityPeriod = value;
    }

    /**
     * Gets the value of the billOfExchangeBankDetailsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillOfExchangeBankDetailsID() {
        return billOfExchangeBankDetailsID;
    }

    /**
     * Sets the value of the billOfExchangeBankDetailsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillOfExchangeBankDetailsID(String value) {
        this.billOfExchangeBankDetailsID = value;
    }

    /**
     * Gets the value of the paymentAdviceRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentAdviceRequiredIndicator() {
        return paymentAdviceRequiredIndicator;
    }

    /**
     * Sets the value of the paymentAdviceRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentAdviceRequiredIndicator(Boolean value) {
        this.paymentAdviceRequiredIndicator = value;
    }

    /**
     * Gets the value of the firstPaymentInstructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPaymentInstructionCode() {
        return firstPaymentInstructionCode;
    }

    /**
     * Sets the value of the firstPaymentInstructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPaymentInstructionCode(String value) {
        this.firstPaymentInstructionCode = value;
    }

    /**
     * Gets the value of the secondPaymentInstructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPaymentInstructionCode() {
        return secondPaymentInstructionCode;
    }

    /**
     * Sets the value of the secondPaymentInstructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPaymentInstructionCode(String value) {
        this.secondPaymentInstructionCode = value;
    }

    /**
     * Gets the value of the thirdPaymentInstructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPaymentInstructionCode() {
        return thirdPaymentInstructionCode;
    }

    /**
     * Sets the value of the thirdPaymentInstructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPaymentInstructionCode(String value) {
        this.thirdPaymentInstructionCode = value;
    }

    /**
     * Gets the value of the fourthPaymentInstructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPaymentInstructionCode() {
        return fourthPaymentInstructionCode;
    }

    /**
     * Sets the value of the fourthPaymentInstructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPaymentInstructionCode(String value) {
        this.fourthPaymentInstructionCode = value;
    }

    /**
     * Gets the value of the bankChargeBearerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankChargeBearerCode() {
        return bankChargeBearerCode;
    }

    /**
     * Sets the value of the bankChargeBearerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankChargeBearerCode(String value) {
        this.bankChargeBearerCode = value;
    }

    /**
     * Gets the value of the bankChargeAssignmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankChargeAssignmentID() {
        return bankChargeAssignmentID;
    }

    /**
     * Sets the value of the bankChargeAssignmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankChargeAssignmentID(String value) {
        this.bankChargeAssignmentID = value;
    }

    /**
     * Gets the value of the virtualAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualAccountID() {
        return virtualAccountID;
    }

    /**
     * Sets the value of the virtualAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualAccountID(String value) {
        this.virtualAccountID = value;
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
     * Gets the value of the directDebitMandateListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectDebitMandateListCompleteTransmissionIndicator() {
        return directDebitMandateListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the directDebitMandateListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectDebitMandateListCompleteTransmissionIndicator(Boolean value) {
        this.directDebitMandateListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the paymentFormListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentFormListCompleteTransmissionIndicator() {
        return paymentFormListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the paymentFormListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentFormListCompleteTransmissionIndicator(Boolean value) {
        this.paymentFormListCompleteTransmissionIndicator = value;
    }

}
