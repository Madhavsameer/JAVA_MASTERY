import java.util.HashMap;
import java.util.HashSet;

public class nonrepeatingcharacter {
     public static void main(String[] args) {

          findNonRepeatingCharacter("my name is sameer");
          

     }

     public static void findNonRepeatingCharacter(String str) {
          HashMap <Character, Integer> hs= new HashMap<>();

          
          for(int i=0; i<str.length(); i++){

               if(str.charAt(i)==' '){
                    continue;
               }
               int count=1;

               if(hs.containsKey(str.charAt(i))){
                    hs.put(str.charAt(i),hs.get(str.charAt(i))+1 );
               }

               else{

                    hs.put(str.charAt(i),count );

               }
               
          }
          System.out.println(hs);

          for(char c:hs.keySet()){
               if(hs.get(c)==1){
                    System.out.println("First non repeating character is: "+c);
                    return;
               }
          }
     }
}
