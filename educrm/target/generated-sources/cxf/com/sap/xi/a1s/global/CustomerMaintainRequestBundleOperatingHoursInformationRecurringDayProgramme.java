
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.WeekdaySelection;


/**
 * <p>Java class for CustomerMaintainRequestBundleOperatingHoursInformationRecurringDayProgramme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleOperatingHoursInformationRecurringDayProgramme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="WeekdaySelection" type="{http://sap.com/xi/AP/Common/GDT}WeekdaySelection" minOccurs="0"/&gt;
 *         &lt;element name="OperatingHours" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleRecurringDayProgrammeOperationHours" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operatingHoursListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMaintainRequestBundleOperatingHoursInformationRecurringDayProgramme", propOrder = {
    "objectNodeSenderTechnicalID",
    "weekdaySelection",
    "operatingHours"
})
public class CustomerMaintainRequestBundleOperatingHoursInformationRecurringDayProgramme {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "WeekdaySelection")
    protected WeekdaySelection weekdaySelection;
    @XmlElement(name = "OperatingHours")
    protected List<CustomerMaintainRequestBundleRecurringDayProgrammeOperationHours> operatingHours;
    @XmlAttribute(name = "operatingHoursListCompleteTransmissionIndicator")
    protected Boolean operatingHoursListCompleteTransmissionIndicator;

    /**
     * Gets the value of the objectNodeSenderTechnicalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNodeSenderTechnicalID() {
        return objectNodeSenderTechnicalID;
    }

    /**
     * Sets the value of the objectNodeSenderTechnicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNodeSenderTechnicalID(String value) {
        this.objectNodeSenderTechnicalID = value;
    }

    /**
     * Gets the value of the weekdaySelection property.
     * 
     * @return
     *     possible object is
     *     {@link WeekdaySelection }
     *     
     */
    public WeekdaySelection getWeekdaySelection() {
        return weekdaySelection;
    }

    /**
     * Sets the value of the weekdaySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekdaySelection }
     *     
     */
    public void setWeekdaySelection(WeekdaySelection value) {
        this.weekdaySelection = value;
    }

    /**
     * Gets the value of the operatingHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleRecurringDayProgrammeOperationHours }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleRecurringDayProgrammeOperationHours> getOperatingHours() {
        if (operatingHours == null) {
            operatingHours = new ArrayList<CustomerMaintainRequestBundleRecurringDayProgrammeOperationHours>();
        }
        return this.operatingHours;
    }

    /**
     * Gets the value of the operatingHoursListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperatingHoursListCompleteTransmissionIndicator() {
        return operatingHoursListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the operatingHoursListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperatingHoursListCompleteTransmissionIndicator(Boolean value) {
        this.operatingHoursListCompleteTransmissionIndicator = value;
    }

}
