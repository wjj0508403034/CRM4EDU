
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.Incoterms;


/**
 * <p>Java class for SalesOrderMaintainRequestDeliveryTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestDeliveryTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryPriorityCode" type="{http://sap.com/xi/AP/Common/GDT}PriorityCode" minOccurs="0"/&gt;
 *         &lt;element name="Incoterms" type="{http://sap.com/xi/AP/Common/GDT}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="PartialDeliveryControlCode" type="{http://sap.com/xi/AP/Common/GDT}PartialDeliveryControlCode" minOccurs="0"/&gt;
 *         &lt;element name="CompleteDeliveryRequestedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestDeliveryTerms", propOrder = {
    "deliveryPriorityCode",
    "incoterms",
    "partialDeliveryControlCode",
    "completeDeliveryRequestedIndicator"
})
public class SalesOrderMaintainRequestDeliveryTerms {

    @XmlElement(name = "DeliveryPriorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryPriorityCode;
    @XmlElement(name = "Incoterms")
    protected Incoterms incoterms;
    @XmlElement(name = "PartialDeliveryControlCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partialDeliveryControlCode;
    @XmlElement(name = "CompleteDeliveryRequestedIndicator")
    protected Boolean completeDeliveryRequestedIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

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
     * Gets the value of the partialDeliveryControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialDeliveryControlCode() {
        return partialDeliveryControlCode;
    }

    /**
     * Sets the value of the partialDeliveryControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialDeliveryControlCode(String value) {
        this.partialDeliveryControlCode = value;
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
