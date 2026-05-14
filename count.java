public class count{
    public static void main(String[]args){
        int[] a={4,5,6,7,4,2};
        int counteven=0;
        int countodd=0;
        for(int a1:a){
            if(a1%2==0){
                counteven++;
            }else{
                 countodd++;
            }
        }System.out.println("number of even numbers:"+counteven);
        System.out.println("NUmber of odd numbers:"+countodd);    }
}