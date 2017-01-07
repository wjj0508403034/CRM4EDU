
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
import com.sap.xi.ap.common.gdt.DirectDebitMandateIDV1;
import com.sap.xi.ap.common.gdt.DirectDebitSchemeCode;
import com.sap.xi.ap.common.gdt.RegionCode;


/**
 * <p>Java class for CustomerMaintainRequestBundlePaymentDataDirectDebitMandate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundlePaymentDataDirectDebitMandate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="MandateID" type="{http://sap.com/xi/AP/Common/GDT}DirectDebitMandateID_V1" minOccurs="0"/&gt;
 *         &lt;element name="MandateDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Description" minOccurs="0"/&gt;
 *         &lt;element name="MandateType" type="{http://sap.com/xi/AP/Common/GDT}DirectDebitSchemeCode" minOccurs="0"/&gt;
 *         &lt;element name="SignatureDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="PlaceOfSignature" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="SingleUseIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BlockedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ValidFromDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="ValidToDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="PayerBankDetailsID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerBankDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePayerName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePayerHouseNumber" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePayerStreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePayerCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePayerCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePayerRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePayerPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerMaintainRequestBundlePaymentDataDirectDebitMandate", propOrder = {
    "objectNodeSenderTechnicalID",
    "mandateID",
    "mandateDescription",
    "mandateType",
    "signatureDate",
    "placeOfSignature",
    "singleUseIndicator",
    "blockedIndicator",
    "validFromDate",
    "validToDate",
    "payerBankDetailsID",
    "alternatePayerName",
    "alternatePayerHouseNumber",
    "alternatePayerStreetName",
    "alternatePayerCityName",
    "alternatePayerCountryCode",
    "alternatePayerRegionCode",
    "alternatePayerPostalCode"
})
public class CustomerMaintainRequestBundlePaymentDataDirectDebitMandate {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "MandateID")
    protected DirectDebitMandateIDV1 mandateID;
    @XmlElement(name = "MandateDescription")
    protected String mandateDescription;
    @XmlElement(name = "MandateType")
    protected DirectDebitSchemeCode mandateType;
    @XmlElement(name = "SignatureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signatureDate;
    @XmlElement(name = "PlaceOfSignature")
    protected String placeOfSignature;
    @XmlElement(name = "SingleUseIndicator")
    protected Boolean singleUseIndicator;
    @XmlElement(name = "BlockedIndicator")
    protected Boolean blockedIndicator;
    @XmlElement(name = "ValidFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFromDate;
    @XmlElement(name = "ValidToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validToDate;
    @XmlElement(name = "PayerBankDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String payerBankDetailsID;
    @XmlElement(name = "AlternatePayerName")
    protected String alternatePayerName;
    @XmlElement(name = "AlternatePayerHouseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alternatePayerHouseNumber;
    @XmlElement(name = "AlternatePayerStreetName")
    protected String alternatePayerStreetName;
    @XmlElement(name = "AlternatePayerCityName")
    protected String alternatePayerCityName;
    @XmlElement(name = "AlternatePayerCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alternatePayerCountryCode;
    @XmlElement(name = "AlternatePayerRegionCode")
    protected RegionCode alternatePayerRegionCode;
    @XmlElement(name = "AlternatePayerPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alternatePayerPostalCode;
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
     * Gets the value of the mandateID property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateIDV1 }
     *     
     */
    public DirectDebitMandateIDV1 getMandateID() {
        return mandateID;
    }

    /**
     * Sets the value of the mandateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateIDV1 }
     *     
     */
    public void setMandateID(DirectDebitMandateIDV1 value) {
        this.mandateID = value;
    }

    /**
     * Gets the value of the mandateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateDescription() {
        return mandateDescription;
    }

    /**
     * Sets the value of the mandateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateDescription(String value) {
        this.mandateDescription = value;
    }

    /**
     * Gets the value of the mandateType property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitSchemeCode }
     *     
     */
    public DirectDebitSchemeCode getMandateType() {
        return mandateType;
    }

    /**
     * Sets the value of the mandateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitSchemeCode }
     *     
     */
    public void setMandateType(DirectDebitSchemeCode value) {
        this.mandateType = value;
    }

    /**
     * Gets the value of the signatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignatureDate() {
        return signatureDate;
    }

    /**
     * Sets the value of the signatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignatureDate(XMLGregorianCalendar value) {
        this.signatureDate = value;
    }

    /**
     * Gets the value of the placeOfSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfSignature() {
        return placeOfSignature;
    }

    /**
     * Sets the value of the placeOfSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfSignature(String value) {
        this.placeOfSignature = value;
    }

    /**
     * Gets the value of the singleUseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleUseIndicator() {
        return singleUseIndicator;
    }

    /**
     * Sets the value of the singleUseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleUseIndicator(Boolean value) {
        this.singleUseIndicator = value;
    }

    /**
     * Gets the value of the blockedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockedIndicator() {
        return blockedIndicator;
    }

    /**
     * Sets the value of the blockedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockedIndicator(Boolean value) {
        this.blockedIndicator = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFromDate(XMLGregorianCalendar value) {
        this.validFromDate = value;
    }

    /**
     * Gets the value of the validToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidToDate() {
        return validToDate;
    }

    /**
     * Sets the value of the validToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidToDate(XMLGregorianCalendar value) {
        this.validToDate = value;
    }

    /**
     * Gets the value of the payerBankDetailsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBankDetailsID() {
        return payerBankDetailsID;
    }

    /**
     * Sets the value of the payerBankDetailsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBankDetailsID(String value) {
        this.payerBankDetailsID = value;
    }

    /**
     * Gets the value of the alternatePayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePayerName() {
        return alternatePayerName;
    }

    /**
     * Sets the value of the alternatePayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePayerName(String value) {
        this.alternatePayerName = value;
    }

    /**
     * Gets the value of the alternatePayerHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePayerHouseNumber() {
        return alternatePayerHouseNumber;
    }

    /**
     * Sets the value of the alternatePayerHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePayerHouseNumber(String value) {
        this.alternatePayerHouseNumber = value;
    }

    /**
     * Gets the value of the alternatePayerStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePayerStreetName() {
        return alternatePayerStreetName;
    }

    /**
     * Sets the value of the alternatePayerStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePayerStreetName(String value) {
        this.alternatePayerStreetName = value;
    }

    /**
     * Gets the value of the alternatePayerCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePayerCityName() {
        return alternatePayerCityName;
    }

    /**
     * Sets the value of the alternatePayerCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePayerCityName(String value) {
        this.alternatePayerCityName = value;
    }

    /**
     * Gets the value of the alternatePayerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePayerCountryCode() {
        return alternatePayerCountryCode;
    }

    /**
     * Sets the value of the alternatePayerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePayerCountryCode(String value) {
        this.alternatePayerCountryCode = value;
    }

    /**
     * Gets the value of the alternatePayerRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getAlternatePayerRegionCode() {
        return alternatePayerRegionCode;
    }

    /**
     * Sets the value of the alternatePayerRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setAlternatePayerRegionCode(RegionCode value) {
        this.alternatePayerRegionCode = value;
    }

    /**
     * Gets the value of the alternatePayerPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePayerPostalCode() {
        return alternatePayerPostalCode;
    }

    /**
     * Sets the value of the alternatePayerPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePayerPostalCode(String value) {
        this.alternatePayerPostalCode = value;
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
