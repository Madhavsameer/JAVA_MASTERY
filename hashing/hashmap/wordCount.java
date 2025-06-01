import java.util.HashMap;

public class wordCount {

     public static void main(String[] args) {

          String str= "this is a man this is boy who kept is old";
          String[] words = str.split(" ");
          HashMap <String,Integer> hs= new HashMap<>();
          for(String word:words){

               System.out.println(word);
               if(hs.containsKey(word)){
                    hs.put(word, hs.get(word)+1);
               }
               else{
                    hs.put(word, 1);
               }
          }

          System.out.println(hs);



          
          

     }


     
}
