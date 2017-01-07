
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.PartyID;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for SalesOrderMaintainRequestPartyParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPartyParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyID" type="{http://sap.com/xi/AP/Common/GDT}PartyID" minOccurs="0"/&gt;
 *         &lt;element name="AddressHostUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddress" minOccurs="0"/&gt;
 *         &lt;element name="ContactParty" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyContactParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="partyContactPartyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPartyParty", propOrder = {
    "partyID",
    "addressHostUUID",
    "address",
    "contactParty"
})
public class SalesOrderMaintainRequestPartyParty {

    @XmlElement(name = "PartyID")
    protected PartyID partyID;
    @XmlElement(name = "AddressHostUUID")
    protected UUID addressHostUUID;
    @XmlElement(name = "Address")
    protected SalesOrderMaintainRequestPartyAddress address;
    @XmlElement(name = "ContactParty")
    protected List<SalesOrderMaintainRequestPartyContactParty> contactParty;
    @XmlAttribute(name = "partyContactPartyListCompleteTransmissionIndicator")
    protected Boolean partyContactPartyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the partyID property.
     * 
     * @return
     *     possible object is
     *     {@link PartyID }
     *     
     */
    public PartyID getPartyID() {
        return partyID;
    }

    /**
     * Sets the value of the partyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyID }
     *     
     */
    public void setPartyID(PartyID value) {
        this.partyID = value;
    }

    /**
     * Gets the value of the addressHostUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getAddressHostUUID() {
        return addressHostUUID;
    }

    /**
     * Sets the value of the addressHostUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setAddressHostUUID(UUID value) {
        this.addressHostUUID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPartyAddress }
     *     
     */
    public SalesOrderMaintainRequestPartyAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPartyAddress }
     *     
     */
    public void setAddress(SalesOrderMaintainRequestPartyAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyContactParty }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyContactParty> getContactParty() {
        if (contactParty == null) {
            contactParty = new ArrayList<SalesOrderMaintainRequestPartyContactParty>();
        }
        return this.contactParty;
    }

    /**
     * Gets the value of the partyContactPartyListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartyContactPartyListCompleteTransmissionIndicator() {
        return partyContactPartyListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the partyContactPartyListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartyContactPartyListCompleteTransmissionIndicator(Boolean value) {
        this.partyContactPartyListCompleteTransmissionIndicator = value;
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
