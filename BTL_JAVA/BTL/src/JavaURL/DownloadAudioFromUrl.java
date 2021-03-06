package JavaURL;
import java.net.*;

import javax.sound.sampled.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
public class DownloadAudioFromUrl {
	public static void main(String[] args) throws Exception {
        URL url = new URL(
            "https://file-examples-com.github.io/uploads/2017/11/file_example_WAV_1MG.wav");
        Clip clip = AudioSystem.getClip();  //lấy ra audio
        // getAudioInputStream() also accepts a File or InputStream
        AudioInputStream ais = AudioSystem.
            getAudioInputStream( url );
        clip.open(ais);                //mở audio
        clip.loop(Clip.LOOP_CONTINUOUSLY);  // sử dụng vòng lặp để chạy audio
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // A GUI element to prevent the Clip's daemon Thread
                // from terminating at the end of the main()		
                JOptionPane.showMessageDialog(null, "Close to exit!");      
            }
        });
    }
}
