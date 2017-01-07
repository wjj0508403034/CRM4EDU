
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.BankBranchID;
import com.sap.xi.ap.common.gdt.BankInternalID;
import com.sap.xi.ap.common.gdt.CLOSEDDatePeriod;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for CustomerMaintainRequestBundleBankDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleBankDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerBankDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="BankUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="BankInternalID" type="{http://sap.com/xi/AP/Common/GDT}BankInternalID" minOccurs="0"/&gt;
 *         &lt;element name="BankRoutingID" type="{http://sap.com/xi/AP/Common/GDT}BankRoutingID" minOccurs="0"/&gt;
 *         &lt;element name="BankRoutingIDTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BankRoutingIDTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BankStandardID" type="{http://sap.com/xi/AP/Common/GDT}BankStandardID" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountID" type="{http://sap.com/xi/AP/Common/GDT}BankAccountID" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountIDCheckDigitValue" type="{http://sap.com/xi/AP/Common/GDT}BankAccountIDCheckDigitValue" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BankAccountTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountHolderName" type="{http://sap.com/xi/AP/Common/GDT}BankAccountHolderName_V1" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountStandardID" type="{http://sap.com/xi/AP/Common/GDT}BankAccountStandardID" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}CustomerBankDetailsExtensionElements"/&gt;
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
@XmlType(name = "CustomerMaintainRequestBundleBankDetails", propOrder = {
    "objectNodeSenderTechnicalID",
    "id",
    "bankUUID",
    "bankInternalID",
    "bankRoutingID",
    "bankRoutingIDTypeCode",
    "bankStandardID",
    "bankAccountID",
    "bankAccountIDCheckDigitValue",
    "bankAccountTypeCode",
    "bankAccountHolderName",
    "bankAccountStandardID",
    "validityPeriod",
    "bankDirectoryBranchID",
    "goldenTaxRelevanceIndicator"
})
public class CustomerMaintainRequestBundleBankDetails {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "BankUUID")
    protected UUID bankUUID;
    @XmlElement(name = "BankInternalID")
    protected BankInternalID bankInternalID;
    @XmlElement(name = "BankRoutingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankRoutingID;
    @XmlElement(name = "BankRoutingIDTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankRoutingIDTypeCode;
    @XmlElement(name = "BankStandardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankStandardID;
    @XmlElement(name = "BankAccountID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountID;
    @XmlElement(name = "BankAccountIDCheckDigitValue")
    protected String bankAccountIDCheckDigitValue;
    @XmlElement(name = "BankAccountTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountTypeCode;
    @XmlElement(name = "BankAccountHolderName")
    protected String bankAccountHolderName;
    @XmlElement(name = "BankAccountStandardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountStandardID;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "BankDirectoryBranchID", namespace = "http://sap.com/xi/AP/Globalization")
    protected BankBranchID bankDirectoryBranchID;
    @XmlElement(name = "GoldenTaxRelevanceIndicator", namespace = "http://sap.com/xi/AP/Globalization")
    protected Boolean goldenTaxRelevanceIndicator;
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
     * Gets the value of the bankUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getBankUUID() {
        return bankUUID;
    }

    /**
     * Sets the value of the bankUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setBankUUID(UUID value) {
        this.bankUUID = value;
    }

    /**
     * Gets the value of the bankInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link BankInternalID }
     *     
     */
    public BankInternalID getBankInternalID() {
        return bankInternalID;
    }

    /**
     * Sets the value of the bankInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInternalID }
     *     
     */
    public void setBankInternalID(BankInternalID value) {
        this.bankInternalID = value;
    }

    /**
     * Gets the value of the bankRoutingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingID() {
        return bankRoutingID;
    }

    /**
     * Sets the value of the bankRoutingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingID(String value) {
        this.bankRoutingID = value;
    }

    /**
     * Gets the value of the bankRoutingIDTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingIDTypeCode() {
        return bankRoutingIDTypeCode;
    }

    /**
     * Sets the value of the bankRoutingIDTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingIDTypeCode(String value) {
        this.bankRoutingIDTypeCode = value;
    }

    /**
     * Gets the value of the bankStandardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankStandardID() {
        return bankStandardID;
    }

    /**
     * Sets the value of the bankStandardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankStandardID(String value) {
        this.bankStandardID = value;
    }

    /**
     * Gets the value of the bankAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountID() {
        return bankAccountID;
    }

    /**
     * Sets the value of the bankAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountID(String value) {
        this.bankAccountID = value;
    }

    /**
     * Gets the value of the bankAccountIDCheckDigitValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountIDCheckDigitValue() {
        return bankAccountIDCheckDigitValue;
    }

    /**
     * Sets the value of the bankAccountIDCheckDigitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountIDCheckDigitValue(String value) {
        this.bankAccountIDCheckDigitValue = value;
    }

    /**
     * Gets the value of the bankAccountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountTypeCode() {
        return bankAccountTypeCode;
    }

    /**
     * Sets the value of the bankAccountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountTypeCode(String value) {
        this.bankAccountTypeCode = value;
    }

    /**
     * Gets the value of the bankAccountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    /**
     * Sets the value of the bankAccountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountHolderName(String value) {
        this.bankAccountHolderName = value;
    }

    /**
     * Gets the value of the bankAccountStandardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountStandardID() {
        return bankAccountStandardID;
    }

    /**
     * Sets the value of the bankAccountStandardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountStandardID(String value) {
        this.bankAccountStandardID = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setValidityPeriod(CLOSEDDatePeriod value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the bankDirectoryBranchID property.
     * 
     * @return
     *     possible object is
     *     {@link BankBranchID }
     *     
     */
    public BankBranchID getBankDirectoryBranchID() {
        return bankDirectoryBranchID;
    }

    /**
     * Sets the value of the bankDirectoryBranchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankBranchID }
     *     
     */
    public void setBankDirectoryBranchID(BankBranchID value) {
        this.bankDirectoryBranchID = value;
    }

    /**
     * Gets the value of the goldenTaxRelevanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoldenTaxRelevanceIndicator() {
        return goldenTaxRelevanceIndicator;
    }

    /**
     * Sets the value of the goldenTaxRelevanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoldenTaxRelevanceIndicator(Boolean value) {
        this.goldenTaxRelevanceIndicator = value;
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
