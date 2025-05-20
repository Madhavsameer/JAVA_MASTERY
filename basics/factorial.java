public class factorial {

     public static void main(String[] args) {

         
          System.out.println(fact(5));
          

     }

     public static int fact(int n){

          int i=2;
          int fact=1;
          if(n==0 || n==1) return 1;

          while(i<=n){
               fact*=i;
               i++;
          }

          return fact;
     }
}