import java.io.FileWriter; 
import java.io.BufferedWriter; 
import java.io.IOException; 
public class Bufferedwriter{ 
        public static void main(String[] args) { 
        try { 
            FileWriter fw = new FileWriter("employees.txt"); 
            BufferedWriter bw = new BufferedWriter(fw); 
            bw.write("Employee:meghana"); 
            bw.newLine(); 
            bw.write("Employee: vaishnavi"); 
            bw.newLine(); 
            bw.write("Employee: sathwika"); 
            bw.newLine(); 
            bw.write("Employee: sahastra"); 
            bw.close();
            System.out.println("Employee data saved!"); 
        } catch (IOException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
} 