
package com.vodafone.mm.gen.api_v1.mminterface.request;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RequestMgrService", targetNamespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request", wsdlLocation = "file:/home/oyugik/Desktop/PURPLE/MNO/Safaricom/CBPInterface_Request.wsdl")
public class RequestMgrService
    extends Service
{

    private final static URL REQUESTMGRSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.vodafone.mm.gen.api_v1.mminterface.request.RequestMgrService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.vodafone.mm.gen.api_v1.mminterface.request.RequestMgrService.class.getResource(".");
            url = new URL(baseUrl, "file:/home/oyugik/Desktop/PURPLE/MNO/Safaricom/CBPInterface_Request.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/oyugik/Desktop/PURPLE/MNO/Safaricom/CBPInterface_Request.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        REQUESTMGRSERVICE_WSDL_LOCATION = url;
    }

    public RequestMgrService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RequestMgrService() {
        super(REQUESTMGRSERVICE_WSDL_LOCATION, new QName("http://api-v1.gen.mm.vodafone.com/mminterface/request", "RequestMgrService"));
    }

    /**
     * 
     * @return
     *     returns RequestMgrPortType
     */
    @WebEndpoint(name = "RequestMgrServicePort")
    public RequestMgrPortType getRequestMgrServicePort() {
        return super.getPort(new QName("http://api-v1.gen.mm.vodafone.com/mminterface/request", "RequestMgrServicePort"), RequestMgrPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RequestMgrPortType
     */
    @WebEndpoint(name = "RequestMgrServicePort")
    public RequestMgrPortType getRequestMgrServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api-v1.gen.mm.vodafone.com/mminterface/request", "RequestMgrServicePort"), RequestMgrPortType.class, features);
    }

}
