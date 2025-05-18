
public class ArraySum {

     public static void main(String[] args) {
          
          int arr[]={5,7,8,9,5,4,3};
          System.out.println(arraySum(arr));
          

     }

     public static int arraySum(int arr[]){
          int sum=0;

          for(int i=0; i<arr.length; i++){
               sum+=arr[i];
          }

          return sum;
     }
     
}
