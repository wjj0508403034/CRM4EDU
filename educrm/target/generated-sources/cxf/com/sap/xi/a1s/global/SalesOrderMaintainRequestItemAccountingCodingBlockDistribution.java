
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SalesOrderMaintainRequestItemAccountingCodingBlockDistribution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestItemAccountingCodingBlockDistribution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingCodingBlockAssignment" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestItemAccountingCodingBlockDistributionAccountingCodingBlockAssignment" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestItemAccountingCodingBlockDistribution", propOrder = {
    "accountingCodingBlockAssignment"
})
public class SalesOrderMaintainRequestItemAccountingCodingBlockDistribution {

    @XmlElement(name = "AccountingCodingBlockAssignment")
    protected SalesOrderMaintainRequestItemAccountingCodingBlockDistributionAccountingCodingBlockAssignment accountingCodingBlockAssignment;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the accountingCodingBlockAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMaintainRequestItemAccountingCodingBlockDistributionAccountingCodingBlockAssignment }
     *     
     */
    public SalesOrderMaintainRequestItemAccountingCodingBlockDistributionAccountingCodingBlockAssignment getAccountingCodingBlockAssignment() {
        return accountingCodingBlockAssignment;
    }

    /**
     * Sets the value of the accountingCodingBlockAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMaintainRequestItemAccountingCodingBlockDistributionAccountingCodingBlockAssignment }
     *     
     */
    public void setAccountingCodingBlockAssignment(SalesOrderMaintainRequestItemAccountingCodingBlockDistributionAccountingCodingBlockAssignment value) {
        this.accountingCodingBlockAssignment = value;
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
