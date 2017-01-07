
package com.sap.xi.ap.fo.paymentcard.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.PaymentCardID;
import com.sap.xi.ap.common.gdt.PaymentCardTypeCode;


/**
 * <p>Java class for PaymentCardKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardID"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardTypeCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardKey", propOrder = {
    "id",
    "typeCode"
})
public class PaymentCardKey {

    @XmlElement(name = "ID", required = true)
    protected PaymentCardID id;
    @XmlElement(name = "TypeCode", required = true)
    protected PaymentCardTypeCode typeCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardID }
     *     
     */
    public PaymentCardID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardID }
     *     
     */
    public void setID(PaymentCardID value) {
        this.id = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardTypeCode }
     *     
     */
    public PaymentCardTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardTypeCode }
     *     
     */
    public void setTypeCode(PaymentCardTypeCode value) {
        this.typeCode = value;
    }

}
