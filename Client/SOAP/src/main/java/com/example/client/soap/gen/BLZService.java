
package com.example.client.soap.gen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BLZService", targetNamespace = "http://thomas-bayer.com/blz/", wsdlLocation = "http://www.thomas-bayer.com/axis2/services/BLZService?wsdl")
public class BLZService
    extends Service
{

    private final static URL BLZSERVICE_WSDL_LOCATION;
    private final static WebServiceException BLZSERVICE_EXCEPTION;
    private final static QName BLZSERVICE_QNAME = new QName("http://thomas-bayer.com/blz/", "BLZService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.thomas-bayer.com/axis2/services/BLZService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BLZSERVICE_WSDL_LOCATION = url;
        BLZSERVICE_EXCEPTION = e;
    }

    public BLZService() {
        super(__getWsdlLocation(), BLZSERVICE_QNAME);
    }

    public BLZService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BLZSERVICE_QNAME, features);
    }

    public BLZService(URL wsdlLocation) {
        super(wsdlLocation, BLZSERVICE_QNAME);
    }

    public BLZService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BLZSERVICE_QNAME, features);
    }

    public BLZService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BLZService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP11port_http")
    public BLZServicePortType getBLZServiceSOAP11PortHttp() {
        return super.getPort(new QName("http://thomas-bayer.com/blz/", "BLZServiceSOAP11port_http"), BLZServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP11port_http")
    public BLZServicePortType getBLZServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://thomas-bayer.com/blz/", "BLZServiceSOAP11port_http"), BLZServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP12port_http")
    public BLZServicePortType getBLZServiceSOAP12PortHttp() {
        return super.getPort(new QName("http://thomas-bayer.com/blz/", "BLZServiceSOAP12port_http"), BLZServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP12port_http")
    public BLZServicePortType getBLZServiceSOAP12PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://thomas-bayer.com/blz/", "BLZServiceSOAP12port_http"), BLZServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceHttpport")
    public BLZServicePortType getBLZServiceHttpport() {
        return super.getPort(new QName("http://thomas-bayer.com/blz/", "BLZServiceHttpport"), BLZServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceHttpport")
    public BLZServicePortType getBLZServiceHttpport(WebServiceFeature... features) {
        return super.getPort(new QName("http://thomas-bayer.com/blz/", "BLZServiceHttpport"), BLZServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BLZSERVICE_EXCEPTION!= null) {
            throw BLZSERVICE_EXCEPTION;
        }
        return BLZSERVICE_WSDL_LOCATION;
    }

}
