/**
 * IWSLim5APserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class IWSLim5APserviceLocator extends org.apache.axis.client.Service implements mypackage.IWSLim5APservice {

    public IWSLim5APserviceLocator() {
    }


    public IWSLim5APserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IWSLim5APserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IWSLim5APPort
    private java.lang.String IWSLim5APPort_address = "http://s11gs3s.doomdns.com:9091/WSDL/soap/IWSLim5AP";

    public java.lang.String getIWSLim5APPortAddress() {
        return IWSLim5APPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IWSLim5APPortWSDDServiceName = "IWSLim5APPort";

    public java.lang.String getIWSLim5APPortWSDDServiceName() {
        return IWSLim5APPortWSDDServiceName;
    }

    public void setIWSLim5APPortWSDDServiceName(java.lang.String name) {
        IWSLim5APPortWSDDServiceName = name;
    }

    public mypackage.IWSLim5AP getIWSLim5APPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IWSLim5APPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIWSLim5APPort(endpoint);
    }

    public mypackage.IWSLim5AP getIWSLim5APPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.IWSLim5APbindingStub _stub = new mypackage.IWSLim5APbindingStub(portAddress, this);
            _stub.setPortName(getIWSLim5APPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIWSLim5APPortEndpointAddress(java.lang.String address) {
        IWSLim5APPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.IWSLim5AP.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.IWSLim5APbindingStub _stub = new mypackage.IWSLim5APbindingStub(new java.net.URL(IWSLim5APPort_address), this);
                _stub.setPortName(getIWSLim5APPortWSDDServiceName());
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
        if ("IWSLim5APPort".equals(inputPortName)) {
            return getIWSLim5APPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "IWSLim5APservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "IWSLim5APPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IWSLim5APPort".equals(portName)) {
            setIWSLim5APPortEndpointAddress(address);
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
