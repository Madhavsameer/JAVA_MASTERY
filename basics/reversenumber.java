public class reversenumber {
     public static void main(String[] args) {

          System.out.println(reverse(745));
          

          
     }

     public static int reverse(int n){

          int reverse=0;
          while(n>0){
               int unit=n%10;
               reverse=reverse*10+unit;
               n/=10;
          }

          return reverse;
     }
}
