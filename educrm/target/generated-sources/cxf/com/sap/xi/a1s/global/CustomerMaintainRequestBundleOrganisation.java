
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.CompanyLegalFormCode;


/**
 * <p>Java class for CustomerMaintainRequestBundleOrganisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleOrganisation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyLegalFormCode" type="{http://sap.com/xi/AP/Common/GDT}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element name="FirstLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="SecondLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMaintainRequestBundleOrganisation", propOrder = {
    "companyLegalFormCode",
    "firstLineName",
    "secondLineName"
})
public class CustomerMaintainRequestBundleOrganisation {

    @XmlElement(name = "CompanyLegalFormCode")
    protected CompanyLegalFormCode companyLegalFormCode;
    @XmlElement(name = "FirstLineName")
    protected String firstLineName;
    @XmlElement(name = "SecondLineName")
    protected String secondLineName;

    /**
     * Gets the value of the companyLegalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public CompanyLegalFormCode getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Sets the value of the companyLegalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCode value) {
        this.companyLegalFormCode = value;
    }

    /**
     * Gets the value of the firstLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLineName() {
        return firstLineName;
    }

    /**
     * Sets the value of the firstLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLineName(String value) {
        this.firstLineName = value;
    }

    /**
     * Gets the value of the secondLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLineName() {
        return secondLineName;
    }

    /**
     * Sets the value of the secondLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLineName(String value) {
        this.secondLineName = value;
    }

}
