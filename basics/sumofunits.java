public class sumofunits {
     public static void main(String[] args) {

          System.out.println(sumOfUnits(156));
          
     }

     public static int sumOfUnits(int n){

          int result=0;
          while (n>0) {
               int unit=n%10;
               result+=unit;
               n/=10;
               
          }

          return result;
     }
}
