
public class sumofdigits {

     public static void main(String[] args) {

          System.out.println(sumOfDigits(453,0));
          

     }

     public static int sumOfDigits(int n, int sum) {
          
          if(n<=0) return sum;
          int unit=n%10;
          sum+=unit;
          n=n/10;
          
          

          return sumOfDigits(n,sum);




     }
     
}
