
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
import com.sap.xi.ap.common.gdt.BankAccountInternalID;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for SalesOrderMaintainRequestPaymentControlExternalPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPaymentControlExternalPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="HouseBankAccountUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="HouseBankAccountKeyInternalID" type="{http://sap.com/xi/AP/Common/GDT}BankAccountInternalID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTransactionReferenceID" type="{http://sap.com/xi/AP/Common/GDT}PaymentTransactionReferenceID" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="ValueDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestPaymentControlExternalPayment", propOrder = {
    "uuid",
    "houseBankAccountUUID",
    "houseBankAccountKeyInternalID",
    "paymentTransactionReferenceID",
    "documentDate",
    "valueDate",
    "amount"
})
public class SalesOrderMaintainRequestPaymentControlExternalPayment {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "HouseBankAccountUUID")
    protected UUID houseBankAccountUUID;
    @XmlElement(name = "HouseBankAccountKeyInternalID")
    protected BankAccountInternalID houseBankAccountKeyInternalID;
    @XmlElement(name = "PaymentTransactionReferenceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentTransactionReferenceID;
    @XmlElement(name = "DocumentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "ValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    @XmlElement(name = "Amount")
    protected Amount amount;
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
     * Gets the value of the houseBankAccountUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getHouseBankAccountUUID() {
        return houseBankAccountUUID;
    }

    /**
     * Sets the value of the houseBankAccountUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setHouseBankAccountUUID(UUID value) {
        this.houseBankAccountUUID = value;
    }

    /**
     * Gets the value of the houseBankAccountKeyInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountInternalID }
     *     
     */
    public BankAccountInternalID getHouseBankAccountKeyInternalID() {
        return houseBankAccountKeyInternalID;
    }

    /**
     * Sets the value of the houseBankAccountKeyInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountInternalID }
     *     
     */
    public void setHouseBankAccountKeyInternalID(BankAccountInternalID value) {
        this.houseBankAccountKeyInternalID = value;
    }

    /**
     * Gets the value of the paymentTransactionReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionReferenceID() {
        return paymentTransactionReferenceID;
    }

    /**
     * Sets the value of the paymentTransactionReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionReferenceID(String value) {
        this.paymentTransactionReferenceID = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
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
