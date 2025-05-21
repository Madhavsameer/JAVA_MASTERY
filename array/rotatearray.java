public class rotatearray {
     
     public static void main(String[] args) {
          int arr[]={1,2,3,4,5,6,7};

          rotateRight(arr, 2);
          
          
     }

     public static void rotateRight(int arr[], int k){
           int n=arr.length-1;
          k=k%n; //if k is greater than n
         

          reverse(arr, 0, n);
          reverse(arr, 0, k-1);q
          reverse(arr, k, n);

          for(int i:arr){
               System.out.print(i+" ");
          }




     }

     public static void reverse(int arr[], int i, int j){

          while(i<=j){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
          }


     }
}
