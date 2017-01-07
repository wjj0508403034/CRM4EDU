
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for CustomerMaintainRequestBundleContactPersonAddressInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleContactPersonAddressInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleContactPersonAddress" minOccurs="0"/&gt;
 *         &lt;element name="AddressUsage" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleContactPersonAddressUsage" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerMaintainRequestBundleContactPersonAddressInformation", propOrder = {
    "objectNodeSenderTechnicalID",
    "uuid",
    "address",
    "addressUsage"
})
public class CustomerMaintainRequestBundleContactPersonAddressInformation {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "Address")
    protected CustomerMaintainRequestBundleContactPersonAddress address;
    @XmlElement(name = "AddressUsage")
    protected CustomerMaintainRequestBundleContactPersonAddressUsage addressUsage;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMaintainRequestBundleContactPersonAddress }
     *     
     */
    public CustomerMaintainRequestBundleContactPersonAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMaintainRequestBundleContactPersonAddress }
     *     
     */
    public void setAddress(CustomerMaintainRequestBundleContactPersonAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMaintainRequestBundleContactPersonAddressUsage }
     *     
     */
    public CustomerMaintainRequestBundleContactPersonAddressUsage getAddressUsage() {
        return addressUsage;
    }

    /**
     * Sets the value of the addressUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMaintainRequestBundleContactPersonAddressUsage }
     *     
     */
    public void setAddressUsage(CustomerMaintainRequestBundleContactPersonAddressUsage value) {
        this.addressUsage = value;
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
