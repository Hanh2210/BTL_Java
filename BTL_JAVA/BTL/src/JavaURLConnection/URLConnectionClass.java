package JavaURLConnection;

import java.net.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.io.*;

public class URLConnectionClass {
	public static void main(String[] args) throws Exception {
		try {
			URL url = new URL("https://sv.dhcnhn.vn");

			// open the connection to the above URL.
			URLConnection urlcon = url.openConnection();

			System.out.println(urlcon.getAllowUserInteraction());

			System.out.println(urlcon.getContentType());

			System.out.println(urlcon.getURL());

			System.out.println(urlcon.getDoInput());

			System.out.println(urlcon.getDoOutput());

			System.out.println(new Date(urlcon.getLastModified()));

			System.out.println(urlcon.getContentEncoding());

			// To get a map of all the fields of http header
			Map<String, List<String>> header = urlcon.getHeaderFields();

			// print all the fields along with their value.
			for (Map.Entry<String, List<String>> mp : header.entrySet()) {
				System.out.print(mp.getKey() + " : ");
				System.out.println(mp.getValue().toString());
			}
	
//            System.out.println();
//            System.out.println("Complete source code of the URL is-");
//            System.out.println("---------------------------------");
//              
//            //get the inputstream of the open connection.
//            BufferedReader br = new BufferedReader(new InputStreamReader
//                                                (urlcon.getInputStream()));
//            String i;
//              
//            //print the source code line by line.
//            while ((i = br.readLine()) != null) 
//            {
//                System.out.println(i);
//            }
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}
