
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.EmployeeID;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for CustomerMaintainRequestBundleContactResponsibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleContactResponsibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployeeUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="PartyRoleCode" type="{http://sap.com/xi/AP/Common/GDT}PartyRoleCode" minOccurs="0"/&gt;
 *         &lt;element name="GroupwareSubscriptionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerMaintainRequestBundleContactResponsibility", propOrder = {
    "objectNodeSenderTechnicalID",
    "uuid",
    "responsibleEmployeeUUID",
    "responsibleEmployeeID",
    "partyRoleCode",
    "groupwareSubscriptionIndicator"
})
public class CustomerMaintainRequestBundleContactResponsibility {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ResponsibleEmployeeUUID")
    protected UUID responsibleEmployeeUUID;
    @XmlElement(name = "ResponsibleEmployeeID")
    protected EmployeeID responsibleEmployeeID;
    @XmlElement(name = "PartyRoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partyRoleCode;
    @XmlElement(name = "GroupwareSubscriptionIndicator")
    protected Boolean groupwareSubscriptionIndicator;
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
     * Gets the value of the responsibleEmployeeUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getResponsibleEmployeeUUID() {
        return responsibleEmployeeUUID;
    }

    /**
     * Sets the value of the responsibleEmployeeUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setResponsibleEmployeeUUID(UUID value) {
        this.responsibleEmployeeUUID = value;
    }

    /**
     * Gets the value of the responsibleEmployeeID property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeID }
     *     
     */
    public EmployeeID getResponsibleEmployeeID() {
        return responsibleEmployeeID;
    }

    /**
     * Sets the value of the responsibleEmployeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeID }
     *     
     */
    public void setResponsibleEmployeeID(EmployeeID value) {
        this.responsibleEmployeeID = value;
    }

    /**
     * Gets the value of the partyRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleCode() {
        return partyRoleCode;
    }

    /**
     * Sets the value of the partyRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleCode(String value) {
        this.partyRoleCode = value;
    }

    /**
     * Gets the value of the groupwareSubscriptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupwareSubscriptionIndicator() {
        return groupwareSubscriptionIndicator;
    }

    /**
     * Sets the value of the groupwareSubscriptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupwareSubscriptionIndicator(Boolean value) {
        this.groupwareSubscriptionIndicator = value;
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
