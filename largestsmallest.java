public class largestsmallest{
    public static void main (String[]args){
int[] a={2,4,5,-6,7,-3};
int largest=0;
int smallest=0;
  for(int i=1;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }else if(a[i]<smallest){
                smallest=a[i];
            }
        }System.out.println("largest element:"+largest);
        System.out.println("smallest element:"+smallest);  }
           }


  