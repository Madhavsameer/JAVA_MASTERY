public class prime {

     public static void main(String[] args) {

          System.out.println(primeCheck(19));
          
     }

     public static boolean primeCheck(int n){
          for(int i=2; i<n;i++){
               if(n%i==0){
                    return false;
               }
          }

          return true;
     }
}