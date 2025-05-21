import java.util.HashSet;

public class removeduplicatecharacter {
     public static void main(String[] args) {

          
          System.out.println(removeDuplicates("sameer"));
          

     }

     public static String removeDuplicates(String str) {
          HashSet <Character> hs= new HashSet<>();

          for(int i=0; i<str.length(); i++){
               hs.add(str.charAt(i));
          }
          String res="";
          for(char c:hs){
               res+=c;
          }

          return res;

     }
}
