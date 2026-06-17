import java.io.PrintWriter; 
import java.io.IOException; 
public class printwriter{ 
        public static void main(String[] args) { 
        try { 
            PrintWriter pw = new PrintWriter("hospital_records.txt"); 
            pw.println("Patient:ravi");  
            pw.println("Age: 45"); 
            pw.println("Diagnosis: Flu"); 
            pw.println("---"); // separator line 
            pw.println("Patient: Priya"); 
            pw.println("Age: 32"); 
            pw.println("Diagnosis: Headache"); 
            pw.close(); 
            System.out.println("Hospital records saved!"); 
        } catch (IOException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
} 
    
