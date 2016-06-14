
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adicom
 */
public class MyIO {
    FileWriter out;
    FileReader in;

    public MyIO() {
        
    }
    
    public static void writeFile(String str) {
        BufferedWriter bw = null;

        try {
            // APPEND MODE SET HERE
            bw = new BufferedWriter(new FileWriter("persons.txt", true));
            bw.write(str);
            bw.newLine();
            bw.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {                       // always close the file
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ioe2) {
                    // just ignore it
                }
            }
        }
    }
}