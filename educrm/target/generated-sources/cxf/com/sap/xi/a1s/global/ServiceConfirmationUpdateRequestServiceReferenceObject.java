
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ServiceConfirmationUpdateRequestServiceReferenceObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationUpdateRequestServiceReferenceObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentServiceReferenceObjectID" minOccurs="0"/&gt;
 *         &lt;element name="MaterialKey" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestServiceReferenceObjectMaterialKey" minOccurs="0"/&gt;
 *         &lt;element name="IndividualMaterialKey" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestServiceReferenceObjectIndividualMaterialKey" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceConfirmationUpdateRequestServiceReferenceObject", propOrder = {
    "id",
    "materialKey",
    "individualMaterialKey"
})
public class ServiceConfirmationUpdateRequestServiceReferenceObject {

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "MaterialKey")
    protected ServiceConfirmationUpdateRequestServiceReferenceObjectMaterialKey materialKey;
    @XmlElement(name = "IndividualMaterialKey")
    protected ServiceConfirmationUpdateRequestServiceReferenceObjectIndividualMaterialKey individualMaterialKey;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the materialKey property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestServiceReferenceObjectMaterialKey }
     *     
     */
    public ServiceConfirmationUpdateRequestServiceReferenceObjectMaterialKey getMaterialKey() {
        return materialKey;
    }

    /**
     * Sets the value of the materialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestServiceReferenceObjectMaterialKey }
     *     
     */
    public void setMaterialKey(ServiceConfirmationUpdateRequestServiceReferenceObjectMaterialKey value) {
        this.materialKey = value;
    }

    /**
     * Gets the value of the individualMaterialKey property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestServiceReferenceObjectIndividualMaterialKey }
     *     
     */
    public ServiceConfirmationUpdateRequestServiceReferenceObjectIndividualMaterialKey getIndividualMaterialKey() {
        return individualMaterialKey;
    }

    /**
     * Sets the value of the individualMaterialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestServiceReferenceObjectIndividualMaterialKey }
     *     
     */
    public void setIndividualMaterialKey(ServiceConfirmationUpdateRequestServiceReferenceObjectIndividualMaterialKey value) {
        this.individualMaterialKey = value;
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
