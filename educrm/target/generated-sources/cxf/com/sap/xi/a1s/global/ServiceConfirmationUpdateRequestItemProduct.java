
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.ProductInternalID;


/**
 * <p>Java class for ServiceConfirmationUpdateRequestItemProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationUpdateRequestItemProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ProductInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/&gt;
 *         &lt;element name="QuantityMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockKey" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestItemProductIdentifiedStockKey" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceConfirmationUpdateRequestItemProduct", propOrder = {
    "technicalID",
    "productInternalID",
    "quantityMeasureUnitCode",
    "identifiedStockKey"
})
public class ServiceConfirmationUpdateRequestItemProduct {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "ProductInternalID")
    protected ProductInternalID productInternalID;
    @XmlElement(name = "QuantityMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String quantityMeasureUnitCode;
    @XmlElement(name = "IdentifiedStockKey")
    protected ServiceConfirmationUpdateRequestItemProductIdentifiedStockKey identifiedStockKey;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the technicalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalID() {
        return technicalID;
    }

    /**
     * Sets the value of the technicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalID(String value) {
        this.technicalID = value;
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
     * Gets the value of the quantityMeasureUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityMeasureUnitCode() {
        return quantityMeasureUnitCode;
    }

    /**
     * Sets the value of the quantityMeasureUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityMeasureUnitCode(String value) {
        this.quantityMeasureUnitCode = value;
    }

    /**
     * Gets the value of the identifiedStockKey property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestItemProductIdentifiedStockKey }
     *     
     */
    public ServiceConfirmationUpdateRequestItemProductIdentifiedStockKey getIdentifiedStockKey() {
        return identifiedStockKey;
    }

    /**
     * Sets the value of the identifiedStockKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestItemProductIdentifiedStockKey }
     *     
     */
    public void setIdentifiedStockKey(ServiceConfirmationUpdateRequestItemProductIdentifiedStockKey value) {
        this.identifiedStockKey = value;
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
