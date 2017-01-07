
package com.sap.xi.a1s.global;

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
import com.sap.xi.ap.common.gdt.PaymentCardHolderAuthenticationID;
import com.sap.xi.ap.common.gdt.PaymentCardHolderAuthenticationResultCode;
import com.sap.xi.ap.common.gdt.PaymentCardPaymentAuthorisationPartyIDV1;
import com.sap.xi.ap.common.gdt.SHORTDescription;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardPaymentAuthorisationPartyID_V1" minOccurs="0"/&gt;
 *         &lt;element name="ClearingHouseID" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardPaymentAuthorisationPartyID_V1" minOccurs="0"/&gt;
 *         &lt;element name="ProviderID" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardPaymentAuthorisationPartyID_V1" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardHolderAuthenticationID" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardHolderAuthenticationID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardHolderAuthenticationResultCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardHolderAuthenticationResultCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardHolderAuthenticationTokenText" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardHolderAuthenticationTokenText" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardTransactionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardTransactionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PreAuthorisationIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActiveIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AppliedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ResultCode" type="{http://sap.com/xi/AP/Common/GDT}AuthorisationResultCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardAddressVerificationResultCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardAddressVerificationResultCode" minOccurs="0"/&gt;
 *         &lt;element name="ProductRecipientPartyPaymentCardAddressVerificationResultCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardAddressVerificationResultCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardVerificationResultCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardVerificationResultCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardVerificationValueVerificationResultCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardVerificationValueVerificationResultCode" minOccurs="0"/&gt;
 *         &lt;element name="ResultDescription" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation", propOrder = {
    "uuid",
    "id",
    "clearingHouseID",
    "providerID",
    "paymentCardHolderAuthenticationID",
    "paymentCardHolderAuthenticationResultCode",
    "paymentCardHolderAuthenticationTokenText",
    "dateTime",
    "paymentCardTransactionTypeCode",
    "preAuthorisationIndicator",
    "amount",
    "expirationDateTime",
    "activeIndicator",
    "appliedIndicator",
    "resultCode",
    "paymentCardAddressVerificationResultCode",
    "productRecipientPartyPaymentCardAddressVerificationResultCode",
    "paymentCardVerificationResultCode",
    "paymentCardVerificationValueVerificationResultCode",
    "resultDescription"
})
public class SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ID")
    protected PaymentCardPaymentAuthorisationPartyIDV1 id;
    @XmlElement(name = "ClearingHouseID")
    protected PaymentCardPaymentAuthorisationPartyIDV1 clearingHouseID;
    @XmlElement(name = "ProviderID")
    protected PaymentCardPaymentAuthorisationPartyIDV1 providerID;
    @XmlElement(name = "PaymentCardHolderAuthenticationID")
    protected PaymentCardHolderAuthenticationID paymentCardHolderAuthenticationID;
    @XmlElement(name = "PaymentCardHolderAuthenticationResultCode")
    protected PaymentCardHolderAuthenticationResultCode paymentCardHolderAuthenticationResultCode;
    @XmlElement(name = "PaymentCardHolderAuthenticationTokenText")
    protected String paymentCardHolderAuthenticationTokenText;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "PaymentCardTransactionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardTransactionTypeCode;
    @XmlElement(name = "PreAuthorisationIndicator")
    protected Boolean preAuthorisationIndicator;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "ActiveIndicator")
    protected Boolean activeIndicator;
    @XmlElement(name = "AppliedIndicator")
    protected Boolean appliedIndicator;
    @XmlElement(name = "ResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String resultCode;
    @XmlElement(name = "PaymentCardAddressVerificationResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardAddressVerificationResultCode;
    @XmlElement(name = "ProductRecipientPartyPaymentCardAddressVerificationResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productRecipientPartyPaymentCardAddressVerificationResultCode;
    @XmlElement(name = "PaymentCardVerificationResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardVerificationResultCode;
    @XmlElement(name = "PaymentCardVerificationValueVerificationResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardVerificationValueVerificationResultCode;
    @XmlElement(name = "ResultDescription")
    protected SHORTDescription resultDescription;
    @XmlAttribute(name = "actionCode")
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardPaymentAuthorisationPartyIDV1 }
     *     
     */
    public PaymentCardPaymentAuthorisationPartyIDV1 getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardPaymentAuthorisationPartyIDV1 }
     *     
     */
    public void setID(PaymentCardPaymentAuthorisationPartyIDV1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the clearingHouseID property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardPaymentAuthorisationPartyIDV1 }
     *     
     */
    public PaymentCardPaymentAuthorisationPartyIDV1 getClearingHouseID() {
        return clearingHouseID;
    }

    /**
     * Sets the value of the clearingHouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardPaymentAuthorisationPartyIDV1 }
     *     
     */
    public void setClearingHouseID(PaymentCardPaymentAuthorisationPartyIDV1 value) {
        this.clearingHouseID = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardPaymentAuthorisationPartyIDV1 }
     *     
     */
    public PaymentCardPaymentAuthorisationPartyIDV1 getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardPaymentAuthorisationPartyIDV1 }
     *     
     */
    public void setProviderID(PaymentCardPaymentAuthorisationPartyIDV1 value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the paymentCardHolderAuthenticationID property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardHolderAuthenticationID }
     *     
     */
    public PaymentCardHolderAuthenticationID getPaymentCardHolderAuthenticationID() {
        return paymentCardHolderAuthenticationID;
    }

    /**
     * Sets the value of the paymentCardHolderAuthenticationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardHolderAuthenticationID }
     *     
     */
    public void setPaymentCardHolderAuthenticationID(PaymentCardHolderAuthenticationID value) {
        this.paymentCardHolderAuthenticationID = value;
    }

    /**
     * Gets the value of the paymentCardHolderAuthenticationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardHolderAuthenticationResultCode }
     *     
     */
    public PaymentCardHolderAuthenticationResultCode getPaymentCardHolderAuthenticationResultCode() {
        return paymentCardHolderAuthenticationResultCode;
    }

    /**
     * Sets the value of the paymentCardHolderAuthenticationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardHolderAuthenticationResultCode }
     *     
     */
    public void setPaymentCardHolderAuthenticationResultCode(PaymentCardHolderAuthenticationResultCode value) {
        this.paymentCardHolderAuthenticationResultCode = value;
    }

    /**
     * Gets the value of the paymentCardHolderAuthenticationTokenText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardHolderAuthenticationTokenText() {
        return paymentCardHolderAuthenticationTokenText;
    }

    /**
     * Sets the value of the paymentCardHolderAuthenticationTokenText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardHolderAuthenticationTokenText(String value) {
        this.paymentCardHolderAuthenticationTokenText = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the paymentCardTransactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardTransactionTypeCode() {
        return paymentCardTransactionTypeCode;
    }

    /**
     * Sets the value of the paymentCardTransactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardTransactionTypeCode(String value) {
        this.paymentCardTransactionTypeCode = value;
    }

    /**
     * Gets the value of the preAuthorisationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAuthorisationIndicator() {
        return preAuthorisationIndicator;
    }

    /**
     * Sets the value of the preAuthorisationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreAuthorisationIndicator(Boolean value) {
        this.preAuthorisationIndicator = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the activeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveIndicator() {
        return activeIndicator;
    }

    /**
     * Sets the value of the activeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveIndicator(Boolean value) {
        this.activeIndicator = value;
    }

    /**
     * Gets the value of the appliedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliedIndicator() {
        return appliedIndicator;
    }

    /**
     * Sets the value of the appliedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliedIndicator(Boolean value) {
        this.appliedIndicator = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the paymentCardAddressVerificationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardAddressVerificationResultCode() {
        return paymentCardAddressVerificationResultCode;
    }

    /**
     * Sets the value of the paymentCardAddressVerificationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardAddressVerificationResultCode(String value) {
        this.paymentCardAddressVerificationResultCode = value;
    }

    /**
     * Gets the value of the productRecipientPartyPaymentCardAddressVerificationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRecipientPartyPaymentCardAddressVerificationResultCode() {
        return productRecipientPartyPaymentCardAddressVerificationResultCode;
    }

    /**
     * Sets the value of the productRecipientPartyPaymentCardAddressVerificationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRecipientPartyPaymentCardAddressVerificationResultCode(String value) {
        this.productRecipientPartyPaymentCardAddressVerificationResultCode = value;
    }

    /**
     * Gets the value of the paymentCardVerificationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardVerificationResultCode() {
        return paymentCardVerificationResultCode;
    }

    /**
     * Sets the value of the paymentCardVerificationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardVerificationResultCode(String value) {
        this.paymentCardVerificationResultCode = value;
    }

    /**
     * Gets the value of the paymentCardVerificationValueVerificationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardVerificationValueVerificationResultCode() {
        return paymentCardVerificationValueVerificationResultCode;
    }

    /**
     * Sets the value of the paymentCardVerificationValueVerificationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardVerificationValueVerificationResultCode(String value) {
        this.paymentCardVerificationValueVerificationResultCode = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SHORTDescription }
     *     
     */
    public SHORTDescription getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTDescription }
     *     
     */
    public void setResultDescription(SHORTDescription value) {
        this.resultDescription = value;
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
