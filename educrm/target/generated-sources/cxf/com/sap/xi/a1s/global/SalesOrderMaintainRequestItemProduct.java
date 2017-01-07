
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.NOCONVERSIONProductID;
import com.sap.xi.ap.common.gdt.ProductInternalID;
import com.sap.xi.ap.common.gdt.ProductStandardID;
import com.sap.xi.ap.common.global.RequirementSpecificationKey;


/**
 * <p>Java class for SalesOrderMaintainRequestItemProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestItemProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}NOCONVERSION_ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ProductStandardID" type="{http://sap.com/xi/AP/Common/GDT}ProductStandardID" minOccurs="0"/&gt;
 *         &lt;element name="ProductBuyerID" type="{http://sap.com/xi/AP/Common/GDT}ProductPartyID" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasure" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="ProductRequirementSpecificationKey" type="{http://sap.com/xi/AP/Common/Global}RequirementSpecificationKey" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestItemProduct", propOrder = {
    "productID",
    "productInternalID",
    "productStandardID",
    "productBuyerID",
    "unitOfMeasure",
    "productRequirementSpecificationKey"
})
public class SalesOrderMaintainRequestItemProduct {

    @XmlElement(name = "ProductID")
    protected NOCONVERSIONProductID productID;
    @XmlElement(name = "ProductInternalID")
    protected ProductInternalID productInternalID;
    @XmlElement(name = "ProductStandardID")
    protected ProductStandardID productStandardID;
    @XmlElement(name = "ProductBuyerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productBuyerID;
    @XmlElement(name = "UnitOfMeasure")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unitOfMeasure;
    @XmlElement(name = "ProductRequirementSpecificationKey")
    protected RequirementSpecificationKey productRequirementSpecificationKey;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link NOCONVERSIONProductID }
     *     
     */
    public NOCONVERSIONProductID getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOCONVERSIONProductID }
     *     
     */
    public void setProductID(NOCONVERSIONProductID value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInternalID }
     *     
     */
    public ProductInternalID getProductInternalID() {
        return productInternalID;
    }

    /**
     * Sets the value of the productInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInternalID }
     *     
     */
    public void setProductInternalID(ProductInternalID value) {
        this.productInternalID = value;
    }

    /**
     * Gets the value of the productStandardID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStandardID }
     *     
     */
    public ProductStandardID getProductStandardID() {
        return productStandardID;
    }

    /**
     * Sets the value of the productStandardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStandardID }
     *     
     */
    public void setProductStandardID(ProductStandardID value) {
        this.productStandardID = value;
    }

    /**
     * Gets the value of the productBuyerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductBuyerID() {
        return productBuyerID;
    }

    /**
     * Sets the value of the productBuyerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductBuyerID(String value) {
        this.productBuyerID = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the productRequirementSpecificationKey property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementSpecificationKey }
     *     
     */
    public RequirementSpecificationKey getProductRequirementSpecificationKey() {
        return productRequirementSpecificationKey;
    }

    /**
     * Sets the value of the productRequirementSpecificationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementSpecificationKey }
     *     
     */
    public void setProductRequirementSpecificationKey(RequirementSpecificationKey value) {
        this.productRequirementSpecificationKey = value;
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
