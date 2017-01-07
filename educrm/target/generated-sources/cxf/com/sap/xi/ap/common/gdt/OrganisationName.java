
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://sap.com/xi/AP/Common/GDT}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="FirstLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="SecondLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="ThirdLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="FourthLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationName", propOrder = {
    "formOfAddressCode",
    "firstLineName",
    "secondLineName",
    "thirdLineName",
    "fourthLineName"
})
public class OrganisationName {

    @XmlElement(name = "FormOfAddressCode")
    protected FormOfAddressCode formOfAddressCode;
    @XmlElement(name = "FirstLineName")
    protected String firstLineName;
    @XmlElement(name = "SecondLineName")
    protected String secondLineName;
    @XmlElement(name = "ThirdLineName")
    protected String thirdLineName;
    @XmlElement(name = "FourthLineName")
    protected String fourthLineName;

    /**
     * Gets the value of the formOfAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfAddressCode }
     *     
     */
    public FormOfAddressCode getFormOfAddressCode() {
        return formOfAddressCode;
    }

    /**
     * Sets the value of the formOfAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfAddressCode }
     *     
     */
    public void setFormOfAddressCode(FormOfAddressCode value) {
        this.formOfAddressCode = value;
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

    /**
     * Gets the value of the thirdLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdLineName() {
        return thirdLineName;
    }

    /**
     * Sets the value of the thirdLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdLineName(String value) {
        this.thirdLineName = value;
    }

    /**
     * Gets the value of the fourthLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthLineName() {
        return fourthLineName;
    }

    /**
     * Sets the value of the fourthLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthLineName(String value) {
        this.fourthLineName = value;
    }

}
