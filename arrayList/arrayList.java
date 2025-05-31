import java.util.ArrayList;

public class arrayList {

     public static void main(String[] args) {

          ArrayList <Integer> mylist= new ArrayList<>();
          mylist.add(5);
          mylist.add(0, 3);
          System.out.println(mylist.getFirst());
          System.out.println(mylist.getLast());
          System.out.println(mylist.get(0));
          System.out.println(mylist.get(1));
          mylist.set(0, 7);
          System.out.println(mylist.size());
          System.out.println(mylist);
          mylist.remove(0);
          System.out.println(mylist.contains(7));
          mylist.clear();
          System.out.println(mylist);


          
          

     }


     
}
