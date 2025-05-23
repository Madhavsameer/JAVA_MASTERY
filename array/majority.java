import java.util.HashMap;

public class majority {

     public static void main(String[] args) {
          int arr[]={1,2,3,2,4,5,6,5,3,2};
          majority(arr);
     }

     public static void majority(int arr[] ){
          HashMap <Integer,Integer> hs= new HashMap<>();
          for(int i:arr){
               if(hs.containsKey(i)){
                    hs.put(i,hs.get(i)+1);
               }
               else{
                    hs.put(i, 1);
               }

          }
          System.out.println(hs);

          int n = arr.length;
        boolean found = false;

        for (int key : hs.keySet()) {
            if (hs.get(key) > n / 2) {
                System.out.println("Majority element: " + key);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No majority element found.");
        }
    
     }
}