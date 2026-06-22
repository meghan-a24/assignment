import java.util.function.Function;
public class functionExample {
    public static void main(String[]args){
    Function<String,Integer> f1=name->name.length();
    Function<String,String>f2=name->name.toUpperCase();

System.out.println(f1.apply("meghana"));
System.out.println(f2.apply("Puram meghana"));
    
}}
