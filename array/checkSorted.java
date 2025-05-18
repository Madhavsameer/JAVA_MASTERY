public class checkSorted {

     public static void main(String[] args) {

          int arr[]={1,2,8,3,4,5,6,7};
          System.out.println(check(arr));
          
     }

     public static boolean check(int arr[]){
          for(int i=1; i<arr.length; i++){
               if(arr[i]<arr[i-1]){
                    return false;
               }
          }

          return true;
     }
}