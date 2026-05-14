public class methods{
    public static void main(String[]args)
{
    System.out.println(iseven(17));
    System.out.println(isodd(17));

}public static boolean iseven(int number){
    return number % 2 == 0;
}public static boolean isodd(int number){
    return number % 2 == 1;}}