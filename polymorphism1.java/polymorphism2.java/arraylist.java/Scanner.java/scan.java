import java.util.Scanner;
public class scan{
    public static void main(String[]args){
        Scanner Scan=new Scanner(System.in);
        System.out.println("enter your mobile number:");
        Long num=Scan.nextLong();
        System.out.println("Your mobile number is:"+num);

    }
}