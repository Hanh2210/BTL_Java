package JavaURL;

import java.net.MalformedURLException;
import java.net.URL;

public class ProtocolTester {
	
	public static void main(String[] args) {
		testProtocol("http://www.adc.org"); // hypertext transfer protocol
		testProtocol("https://www.amazon.com/exec/obidos/order2/"); // secure http
		 // file transfer protocol
		testProtocol("ftp://metalab.unc.edu/pub/languages/java/javafaq/");
		testProtocol("mailto:elharo@metalab.unc.edu"); // Simple Mail Transfer Protocol
		testProtocol("telnet://dibner.poly.edu/"); // telnet
		testProtocol("file:///etc/passwd"); // local file access
		testProtocol("gopher://gopher.anc.org.za/"); // gopher
		testProtocol( // Lightweight Directory Access ProtocolTrang 172
		 "ldap://ldap.itd.umich.edu/o=University%20of%20Michigan,c=US?postalAddress");
		testProtocol( // JAR
		"jar:http://cafeaulait.org/books/javaio/ioexamples/javaio.jar!"
		+ "/com/macfaq/io/StreamCopier.class");
		testProtocol("nfs://utopia.poly.edu/usr/tmp/"); // NFS, Network File System
		testProtocol("jdbc:mysql://luna.metalab.unc.edu:3306/NEWS");
		 // a custom protocol for JDBC
		 // rmi, a custom protocol for remote method invocation
		testProtocol("rmi://metalab.unc.edu/RenderEngine");
		testProtocol("doc:/UsersGuide/release.html"); // custom protocols for HotJava
		testProtocol("netdoc:/UsersGuide/release.html");
		testProtocol("systemresource://www.adc.org/+/index.html");
		testProtocol("verbatim:http://www.adc.org/");
		try {
			 URL u = new URL("http", "localhost", 8080, "/index.html");
			 // trỏ đến địa chỉ http://localhost:8080/index.html
			}
			catch (MalformedURLException ex) {
			 System.err.println(ex);
		}
		try {
			 URL u1 = new URL("http://www.ibiblio.org/javafaq/index.html");
			 URL u2 = new URL (u1, "mailinglists.html");
			}
			catch (MalformedURLException ex) {
			 System.err.println(ex);
			}
	}
	private static void testProtocol(String url) {
		try {
			URL u = new URL(url);
			System.out.println(u.getProtocol() + " is supported");
		} catch (MalformedURLException e) {
			// TODO: handle exception
			String protocol = url.substring(0,url.indexOf(":"));
			System.out.println(protocol + " is not supported");
		}
	}
}
