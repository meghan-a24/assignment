import java.util.Scanner;
public class studentinfo{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
    System.out.println("enter your name:");
    String name=Scan.nextLine();
    System.out.println("enter your village:");
    String village=Scan.nextLine();
    System.out.println("enter your age:");
    int age=Scan.nextInt();
    System.out.println("enter your year:");
    int year=Scan.nextInt();
    System.out.println("enter your percentage:");
    double percentage=Scan.nextDouble();
    System.out.println("enter your phone number:");
    long phnnumber=Scan.nextLong();
    System.out.println("name:"+name);
    System.out.println("vlg:"+village);
    System.out.println("age:"+age);
    System.out.println("percentage:"+percentage+"%");
    System.out.println("year:"+year);
    System.out.println("phn no.:"+phnnumber);
    }}