package recursion;

public class fibbonaci {
     

     public static void main(String[] args) {
          

     }

     public static void fib(int n, int first, int second){
          
          int third=first+second;
          System.out.println(first,second,third);

          fib(n, second, third);
     }
}
