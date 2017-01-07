
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.BusinessTransactionDocumentReference;


/**
 * <p>Java class for SalesOrderMaintainRequestBusinessTransactionDocumentReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestBusinessTransactionDocumentReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessTransactionDocumentReference" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentReference"/&gt;
 *         &lt;element name="BusinessTransactionDocumentRelationshipRoleCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentRelationshipRoleCode" minOccurs="0"/&gt;
 *         &lt;element name="DataProviderIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestBusinessTransactionDocumentReference", propOrder = {
    "businessTransactionDocumentReference",
    "businessTransactionDocumentRelationshipRoleCode",
    "dataProviderIndicator"
})
public class SalesOrderMaintainRequestBusinessTransactionDocumentReference {

    @XmlElement(name = "BusinessTransactionDocumentReference", required = true)
    protected BusinessTransactionDocumentReference businessTransactionDocumentReference;
    @XmlElement(name = "BusinessTransactionDocumentRelationshipRoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessTransactionDocumentRelationshipRoleCode;
    @XmlElement(name = "DataProviderIndicator")
    protected Boolean dataProviderIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the businessTransactionDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentReference }
     *     
     */
    public BusinessTransactionDocumentReference getBusinessTransactionDocumentReference() {
        return businessTransactionDocumentReference;
    }

    /**
     * Sets the value of the businessTransactionDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentReference }
     *     
     */
    public void setBusinessTransactionDocumentReference(BusinessTransactionDocumentReference value) {
        this.businessTransactionDocumentReference = value;
    }

    /**
     * Gets the value of the businessTransactionDocumentRelationshipRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionDocumentRelationshipRoleCode() {
        return businessTransactionDocumentRelationshipRoleCode;
    }

    /**
     * Sets the value of the businessTransactionDocumentRelationshipRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionDocumentRelationshipRoleCode(String value) {
        this.businessTransactionDocumentRelationshipRoleCode = value;
    }

    /**
     * Gets the value of the dataProviderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataProviderIndicator() {
        return dataProviderIndicator;
    }

    /**
     * Sets the value of the dataProviderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataProviderIndicator(Boolean value) {
        this.dataProviderIndicator = value;
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
