
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
import com.sap.xi.ap.common.gdt.ExchangeRate;
import com.sap.xi.ap.common.gdt.MEDIUMNote;
import com.sap.xi.ap.common.gdt.PaymentBlock;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for SalesOrderMaintainRequestPaymentControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPaymentControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentProcessingCompanyUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentProcessingCompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentProcessingBusinessPartnerUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentProcessingBusinessPartnerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployeeUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployeeID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="PropertyMovementDirectionCode" type="{http://sap.com/xi/AP/Common/GDT}PropertyMovementDirectionCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFormCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentFormCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://sap.com/xi/AP/Common/GDT}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBlock" type="{http://sap.com/xi/AP/Common/GDT}PaymentBlock" minOccurs="0"/&gt;
 *         &lt;element name="FirstPaymentInstructionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="SecondPaymentInstructionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPaymentInstructionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="FourthPaymentInstructionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BankChargeBearerCode" type="{http://sap.com/xi/AP/Common/GDT}BankChargeBearerCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentPriorityCode" type="{http://sap.com/xi/AP/Common/GDT}PriorityCode" minOccurs="0"/&gt;
 *         &lt;element name="SinglePaymentIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DebitValueDate" type="{http://sap.com/xi/BASIS/Global}Date" minOccurs="0"/&gt;
 *         &lt;element name="CreditValueDate" type="{http://sap.com/xi/BASIS/Global}Date" minOccurs="0"/&gt;
 *         &lt;element name="PaymentReceivablesPayablesGroupID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentGroupID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentReferenceID" type="{http://sap.com/xi/AP/Common/GDT}PaymentReferenceID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentReferenceTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentReferenceTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Note" minOccurs="0"/&gt;
 *         &lt;element name="ExternalPayment" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPaymentControlExternalPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardPayment" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPaymentControlCreditCardPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *       &lt;attribute name="externalPaymentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="creditCardPaymentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPaymentControl", propOrder = {
    "paymentProcessingCompanyUUID",
    "paymentProcessingCompanyID",
    "paymentProcessingBusinessPartnerUUID",
    "paymentProcessingBusinessPartnerID",
    "responsibleEmployeeUUID",
    "responsibleEmployeeID",
    "propertyMovementDirectionCode",
    "paymentFormCode",
    "paymentAmount",
    "exchangeRate",
    "paymentBlock",
    "firstPaymentInstructionTypeCode",
    "secondPaymentInstructionTypeCode",
    "thirdPaymentInstructionTypeCode",
    "fourthPaymentInstructionTypeCode",
    "bankChargeBearerCode",
    "paymentPriorityCode",
    "singlePaymentIndicator",
    "debitValueDate",
    "creditValueDate",
    "paymentReceivablesPayablesGroupID",
    "paymentReferenceID",
    "paymentReferenceTypeCode",
    "note",
    "externalPayment",
    "creditCardPayment"
})
public class SalesOrderMaintainRequestPaymentControl {

    @XmlElement(name = "PaymentProcessingCompanyUUID")
    protected UUID paymentProcessingCompanyUUID;
    @XmlElement(name = "PaymentProcessingCompanyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentProcessingCompanyID;
    @XmlElement(name = "PaymentProcessingBusinessPartnerUUID")
    protected UUID paymentProcessingBusinessPartnerUUID;
    @XmlElement(name = "PaymentProcessingBusinessPartnerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentProcessingBusinessPartnerID;
    @XmlElement(name = "ResponsibleEmployeeUUID")
    protected UUID responsibleEmployeeUUID;
    @XmlElement(name = "ResponsibleEmployeeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String responsibleEmployeeID;
    @XmlElement(name = "PropertyMovementDirectionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String propertyMovementDirectionCode;
    @XmlElement(name = "PaymentFormCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentFormCode;
    @XmlElement(name = "PaymentAmount")
    protected Amount paymentAmount;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRate exchangeRate;
    @XmlElement(name = "PaymentBlock")
    protected PaymentBlock paymentBlock;
    @XmlElement(name = "FirstPaymentInstructionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstPaymentInstructionTypeCode;
    @XmlElement(name = "SecondPaymentInstructionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String secondPaymentInstructionTypeCode;
    @XmlElement(name = "ThirdPaymentInstructionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String thirdPaymentInstructionTypeCode;
    @XmlElement(name = "FourthPaymentInstructionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fourthPaymentInstructionTypeCode;
    @XmlElement(name = "BankChargeBearerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankChargeBearerCode;
    @XmlElement(name = "PaymentPriorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentPriorityCode;
    @XmlElement(name = "SinglePaymentIndicator")
    protected Boolean singlePaymentIndicator;
    @XmlElement(name = "DebitValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar debitValueDate;
    @XmlElement(name = "CreditValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditValueDate;
    @XmlElement(name = "PaymentReceivablesPayablesGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentReceivablesPayablesGroupID;
    @XmlElement(name = "PaymentReferenceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentReferenceID;
    @XmlElement(name = "PaymentReferenceTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentReferenceTypeCode;
    @XmlElement(name = "Note")
    protected MEDIUMNote note;
    @XmlElement(name = "ExternalPayment")
    protected List<SalesOrderMaintainRequestPaymentControlExternalPayment> externalPayment;
    @XmlElement(name = "CreditCardPayment")
    protected List<SalesOrderMaintainRequestPaymentControlCreditCardPayment> creditCardPayment;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "externalPaymentListCompleteTransmissionIndicator")
    protected Boolean externalPaymentListCompleteTransmissionIndicator;
    @XmlAttribute(name = "creditCardPaymentListCompleteTransmissionIndicator")
    protected Boolean creditCardPaymentListCompleteTransmissionIndicator;

    /**
     * Gets the value of the paymentProcessingCompanyUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getPaymentProcessingCompanyUUID() {
        return paymentProcessingCompanyUUID;
    }

    /**
     * Sets the value of the paymentProcessingCompanyUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setPaymentProcessingCompanyUUID(UUID value) {
        this.paymentProcessingCompanyUUID = value;
    }

    /**
     * Gets the value of the paymentProcessingCompanyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProcessingCompanyID() {
        return paymentProcessingCompanyID;
    }

    /**
     * Sets the value of the paymentProcessingCompanyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProcessingCompanyID(String value) {
        this.paymentProcessingCompanyID = value;
    }

    /**
     * Gets the value of the paymentProcessingBusinessPartnerUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getPaymentProcessingBusinessPartnerUUID() {
        return paymentProcessingBusinessPartnerUUID;
    }

    /**
     * Sets the value of the paymentProcessingBusinessPartnerUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setPaymentProcessingBusinessPartnerUUID(UUID value) {
        this.paymentProcessingBusinessPartnerUUID = value;
    }

    /**
     * Gets the value of the paymentProcessingBusinessPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProcessingBusinessPartnerID() {
        return paymentProcessingBusinessPartnerID;
    }

    /**
     * Sets the value of the paymentProcessingBusinessPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProcessingBusinessPartnerID(String value) {
        this.paymentProcessingBusinessPartnerID = value;
    }

    /**
     * Gets the value of the responsibleEmployeeUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getResponsibleEmployeeUUID() {
        return responsibleEmployeeUUID;
    }

    /**
     * Sets the value of the responsibleEmployeeUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setResponsibleEmployeeUUID(UUID value) {
        this.responsibleEmployeeUUID = value;
    }

    /**
     * Gets the value of the responsibleEmployeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleEmployeeID() {
        return responsibleEmployeeID;
    }

    /**
     * Sets the value of the responsibleEmployeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleEmployeeID(String value) {
        this.responsibleEmployeeID = value;
    }

    /**
     * Gets the value of the propertyMovementDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyMovementDirectionCode() {
        return propertyMovementDirectionCode;
    }

    /**
     * Sets the value of the propertyMovementDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyMovementDirectionCode(String value) {
        this.propertyMovementDirectionCode = value;
    }

    /**
     * Gets the value of the paymentFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFormCode() {
        return paymentFormCode;
    }

    /**
     * Sets the value of the paymentFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFormCode(String value) {
        this.paymentFormCode = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPaymentAmount(Amount value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate }
     *     
     */
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate }
     *     
     */
    public void setExchangeRate(ExchangeRate value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the paymentBlock property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentBlock }
     *     
     */
    public PaymentBlock getPaymentBlock() {
        return paymentBlock;
    }

    /**
     * Sets the value of the paymentBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentBlock }
     *     
     */
    public void setPaymentBlock(PaymentBlock value) {
        this.paymentBlock = value;
    }

    /**
     * Gets the value of the firstPaymentInstructionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPaymentInstructionTypeCode() {
        return firstPaymentInstructionTypeCode;
    }

    /**
     * Sets the value of the firstPaymentInstructionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPaymentInstructionTypeCode(String value) {
        this.firstPaymentInstructionTypeCode = value;
    }

    /**
     * Gets the value of the secondPaymentInstructionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPaymentInstructionTypeCode() {
        return secondPaymentInstructionTypeCode;
    }

    /**
     * Sets the value of the secondPaymentInstructionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPaymentInstructionTypeCode(String value) {
        this.secondPaymentInstructionTypeCode = value;
    }

    /**
     * Gets the value of the thirdPaymentInstructionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPaymentInstructionTypeCode() {
        return thirdPaymentInstructionTypeCode;
    }

    /**
     * Sets the value of the thirdPaymentInstructionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPaymentInstructionTypeCode(String value) {
        this.thirdPaymentInstructionTypeCode = value;
    }

    /**
     * Gets the value of the fourthPaymentInstructionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPaymentInstructionTypeCode() {
        return fourthPaymentInstructionTypeCode;
    }

    /**
     * Sets the value of the fourthPaymentInstructionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPaymentInstructionTypeCode(String value) {
        this.fourthPaymentInstructionTypeCode = value;
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
     * Gets the value of the paymentPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPriorityCode() {
        return paymentPriorityCode;
    }

    /**
     * Sets the value of the paymentPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPriorityCode(String value) {
        this.paymentPriorityCode = value;
    }

    /**
     * Gets the value of the singlePaymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSinglePaymentIndicator() {
        return singlePaymentIndicator;
    }

    /**
     * Sets the value of the singlePaymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSinglePaymentIndicator(Boolean value) {
        this.singlePaymentIndicator = value;
    }

    /**
     * Gets the value of the debitValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebitValueDate() {
        return debitValueDate;
    }

    /**
     * Sets the value of the debitValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebitValueDate(XMLGregorianCalendar value) {
        this.debitValueDate = value;
    }

    /**
     * Gets the value of the creditValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditValueDate() {
        return creditValueDate;
    }

    /**
     * Sets the value of the creditValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditValueDate(XMLGregorianCalendar value) {
        this.creditValueDate = value;
    }

    /**
     * Gets the value of the paymentReceivablesPayablesGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReceivablesPayablesGroupID() {
        return paymentReceivablesPayablesGroupID;
    }

    /**
     * Sets the value of the paymentReceivablesPayablesGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReceivablesPayablesGroupID(String value) {
        this.paymentReceivablesPayablesGroupID = value;
    }

    /**
     * Gets the value of the paymentReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReferenceID() {
        return paymentReferenceID;
    }

    /**
     * Sets the value of the paymentReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReferenceID(String value) {
        this.paymentReferenceID = value;
    }

    /**
     * Gets the value of the paymentReferenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReferenceTypeCode() {
        return paymentReferenceTypeCode;
    }

    /**
     * Sets the value of the paymentReferenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReferenceTypeCode(String value) {
        this.paymentReferenceTypeCode = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link MEDIUMNote }
     *     
     */
    public MEDIUMNote getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEDIUMNote }
     *     
     */
    public void setNote(MEDIUMNote value) {
        this.note = value;
    }

    /**
     * Gets the value of the externalPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPaymentControlExternalPayment }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPaymentControlExternalPayment> getExternalPayment() {
        if (externalPayment == null) {
            externalPayment = new ArrayList<SalesOrderMaintainRequestPaymentControlExternalPayment>();
        }
        return this.externalPayment;
    }

    /**
     * Gets the value of the creditCardPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPaymentControlCreditCardPayment }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPaymentControlCreditCardPayment> getCreditCardPayment() {
        if (creditCardPayment == null) {
            creditCardPayment = new ArrayList<SalesOrderMaintainRequestPaymentControlCreditCardPayment>();
        }
        return this.creditCardPayment;
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
     * Gets the value of the externalPaymentListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalPaymentListCompleteTransmissionIndicator() {
        return externalPaymentListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the externalPaymentListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalPaymentListCompleteTransmissionIndicator(Boolean value) {
        this.externalPaymentListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the creditCardPaymentListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditCardPaymentListCompleteTransmissionIndicator() {
        return creditCardPaymentListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the creditCardPaymentListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditCardPaymentListCompleteTransmissionIndicator(Boolean value) {
        this.creditCardPaymentListCompleteTransmissionIndicator = value;
    }

}
