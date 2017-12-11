package dennis.Service;

import javax.xml.ws.Endpoint;

public class AreaServer {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:12345/area",new AreaServiceInterfaceImpl());
    }
}
