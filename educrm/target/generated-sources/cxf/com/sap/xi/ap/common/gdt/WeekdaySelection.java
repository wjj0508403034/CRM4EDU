
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekdaySelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeekdaySelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MondayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FridayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SundayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeekdaySelection", propOrder = {
    "mondayIndicator",
    "tuesdayIndicator",
    "wednesdayIndicator",
    "thursdayIndicator",
    "fridayIndicator",
    "saturdayIndicator",
    "sundayIndicator"
})
public class WeekdaySelection {

    @XmlElement(name = "MondayIndicator")
    protected Boolean mondayIndicator;
    @XmlElement(name = "TuesdayIndicator")
    protected Boolean tuesdayIndicator;
    @XmlElement(name = "WednesdayIndicator")
    protected Boolean wednesdayIndicator;
    @XmlElement(name = "ThursdayIndicator")
    protected Boolean thursdayIndicator;
    @XmlElement(name = "FridayIndicator")
    protected Boolean fridayIndicator;
    @XmlElement(name = "SaturdayIndicator")
    protected Boolean saturdayIndicator;
    @XmlElement(name = "SundayIndicator")
    protected Boolean sundayIndicator;

    /**
     * Gets the value of the mondayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMondayIndicator() {
        return mondayIndicator;
    }

    /**
     * Sets the value of the mondayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMondayIndicator(Boolean value) {
        this.mondayIndicator = value;
    }

    /**
     * Gets the value of the tuesdayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTuesdayIndicator() {
        return tuesdayIndicator;
    }

    /**
     * Sets the value of the tuesdayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTuesdayIndicator(Boolean value) {
        this.tuesdayIndicator = value;
    }

    /**
     * Gets the value of the wednesdayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWednesdayIndicator() {
        return wednesdayIndicator;
    }

    /**
     * Sets the value of the wednesdayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWednesdayIndicator(Boolean value) {
        this.wednesdayIndicator = value;
    }

    /**
     * Gets the value of the thursdayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThursdayIndicator() {
        return thursdayIndicator;
    }

    /**
     * Sets the value of the thursdayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThursdayIndicator(Boolean value) {
        this.thursdayIndicator = value;
    }

    /**
     * Gets the value of the fridayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFridayIndicator() {
        return fridayIndicator;
    }

    /**
     * Sets the value of the fridayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFridayIndicator(Boolean value) {
        this.fridayIndicator = value;
    }

    /**
     * Gets the value of the saturdayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayIndicator() {
        return saturdayIndicator;
    }

    /**
     * Sets the value of the saturdayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayIndicator(Boolean value) {
        this.saturdayIndicator = value;
    }

    /**
     * Gets the value of the sundayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSundayIndicator() {
        return sundayIndicator;
    }

    /**
     * Sets the value of the sundayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSundayIndicator(Boolean value) {
        this.sundayIndicator = value;
    }

}
