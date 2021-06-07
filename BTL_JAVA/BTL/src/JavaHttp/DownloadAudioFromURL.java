package JavaHttp;
import java.net.*;
import java.io.*;

public class DownloadAudioFromURL {
	public static void main(String[] args) {
		try{
//            String word="〜のそばに";
//            word=java.net.URLEncoder.encode(word, "UTF-8");
            URL url = new URL("https://file-examples-com.github.io/uploads/2017/11/file_example_WAV_1MG.wav");
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            urlConn.addRequestProperty("User-Agent", "Mozilla/4.76");
            InputStream audioSrc = urlConn.getInputStream();
            DataInputStream read = new DataInputStream(audioSrc);
            OutputStream outstream = new FileOutputStream(new File("mysound.mp3"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = read.read(buffer)) > 0) {
                    outstream.write(buffer, 0, len);                    
            }
            outstream.close();              
}catch(IOException e){
           System.out.println(e.getMessage());
}
	}
}
