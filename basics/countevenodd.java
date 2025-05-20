public class countevenodd {
     public static void main(String[] args) {

          ceo(477855356);
          
     }

     public static void ceo(int n){
          int even=0;
          int odd=0;

          while (n>0) {

               int unit=n%10;
               n=n/10;

               if(unit%2==0){
                    even++;
               }
               else{
                    odd++;
               }
               
          }
          System.out.println("Number of Even digits: "+even);
          System.out.println("Number of Odd digits: "+odd);
     }
}
