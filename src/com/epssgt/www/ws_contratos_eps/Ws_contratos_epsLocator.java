/**
 * Ws_contratos_epsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epssgt.www.ws_contratos_eps;

public class Ws_contratos_epsLocator extends org.apache.axis.client.Service implements com.epssgt.www.ws_contratos_eps.Ws_contratos_eps {

    public Ws_contratos_epsLocator() {
    }


    public Ws_contratos_epsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Ws_contratos_epsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ws_contratos_epsSoap
    private java.lang.String ws_contratos_epsSoap_address = "http://10.20.10.5:7770/wscontratoseps_test/ws_contratos_eps.asmx";

    public java.lang.String getws_contratos_epsSoapAddress() {
        return ws_contratos_epsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ws_contratos_epsSoapWSDDServiceName = "ws_contratos_epsSoap";

    public java.lang.String getws_contratos_epsSoapWSDDServiceName() {
        return ws_contratos_epsSoapWSDDServiceName;
    }

    public void setws_contratos_epsSoapWSDDServiceName(java.lang.String name) {
        ws_contratos_epsSoapWSDDServiceName = name;
    }

    public com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoap getws_contratos_epsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ws_contratos_epsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getws_contratos_epsSoap(endpoint);
    }

    public com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoap getws_contratos_epsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoapStub _stub = new com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoapStub(portAddress, this);
            _stub.setPortName(getws_contratos_epsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setws_contratos_epsSoapEndpointAddress(java.lang.String address) {
        ws_contratos_epsSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoapStub _stub = new com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoapStub(new java.net.URL(ws_contratos_epsSoap_address), this);
                _stub.setPortName(getws_contratos_epsSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ws_contratos_epsSoap".equals(inputPortName)) {
            return getws_contratos_epsSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.epssgt.com/ws_contratos_eps/", "ws_contratos_eps");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.epssgt.com/ws_contratos_eps/", "ws_contratos_epsSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ws_contratos_epsSoap".equals(portName)) {
            setws_contratos_epsSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
