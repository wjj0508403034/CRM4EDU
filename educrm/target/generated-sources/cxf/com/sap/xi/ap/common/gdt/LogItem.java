
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTypeID" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemSeverityCode" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceMessageElementName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LogItemNote"/&gt;
 *         &lt;element name="NoteTemplateText" type="{http://sap.com/xi/AP/Common/GDT}LogItemNoteTemplateText" minOccurs="0"/&gt;
 *         &lt;element name="LogItemNotePlaceholderSubstitutionList" type="{http://sap.com/xi/AP/Common/GDT}LogItemNotePlaceholderSubstitutionList" minOccurs="0"/&gt;
 *         &lt;element name="WebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItem", propOrder = {
    "typeID",
    "categoryCode",
    "severityCode",
    "referenceObjectNodeSenderTechnicalID",
    "referenceMessageElementName",
    "note",
    "noteTemplateText",
    "logItemNotePlaceholderSubstitutionList",
    "webURI"
})
public class LogItem {

    @XmlElement(name = "TypeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeID;
    @XmlElement(name = "CategoryCode")
    protected LogItemCategoryCode categoryCode;
    @XmlElement(name = "SeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String severityCode;
    @XmlElement(name = "ReferenceObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceObjectNodeSenderTechnicalID;
    @XmlElement(name = "ReferenceMessageElementName")
    protected String referenceMessageElementName;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "NoteTemplateText")
    protected String noteTemplateText;
    @XmlElement(name = "LogItemNotePlaceholderSubstitutionList")
    protected LogItemNotePlaceholderSubstitutionList logItemNotePlaceholderSubstitutionList;
    @XmlElement(name = "WebURI")
    @XmlSchemaType(name = "anyURI")
    protected String webURI;

    /**
     * Gets the value of the typeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Sets the value of the typeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public LogItemCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public void setCategoryCode(LogItemCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the severityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityCode() {
        return severityCode;
    }

    /**
     * Sets the value of the severityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityCode(String value) {
        this.severityCode = value;
    }

    /**
     * Gets the value of the referenceObjectNodeSenderTechnicalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceObjectNodeSenderTechnicalID() {
        return referenceObjectNodeSenderTechnicalID;
    }

    /**
     * Sets the value of the referenceObjectNodeSenderTechnicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceObjectNodeSenderTechnicalID(String value) {
        this.referenceObjectNodeSenderTechnicalID = value;
    }

    /**
     * Gets the value of the referenceMessageElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceMessageElementName() {
        return referenceMessageElementName;
    }

    /**
     * Sets the value of the referenceMessageElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceMessageElementName(String value) {
        this.referenceMessageElementName = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the noteTemplateText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTemplateText() {
        return noteTemplateText;
    }

    /**
     * Sets the value of the noteTemplateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTemplateText(String value) {
        this.noteTemplateText = value;
    }

    /**
     * Gets the value of the logItemNotePlaceholderSubstitutionList property.
     * 
     * @return
     *     possible object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public LogItemNotePlaceholderSubstitutionList getLogItemNotePlaceholderSubstitutionList() {
        return logItemNotePlaceholderSubstitutionList;
    }

    /**
     * Sets the value of the logItemNotePlaceholderSubstitutionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public void setLogItemNotePlaceholderSubstitutionList(LogItemNotePlaceholderSubstitutionList value) {
        this.logItemNotePlaceholderSubstitutionList = value;
    }

    /**
     * Gets the value of the webURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebURI() {
        return webURI;
    }

    /**
     * Sets the value of the webURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebURI(String value) {
        this.webURI = value;
    }

}
