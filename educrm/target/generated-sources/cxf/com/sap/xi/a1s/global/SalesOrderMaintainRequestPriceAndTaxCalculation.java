
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


/**
 * <p>Java class for SalesOrderMaintainRequestPriceAndTaxCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPriceAndTaxCalculation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainDiscount" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationMainDiscount" minOccurs="0"/&gt;
 *         &lt;element name="PriceComponent" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductTaxDetails" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationProductTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxationTerms" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationTaxationTerms" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxDetails" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="priceComponentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="productTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="withholdingTaxDetailsListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPriceAndTaxCalculation", propOrder = {
    "mainDiscount",
    "priceComponent",
    "productTaxDetails",
    "taxationTerms",
    "withholdingTaxDetails"
})
public class SalesOrderMaintainRequestPriceAndTaxCalculation {

    @XmlElement(name = "MainDiscount")
    protected SalesOrderMaintainRequestPriceAndTaxCalculationMainDiscount mainDiscount;
    @XmlElement(name = "PriceComponent")
    protected List<SalesOrderMaintainRequestPriceAndTaxCalculationPriceComponent> priceComponent;
    @XmlElement(name = "ProductTaxDetails")
    protected List<SalesOrderMaintainRequestPriceAndTaxCalculationProductTaxDetails> productTaxDetails;
    @XmlElement(name = "TaxationTerms")
    protected SalesOrderMaintainRequestPriceAndTaxCalculationTaxationTerms taxationTerms;
    @XmlElement(name = "WithholdingTaxDetails")
    protected List<SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails> withholdingTaxDetails;
    @XmlAttribute(name = "priceComponentListCompleteTransmissionIndicator")
    protected Boolean priceComponentListCompleteTransmissionIndicator;
    @XmlAttribute(name = "productTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean productTaxDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "withholdingTaxDetailsListCompleteTransmissionIndicator")
    protected Boolean withholdingTaxDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the mainDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationMainDiscount }
     *     
     */
    public SalesOrderMaintainRequestPriceAndTaxCalculationMainDiscount getMainDiscount() {
        return mainDiscount;
    }

    /**
     * Sets the value of the mainDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationMainDiscount }
     *     
     */
    public void setMainDiscount(SalesOrderMaintainRequestPriceAndTaxCalculationMainDiscount value) {
        this.mainDiscount = value;
    }

    /**
     * Gets the value of the priceComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPriceAndTaxCalculationPriceComponent }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPriceAndTaxCalculationPriceComponent> getPriceComponent() {
        if (priceComponent == null) {
            priceComponent = new ArrayList<SalesOrderMaintainRequestPriceAndTaxCalculationPriceComponent>();
        }
        return this.priceComponent;
    }

    /**
     * Gets the value of the productTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPriceAndTaxCalculationProductTaxDetails }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPriceAndTaxCalculationProductTaxDetails> getProductTaxDetails() {
        if (productTaxDetails == null) {
            productTaxDetails = new ArrayList<SalesOrderMaintainRequestPriceAndTaxCalculationProductTaxDetails>();
        }
        return this.productTaxDetails;
    }

    /**
     * Gets the value of the taxationTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationTaxationTerms }
     *     
     */
    public SalesOrderMaintainRequestPriceAndTaxCalculationTaxationTerms getTaxationTerms() {
        return taxationTerms;
    }

    /**
     * Sets the value of the taxationTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestPriceAndTaxCalculationTaxationTerms }
     *     
     */
    public void setTaxationTerms(SalesOrderMaintainRequestPriceAndTaxCalculationTaxationTerms value) {
        this.taxationTerms = value;
    }

    /**
     * Gets the value of the withholdingTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails> getWithholdingTaxDetails() {
        if (withholdingTaxDetails == null) {
            withholdingTaxDetails = new ArrayList<SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails>();
        }
        return this.withholdingTaxDetails;
    }

    /**
     * Gets the value of the priceComponentListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceComponentListCompleteTransmissionIndicator() {
        return priceComponentListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the priceComponentListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceComponentListCompleteTransmissionIndicator(Boolean value) {
        this.priceComponentListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the productTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTaxDetailsListCompleteTransmissionIndicator() {
        return productTaxDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the productTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTaxDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.productTaxDetailsListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the withholdingTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithholdingTaxDetailsListCompleteTransmissionIndicator() {
        return withholdingTaxDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the withholdingTaxDetailsListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithholdingTaxDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.withholdingTaxDetailsListCompleteTransmissionIndicator = value;
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
