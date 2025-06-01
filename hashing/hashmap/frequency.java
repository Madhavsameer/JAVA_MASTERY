import java.util.HashMap;

public class frequency {
     public static void main(String[] args) {

          HashMap <Character, Integer> hs= new HashMap<>();

          String str= "sameer";
         

          for(int i=0; i<str.length(); i++){
               if(hs.containsKey(str.charAt(i))){
                    hs.put(str.charAt(i), hs.get(str.charAt(i))+1);
               }
               else{
                    hs.put(str.charAt(i), 1);
               }
          }

          System.out.println(hs);
          
     }
}
