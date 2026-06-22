import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[]args){
        Consumer<String> c1=name->System.out.println("NAME:"+name);
        c1.accept("Meghana");
        Consumer<String>upperprinter=name->System.out.println(name.toUpperCase());
        Consumer<String>combined=c1.andThen(upperprinter);
    combined.accept("vihaa");   }
    
}
