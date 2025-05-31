import java.util.ArrayList;

public class reverse {
     public static void main(String[] args) {
          


          ArrayList <Integer> list = new ArrayList<>();

          list.add(5);
          list.add(7);
          list.add(9);
          list.add(3);
          list.add(6);
          list.add(2);
          list.add(8);


          System.out.println("My array list is :"+list);

          int start=0;
          int end=list.size()-1;

          while (start<=end) {

               list.set(start, list.get(end));
               start++;
               end--;
               
          }
          System.out.println(list);

     }
}
