
package com.sap.xi.sapglobal20.global;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.sap.xi.a1s.global.ServiceConfirmationMaintainConfirmationBundleMessageSync;
import com.sap.xi.a1s.global.ServiceConfirmationMaintainRequestBundleMessageSync;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.xi.sapglobal20.global package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceConfirmationBundleMaintainConfirmationSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "ServiceConfirmationBundleMaintainConfirmation_sync");
    private final static QName _ServiceConfirmationBundleMaintainRequestSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "ServiceConfirmationBundleMaintainRequest_sync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.xi.sapglobal20.global
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConfirmationMaintainConfirmationBundleMessageSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ServiceConfirmationBundleMaintainConfirmation_sync")
    public JAXBElement<ServiceConfirmationMaintainConfirmationBundleMessageSync> createServiceConfirmationBundleMaintainConfirmationSync(ServiceConfirmationMaintainConfirmationBundleMessageSync value) {
        return new JAXBElement<ServiceConfirmationMaintainConfirmationBundleMessageSync>(_ServiceConfirmationBundleMaintainConfirmationSync_QNAME, ServiceConfirmationMaintainConfirmationBundleMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConfirmationMaintainRequestBundleMessageSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ServiceConfirmationBundleMaintainRequest_sync")
    public JAXBElement<ServiceConfirmationMaintainRequestBundleMessageSync> createServiceConfirmationBundleMaintainRequestSync(ServiceConfirmationMaintainRequestBundleMessageSync value) {
        return new JAXBElement<ServiceConfirmationMaintainRequestBundleMessageSync>(_ServiceConfirmationBundleMaintainRequestSync_QNAME, ServiceConfirmationMaintainRequestBundleMessageSync.class, null, value);
    }

}
