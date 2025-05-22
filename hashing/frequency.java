import java.util.Arrays;
import java.util.HashMap;

public class frequency {
     public static void main(String[] args) {

          int arr[]={1,5,4,6,5,2,2,8,3,2};
          

          findfreq(arr);
          
     }

     public static void findfreq(int arr[]){

          HashMap <Integer, Integer> hs= new HashMap<>();
          
          for(int i:arr){
               int freq=1;
               
               if(hs.containsKey(i)){
                    hs.put(i, hs.get(i)+1);
               }

               else{
                    hs.put(i, freq);
               }
          }

          System.out.println(hs);
     }


}
