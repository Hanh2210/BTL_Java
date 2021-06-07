package JavaURL;
import java.net.*;
import java.io.*;
public class SaveImageFromURL {
	public static void main(String[] args) throws Exception {
	    String imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
	    String destinationFile = "image.jpg";

	    saveImage(imageUrl, destinationFile);
	}

	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
	    URL url = new URL(imageUrl);
	    InputStream is = url.openStream();  // mở 
	    OutputStream os = new FileOutputStream(destinationFile);  //lưu file

	    byte[] b = new byte[2048];
	    int length;

	    while ((length = is.read(b)) != -1) {
	        os.write(b, 0, length);
	    }

	    is.close();
	    os.close();
	}
}
