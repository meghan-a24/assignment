public class student{
    public static void main(String[]args){
        int[][] m={{47,67,54},{45,6,7}};      
        int highesttotal=0;
        int topper=0;
        int total=0;
        for(int i=0;i<m.length;i++){
        for(int j=0;j< m[i].length;j++){
            total=total+m[i][j];
        } if(total>highesttotal){
            highesttotal=total;
            topper=i;}
        System.out.println("Student:"+i);
        System.out.println("totalmarks:"+total);
        System.out.println("avg:"+(double)total/m[i].length);
        System.out.println("highestTotal:"+highesttotal);
        System.out.println("Topper:"+topper);
}}}