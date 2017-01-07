
package com.sap.xi.ap.common.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.RequirementSpecificationID;


/**
 * <p>Java class for RequirementSpecificationKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequirementSpecificationKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequirementSpecificationID" type="{http://sap.com/xi/AP/Common/GDT}RequirementSpecificationID"/&gt;
 *         &lt;element name="RequirementSpecificationVersionID" type="{http://sap.com/xi/AP/Common/GDT}VersionID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequirementSpecificationKey", propOrder = {
    "requirementSpecificationID",
    "requirementSpecificationVersionID"
})
public class RequirementSpecificationKey {

    @XmlElement(name = "RequirementSpecificationID", required = true)
    protected RequirementSpecificationID requirementSpecificationID;
    @XmlElement(name = "RequirementSpecificationVersionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String requirementSpecificationVersionID;

    /**
     * Gets the value of the requirementSpecificationID property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementSpecificationID }
     *     
     */
    public RequirementSpecificationID getRequirementSpecificationID() {
        return requirementSpecificationID;
    }

    /**
     * Sets the value of the requirementSpecificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementSpecificationID }
     *     
     */
    public void setRequirementSpecificationID(RequirementSpecificationID value) {
        this.requirementSpecificationID = value;
    }

    /**
     * Gets the value of the requirementSpecificationVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirementSpecificationVersionID() {
        return requirementSpecificationVersionID;
    }

    /**
     * Sets the value of the requirementSpecificationVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirementSpecificationVersionID(String value) {
        this.requirementSpecificationVersionID = value;
    }

}
