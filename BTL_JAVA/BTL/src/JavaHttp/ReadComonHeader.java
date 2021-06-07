package JavaHttp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class ReadComonHeader {
	public static void main(String[] args) {
		try {
			String url = "https://sv.dhcnhn.vn";
			 
			URL urlObj = new URL(url);
			HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();
			 
			int responseCode = httpCon.getResponseCode();
			String responseMessage = httpCon.getResponseMessage();
			String contentType = httpCon.getContentType();
			String contentEncoding = httpCon.getContentEncoding();
			int contentLength = httpCon.getContentLength();
			 
			long date = httpCon.getDate();
			long expiration = httpCon.getExpiration();
			long lastModified = httpCon.getLastModified();
			 
			System.out.println("Response Code: " + responseCode);
			System.out.println("Response Message: " + responseMessage);
			System.out.println("Content Type: " + contentType);
			System.out.println("Content Encoding: " + contentEncoding);
			System.out.println("Content Length: " + contentLength);
			System.out.println("Date: " + new Date(date));
			System.out.println("Expiration: " + new Date(expiration));
			System.out.println("Last Modified: " + new Date(lastModified));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
