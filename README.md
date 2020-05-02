# soap-mime

You will need IntelliJ to run this. We use Maven to install packages.

If you are able to run it, you should see something like this on the commandline (at the time that this README was created):

```
============================= REQUEST ============================================
In message: <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
 <soapenv:Body>
  <ns1:txtcompname soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/" xmlns:ns1="urn:WSLim5APIntf-IWSLim5AP"/>
 </soapenv:Body>
</soapenv:Envelope>
===================================RESPONSE======================================
Out message: <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/">
 <SOAP-ENV:Body SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
  <ns1:txtcompnameResponse xmlns:ns1="urn:WSLim5APIntf-IWSLim5AP">
   <return xsi:type="xsd:string">S11 Group PCL. </return>
  </ns1:txtcompnameResponse>
 </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
S11 Group PCL. 
file:/Users/pac/IdeaProjects/S11/target/classes/attachment.png
Uploading...
============================= REQUEST ============================================
In message: <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
 <soapenv:Body>
  <ns1:IMGsd soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/" xmlns:ns1="urn:WSLim5APIntf-IWSLim5AP">
   <xctxt xsi:type="xsd:string">SendOK</xctxt>
   <xattach href="cid:2EDBFFC731158C37F50844E69C6ECD3C" xsi:type="ns2:DataHandler" xmlns:ns2="http://xml.apache.org/xml-soap"/>
  </ns1:IMGsd>
 </soapenv:Body>
</soapenv:Envelope>
```
