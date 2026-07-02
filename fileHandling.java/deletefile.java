import java.io.File;
public class deletefile{
    public static void  main(String[]args){
        File myFile=new File("meghana.txt");
             if (myFile.exists()) { 
            if (myFile.delete()) { 
                System.out.println("File deleted successfully!"); 
            } else { 
                System.out.println("Could not delete the file."); 
            } 
        } else { 
            System.out.println("file does not exist."); 

        } 

    } 
        }
    