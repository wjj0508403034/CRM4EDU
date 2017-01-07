
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.PhoneNumber;


/**
 * <p>Java class for SalesOrderMaintainRequestPartyAddressTelephone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPartyAddressTelephone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://sap.com/xi/AP/Common/GDT}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="FormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="DefaultConventionalPhoneNumberIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DefaultMobilePhoneNumberIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="UsageDeniedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhoneNumberIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SMSEnabledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPartyAddressTelephone", propOrder = {
    "number",
    "formattedNumberDescription",
    "defaultConventionalPhoneNumberIndicator",
    "defaultMobilePhoneNumberIndicator",
    "usageDeniedIndicator",
    "mobilePhoneNumberIndicator",
    "smsEnabledIndicator"
})
public class SalesOrderMaintainRequestPartyAddressTelephone {

    @XmlElement(name = "Number")
    protected PhoneNumber number;
    @XmlElement(name = "FormattedNumberDescription")
    protected String formattedNumberDescription;
    @XmlElement(name = "DefaultConventionalPhoneNumberIndicator")
    protected Boolean defaultConventionalPhoneNumberIndicator;
    @XmlElement(name = "DefaultMobilePhoneNumberIndicator")
    protected Boolean defaultMobilePhoneNumberIndicator;
    @XmlElement(name = "UsageDeniedIndicator")
    protected Boolean usageDeniedIndicator;
    @XmlElement(name = "MobilePhoneNumberIndicator")
    protected Boolean mobilePhoneNumberIndicator;
    @XmlElement(name = "SMSEnabledIndicator")
    protected Boolean smsEnabledIndicator;

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
     * Gets the value of the defaultConventionalPhoneNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultConventionalPhoneNumberIndicator() {
        return defaultConventionalPhoneNumberIndicator;
    }

    /**
     * Sets the value of the defaultConventionalPhoneNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultConventionalPhoneNumberIndicator(Boolean value) {
        this.defaultConventionalPhoneNumberIndicator = value;
    }

    /**
     * Gets the value of the defaultMobilePhoneNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultMobilePhoneNumberIndicator() {
        return defaultMobilePhoneNumberIndicator;
    }

    /**
     * Sets the value of the defaultMobilePhoneNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultMobilePhoneNumberIndicator(Boolean value) {
        this.defaultMobilePhoneNumberIndicator = value;
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

    /**
     * Gets the value of the mobilePhoneNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilePhoneNumberIndicator() {
        return mobilePhoneNumberIndicator;
    }

    /**
     * Sets the value of the mobilePhoneNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilePhoneNumberIndicator(Boolean value) {
        this.mobilePhoneNumberIndicator = value;
    }

    /**
     * Gets the value of the smsEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSMSEnabledIndicator() {
        return smsEnabledIndicator;
    }

    /**
     * Sets the value of the smsEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSMSEnabledIndicator(Boolean value) {
        this.smsEnabledIndicator = value;
    }

}
