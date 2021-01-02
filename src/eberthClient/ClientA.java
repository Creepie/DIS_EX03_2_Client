package eberthClient;

import eberthClient.generate.HelloWorldService;
import eberthClient.generate.ISimpleInterface;

public class ClientA {

    public static void main(String[] args) {
        HelloWorldService srv = new HelloWorldService();

        ISimpleInterface soap = srv.getHelloWorldPort();
        System.out.println("server --> " + soap.saySomething());
    }
}
