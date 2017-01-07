
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.CashDiscountTermsCode;


/**
 * <p>Java class for SalesOrderMaintainRequestCashDiscountTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestCashDiscountTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://sap.com/xi/AP/Common/GDT}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBaselineDate" type="{http://sap.com/xi/BASIS/Global}Date" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOrderMaintainRequestCashDiscountTerms", propOrder = {
    "code",
    "paymentBaselineDate"
})
public class SalesOrderMaintainRequestCashDiscountTerms {

    @XmlElement(name = "Code")
    protected CashDiscountTermsCode code;
    @XmlElement(name = "PaymentBaselineDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentBaselineDate;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public CashDiscountTermsCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public void setCode(CashDiscountTermsCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the paymentBaselineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentBaselineDate() {
        return paymentBaselineDate;
    }

    /**
     * Sets the value of the paymentBaselineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentBaselineDate(XMLGregorianCalendar value) {
        this.paymentBaselineDate = value;
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
