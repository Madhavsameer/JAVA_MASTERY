public class containsduplicate {
     public static void main(String[] args) {

          int arr[]={1,6,2,3,4,5,6,7,8};
          System.out.println(check(arr));
          
     }

     public static boolean check(int arr[]){

          for(int i=0; i<arr.length;i++){
               for(int j=i+1; j<arr.length;j++){
                    if(arr[i]==arr[j]){
                         return true;
                    }
                    
               }
          }
          return false;
     }
}
