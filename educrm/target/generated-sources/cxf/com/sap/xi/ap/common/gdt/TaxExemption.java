
package com.sap.xi.ap.common.gdt;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxExemption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateID" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionCertificateID"/&gt;
 *         &lt;element name="InternalCertificateID" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionCertificateID" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCode" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxExemption", propOrder = {
    "certificateID",
    "internalCertificateID",
    "validityPeriod",
    "percent",
    "amount",
    "reasonCode"
})
public class TaxExemption {

    @XmlElement(name = "CertificateID", required = true)
    protected TaxExemptionCertificateID certificateID;
    @XmlElement(name = "InternalCertificateID")
    protected TaxExemptionCertificateID internalCertificateID;
    @XmlElement(name = "ValidityPeriod")
    protected DatePeriod validityPeriod;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "ReasonCode")
    protected TaxExemptionReasonCode reasonCode;

    /**
     * Gets the value of the certificateID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public TaxExemptionCertificateID getCertificateID() {
        return certificateID;
    }

    /**
     * Sets the value of the certificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public void setCertificateID(TaxExemptionCertificateID value) {
        this.certificateID = value;
    }

    /**
     * Gets the value of the internalCertificateID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public TaxExemptionCertificateID getInternalCertificateID() {
        return internalCertificateID;
    }

    /**
     * Sets the value of the internalCertificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public void setInternalCertificateID(TaxExemptionCertificateID value) {
        this.internalCertificateID = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod }
     *     
     */
    public DatePeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod }
     *     
     */
    public void setValidityPeriod(DatePeriod value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
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
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public TaxExemptionReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public void setReasonCode(TaxExemptionReasonCode value) {
        this.reasonCode = value;
    }

}
