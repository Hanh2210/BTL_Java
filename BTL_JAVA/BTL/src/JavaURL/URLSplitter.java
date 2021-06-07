package JavaURL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLSplitter {
	public static void main(String[] args) {
		try {
		 URL u = new URL("http://java.sun.com");
		 System.out.println("The URL is " + u);
		 System.out.println("The scheme is " + u.getProtocol());  //trả về protocol của url đó
		 System.out.println("The user info is " + u.getUserInfo()); //trả về username
		 String host = u.getHost();                                 //trả về tên máy chủ
		if (host != null) {
		 int atSign = host.indexOf('@');
		if (atSign != -1) host = host.substring(atSign + 1);
		 System.out.println("The host is " + host);
		 }
		else {
		 System.out.println("The host is null.");
		 }
		 System.out.println("The port is " + u.getPort());     //trả về cổng đc sd
		 System.out.println("The path is " + u.getPath());     //java 1.3 trả về đường dẫn đến file, thường là 1 query string
		 System.out.println("The ref is " + u.getRef());       //Trả về phần reference của URL đó
		 System.out.println("The query string is " + u.getQuery()); //Java 1.3 trả về một query string trong URL
		 } // end try
		catch (MalformedURLException ex) {
		 System.err.println("is not a URL I understand.");
		 }
		 System.out.println();
	} // end main
}// end URLSplitter
