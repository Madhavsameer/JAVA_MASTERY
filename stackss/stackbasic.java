import java.util.Stack;

public class stackbasic {

     public static void main(String[] args) {



          
          String str="madam";
          
          System.out.println(checkPallindrome(str));
        
        

     }

     public static boolean checkPallindrome(String str){

          Stack <Character> sk= new Stack<>();


         for(int i=0; i<str.length(); i++){
          sk.push(str.charAt(i));
         }
         System.out.println(sk);
         int n=0;


         while (!sk.isEmpty()) {
          
          if(str.charAt(n)!=sk.peek()){
               return false;
          }
          
          n++;
          sk.pop();
         }

         return true;

     }
     
}
