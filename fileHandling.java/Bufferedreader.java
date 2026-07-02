import java.io.FileReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
public class Bufferedreader{ 
    public static void main(String[] args) { 
        try { 
            BufferedReader br = new BufferedReader(new FileReader("meghana.txt")); 
            String line; 
            while ((line = br.readLine()) != null) { 
                System.out.println(line); 
            } 
            br.close(); 
        } catch (IOException e) { 
            System.out.println("Error: " + e.getMessage()); }}}