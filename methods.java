public class methods{
    public  static void add(int a,int b,int c){
        int sum=a+b+c;p
        System.out.println("sum:"+sum);
    }
public  static void multiplication(int a,int b){
    int multi=a*b;
    System.out.println("multi:"+multi);
}
public  static void division(int a,int b){
    int div=a%b;
    System.out.println("div:"+div);
}
    public  static void main(String[] args){
        add(10,2,3);
        multiplication(2,4);
        division(3,2);
    }
    
}