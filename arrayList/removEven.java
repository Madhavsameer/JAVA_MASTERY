import java.util.ArrayList;

public class removEven {

     public static void main(String[] args) {
          
          ArrayList <Integer> list= new ArrayList<>();

          for(int i=1; i<=100; i++){
               list.add(i);
          }

          for(int i=1; i<list.size(); i++){
               if(list.get(i)%2==0){
                    list.remove(i);

               }
          }
          System.out.println(list);
     }
     
}
