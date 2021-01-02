package eberthClient;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    ISimpleInterface mSOAP;

    public void Client() throws MalformedURLException {
        Service service = Service.create(
                new URL("http://localhost:8081/HelloWorld?wsdl"),
                new QName("http://service.jaxws.vis.mc.fhooe.at/",
                        "HelloWorldService"));
        mSOAP = service.getPort(ISimpleInterface.class);
        )
    }


    public static void main(String[] args) {

    }
}
