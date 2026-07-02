import java.io.File;   
import java.io.IOException; 
public class createfile{ 
     public static void main(String[] args) { 
        try { 
File myFile = new File("meghana.txt"); 
        if (myFile.createNewFile()) { 
        System.out.println("File created: " + myFile.getName());
            } else { 
         System.out.println("File already exists."); 
         } 
        } catch (IOException e) { 
System.out.println("An error occurred: " + e.getMessage()); 
        } 
    } 
} 

