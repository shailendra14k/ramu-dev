package com.mycompany.cxf.soap.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-621107
 * 2016-08-26T20:15:47.603+05:30
 * Generated source version: 3.0.4.redhat-621107
 * 
 */
@WebServiceClient(name = "PersonService", 
                  wsdlLocation = "file:/home/kkakarla/Development/Camel-Fuse-Examples/cxf-soap-https-client/src/main/resources/wsdl/person.wsdl",
                  targetNamespace = "http://model.soap.cxf.mycompany.com/") 
public class PersonService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://model.soap.cxf.mycompany.com/", "PersonService");
    public final static QName PersonServicePort = new QName("http://model.soap.cxf.mycompany.com/", "PersonServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/kkakarla/Development/Camel-Fuse-Examples/cxf-soap-https-client/src/main/resources/wsdl/person.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/kkakarla/Development/Camel-Fuse-Examples/cxf-soap-https-client/src/main/resources/wsdl/person.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServicePort")
    public PersonService getPersonServicePort() {
        return super.getPort(PersonServicePort, PersonService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServicePort")
    public PersonService getPersonServicePort(WebServiceFeature... features) {
        return super.getPort(PersonServicePort, PersonService.class, features);
    }

}
