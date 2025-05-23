
public class factorial {

     public static void main(String[] args) {

         
          System.out.println(factorial(5));
          

     }

     public static int factorial(int n){

          int fact=n;
          if(n==1) return fact;

          return fact*(factorial(n-1));
     }


     
}
