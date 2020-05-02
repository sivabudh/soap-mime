package example;

import mypackage.IWSLim5APserviceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            var service = new IWSLim5APserviceLocator();
            var port = service.getIWSLim5APPort();
            var result = port.txtcompname();
            System.out.println(result);
        } catch (ServiceException | RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
