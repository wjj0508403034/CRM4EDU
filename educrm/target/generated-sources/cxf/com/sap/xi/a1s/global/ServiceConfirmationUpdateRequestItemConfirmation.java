
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import com.sap.xi.ap.common.gdt.ServiceWorkingConditionsCode;


/**
 * <p>Java class for ServiceConfirmationUpdateRequestItemConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationUpdateRequestItemConfirmation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedDuration" type="{http://sap.com/xi/AP/Common/GDT}Duration" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedServiceWorkingConditionsCode" type="{http://sap.com/xi/AP/Common/GDT}ServiceWorkingConditionsCode" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceConfirmationUpdateRequestItemConfirmation", propOrder = {
    "technicalID",
    "confirmedDuration",
    "confirmedServiceWorkingConditionsCode"
})
public class ServiceConfirmationUpdateRequestItemConfirmation {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "ConfirmedDuration")
    protected Duration confirmedDuration;
    @XmlElement(name = "ConfirmedServiceWorkingConditionsCode")
    protected ServiceWorkingConditionsCode confirmedServiceWorkingConditionsCode;
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
     * Gets the value of the confirmedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getConfirmedDuration() {
        return confirmedDuration;
    }

    /**
     * Sets the value of the confirmedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setConfirmedDuration(Duration value) {
        this.confirmedDuration = value;
    }

    /**
     * Gets the value of the confirmedServiceWorkingConditionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceWorkingConditionsCode }
     *     
     */
    public ServiceWorkingConditionsCode getConfirmedServiceWorkingConditionsCode() {
        return confirmedServiceWorkingConditionsCode;
    }

    /**
     * Sets the value of the confirmedServiceWorkingConditionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceWorkingConditionsCode }
     *     
     */
    public void setConfirmedServiceWorkingConditionsCode(ServiceWorkingConditionsCode value) {
        this.confirmedServiceWorkingConditionsCode = value;
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
