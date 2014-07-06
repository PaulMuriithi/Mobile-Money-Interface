
package com.vodafone.mm.gen.api_v1.mminterface.request;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "RequestMgrPortType", targetNamespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    cn.com.huawei.schema.common.v2_1.ObjectFactory.class,
    com.vodafone.mm.gen.api_v1.mminterface.request.ObjectFactory.class
})
public interface RequestMgrPortType {


    /**
     * 
     * @param requestMsg
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GenericAPIRequest")
    @WebResult(name = "ResponseMsg", targetNamespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request", partName = "ResponseMsg")
    public String genericAPIRequest(
        @WebParam(name = "RequestMsg", targetNamespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request", partName = "RequestMsg")
        String requestMsg);

}
