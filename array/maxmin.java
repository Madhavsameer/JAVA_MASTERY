
public class maxmin {

     public static void main(String[] args) {

          int arr[]={5,6,7,9,3,2,4,7};
          
          int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;

          for(int i=0; i<arr.length; i++){
               if(arr[i]>max){
                    max=arr[i];
               }
               if(arr[i]<min){
                    min=arr[i];
               }
          }

          System.out.println("Largest Element: "+max);
          System.out.println("Smallest Element: "+min);
     }
     
}
