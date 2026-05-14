public class methods{
    public static void main(String[]args)
{
    System.out.println(square(17));
    System.out.println(cube(17));
    System.out.println(largest(17,5));
    
}public static  int square(int number){
    return number*number;

} public static  int cube(int number){
    return number*number*number;
}public static  int largest(int a,int b){
    if (a>b){
        return a;
    }else{
        return b;}}}