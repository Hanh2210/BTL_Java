package JavaURL;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class URLProxy {
	
	public static void main(String args[]) throws Exception {
        URL u = new URL("http://www.yourserver.com:80/abc/demo.htm");
        System.out.println("The URL is " + u);
        System.out.println("The file part is " + u.getFile());
        u.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.1.1.10",10))); 
                                                         // java 7 -> địa chỉ ip, cổng
    }
}
