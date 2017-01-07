
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime"/&gt;
 *         &lt;element name="CreationIdentityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentBlock", propOrder = {
    "paymentBlockingReasonCode",
    "expirationDateTime",
    "creationIdentityUUID",
    "creationDateTime"
})
public class PaymentBlock {

    @XmlElement(name = "PaymentBlockingReasonCode")
    protected PaymentBlockingReasonCode paymentBlockingReasonCode;
    @XmlElement(name = "ExpirationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "CreationIdentityUUID")
    protected UUID creationIdentityUUID;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;

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
     * Gets the value of the creationIdentityUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getCreationIdentityUUID() {
        return creationIdentityUUID;
    }

    /**
     * Sets the value of the creationIdentityUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setCreationIdentityUUID(UUID value) {
        this.creationIdentityUUID = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

}
