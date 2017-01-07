
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.common.gdt.WithholdingTax;


/**
 * <p>Java class for SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTax" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTax" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyWithholdingTax" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTax" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails", propOrder = {
    "uuid",
    "withholdingTax",
    "transactionCurrencyWithholdingTax"
})
public class SalesOrderMaintainRequestPriceAndTaxCalculationWithholdingTaxDetails {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "WithholdingTax")
    protected WithholdingTax withholdingTax;
    @XmlElement(name = "TransactionCurrencyWithholdingTax")
    protected WithholdingTax transactionCurrencyWithholdingTax;
    @XmlAttribute(name = "actionCode")
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
     * Gets the value of the withholdingTax property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTax }
     *     
     */
    public WithholdingTax getWithholdingTax() {
        return withholdingTax;
    }

    /**
     * Sets the value of the withholdingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTax }
     *     
     */
    public void setWithholdingTax(WithholdingTax value) {
        this.withholdingTax = value;
    }

    /**
     * Gets the value of the transactionCurrencyWithholdingTax property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTax }
     *     
     */
    public WithholdingTax getTransactionCurrencyWithholdingTax() {
        return transactionCurrencyWithholdingTax;
    }

    /**
     * Sets the value of the transactionCurrencyWithholdingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTax }
     *     
     */
    public void setTransactionCurrencyWithholdingTax(WithholdingTax value) {
        this.transactionCurrencyWithholdingTax = value;
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
