
package com.j4ltechnologies.formation.ws.soap;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsCompteService", targetNamespace = "http://impls.ws.soap.ws.formation.j4ltechnologies.com/", wsdlLocation = "http://PANTHERA:8080/chap_02_ws_banque_server-1.0/WsCompteService?wsdl")
public class WsCompteService
    extends Service
{

    private final static URL WSCOMPTESERVICE_WSDL_LOCATION;
    private final static WebServiceException WSCOMPTESERVICE_EXCEPTION;
    private final static QName WSCOMPTESERVICE_QNAME = new QName("http://impls.ws.soap.ws.formation.j4ltechnologies.com/", "WsCompteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://PANTHERA:8080/chap_02_ws_banque_server-1.0/WsCompteService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCOMPTESERVICE_WSDL_LOCATION = url;
        WSCOMPTESERVICE_EXCEPTION = e;
    }

    public WsCompteService() {
        super(__getWsdlLocation(), WSCOMPTESERVICE_QNAME);
    }

    public WsCompteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCOMPTESERVICE_QNAME, features);
    }

    public WsCompteService(URL wsdlLocation) {
        super(wsdlLocation, WSCOMPTESERVICE_QNAME);
    }

    public WsCompteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCOMPTESERVICE_QNAME, features);
    }

    public WsCompteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsCompteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsCompte
     */
    @WebEndpoint(name = "WsComptePort")
    public WsCompte getWsComptePort() {
        return super.getPort(new QName("http://impls.ws.soap.ws.formation.j4ltechnologies.com/", "WsComptePort"), WsCompte.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsCompte
     */
    @WebEndpoint(name = "WsComptePort")
    public WsCompte getWsComptePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impls.ws.soap.ws.formation.j4ltechnologies.com/", "WsComptePort"), WsCompte.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCOMPTESERVICE_EXCEPTION!= null) {
            throw WSCOMPTESERVICE_EXCEPTION;
        }
        return WSCOMPTESERVICE_WSDL_LOCATION;
    }

}
