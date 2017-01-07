
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.CashDiscountTermsCode;
import com.sap.xi.ap.common.gdt.CustomerGroupCode;
import com.sap.xi.ap.common.gdt.DistributionChannelCode;
import com.sap.xi.ap.common.gdt.Incoterms;


/**
 * <p>Java class for CustomerMaintainRequestBundleSalesArrangement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleSalesArrangement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrganisationID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChannelCode" type="{http://sap.com/xi/AP/Common/GDT}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="Incoterms" type="{http://sap.com/xi/AP/Common/GDT}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryPriorityCode" type="{http://sap.com/xi/AP/Common/GDT}PriorityCode" minOccurs="0"/&gt;
 *         &lt;element name="CompleteDeliveryRequestedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="CustomerGroupCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTermsCode" type="{http://sap.com/xi/AP/Common/GDT}CashDiscountTermsCode" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerMaintainRequestBundleSalesArrangement", propOrder = {
    "objectNodeSenderTechnicalID",
    "salesOrganisationID",
    "distributionChannelCode",
    "incoterms",
    "deliveryPriorityCode",
    "completeDeliveryRequestedIndicator",
    "currencyCode",
    "customerGroupCode",
    "cashDiscountTermsCode"
})
public class CustomerMaintainRequestBundleSalesArrangement {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "SalesOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrganisationID;
    @XmlElement(name = "DistributionChannelCode")
    protected DistributionChannelCode distributionChannelCode;
    @XmlElement(name = "Incoterms")
    protected Incoterms incoterms;
    @XmlElement(name = "DeliveryPriorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryPriorityCode;
    @XmlElement(name = "CompleteDeliveryRequestedIndicator")
    protected Boolean completeDeliveryRequestedIndicator;
    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "CustomerGroupCode")
    protected CustomerGroupCode customerGroupCode;
    @XmlElement(name = "CashDiscountTermsCode")
    protected CashDiscountTermsCode cashDiscountTermsCode;
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
     * Gets the value of the salesOrganisationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganisationID() {
        return salesOrganisationID;
    }

    /**
     * Sets the value of the salesOrganisationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganisationID(String value) {
        this.salesOrganisationID = value;
    }

    /**
     * Gets the value of the distributionChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelCode }
     *     
     */
    public DistributionChannelCode getDistributionChannelCode() {
        return distributionChannelCode;
    }

    /**
     * Sets the value of the distributionChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelCode }
     *     
     */
    public void setDistributionChannelCode(DistributionChannelCode value) {
        this.distributionChannelCode = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the deliveryPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPriorityCode() {
        return deliveryPriorityCode;
    }

    /**
     * Sets the value of the deliveryPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPriorityCode(String value) {
        this.deliveryPriorityCode = value;
    }

    /**
     * Gets the value of the completeDeliveryRequestedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteDeliveryRequestedIndicator() {
        return completeDeliveryRequestedIndicator;
    }

    /**
     * Sets the value of the completeDeliveryRequestedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteDeliveryRequestedIndicator(Boolean value) {
        this.completeDeliveryRequestedIndicator = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customerGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerGroupCode }
     *     
     */
    public CustomerGroupCode getCustomerGroupCode() {
        return customerGroupCode;
    }

    /**
     * Sets the value of the customerGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerGroupCode }
     *     
     */
    public void setCustomerGroupCode(CustomerGroupCode value) {
        this.customerGroupCode = value;
    }

    /**
     * Gets the value of the cashDiscountTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public CashDiscountTermsCode getCashDiscountTermsCode() {
        return cashDiscountTermsCode;
    }

    /**
     * Sets the value of the cashDiscountTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public void setCashDiscountTermsCode(CashDiscountTermsCode value) {
        this.cashDiscountTermsCode = value;
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
