
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import com.sap.xi.ap.common.gdt.ProjectElementID;
import com.sap.xi.ap.common.gdt.ResourceID;
import com.sap.xi.ap.common.gdt.ServiceWorkingConditionsCode;


/**
 * <p>Java class for SalesOrderMaintainRequestItemServiceTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestItemServiceTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmationRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeTimeConfirmationRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportingConfirmationRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWorkingConditionsCode" type="{http://sap.com/xi/AP/Common/GDT}ServiceWorkingConditionsCode" minOccurs="0"/&gt;
 *         &lt;element name="ServicePlannedDuration" type="{http://sap.com/xi/AP/Common/GDT}Duration" minOccurs="0"/&gt;
 *         &lt;element name="ResourceID" type="{http://sap.com/xi/AP/Common/GDT}ResourceID" minOccurs="0"/&gt;
 *         &lt;element name="ProjectTaskID" type="{http://sap.com/xi/AP/Common/GDT}ProjectElementID" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestItemServiceTerms", propOrder = {
    "confirmationRelevanceIndicator",
    "employeeTimeConfirmationRelevanceIndicator",
    "expenseReportingConfirmationRelevanceIndicator",
    "serviceWorkingConditionsCode",
    "servicePlannedDuration",
    "resourceID",
    "projectTaskID"
})
public class SalesOrderMaintainRequestItemServiceTerms {

    @XmlElement(name = "ConfirmationRelevanceIndicator")
    protected Boolean confirmationRelevanceIndicator;
    @XmlElement(name = "EmployeeTimeConfirmationRelevanceIndicator")
    protected Boolean employeeTimeConfirmationRelevanceIndicator;
    @XmlElement(name = "ExpenseReportingConfirmationRelevanceIndicator")
    protected Boolean expenseReportingConfirmationRelevanceIndicator;
    @XmlElement(name = "ServiceWorkingConditionsCode")
    protected ServiceWorkingConditionsCode serviceWorkingConditionsCode;
    @XmlElement(name = "ServicePlannedDuration")
    protected Duration servicePlannedDuration;
    @XmlElement(name = "ResourceID")
    protected ResourceID resourceID;
    @XmlElement(name = "ProjectTaskID")
    protected ProjectElementID projectTaskID;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the confirmationRelevanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmationRelevanceIndicator() {
        return confirmationRelevanceIndicator;
    }

    /**
     * Sets the value of the confirmationRelevanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmationRelevanceIndicator(Boolean value) {
        this.confirmationRelevanceIndicator = value;
    }

    /**
     * Gets the value of the employeeTimeConfirmationRelevanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployeeTimeConfirmationRelevanceIndicator() {
        return employeeTimeConfirmationRelevanceIndicator;
    }

    /**
     * Sets the value of the employeeTimeConfirmationRelevanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployeeTimeConfirmationRelevanceIndicator(Boolean value) {
        this.employeeTimeConfirmationRelevanceIndicator = value;
    }

    /**
     * Gets the value of the expenseReportingConfirmationRelevanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpenseReportingConfirmationRelevanceIndicator() {
        return expenseReportingConfirmationRelevanceIndicator;
    }

    /**
     * Sets the value of the expenseReportingConfirmationRelevanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpenseReportingConfirmationRelevanceIndicator(Boolean value) {
        this.expenseReportingConfirmationRelevanceIndicator = value;
    }

    /**
     * Gets the value of the serviceWorkingConditionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceWorkingConditionsCode }
     *     
     */
    public ServiceWorkingConditionsCode getServiceWorkingConditionsCode() {
        return serviceWorkingConditionsCode;
    }

    /**
     * Sets the value of the serviceWorkingConditionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceWorkingConditionsCode }
     *     
     */
    public void setServiceWorkingConditionsCode(ServiceWorkingConditionsCode value) {
        this.serviceWorkingConditionsCode = value;
    }

    /**
     * Gets the value of the servicePlannedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getServicePlannedDuration() {
        return servicePlannedDuration;
    }

    /**
     * Sets the value of the servicePlannedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setServicePlannedDuration(Duration value) {
        this.servicePlannedDuration = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceID }
     *     
     */
    public ResourceID getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceID }
     *     
     */
    public void setResourceID(ResourceID value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the projectTaskID property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectElementID }
     *     
     */
    public ProjectElementID getProjectTaskID() {
        return projectTaskID;
    }

    /**
     * Sets the value of the projectTaskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectElementID }
     *     
     */
    public void setProjectTaskID(ProjectElementID value) {
        this.projectTaskID = value;
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
