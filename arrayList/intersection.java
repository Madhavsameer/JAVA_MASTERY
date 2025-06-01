import java.util.ArrayList;

public class intersection {

     public static void main(String[] args) {
          
          ArrayList <Integer> list1= new ArrayList<>();
          ArrayList <Integer> list2= new ArrayList<>();

          for(int i=1; i<=10; i++){
               list1.add(i);
          }

          for(int i=5; i<20; i++){
               list2.add(i);
          }

          for(int i=1; i<=Integer.MAX_VALUE; i++){
               for(int j=1; j<Integer.MAX_VALUE; j++){
                    if(list1.contains(i) && list2.contains(j)){
                         System.out.println(j);
                    }

                    
               }
          }



     }
     
}
