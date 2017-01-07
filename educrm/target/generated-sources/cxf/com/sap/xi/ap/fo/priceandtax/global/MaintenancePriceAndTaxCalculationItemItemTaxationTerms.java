
package com.sap.xi.ap.fo.priceandtax.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.PartyTaxID;
import com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode;
import com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationSystemCode;
import com.sap.xi.ap.common.gdt.TaxExemptionCertificateID;
import com.sap.xi.ap.common.gdt.TaxExemptionReasonCode;
import com.sap.xi.ap.common.gdt.TaxIdentificationNumberTypeCode;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for MaintenancePriceAndTaxCalculationItemItemTaxationTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenancePriceAndTaxCalculationItemItemTaxationTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SellerCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="SellerTaxID" type="{http://sap.com/xi/AP/Common/GDT}PartyTaxID" minOccurs="0"/&gt;
 *         &lt;element name="SellerTaxIdentificationNumberTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxIdentificationNumberTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BuyerCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="BuyerTaxID" type="{http://sap.com/xi/AP/Common/GDT}PartyTaxID" minOccurs="0"/&gt;
 *         &lt;element name="BuyerTaxIdentificationNumberTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxIdentificationNumberTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="EuropeanCommunityVATTriangulationIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TaxDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="TaxDueDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionCertificateID" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionCertificateID" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionReasonCode" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionReasonCodeRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FollowUpTaxExemptionCertificateID" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionCertificateID" minOccurs="0"/&gt;
 *         &lt;element name="ProductTaxStandardClassificationCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxStandardClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="ProductTaxStandardClassificationSystemCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxStandardClassificationSystemCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenancePriceAndTaxCalculationItemItemTaxationTerms", propOrder = {
    "uuid",
    "sellerCountryCode",
    "sellerTaxID",
    "sellerTaxIdentificationNumberTypeCode",
    "buyerCountryCode",
    "buyerTaxID",
    "buyerTaxIdentificationNumberTypeCode",
    "europeanCommunityVATTriangulationIndicator",
    "taxDate",
    "taxDueDate",
    "taxExemptionCertificateID",
    "taxExemptionReasonCode",
    "taxExemptionReasonCodeRelevanceIndicator",
    "followUpTaxExemptionCertificateID",
    "productTaxStandardClassificationCode",
    "productTaxStandardClassificationSystemCode"
})
public class MaintenancePriceAndTaxCalculationItemItemTaxationTerms {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "SellerCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sellerCountryCode;
    @XmlElement(name = "SellerTaxID")
    protected PartyTaxID sellerTaxID;
    @XmlElement(name = "SellerTaxIdentificationNumberTypeCode")
    protected TaxIdentificationNumberTypeCode sellerTaxIdentificationNumberTypeCode;
    @XmlElement(name = "BuyerCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyerCountryCode;
    @XmlElement(name = "BuyerTaxID")
    protected PartyTaxID buyerTaxID;
    @XmlElement(name = "BuyerTaxIdentificationNumberTypeCode")
    protected TaxIdentificationNumberTypeCode buyerTaxIdentificationNumberTypeCode;
    @XmlElement(name = "EuropeanCommunityVATTriangulationIndicator")
    protected Boolean europeanCommunityVATTriangulationIndicator;
    @XmlElement(name = "TaxDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(name = "TaxDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDueDate;
    @XmlElement(name = "TaxExemptionCertificateID")
    protected TaxExemptionCertificateID taxExemptionCertificateID;
    @XmlElement(name = "TaxExemptionReasonCode")
    protected TaxExemptionReasonCode taxExemptionReasonCode;
    @XmlElement(name = "TaxExemptionReasonCodeRelevanceIndicator")
    protected Boolean taxExemptionReasonCodeRelevanceIndicator;
    @XmlElement(name = "FollowUpTaxExemptionCertificateID")
    protected TaxExemptionCertificateID followUpTaxExemptionCertificateID;
    @XmlElement(name = "ProductTaxStandardClassificationCode")
    protected ProductTaxStandardClassificationCode productTaxStandardClassificationCode;
    @XmlElement(name = "ProductTaxStandardClassificationSystemCode")
    protected ProductTaxStandardClassificationSystemCode productTaxStandardClassificationSystemCode;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

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
     * Gets the value of the sellerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCountryCode() {
        return sellerCountryCode;
    }

    /**
     * Sets the value of the sellerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCountryCode(String value) {
        this.sellerCountryCode = value;
    }

    /**
     * Gets the value of the sellerTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTaxID }
     *     
     */
    public PartyTaxID getSellerTaxID() {
        return sellerTaxID;
    }

    /**
     * Sets the value of the sellerTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTaxID }
     *     
     */
    public void setSellerTaxID(PartyTaxID value) {
        this.sellerTaxID = value;
    }

    /**
     * Gets the value of the sellerTaxIdentificationNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public TaxIdentificationNumberTypeCode getSellerTaxIdentificationNumberTypeCode() {
        return sellerTaxIdentificationNumberTypeCode;
    }

    /**
     * Sets the value of the sellerTaxIdentificationNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public void setSellerTaxIdentificationNumberTypeCode(TaxIdentificationNumberTypeCode value) {
        this.sellerTaxIdentificationNumberTypeCode = value;
    }

    /**
     * Gets the value of the buyerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerCountryCode() {
        return buyerCountryCode;
    }

    /**
     * Sets the value of the buyerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerCountryCode(String value) {
        this.buyerCountryCode = value;
    }

    /**
     * Gets the value of the buyerTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTaxID }
     *     
     */
    public PartyTaxID getBuyerTaxID() {
        return buyerTaxID;
    }

    /**
     * Sets the value of the buyerTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTaxID }
     *     
     */
    public void setBuyerTaxID(PartyTaxID value) {
        this.buyerTaxID = value;
    }

    /**
     * Gets the value of the buyerTaxIdentificationNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public TaxIdentificationNumberTypeCode getBuyerTaxIdentificationNumberTypeCode() {
        return buyerTaxIdentificationNumberTypeCode;
    }

    /**
     * Sets the value of the buyerTaxIdentificationNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public void setBuyerTaxIdentificationNumberTypeCode(TaxIdentificationNumberTypeCode value) {
        this.buyerTaxIdentificationNumberTypeCode = value;
    }

    /**
     * Gets the value of the europeanCommunityVATTriangulationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEuropeanCommunityVATTriangulationIndicator() {
        return europeanCommunityVATTriangulationIndicator;
    }

    /**
     * Sets the value of the europeanCommunityVATTriangulationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEuropeanCommunityVATTriangulationIndicator(Boolean value) {
        this.europeanCommunityVATTriangulationIndicator = value;
    }

    /**
     * Gets the value of the taxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDate() {
        return taxDate;
    }

    /**
     * Sets the value of the taxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDate(XMLGregorianCalendar value) {
        this.taxDate = value;
    }

    /**
     * Gets the value of the taxDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDueDate() {
        return taxDueDate;
    }

    /**
     * Sets the value of the taxDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDueDate(XMLGregorianCalendar value) {
        this.taxDueDate = value;
    }

    /**
     * Gets the value of the taxExemptionCertificateID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public TaxExemptionCertificateID getTaxExemptionCertificateID() {
        return taxExemptionCertificateID;
    }

    /**
     * Sets the value of the taxExemptionCertificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public void setTaxExemptionCertificateID(TaxExemptionCertificateID value) {
        this.taxExemptionCertificateID = value;
    }

    /**
     * Gets the value of the taxExemptionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public TaxExemptionReasonCode getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    /**
     * Sets the value of the taxExemptionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public void setTaxExemptionReasonCode(TaxExemptionReasonCode value) {
        this.taxExemptionReasonCode = value;
    }

    /**
     * Gets the value of the taxExemptionReasonCodeRelevanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExemptionReasonCodeRelevanceIndicator() {
        return taxExemptionReasonCodeRelevanceIndicator;
    }

    /**
     * Sets the value of the taxExemptionReasonCodeRelevanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExemptionReasonCodeRelevanceIndicator(Boolean value) {
        this.taxExemptionReasonCodeRelevanceIndicator = value;
    }

    /**
     * Gets the value of the followUpTaxExemptionCertificateID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public TaxExemptionCertificateID getFollowUpTaxExemptionCertificateID() {
        return followUpTaxExemptionCertificateID;
    }

    /**
     * Sets the value of the followUpTaxExemptionCertificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public void setFollowUpTaxExemptionCertificateID(TaxExemptionCertificateID value) {
        this.followUpTaxExemptionCertificateID = value;
    }

    /**
     * Gets the value of the productTaxStandardClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTaxStandardClassificationCode }
     *     
     */
    public ProductTaxStandardClassificationCode getProductTaxStandardClassificationCode() {
        return productTaxStandardClassificationCode;
    }

    /**
     * Sets the value of the productTaxStandardClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTaxStandardClassificationCode }
     *     
     */
    public void setProductTaxStandardClassificationCode(ProductTaxStandardClassificationCode value) {
        this.productTaxStandardClassificationCode = value;
    }

    /**
     * Gets the value of the productTaxStandardClassificationSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTaxStandardClassificationSystemCode }
     *     
     */
    public ProductTaxStandardClassificationSystemCode getProductTaxStandardClassificationSystemCode() {
        return productTaxStandardClassificationSystemCode;
    }

    /**
     * Sets the value of the productTaxStandardClassificationSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTaxStandardClassificationSystemCode }
     *     
     */
    public void setProductTaxStandardClassificationSystemCode(ProductTaxStandardClassificationSystemCode value) {
        this.productTaxStandardClassificationSystemCode = value;
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
