
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.Log;


/**
 * <p>Java class for ServiceConfirmationMaintainConfirmationBundleMessage_sync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationMaintainConfirmationBundleMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceConfirmation" type="{http://sap.com/xi/A1S/Global}ServiceConfirmationMaintainConfirmationBundle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfirmationMaintainConfirmationBundleMessage_sync", propOrder = {
    "serviceConfirmation",
    "log"
})
public class ServiceConfirmationMaintainConfirmationBundleMessageSync {

    @XmlElement(name = "ServiceConfirmation")
    protected List<ServiceConfirmationMaintainConfirmationBundle> serviceConfirmation;
    @XmlElement(name = "Log", required = true)
    protected Log log;

    /**
     * Gets the value of the serviceConfirmation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceConfirmation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceConfirmation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConfirmationMaintainConfirmationBundle }
     * 
     * 
     */
    public List<ServiceConfirmationMaintainConfirmationBundle> getServiceConfirmation() {
        if (serviceConfirmation == null) {
            serviceConfirmation = new ArrayList<ServiceConfirmationMaintainConfirmationBundle>();
        }
        return this.serviceConfirmation;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
