
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.PhoneNumber;


/**
 * <p>Java class for SalesOrderMaintainRequestPartyAddressFascmile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPartyAddressFascmile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://sap.com/xi/AP/Common/GDT}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="FormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="UsageDeniedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPartyAddressFascmile", propOrder = {
    "number",
    "formattedNumberDescription",
    "defaultIndicator",
    "usageDeniedIndicator"
})
public class SalesOrderMaintainRequestPartyAddressFascmile {

    @XmlElement(name = "Number")
    protected PhoneNumber number;
    @XmlElement(name = "FormattedNumberDescription")
    protected String formattedNumberDescription;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlElement(name = "UsageDeniedIndicator")
    protected Boolean usageDeniedIndicator;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     */
    public void setNumber(PhoneNumber value) {
        this.number = value;
    }

    /**
     * Gets the value of the formattedNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedNumberDescription() {
        return formattedNumberDescription;
    }

    /**
     * Sets the value of the formattedNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedNumberDescription(String value) {
        this.formattedNumberDescription = value;
    }

    /**
     * Gets the value of the defaultIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Sets the value of the defaultIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * Gets the value of the usageDeniedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageDeniedIndicator() {
        return usageDeniedIndicator;
    }

    /**
     * Sets the value of the usageDeniedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageDeniedIndicator(Boolean value) {
        this.usageDeniedIndicator = value;
    }

}
