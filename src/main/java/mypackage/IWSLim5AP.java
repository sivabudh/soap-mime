/**
 * IWSLim5AP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface IWSLim5AP extends java.rmi.Remote {
    public java.lang.String textrec(java.lang.String xcrec) throws java.rmi.RemoteException;
    public java.lang.String txtcompname() throws java.rmi.RemoteException;
    public void loadIMG1(java.lang.String xctxt, javax.xml.rpc.holders.StringHolder xretxt, org.apache.axis.holders.DataHandlerHolder xrpic1, org.apache.axis.holders.DataHandlerHolder xrpic2, org.apache.axis.holders.DataHandlerHolder xrpic3) throws java.rmi.RemoteException;
    public java.lang.String recIMG(java.lang.String xctxt, javax.activation.DataHandler xattach) throws java.rmi.RemoteException;
    public java.lang.String IMGsd(java.lang.String xctxt, javax.activation.DataHandler xattach) throws java.rmi.RemoteException;
}
