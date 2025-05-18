

public class LinearSearch {

     public static void main(String[] args) {
          int arr[]={1,2,8,9,7,6,5};
          int target=3;
          for(int i=0; i<arr.length; i++){

               if(arr[i]==target){
                    System.out.println("Target element "+target+" found at "+i+" index");
                    return;
               }

          }
          System.out.println("Target Element not found in the given array");
     }
     
}
