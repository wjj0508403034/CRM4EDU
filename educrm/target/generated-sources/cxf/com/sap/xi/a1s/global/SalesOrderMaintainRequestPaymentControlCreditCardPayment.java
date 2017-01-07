
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
import com.sap.xi.ap.common.gdt.Amount;
import com.sap.xi.ap.common.gdt.ClearingHouseAccountID;
import com.sap.xi.ap.common.gdt.DataOriginTypeCode;
import com.sap.xi.ap.common.gdt.DeviceID;
import com.sap.xi.ap.common.gdt.LocationInternalID;
import com.sap.xi.ap.common.gdt.PaymentCardVerificationValueAvailabilityCode;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.fo.paymentcard.global.PaymentCardKey;


/**
 * <p>Java class for SalesOrderMaintainRequestPaymentControlCreditCardPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPaymentControlCreditCardPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardKey" type="{http://sap.com/xi/AP/FO/PaymentCard/Global}PaymentCardKey" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerPaymentCardDetailsKeyID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerPaymentCardDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardDataOriginTypeCode" type="{http://sap.com/xi/AP/Common/GDT}DataOriginTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardAutomaticallyGeneratedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DeviceID" type="{http://sap.com/xi/AP/Common/GDT}DeviceID" minOccurs="0"/&gt;
 *         &lt;element name="LocationInternalID" type="{http://sap.com/xi/AP/Common/GDT}LocationInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ClearingHouseAccountUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ClearingHouseAccountKeyID" type="{http://sap.com/xi/AP/Common/GDT}ClearingHouseAccountID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardVerificationValueText" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardVerificationValueText" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardVerificationValueAvailabilityCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardVerificationValueAvailabilityCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardVerificationValueCheckRequiredIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationRequiredIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationLimitAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationValueUnlimitedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAuthorisedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="CompanyClearingHouseID" type="{http://sap.com/xi/AP/Common/GDT}PartyPartyID" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardPaymentAuthorisation" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="creditCardPaymentAuthorisationListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPaymentControlCreditCardPayment", propOrder = {
    "uuid",
    "paymentCardUUID",
    "paymentCardKey",
    "businessPartnerPaymentCardDetailsKeyID",
    "paymentCardDataOriginTypeCode",
    "paymentCardAutomaticallyGeneratedIndicator",
    "deviceID",
    "locationInternalID",
    "clearingHouseAccountUUID",
    "clearingHouseAccountKeyID",
    "paymentCardVerificationValueText",
    "paymentCardVerificationValueAvailabilityCode",
    "paymentCardVerificationValueCheckRequiredIndicator",
    "authorisationRequiredIndicator",
    "authorisationLimitAmount",
    "authorisationValueUnlimitedIndicator",
    "amount",
    "paymentAuthorisedAmount",
    "companyClearingHouseID",
    "creditCardPaymentAuthorisation"
})
public class SalesOrderMaintainRequestPaymentControlCreditCardPayment {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "PaymentCardUUID")
    protected UUID paymentCardUUID;
    @XmlElement(name = "PaymentCardKey")
    protected PaymentCardKey paymentCardKey;
    @XmlElement(name = "BusinessPartnerPaymentCardDetailsKeyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerPaymentCardDetailsKeyID;
    @XmlElement(name = "PaymentCardDataOriginTypeCode")
    protected DataOriginTypeCode paymentCardDataOriginTypeCode;
    @XmlElement(name = "PaymentCardAutomaticallyGeneratedIndicator")
    protected Boolean paymentCardAutomaticallyGeneratedIndicator;
    @XmlElement(name = "DeviceID")
    protected DeviceID deviceID;
    @XmlElement(name = "LocationInternalID")
    protected LocationInternalID locationInternalID;
    @XmlElement(name = "ClearingHouseAccountUUID")
    protected UUID clearingHouseAccountUUID;
    @XmlElement(name = "ClearingHouseAccountKeyID")
    protected ClearingHouseAccountID clearingHouseAccountKeyID;
    @XmlElement(name = "PaymentCardVerificationValueText")
    protected String paymentCardVerificationValueText;
    @XmlElement(name = "PaymentCardVerificationValueAvailabilityCode")
    protected PaymentCardVerificationValueAvailabilityCode paymentCardVerificationValueAvailabilityCode;
    @XmlElement(name = "PaymentCardVerificationValueCheckRequiredIndicator")
    protected Boolean paymentCardVerificationValueCheckRequiredIndicator;
    @XmlElement(name = "AuthorisationRequiredIndicator")
    protected Boolean authorisationRequiredIndicator;
    @XmlElement(name = "AuthorisationLimitAmount")
    protected Amount authorisationLimitAmount;
    @XmlElement(name = "AuthorisationValueUnlimitedIndicator")
    protected Boolean authorisationValueUnlimitedIndicator;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "PaymentAuthorisedAmount")
    protected Amount paymentAuthorisedAmount;
    @XmlElement(name = "CompanyClearingHouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyClearingHouseID;
    @XmlElement(name = "CreditCardPaymentAuthorisation")
    protected List<SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation> creditCardPaymentAuthorisation;
    @XmlAttribute(name = "creditCardPaymentAuthorisationListCompleteTransmissionIndicator")
    protected Boolean creditCardPaymentAuthorisationListCompleteTransmissionIndicator;
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
     * Gets the value of the paymentCardUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getPaymentCardUUID() {
        return paymentCardUUID;
    }

    /**
     * Sets the value of the paymentCardUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setPaymentCardUUID(UUID value) {
        this.paymentCardUUID = value;
    }

    /**
     * Gets the value of the paymentCardKey property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardKey }
     *     
     */
    public PaymentCardKey getPaymentCardKey() {
        return paymentCardKey;
    }

    /**
     * Sets the value of the paymentCardKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardKey }
     *     
     */
    public void setPaymentCardKey(PaymentCardKey value) {
        this.paymentCardKey = value;
    }

    /**
     * Gets the value of the businessPartnerPaymentCardDetailsKeyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerPaymentCardDetailsKeyID() {
        return businessPartnerPaymentCardDetailsKeyID;
    }

    /**
     * Sets the value of the businessPartnerPaymentCardDetailsKeyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerPaymentCardDetailsKeyID(String value) {
        this.businessPartnerPaymentCardDetailsKeyID = value;
    }

    /**
     * Gets the value of the paymentCardDataOriginTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DataOriginTypeCode }
     *     
     */
    public DataOriginTypeCode getPaymentCardDataOriginTypeCode() {
        return paymentCardDataOriginTypeCode;
    }

    /**
     * Sets the value of the paymentCardDataOriginTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataOriginTypeCode }
     *     
     */
    public void setPaymentCardDataOriginTypeCode(DataOriginTypeCode value) {
        this.paymentCardDataOriginTypeCode = value;
    }

    /**
     * Gets the value of the paymentCardAutomaticallyGeneratedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentCardAutomaticallyGeneratedIndicator() {
        return paymentCardAutomaticallyGeneratedIndicator;
    }

    /**
     * Sets the value of the paymentCardAutomaticallyGeneratedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentCardAutomaticallyGeneratedIndicator(Boolean value) {
        this.paymentCardAutomaticallyGeneratedIndicator = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceID }
     *     
     */
    public DeviceID getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceID }
     *     
     */
    public void setDeviceID(DeviceID value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the locationInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInternalID }
     *     
     */
    public LocationInternalID getLocationInternalID() {
        return locationInternalID;
    }

    /**
     * Sets the value of the locationInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInternalID }
     *     
     */
    public void setLocationInternalID(LocationInternalID value) {
        this.locationInternalID = value;
    }

    /**
     * Gets the value of the clearingHouseAccountUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getClearingHouseAccountUUID() {
        return clearingHouseAccountUUID;
    }

    /**
     * Sets the value of the clearingHouseAccountUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setClearingHouseAccountUUID(UUID value) {
        this.clearingHouseAccountUUID = value;
    }

    /**
     * Gets the value of the clearingHouseAccountKeyID property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingHouseAccountID }
     *     
     */
    public ClearingHouseAccountID getClearingHouseAccountKeyID() {
        return clearingHouseAccountKeyID;
    }

    /**
     * Sets the value of the clearingHouseAccountKeyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingHouseAccountID }
     *     
     */
    public void setClearingHouseAccountKeyID(ClearingHouseAccountID value) {
        this.clearingHouseAccountKeyID = value;
    }

    /**
     * Gets the value of the paymentCardVerificationValueText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardVerificationValueText() {
        return paymentCardVerificationValueText;
    }

    /**
     * Sets the value of the paymentCardVerificationValueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardVerificationValueText(String value) {
        this.paymentCardVerificationValueText = value;
    }

    /**
     * Gets the value of the paymentCardVerificationValueAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardVerificationValueAvailabilityCode }
     *     
     */
    public PaymentCardVerificationValueAvailabilityCode getPaymentCardVerificationValueAvailabilityCode() {
        return paymentCardVerificationValueAvailabilityCode;
    }

    /**
     * Sets the value of the paymentCardVerificationValueAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardVerificationValueAvailabilityCode }
     *     
     */
    public void setPaymentCardVerificationValueAvailabilityCode(PaymentCardVerificationValueAvailabilityCode value) {
        this.paymentCardVerificationValueAvailabilityCode = value;
    }

    /**
     * Gets the value of the paymentCardVerificationValueCheckRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentCardVerificationValueCheckRequiredIndicator() {
        return paymentCardVerificationValueCheckRequiredIndicator;
    }

    /**
     * Sets the value of the paymentCardVerificationValueCheckRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentCardVerificationValueCheckRequiredIndicator(Boolean value) {
        this.paymentCardVerificationValueCheckRequiredIndicator = value;
    }

    /**
     * Gets the value of the authorisationRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorisationRequiredIndicator() {
        return authorisationRequiredIndicator;
    }

    /**
     * Sets the value of the authorisationRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorisationRequiredIndicator(Boolean value) {
        this.authorisationRequiredIndicator = value;
    }

    /**
     * Gets the value of the authorisationLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAuthorisationLimitAmount() {
        return authorisationLimitAmount;
    }

    /**
     * Sets the value of the authorisationLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAuthorisationLimitAmount(Amount value) {
        this.authorisationLimitAmount = value;
    }

    /**
     * Gets the value of the authorisationValueUnlimitedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorisationValueUnlimitedIndicator() {
        return authorisationValueUnlimitedIndicator;
    }

    /**
     * Sets the value of the authorisationValueUnlimitedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorisationValueUnlimitedIndicator(Boolean value) {
        this.authorisationValueUnlimitedIndicator = value;
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
     * Gets the value of the paymentAuthorisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPaymentAuthorisedAmount() {
        return paymentAuthorisedAmount;
    }

    /**
     * Sets the value of the paymentAuthorisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPaymentAuthorisedAmount(Amount value) {
        this.paymentAuthorisedAmount = value;
    }

    /**
     * Gets the value of the companyClearingHouseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyClearingHouseID() {
        return companyClearingHouseID;
    }

    /**
     * Sets the value of the companyClearingHouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyClearingHouseID(String value) {
        this.companyClearingHouseID = value;
    }

    /**
     * Gets the value of the creditCardPaymentAuthorisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardPaymentAuthorisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardPaymentAuthorisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation> getCreditCardPaymentAuthorisation() {
        if (creditCardPaymentAuthorisation == null) {
            creditCardPaymentAuthorisation = new ArrayList<SalesOrderMaintainRequestPaymentControlCreditCardPaymentCreditCardPaymentAuthorisation>();
        }
        return this.creditCardPaymentAuthorisation;
    }

    /**
     * Gets the value of the creditCardPaymentAuthorisationListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditCardPaymentAuthorisationListCompleteTransmissionIndicator() {
        return creditCardPaymentAuthorisationListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the creditCardPaymentAuthorisationListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditCardPaymentAuthorisationListCompleteTransmissionIndicator(Boolean value) {
        this.creditCardPaymentAuthorisationListCompleteTransmissionIndicator = value;
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
