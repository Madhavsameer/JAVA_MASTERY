import java.util.HashSet;

public class uniquechars {
     public static void main(String[] args) {
          

          HashSet <Character> hs= new HashSet<>();

          String str="programming";
          char []arr= str.toCharArray();

          for(char c:arr){
               hs.add(c);
          }
          System.out.println("The number of unique chars is given String is "+hs.size());
     }
}
