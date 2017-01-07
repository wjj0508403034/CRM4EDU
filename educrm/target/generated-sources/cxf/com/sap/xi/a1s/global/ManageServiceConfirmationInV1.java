package com.sap.xi.a1s.global;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2015-12-07T00:20:54.613+08:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://sap.com/xi/A1S/Global", name = "ManageServiceConfirmationIn_V1")
@XmlSeeAlso({ObjectFactory.class, com.sap.xi.documentservices.global.ObjectFactory.class, com.sap.xi.ap.common.gdt.ObjectFactory.class, com.sap.xi.sapglobal20.global.ObjectFactory.class, com.sap.xi.ap.common.global.ObjectFactory.class, com.sap.xi.ap.fo.priceandtax.global.ObjectFactory.class, com.sap.xi.basis.global.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ManageServiceConfirmationInV1 {

    @WebResult(name = "ServiceConfirmationBundleMaintainConfirmation_sync", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global", partName = "ServiceConfirmationBundleMaintainConfirmation_sync")
    @WebMethod(operationName = "MaintainBundle", action = "http://sap.com/xi/A1S/Global/ManageServiceConfirmationIn_V1/MaintainBundleRequest")
    public ServiceConfirmationMaintainConfirmationBundleMessageSync maintainBundle(
        @WebParam(partName = "ServiceConfirmationBundleMaintainRequest_sync", name = "ServiceConfirmationBundleMaintainRequest_sync", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global")
        ServiceConfirmationMaintainRequestBundleMessageSync serviceConfirmationBundleMaintainRequestSync
    ) throws StandardFaultMessage;
}
