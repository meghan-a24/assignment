import java.io.FileWriter; 
import java.io.IOException; 
public class filewrite{ 
        public static void main(String[] args) { 
        try { 
 FileWriter writer = new FileWriter("studentslist.txt"); 
            writer.write("Student Name: meghana\n"); 

            writer.write("Student Name: bhavitha\n"); 

            writer.write("Student Name: rajasri\n");
            writer.close(); 

            System.out.println("Data written successfully!"); 

        } catch (IOException e) { 

            System.out.println("Error: " + e.getMessage()); 

        } 

    } 

} 
