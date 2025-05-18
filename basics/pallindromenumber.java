
public class pallindromenumber {

     public static void main(String[] args) {

          System.out.println(pallindrome(5055));
          

     }

     public static boolean pallindrome(int num){

          int n=num;
          int reverse=0;
          while(n>0){
               int unit=n%10;
               reverse=reverse*10+unit;
               n=n/10;
          }

          if(reverse==num){
               return true;
          }

          return false;


     }     
}
