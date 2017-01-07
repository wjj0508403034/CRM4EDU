
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
 * <p>Java class for ServiceConfirmationUpdateRequestServiceTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationUpdateRequestServiceTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ServiceIssueCategoryCatalogueCategoryKey" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceConfirmationUpdateRequestServiceTerms", propOrder = {
    "technicalID",
    "serviceIssueCategoryCatalogueCategoryKey"
})
public class ServiceConfirmationUpdateRequestServiceTerms {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "ServiceIssueCategoryCatalogueCategoryKey")
    protected ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey serviceIssueCategoryCatalogueCategoryKey;
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
     * Gets the value of the serviceIssueCategoryCatalogueCategoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey }
     *     
     */
    public ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey getServiceIssueCategoryCatalogueCategoryKey() {
        return serviceIssueCategoryCatalogueCategoryKey;
    }

    /**
     * Sets the value of the serviceIssueCategoryCatalogueCategoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey }
     *     
     */
    public void setServiceIssueCategoryCatalogueCategoryKey(ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey value) {
        this.serviceIssueCategoryCatalogueCategoryKey = value;
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
