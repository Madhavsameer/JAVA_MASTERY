import java.util.ArrayList;

public class fibonnaci {
     public static void main(String[] args) {
          fibb(10);
          
     }

     public static void fibb(int n){
          ArrayList <Integer> mylist= new ArrayList<>();
          if(n==0){
               mylist.add(0);
               System.out.println(mylist);
               return;

               
          }

          if(n==1){
               mylist.add(1);
               System.out.println(mylist);
               return;
          }

          else{
               mylist.add(0);
               mylist.add(1);
               int i=2;
               while(i<n){
                    mylist.add(mylist.get(i-1)+mylist.get(i-2));
                    i++;
               }
               System.out.println(mylist);
          }
     }
}
