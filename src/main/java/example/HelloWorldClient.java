package example;

import mypackage.IWSLim5APserviceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            var service = new IWSLim5APserviceLocator();
            var port = service.getIWSLim5APPort();
            var txtcompnameResult = port.txtcompname();
            System.out.println(txtcompnameResult);

            var attachmentPath = HelloWorldClient.class.getResource("/attachment.jpg");
            System.out.println(attachmentPath);

            var fileDataSource = new javax.activation.FileDataSource(attachmentPath.toString());
            var dataHandler = new javax.activation.DataHandler(fileDataSource);

            System.out.println("Uploading...");

            var IMGsdResult = port.IMGsd("SendOK", dataHandler);
            System.out.println(IMGsdResult);

            System.out.println("Finished!");
        } catch (ServiceException | RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
