import java.util.function.Supplier;
class Employee{
    String name;
    int age;
    String designation;
    public Employee(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }
}
public class SupplierExample {
        public static void main(String[]args)
{
Supplier<Employee>emp=()->new Employee("default",20,"developer");
Employee e1=emp.get();
Employee e2=emp.get();
System.out.println(e1.name);
System.out.println(e2.name);}}
