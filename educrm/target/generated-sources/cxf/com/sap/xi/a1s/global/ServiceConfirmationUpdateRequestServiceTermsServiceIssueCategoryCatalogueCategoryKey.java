
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.ServiceIssueCategoryID;


/**
 * <p>Java class for ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceIssueCategoryID" type="{http://sap.com/xi/AP/Common/GDT}ServiceIssueCategoryID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey", propOrder = {
    "serviceIssueCategoryID"
})
public class ServiceConfirmationUpdateRequestServiceTermsServiceIssueCategoryCatalogueCategoryKey {

    @XmlElement(name = "ServiceIssueCategoryID")
    protected ServiceIssueCategoryID serviceIssueCategoryID;

    /**
     * Gets the value of the serviceIssueCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIssueCategoryID }
     *     
     */
    public ServiceIssueCategoryID getServiceIssueCategoryID() {
        return serviceIssueCategoryID;
    }

    /**
     * Sets the value of the serviceIssueCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIssueCategoryID }
     *     
     */
    public void setServiceIssueCategoryID(ServiceIssueCategoryID value) {
        this.serviceIssueCategoryID = value;
    }

}
