public class calculator{
    int add(int a,int b){
        return a+b;
    }double add(double a,double b){
        return a+b;
    }int add(int a,int b, int c){
        return a+b+c;
    }public  static void main(string[]args){
        calculator C=new calculator();
        System.out.println(C.add(2,3));
        System.out.println(C.add(2.3,3.6));
        System.out.println(C.add(2,3,5));
    }
}