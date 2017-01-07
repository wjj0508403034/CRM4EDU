
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.LONGName;


/**
 * <p>Java class for SalesOrderMaintainRequestPartyAddressDisplayName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPartyAddressDisplayName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedName" type="{http://sap.com/xi/AP/Common/GDT}LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPartyAddressDisplayName", propOrder = {
    "formattedName"
})
public class SalesOrderMaintainRequestPartyAddressDisplayName {

    @XmlElement(name = "FormattedName")
    protected LONGName formattedName;

    /**
     * Gets the value of the formattedName property.
     * 
     * @return
     *     possible object is
     *     {@link LONGName }
     *     
     */
    public LONGName getFormattedName() {
        return formattedName;
    }

    /**
     * Sets the value of the formattedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LONGName }
     *     
     */
    public void setFormattedName(LONGName value) {
        this.formattedName = value;
    }

}
