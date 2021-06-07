package JavaURL;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class SourcViewer {
	public static void main(String[] args) {
		try { //Open the URL for reading
		 URL u = new URL("https://sv.dhcnhn.vn/");
		InputStream in = u.openStream(); // buffer the input to increase performance
		 in = new BufferedInputStream(in); // chain the InputStream to a Reader
		 Reader r = new InputStreamReader(in);
		 int c;
		while ( (c = r.read()) != -1) {
		 System.out.print( (char) c);
		 }
		 }
		catch (MalformedURLException ex) {
		 System.err.println("is not a parseable URL");
		 }
		catch (IOException ex) {
		 System.err.println(ex);
		 }
	} // end main 
}// end SourceViewer
