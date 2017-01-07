
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.CommunicationMediumTypeCode;
import com.sap.xi.ap.common.gdt.CompoundServiceInterfaceCode;
import com.sap.xi.ap.common.gdt.EmailURI;
import com.sap.xi.ap.common.gdt.OutputRequestFormTemplateCode;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for CommunicationArrangement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationArrangement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CompoundServiceInterfaceCode" type="{http://sap.com/xi/AP/Common/GDT}CompoundServiceInterfaceCode" minOccurs="0"/&gt;
 *         &lt;element name="EnabledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationMediumTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CommunicationMediumTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="OutputRequestFormTemplateCode" type="{http://sap.com/xi/AP/Common/GDT}OutputRequestFormTemplateCode" minOccurs="0"/&gt;
 *         &lt;element name="EMailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="OutputCopyNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
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
@XmlType(name = "CommunicationArrangement", propOrder = {
    "objectNodeSenderTechnicalID",
    "uuid",
    "compoundServiceInterfaceCode",
    "enabledIndicator",
    "communicationMediumTypeCode",
    "outputRequestFormTemplateCode",
    "eMailURI",
    "facsimileFormattedNumberDescription",
    "outputCopyNumberValue"
})
public class CommunicationArrangement {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "CompoundServiceInterfaceCode")
    protected CompoundServiceInterfaceCode compoundServiceInterfaceCode;
    @XmlElement(name = "EnabledIndicator")
    protected Boolean enabledIndicator;
    @XmlElement(name = "CommunicationMediumTypeCode")
    protected CommunicationMediumTypeCode communicationMediumTypeCode;
    @XmlElement(name = "OutputRequestFormTemplateCode")
    protected OutputRequestFormTemplateCode outputRequestFormTemplateCode;
    @XmlElement(name = "EMailURI")
    protected EmailURI eMailURI;
    @XmlElement(name = "FacsimileFormattedNumberDescription")
    protected String facsimileFormattedNumberDescription;
    @XmlElement(name = "OutputCopyNumberValue")
    protected Integer outputCopyNumberValue;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

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
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the compoundServiceInterfaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundServiceInterfaceCode }
     *     
     */
    public CompoundServiceInterfaceCode getCompoundServiceInterfaceCode() {
        return compoundServiceInterfaceCode;
    }

    /**
     * Sets the value of the compoundServiceInterfaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundServiceInterfaceCode }
     *     
     */
    public void setCompoundServiceInterfaceCode(CompoundServiceInterfaceCode value) {
        this.compoundServiceInterfaceCode = value;
    }

    /**
     * Gets the value of the enabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabledIndicator() {
        return enabledIndicator;
    }

    /**
     * Sets the value of the enabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabledIndicator(Boolean value) {
        this.enabledIndicator = value;
    }

    /**
     * Gets the value of the communicationMediumTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public CommunicationMediumTypeCode getCommunicationMediumTypeCode() {
        return communicationMediumTypeCode;
    }

    /**
     * Sets the value of the communicationMediumTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public void setCommunicationMediumTypeCode(CommunicationMediumTypeCode value) {
        this.communicationMediumTypeCode = value;
    }

    /**
     * Gets the value of the outputRequestFormTemplateCode property.
     * 
     * @return
     *     possible object is
     *     {@link OutputRequestFormTemplateCode }
     *     
     */
    public OutputRequestFormTemplateCode getOutputRequestFormTemplateCode() {
        return outputRequestFormTemplateCode;
    }

    /**
     * Sets the value of the outputRequestFormTemplateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputRequestFormTemplateCode }
     *     
     */
    public void setOutputRequestFormTemplateCode(OutputRequestFormTemplateCode value) {
        this.outputRequestFormTemplateCode = value;
    }

    /**
     * Gets the value of the eMailURI property.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getEMailURI() {
        return eMailURI;
    }

    /**
     * Sets the value of the eMailURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setEMailURI(EmailURI value) {
        this.eMailURI = value;
    }

    /**
     * Gets the value of the facsimileFormattedNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacsimileFormattedNumberDescription() {
        return facsimileFormattedNumberDescription;
    }

    /**
     * Sets the value of the facsimileFormattedNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacsimileFormattedNumberDescription(String value) {
        this.facsimileFormattedNumberDescription = value;
    }

    /**
     * Gets the value of the outputCopyNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutputCopyNumberValue() {
        return outputCopyNumberValue;
    }

    /**
     * Sets the value of the outputCopyNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutputCopyNumberValue(Integer value) {
        this.outputCopyNumberValue = value;
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
