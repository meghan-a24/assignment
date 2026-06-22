import java.util.function.Supplier;
public class Supplier1 {
    public static void main(String[] args) {
        Supplier<String> name = () ->"meghana"; 
        System.out.println(name.get()); 
    }
}
