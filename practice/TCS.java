public class TCS {
     public static void main(String[] args) {

          
          reverseString("Sameer");
          System.out.println(isPrime(17));
          primes(1, 100);
          
     }

     public static void reverseString(String str){
          String res="";
          for(int i=0; i<str.length(); i++){
               res=str.charAt(i)+res;
          }

          System.out.println("Reverse String is "+res);
     }

     public static boolean isPrime(int n){
          for(int i=2; i<=Math.sqrt(n); i++){
               if(n%i==0){
                    return false;
               }
          }

          return true;
     }

     public static void primes(int start, int end){

          while (start<=end) {

               if (isPrime(start)) {

                    System.out.println(start);
                    
               }

               start++;
               
          }

     }

     
}
