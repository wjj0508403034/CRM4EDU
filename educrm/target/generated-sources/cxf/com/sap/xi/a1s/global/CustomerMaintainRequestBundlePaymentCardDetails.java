
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.PaymentCardBlockingReasonCode;
import com.sap.xi.ap.common.gdt.PaymentCardID;
import com.sap.xi.ap.common.gdt.PaymentCardTypeCode;
import com.sap.xi.ap.common.gdt.RegionCode;


/**
 * <p>Java class for CustomerMaintainRequestBundlePaymentCardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundlePaymentCardDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerPaymentCardDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardID" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardHolderName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardExpirationDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="HouseID" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerMaintainRequestBundlePaymentCardDetails", propOrder = {
    "objectNodeSenderTechnicalID",
    "id",
    "paymentCardTypeCode",
    "paymentCardID",
    "paymentCardHolderName",
    "paymentCardExpirationDate",
    "defaultIndicator",
    "blockingReasonCode",
    "streetName",
    "houseID",
    "postalCode",
    "cityName",
    "regionCode",
    "countryCode"
})
public class CustomerMaintainRequestBundlePaymentCardDetails {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "PaymentCardTypeCode")
    protected PaymentCardTypeCode paymentCardTypeCode;
    @XmlElement(name = "PaymentCardID")
    protected PaymentCardID paymentCardID;
    @XmlElement(name = "PaymentCardHolderName")
    protected String paymentCardHolderName;
    @XmlElement(name = "PaymentCardExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentCardExpirationDate;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlElement(name = "BlockingReasonCode")
    protected PaymentCardBlockingReasonCode blockingReasonCode;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseID;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the paymentCardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardTypeCode }
     *     
     */
    public PaymentCardTypeCode getPaymentCardTypeCode() {
        return paymentCardTypeCode;
    }

    /**
     * Sets the value of the paymentCardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardTypeCode }
     *     
     */
    public void setPaymentCardTypeCode(PaymentCardTypeCode value) {
        this.paymentCardTypeCode = value;
    }

    /**
     * Gets the value of the paymentCardID property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardID }
     *     
     */
    public PaymentCardID getPaymentCardID() {
        return paymentCardID;
    }

    /**
     * Sets the value of the paymentCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardID }
     *     
     */
    public void setPaymentCardID(PaymentCardID value) {
        this.paymentCardID = value;
    }

    /**
     * Gets the value of the paymentCardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardHolderName() {
        return paymentCardHolderName;
    }

    /**
     * Sets the value of the paymentCardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardHolderName(String value) {
        this.paymentCardHolderName = value;
    }

    /**
     * Gets the value of the paymentCardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentCardExpirationDate() {
        return paymentCardExpirationDate;
    }

    /**
     * Sets the value of the paymentCardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentCardExpirationDate(XMLGregorianCalendar value) {
        this.paymentCardExpirationDate = value;
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
     * Gets the value of the blockingReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardBlockingReasonCode }
     *     
     */
    public PaymentCardBlockingReasonCode getBlockingReasonCode() {
        return blockingReasonCode;
    }

    /**
     * Sets the value of the blockingReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardBlockingReasonCode }
     *     
     */
    public void setBlockingReasonCode(PaymentCardBlockingReasonCode value) {
        this.blockingReasonCode = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the houseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseID() {
        return houseID;
    }

    /**
     * Sets the value of the houseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseID(String value) {
        this.houseID = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
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
