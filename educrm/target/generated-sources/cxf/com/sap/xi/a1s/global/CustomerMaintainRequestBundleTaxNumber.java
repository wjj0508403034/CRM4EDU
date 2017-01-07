
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.PartyTaxID;
import com.sap.xi.ap.common.gdt.TaxIdentificationNumberTypeCode;


/**
 * <p>Java class for CustomerMaintainRequestBundleTaxNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleTaxNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode"/&gt;
 *         &lt;element name="TaxIdentificationNumberTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxIdentificationNumberTypeCode"/&gt;
 *         &lt;element name="PartyTaxID" type="{http://sap.com/xi/AP/Common/GDT}PartyTaxID" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerMaintainRequestBundleTaxNumber", propOrder = {
    "objectNodeSenderTechnicalID",
    "countryCode",
    "taxIdentificationNumberTypeCode",
    "partyTaxID"
})
public class CustomerMaintainRequestBundleTaxNumber {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "CountryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "TaxIdentificationNumberTypeCode", required = true)
    protected TaxIdentificationNumberTypeCode taxIdentificationNumberTypeCode;
    @XmlElement(name = "PartyTaxID")
    protected PartyTaxID partyTaxID;
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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the taxIdentificationNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public TaxIdentificationNumberTypeCode getTaxIdentificationNumberTypeCode() {
        return taxIdentificationNumberTypeCode;
    }

    /**
     * Sets the value of the taxIdentificationNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public void setTaxIdentificationNumberTypeCode(TaxIdentificationNumberTypeCode value) {
        this.taxIdentificationNumberTypeCode = value;
    }

    /**
     * Gets the value of the partyTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTaxID }
     *     
     */
    public PartyTaxID getPartyTaxID() {
        return partyTaxID;
    }

    /**
     * Sets the value of the partyTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTaxID }
     *     
     */
    public void setPartyTaxID(PartyTaxID value) {
        this.partyTaxID = value;
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
