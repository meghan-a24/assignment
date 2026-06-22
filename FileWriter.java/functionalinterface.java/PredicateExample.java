import java.util.function.Predicate;
public class PredicateExample {
    public static void main(String[]args){
    Predicate<String> p1 = name -> name.length()>7;
    System.out.println(p1.test("meghana"));
    System.out.println(p1.test("vihaa"));

}}
