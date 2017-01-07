
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SalesOrderMaintainRequestPartyAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMaintainRequestPartyAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrespondenceLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddressEmail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Facsimile" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddressFascmile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddressTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Web" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddressWeb" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddressDisplayName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddressName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://sap.com/xi/A1S/Global}SalesOrderMaintainRequestPartyAddressPostalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMaintainRequestPartyAddress", propOrder = {
    "correspondenceLanguageCode",
    "email",
    "facsimile",
    "telephone",
    "web",
    "displayName",
    "name",
    "postalAddress"
})
public class SalesOrderMaintainRequestPartyAddress {

    @XmlElement(name = "CorrespondenceLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String correspondenceLanguageCode;
    @XmlElement(name = "Email")
    protected List<SalesOrderMaintainRequestPartyAddressEmail> email;
    @XmlElement(name = "Facsimile")
    protected List<SalesOrderMaintainRequestPartyAddressFascmile> facsimile;
    @XmlElement(name = "Telephone")
    protected List<SalesOrderMaintainRequestPartyAddressTelephone> telephone;
    @XmlElement(name = "Web")
    protected List<SalesOrderMaintainRequestPartyAddressWeb> web;
    @XmlElement(name = "DisplayName")
    protected List<SalesOrderMaintainRequestPartyAddressDisplayName> displayName;
    @XmlElement(name = "Name")
    protected List<SalesOrderMaintainRequestPartyAddressName> name;
    @XmlElement(name = "PostalAddress")
    protected List<SalesOrderMaintainRequestPartyAddressPostalAddress> postalAddress;

    /**
     * Gets the value of the correspondenceLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceLanguageCode() {
        return correspondenceLanguageCode;
    }

    /**
     * Sets the value of the correspondenceLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceLanguageCode(String value) {
        this.correspondenceLanguageCode = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyAddressEmail }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyAddressEmail> getEmail() {
        if (email == null) {
            email = new ArrayList<SalesOrderMaintainRequestPartyAddressEmail>();
        }
        return this.email;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyAddressFascmile }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyAddressFascmile> getFacsimile() {
        if (facsimile == null) {
            facsimile = new ArrayList<SalesOrderMaintainRequestPartyAddressFascmile>();
        }
        return this.facsimile;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyAddressTelephone }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyAddressTelephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<SalesOrderMaintainRequestPartyAddressTelephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the web property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the web property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyAddressWeb }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyAddressWeb> getWeb() {
        if (web == null) {
            web = new ArrayList<SalesOrderMaintainRequestPartyAddressWeb>();
        }
        return this.web;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyAddressDisplayName }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyAddressDisplayName> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<SalesOrderMaintainRequestPartyAddressDisplayName>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyAddressName }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyAddressName> getName() {
        if (name == null) {
            name = new ArrayList<SalesOrderMaintainRequestPartyAddressName>();
        }
        return this.name;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderMaintainRequestPartyAddressPostalAddress }
     * 
     * 
     */
    public List<SalesOrderMaintainRequestPartyAddressPostalAddress> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<SalesOrderMaintainRequestPartyAddressPostalAddress>();
        }
        return this.postalAddress;
    }

}
