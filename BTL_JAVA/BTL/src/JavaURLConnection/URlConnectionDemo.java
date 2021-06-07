package JavaURLConnection;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

public class URlConnectionDemo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.geeksforgeeks.org/reading-url-using-urlconnection-class/");
			URLConnection connection = url.openConnection();
			InputStream inputStream = connection.getInputStream();
			
			int i = inputStream.read();
			while(i != -1) {
				System.out.print((char)i);
				i = inputStream.read();
			}
			
//			InputStream inputStream = connection.getInputStream();
//			InputStreamReader reader = new InputStreamReader(inputStream);
//			BufferedReader bufferedReader = new BufferedReader(reader);
//			String i;
//			while((i = bufferedReader.readLine()) != null) {
//				System.out.println(i);
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
