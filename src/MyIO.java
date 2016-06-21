
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adicom
 */
public class MyIO {

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

    public static String[] readFile() {
        ArrayList<String> aList = new ArrayList<String>();
        try {
            FileInputStream fstream = new FileInputStream("persons.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                aList.add(strLine);
            }

            //Close the input stream
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] str = new String[aList.size()];
        str = aList.toArray(str);
        return str;
    }
    
    public static void clearFile() {
        FileOutputStream writer = null;
        try {
            writer = new FileOutputStream("persons.txt");
            writer.write(("").getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException ex) {
             Logger.getLogger(MyIO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(MyIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
