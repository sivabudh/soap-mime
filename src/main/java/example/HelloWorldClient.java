package example;

import mypackage.IWSLim5APserviceLocator;
import org.apache.axis.*;
import org.apache.axis.client.AxisClient;
import org.apache.axis.configuration.SimpleProvider;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.i18n.Messages;
import org.apache.axis.transport.http.HTTPSender;
import org.apache.axis.transport.http.HTTPTransport;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

class AxisLogHandler extends BasicHandler {
    private static final long serialVersionUID = 1L;

    @Override
    public void invoke(MessageContext msgContext) throws AxisFault {
        try {
            logMessage(msgContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void logMessage(MessageContext msgContext) throws Exception {
        Message inMsg = msgContext.getRequestMessage();
        Message outMsg = msgContext.getResponseMessage();
        if (outMsg == null) {
            System.out.println("============================= REQUEST ============================================");
            System.out.println(Messages.getMessage("inMsg00", (inMsg == null ? "" : inMsg.getSOAPEnvelope().getAsString())));
        } else {
            System.out.println("===================================RESPONSE======================================");
            System.out.println(Messages.getMessage("outMsg00", (outMsg == null ? "" : outMsg.getSOAPEnvelope().getAsString())));
        }
    }

    @Override
    public void onFault(MessageContext msgContext) {
        super.onFault(msgContext);
        try {
            logMessage(msgContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class HelloWorldClient {
    private static SimpleProvider configureAxisLogger() {
        SimpleProvider clientConfig = new SimpleProvider();
        AxisLogHandler logHandler = new AxisLogHandler();
        SimpleChain reqHandler = new SimpleChain();
        SimpleChain respHandler = new SimpleChain();
        reqHandler.addHandler(logHandler);
        respHandler.addHandler(logHandler);
        Handler pivot = new HTTPSender();
        Handler transport = new SimpleTargetedChain(reqHandler, pivot, respHandler);
        clientConfig.deployTransport(HTTPTransport.DEFAULT_TRANSPORT_NAME, transport);
        return clientConfig;
    }

    public static void main(String[] argv) {
        try {
            var service = new IWSLim5APserviceLocator();
            var clientConfig = configureAxisLogger();
            service.setEngineConfiguration(clientConfig);
            service.setEngine(new AxisClient((clientConfig)));

            var port = service.getIWSLim5APPort();
            var txtcompnameResult = port.txtcompname();
            System.out.println(txtcompnameResult);

            var attachmentPath = HelloWorldClient.class.getResource("/attachment.png");
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
