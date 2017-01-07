
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.AddressRepresentationCode;
import com.sap.xi.ap.common.gdt.OrganisationName;


/**
 * <p>Java class for SalesOrderMaintainRequestPartyAddressName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPartyAddressName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressRepresentationCode" type="{http://sap.com/xi/AP/Common/GDT}AddressRepresentationCode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}OrganisationName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPartyAddressName", propOrder = {
    "addressRepresentationCode",
    "name"
})
public class SalesOrderMaintainRequestPartyAddressName {

    @XmlElement(name = "AddressRepresentationCode")
    protected AddressRepresentationCode addressRepresentationCode;
    @XmlElement(name = "Name")
    protected OrganisationName name;

    /**
     * Gets the value of the addressRepresentationCode property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public AddressRepresentationCode getAddressRepresentationCode() {
        return addressRepresentationCode;
    }

    /**
     * Sets the value of the addressRepresentationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public void setAddressRepresentationCode(AddressRepresentationCode value) {
        this.addressRepresentationCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationName }
     *     
     */
    public OrganisationName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationName }
     *     
     */
    public void setName(OrganisationName value) {
        this.name = value;
    }

}
