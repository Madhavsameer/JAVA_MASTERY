import java.util.HashMap;
import java.util.logging.Handler;

public class twice {
     public static void main(String[] args) {
          
          int arr[]={5,4,1,2,3,1,3,7,5,8,5,6,4};
          HashMap <Integer, Integer> hs= new HashMap<>();

          for(int i:arr){
              if(hs.containsKey(i)){
               hs.put(i, hs.get(i)+1);
               System.out.println(i);
              }
              else{
               hs.put(i, 1);
              }

          }
     }
}
