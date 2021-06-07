package JavaURL;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class DownloadFileFromURL {
	public static void main(String[] args) {
//		try {
//			InputStream in = new URL("https://www.geeksforgeeks.org/reading-url-using-urlconnection-class/").openStream();
//		Files.copy(in, Paths.get("source_code.txt"), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
		try (BufferedInputStream in = new BufferedInputStream(
				new URL("https://www.geeksforgeeks.org/reading-url-using-urlconnection-class/").openStream());
				FileOutputStream fileOutputStream = new FileOutputStream("source_code2.txt")) {
			byte dataBuffer[] = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				fileOutputStream.write(dataBuffer, 0, bytesRead);
			}
		} catch (IOException e) {
			// handle exception
		}
	}
}
