package eberthClient;

import eberthClient.generate.ISimpleInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    static ISimpleInterface mSOAP;

    public static void main(String[] args) throws MalformedURLException {
        Service service = Service.create(
                new URL("http://localhost:8081/HelloWorld?wsdl"),
                new QName("http://eberth/",
                        "HelloWorldService"));
        mSOAP = service.getPort(ISimpleInterface.class);

        System.out.println(mSOAP.saySomething());
    }
}
