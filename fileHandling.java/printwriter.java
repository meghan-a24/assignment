import java.io.PrintWriter; 
import java.io.IOException; 
public class printwriter{ 
        public static void main(String[] args) { 
        try { 
            PrintWriter pw = new PrintWriter("hospital_records.txt"); 
            pw.println("Patient:vihaa");  
            pw.println("Age: 23"); 
            pw.println("Diagnosis: fever"); 
            pw.println("---");  
            pw.println("Patient: mayaa"); 
            pw.println("Age: 22"); 
            pw.println("Diagnosis: Headache"); 
            pw.close(); 
            System.out.println("Hospital records saved!"); 
        } catch (IOException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
} 
    
