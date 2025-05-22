import java.util.HashMap;

public class mostfrequent {
     public static void main(String[] args) {

          mostFrequentChar("my name is madhav");
          

     }

     public static void mostFrequentChar(String str){

          HashMap <Character, Integer> hs= new HashMap<>();
          
          char str1[]=str.toCharArray();
          for(char c:str1){

               if(c==' '){
                    continue;
               }
               int count=1;
               if(hs.containsKey(c)){
                    hs.put(c, hs.get(c)+1);
               }
               else{
                    hs.put(c, count);
               }
          }

          System.out.println(hs);


           char maxChar = ' ';
          int maxFreq = 0;
          for (char key : hs.keySet()) {
            if (hs.get(key) > maxFreq) {
                maxFreq = hs.get(key);
                maxChar = key;
            }
        }

        System.out.println("Character frequencies: " + hs);
        System.out.println("Most frequent character: '" + maxChar + "' with frequency " + maxFreq);
          
     }
}
