import java.util.*;

public class ComparatorExample {
        public static void main(String[]args){
            List<String> names = Arrays.asList("meghana","vihaa","Keerthana"); 
Collections.sort(names,(a,b)->a.compareTo(b));
System.out.println(names);
  
            
        }
}
