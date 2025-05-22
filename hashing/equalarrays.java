import java.util.HashSet;

public class equalarrays {

     public static void main(String[] args) {
          
          int arr1[]= {1,2,3,4,5,7,9,8,6};
          int arr2[]={2,1,3,5,4,6,7,9,8};
          
          System.out.println(equalornot(arr1, arr2));






     }

     public static boolean equalornot(int arr1[], int arr2[]){

          HashSet <Integer> hs1= new HashSet<>();
          HashSet <Integer> hs2= new HashSet<>();

          if(arr1.length!=arr2.length){
               return false;
          }
          

          for(int i:arr1){

               hs1.add(i);

          }
          for(int i:arr2){
               hs2.add(i);
          }

          if(hs1.equals(hs2)){
               return true;
          }

          return false;
     }
}