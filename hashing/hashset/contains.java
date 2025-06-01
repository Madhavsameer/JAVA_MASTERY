
import java.util.HashSet;

public class contains {
     

     public static void main(String[] args) {

          HashSet <Integer> hs= new HashSet<>();

          hs.add(5);
          hs.add(7);
          hs.add(9);
          hs.add(3);
          hs.add(2);
          hs.add(8);

          if(hs.contains(8)) System.out.println("Element exists");
          else{
               System.out.println("Element does not exist");
          }

          

     }


}
