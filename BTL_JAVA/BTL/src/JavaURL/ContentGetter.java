package JavaURL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ContentGetter {
	public static void main(String[] args) {
		 //Open the URL for reading
		try {
		 URL u = new URL("https://sv.dhcnhn.vn/");
		try {
		 Object o = u.getContent();
		 System.out.println("I got a " + o.getClass().getName());
		 } // end try
		catch (IOException ex) {
		 System.err.println(ex);
		 }
		 } // end try
		catch (MalformedURLException ex) {
		 System.err.println("is not a parseable URL");
		 }
		 } // end main
} // end ContentGetter
