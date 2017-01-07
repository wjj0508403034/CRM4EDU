
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for TimePointPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePointPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="StartTimePoint" type="{http://sap.com/xi/AP/Common/GDT}TimePoint" minOccurs="0"/&gt;
 *         &lt;element name="EndTimePoint" type="{http://sap.com/xi/AP/Common/GDT}TimePoint" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://sap.com/xi/AP/Common/GDT}Duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePointPeriod", propOrder = {
    "intervalBoundaryTypeCode",
    "startTimePoint",
    "endTimePoint",
    "duration"
})
public class TimePointPeriod {

    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "StartTimePoint")
    protected TimePoint startTimePoint;
    @XmlElement(name = "EndTimePoint")
    protected TimePoint endTimePoint;
    @XmlElement(name = "Duration")
    protected Duration duration;

    /**
     * Gets the value of the intervalBoundaryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalBoundaryTypeCode() {
        return intervalBoundaryTypeCode;
    }

    /**
     * Sets the value of the intervalBoundaryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalBoundaryTypeCode(String value) {
        this.intervalBoundaryTypeCode = value;
    }

    /**
     * Gets the value of the startTimePoint property.
     * 
     * @return
     *     possible object is
     *     {@link TimePoint }
     *     
     */
    public TimePoint getStartTimePoint() {
        return startTimePoint;
    }

    /**
     * Sets the value of the startTimePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePoint }
     *     
     */
    public void setStartTimePoint(TimePoint value) {
        this.startTimePoint = value;
    }

    /**
     * Gets the value of the endTimePoint property.
     * 
     * @return
     *     possible object is
     *     {@link TimePoint }
     *     
     */
    public TimePoint getEndTimePoint() {
        return endTimePoint;
    }

    /**
     * Sets the value of the endTimePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePoint }
     *     
     */
    public void setEndTimePoint(TimePoint value) {
        this.endTimePoint = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}
