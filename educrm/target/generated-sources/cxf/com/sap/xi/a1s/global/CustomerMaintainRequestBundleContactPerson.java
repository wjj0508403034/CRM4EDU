
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.AcademicTitleCode;
import com.sap.xi.ap.common.gdt.BusinessPartnerFunctionTypeCode;
import com.sap.xi.ap.common.gdt.BusinessPartnerFunctionalAreaCode;
import com.sap.xi.ap.common.gdt.CommunicationMediumTypeCode;
import com.sap.xi.ap.common.gdt.EmailURI;
import com.sap.xi.ap.common.gdt.FormOfAddressCode;
import com.sap.xi.ap.common.gdt.MaritalStatusCode;
import com.sap.xi.ap.common.gdt.OccupationCode;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.ap.common.gdt.VIPReasonCode;


/**
 * <p>Java class for CustomerMaintainRequestBundleContactPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMaintainRequestBundleContactPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerContactUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerContactInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="NationalProviderID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="DefaultContactPersonIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://sap.com/xi/AP/Common/GDT}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="AcademicTitleCode" type="{http://sap.com/xi/AP/Common/GDT}AcademicTitleCode" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="BirthName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://sap.com/xi/AP/Common/GDT}GenderCode" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="NonVerbalCommunicationLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="OccupationCode" type="{http://sap.com/xi/AP/Common/GDT}OccupationCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerFunctionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerFunctionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerFunctionalAreaCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerFunctionalAreaCode" minOccurs="0"/&gt;
 *         &lt;element name="VIPReasonCode" type="{http://sap.com/xi/AP/Common/GDT}VIPReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceBusinessAddressUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplacePreferredCommunicationMediumTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CommunicationMediumTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceEmailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceFacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceTelephone" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleWorkplaceTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceWebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceFunctionalTitleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceDepartmentName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceBuildingID" type="{http://sap.com/xi/AP/Common/GDT}BuildingID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceFloorID" type="{http://sap.com/xi/AP/Common/GDT}FloorID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceRoomID" type="{http://sap.com/xi/AP/Common/GDT}RoomID" minOccurs="0"/&gt;
 *         &lt;element name="AddressInformation" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleContactPersonAddressInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}PartyLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatusCode" type="{http://sap.com/xi/AP/Common/GDT}MaritalStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployee" type="{http://sap.com/xi/A1S/Global}CustomerMaintainRequestBundleContactResponsibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responsibleEmployeeListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *       &lt;attribute name="workplaceTelephoneListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="addressInformationListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMaintainRequestBundleContactPerson", propOrder = {
    "objectNodeSenderTechnicalID",
    "businessPartnerContactUUID",
    "businessPartnerContactInternalID",
    "nationalProviderID",
    "defaultContactPersonIndicator",
    "formOfAddressCode",
    "academicTitleCode",
    "givenName",
    "middleName",
    "familyName",
    "birthName",
    "nickName",
    "genderCode",
    "birthDate",
    "nonVerbalCommunicationLanguageCode",
    "occupationCode",
    "businessPartnerFunctionTypeCode",
    "businessPartnerFunctionalAreaCode",
    "vipReasonCode",
    "workplaceBusinessAddressUUID",
    "workplacePreferredCommunicationMediumTypeCode",
    "workplaceEmailURI",
    "workplaceFacsimileFormattedNumberDescription",
    "workplaceTelephone",
    "workplaceWebURI",
    "workplaceFunctionalTitleName",
    "workplaceDepartmentName",
    "workplaceBuildingID",
    "workplaceFloorID",
    "workplaceRoomID",
    "addressInformation",
    "lifeCycleStatusCode",
    "maritalStatusCode",
    "responsibleEmployee",
    "responsibleEmployeeListCompleteTransmissionIndicator"
})
public class CustomerMaintainRequestBundleContactPerson {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "BusinessPartnerContactUUID")
    protected UUID businessPartnerContactUUID;
    @XmlElement(name = "BusinessPartnerContactInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerContactInternalID;
    @XmlElement(name = "NationalProviderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nationalProviderID;
    @XmlElement(name = "DefaultContactPersonIndicator")
    protected Boolean defaultContactPersonIndicator;
    @XmlElement(name = "FormOfAddressCode")
    protected FormOfAddressCode formOfAddressCode;
    @XmlElement(name = "AcademicTitleCode")
    protected AcademicTitleCode academicTitleCode;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "BirthName")
    protected String birthName;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "GenderCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String genderCode;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "NonVerbalCommunicationLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String nonVerbalCommunicationLanguageCode;
    @XmlElement(name = "OccupationCode")
    protected OccupationCode occupationCode;
    @XmlElement(name = "BusinessPartnerFunctionTypeCode")
    protected BusinessPartnerFunctionTypeCode businessPartnerFunctionTypeCode;
    @XmlElement(name = "BusinessPartnerFunctionalAreaCode")
    protected BusinessPartnerFunctionalAreaCode businessPartnerFunctionalAreaCode;
    @XmlElement(name = "VIPReasonCode")
    protected VIPReasonCode vipReasonCode;
    @XmlElement(name = "WorkplaceBusinessAddressUUID")
    protected UUID workplaceBusinessAddressUUID;
    @XmlElement(name = "WorkplacePreferredCommunicationMediumTypeCode")
    protected CommunicationMediumTypeCode workplacePreferredCommunicationMediumTypeCode;
    @XmlElement(name = "WorkplaceEmailURI")
    protected EmailURI workplaceEmailURI;
    @XmlElement(name = "WorkplaceFacsimileFormattedNumberDescription")
    protected String workplaceFacsimileFormattedNumberDescription;
    @XmlElement(name = "WorkplaceTelephone")
    protected List<CustomerMaintainRequestBundleWorkplaceTelephone> workplaceTelephone;
    @XmlElement(name = "WorkplaceWebURI")
    @XmlSchemaType(name = "anyURI")
    protected String workplaceWebURI;
    @XmlElement(name = "WorkplaceFunctionalTitleName")
    protected String workplaceFunctionalTitleName;
    @XmlElement(name = "WorkplaceDepartmentName")
    protected String workplaceDepartmentName;
    @XmlElement(name = "WorkplaceBuildingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workplaceBuildingID;
    @XmlElement(name = "WorkplaceFloorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workplaceFloorID;
    @XmlElement(name = "WorkplaceRoomID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workplaceRoomID;
    @XmlElement(name = "AddressInformation")
    protected List<CustomerMaintainRequestBundleContactPersonAddressInformation> addressInformation;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "MaritalStatusCode")
    protected MaritalStatusCode maritalStatusCode;
    @XmlElement(name = "ResponsibleEmployee")
    protected List<CustomerMaintainRequestBundleContactResponsibility> responsibleEmployee;
    protected Boolean responsibleEmployeeListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "workplaceTelephoneListCompleteTransmissionIndicator")
    protected Boolean workplaceTelephoneListCompleteTransmissionIndicator;
    @XmlAttribute(name = "addressInformationListCompleteTransmissionIndicator")
    protected Boolean addressInformationListCompleteTransmissionIndicator;

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
     * Gets the value of the businessPartnerContactUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getBusinessPartnerContactUUID() {
        return businessPartnerContactUUID;
    }

    /**
     * Sets the value of the businessPartnerContactUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setBusinessPartnerContactUUID(UUID value) {
        this.businessPartnerContactUUID = value;
    }

    /**
     * Gets the value of the businessPartnerContactInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerContactInternalID() {
        return businessPartnerContactInternalID;
    }

    /**
     * Sets the value of the businessPartnerContactInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerContactInternalID(String value) {
        this.businessPartnerContactInternalID = value;
    }

    /**
     * Gets the value of the nationalProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalProviderID() {
        return nationalProviderID;
    }

    /**
     * Sets the value of the nationalProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalProviderID(String value) {
        this.nationalProviderID = value;
    }

    /**
     * Gets the value of the defaultContactPersonIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultContactPersonIndicator() {
        return defaultContactPersonIndicator;
    }

    /**
     * Sets the value of the defaultContactPersonIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultContactPersonIndicator(Boolean value) {
        this.defaultContactPersonIndicator = value;
    }

    /**
     * Gets the value of the formOfAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfAddressCode }
     *     
     */
    public FormOfAddressCode getFormOfAddressCode() {
        return formOfAddressCode;
    }

    /**
     * Sets the value of the formOfAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfAddressCode }
     *     
     */
    public void setFormOfAddressCode(FormOfAddressCode value) {
        this.formOfAddressCode = value;
    }

    /**
     * Gets the value of the academicTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTitleCode }
     *     
     */
    public AcademicTitleCode getAcademicTitleCode() {
        return academicTitleCode;
    }

    /**
     * Sets the value of the academicTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTitleCode }
     *     
     */
    public void setAcademicTitleCode(AcademicTitleCode value) {
        this.academicTitleCode = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the birthName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Sets the value of the birthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthName(String value) {
        this.birthName = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the nonVerbalCommunicationLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonVerbalCommunicationLanguageCode() {
        return nonVerbalCommunicationLanguageCode;
    }

    /**
     * Sets the value of the nonVerbalCommunicationLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonVerbalCommunicationLanguageCode(String value) {
        this.nonVerbalCommunicationLanguageCode = value;
    }

    /**
     * Gets the value of the occupationCode property.
     * 
     * @return
     *     possible object is
     *     {@link OccupationCode }
     *     
     */
    public OccupationCode getOccupationCode() {
        return occupationCode;
    }

    /**
     * Sets the value of the occupationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationCode }
     *     
     */
    public void setOccupationCode(OccupationCode value) {
        this.occupationCode = value;
    }

    /**
     * Gets the value of the businessPartnerFunctionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerFunctionTypeCode }
     *     
     */
    public BusinessPartnerFunctionTypeCode getBusinessPartnerFunctionTypeCode() {
        return businessPartnerFunctionTypeCode;
    }

    /**
     * Sets the value of the businessPartnerFunctionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerFunctionTypeCode }
     *     
     */
    public void setBusinessPartnerFunctionTypeCode(BusinessPartnerFunctionTypeCode value) {
        this.businessPartnerFunctionTypeCode = value;
    }

    /**
     * Gets the value of the businessPartnerFunctionalAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerFunctionalAreaCode }
     *     
     */
    public BusinessPartnerFunctionalAreaCode getBusinessPartnerFunctionalAreaCode() {
        return businessPartnerFunctionalAreaCode;
    }

    /**
     * Sets the value of the businessPartnerFunctionalAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerFunctionalAreaCode }
     *     
     */
    public void setBusinessPartnerFunctionalAreaCode(BusinessPartnerFunctionalAreaCode value) {
        this.businessPartnerFunctionalAreaCode = value;
    }

    /**
     * Gets the value of the vipReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link VIPReasonCode }
     *     
     */
    public VIPReasonCode getVIPReasonCode() {
        return vipReasonCode;
    }

    /**
     * Sets the value of the vipReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VIPReasonCode }
     *     
     */
    public void setVIPReasonCode(VIPReasonCode value) {
        this.vipReasonCode = value;
    }

    /**
     * Gets the value of the workplaceBusinessAddressUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getWorkplaceBusinessAddressUUID() {
        return workplaceBusinessAddressUUID;
    }

    /**
     * Sets the value of the workplaceBusinessAddressUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setWorkplaceBusinessAddressUUID(UUID value) {
        this.workplaceBusinessAddressUUID = value;
    }

    /**
     * Gets the value of the workplacePreferredCommunicationMediumTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public CommunicationMediumTypeCode getWorkplacePreferredCommunicationMediumTypeCode() {
        return workplacePreferredCommunicationMediumTypeCode;
    }

    /**
     * Sets the value of the workplacePreferredCommunicationMediumTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public void setWorkplacePreferredCommunicationMediumTypeCode(CommunicationMediumTypeCode value) {
        this.workplacePreferredCommunicationMediumTypeCode = value;
    }

    /**
     * Gets the value of the workplaceEmailURI property.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getWorkplaceEmailURI() {
        return workplaceEmailURI;
    }

    /**
     * Sets the value of the workplaceEmailURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setWorkplaceEmailURI(EmailURI value) {
        this.workplaceEmailURI = value;
    }

    /**
     * Gets the value of the workplaceFacsimileFormattedNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceFacsimileFormattedNumberDescription() {
        return workplaceFacsimileFormattedNumberDescription;
    }

    /**
     * Sets the value of the workplaceFacsimileFormattedNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceFacsimileFormattedNumberDescription(String value) {
        this.workplaceFacsimileFormattedNumberDescription = value;
    }

    /**
     * Gets the value of the workplaceTelephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workplaceTelephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkplaceTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleWorkplaceTelephone }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleWorkplaceTelephone> getWorkplaceTelephone() {
        if (workplaceTelephone == null) {
            workplaceTelephone = new ArrayList<CustomerMaintainRequestBundleWorkplaceTelephone>();
        }
        return this.workplaceTelephone;
    }

    /**
     * Gets the value of the workplaceWebURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceWebURI() {
        return workplaceWebURI;
    }

    /**
     * Sets the value of the workplaceWebURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceWebURI(String value) {
        this.workplaceWebURI = value;
    }

    /**
     * Gets the value of the workplaceFunctionalTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceFunctionalTitleName() {
        return workplaceFunctionalTitleName;
    }

    /**
     * Sets the value of the workplaceFunctionalTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceFunctionalTitleName(String value) {
        this.workplaceFunctionalTitleName = value;
    }

    /**
     * Gets the value of the workplaceDepartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceDepartmentName() {
        return workplaceDepartmentName;
    }

    /**
     * Sets the value of the workplaceDepartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceDepartmentName(String value) {
        this.workplaceDepartmentName = value;
    }

    /**
     * Gets the value of the workplaceBuildingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceBuildingID() {
        return workplaceBuildingID;
    }

    /**
     * Sets the value of the workplaceBuildingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceBuildingID(String value) {
        this.workplaceBuildingID = value;
    }

    /**
     * Gets the value of the workplaceFloorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceFloorID() {
        return workplaceFloorID;
    }

    /**
     * Sets the value of the workplaceFloorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceFloorID(String value) {
        this.workplaceFloorID = value;
    }

    /**
     * Gets the value of the workplaceRoomID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceRoomID() {
        return workplaceRoomID;
    }

    /**
     * Sets the value of the workplaceRoomID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceRoomID(String value) {
        this.workplaceRoomID = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleContactPersonAddressInformation }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleContactPersonAddressInformation> getAddressInformation() {
        if (addressInformation == null) {
            addressInformation = new ArrayList<CustomerMaintainRequestBundleContactPersonAddressInformation>();
        }
        return this.addressInformation;
    }

    /**
     * Gets the value of the lifeCycleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Sets the value of the lifeCycleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the maritalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusCode }
     *     
     */
    public MaritalStatusCode getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Sets the value of the maritalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusCode }
     *     
     */
    public void setMaritalStatusCode(MaritalStatusCode value) {
        this.maritalStatusCode = value;
    }

    /**
     * Gets the value of the responsibleEmployee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleEmployee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMaintainRequestBundleContactResponsibility }
     * 
     * 
     */
    public List<CustomerMaintainRequestBundleContactResponsibility> getResponsibleEmployee() {
        if (responsibleEmployee == null) {
            responsibleEmployee = new ArrayList<CustomerMaintainRequestBundleContactResponsibility>();
        }
        return this.responsibleEmployee;
    }

    /**
     * Gets the value of the responsibleEmployeeListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResponsibleEmployeeListCompleteTransmissionIndicator() {
        return responsibleEmployeeListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the responsibleEmployeeListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResponsibleEmployeeListCompleteTransmissionIndicator(Boolean value) {
        this.responsibleEmployeeListCompleteTransmissionIndicator = value;
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

    /**
     * Gets the value of the workplaceTelephoneListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkplaceTelephoneListCompleteTransmissionIndicator() {
        return workplaceTelephoneListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the workplaceTelephoneListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkplaceTelephoneListCompleteTransmissionIndicator(Boolean value) {
        this.workplaceTelephoneListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the addressInformationListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressInformationListCompleteTransmissionIndicator() {
        return addressInformationListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the addressInformationListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressInformationListCompleteTransmissionIndicator(Boolean value) {
        this.addressInformationListCompleteTransmissionIndicator = value;
    }

}
