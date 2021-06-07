package JavaURLConnection;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ShowImageFromURL {
	public static void main(String[] args) {
		show("http://www.avajava.com/images/avajavalogo.jpg");
	}
	 public static void show(String urlLocation) {
	        Image image = null;
	        try {
	            URL url = new URL(urlLocation);
	            URLConnection conn = url.openConnection();
	            conn.setRequestProperty("User-Agent", "Mozilla/5.0");

	            conn.connect();
	            InputStream urlStream = conn.getInputStream();
	            image = ImageIO.read(urlStream);

	            JFrame frame = new JFrame();
	            JLabel lblimage = new JLabel(new ImageIcon(image));
	            frame.getContentPane().add(lblimage, BorderLayout.CENTER);
	            frame.setSize(image.getWidth(null) + 50, image.getHeight(null) + 50);
	            frame.setVisible(true);

	        } catch (IOException e) {
	            System.out.println("Something went wrong, sorry:" + e.toString());
	            e.printStackTrace();
	        }
	    }
}
