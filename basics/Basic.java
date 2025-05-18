package basics;
import java.util.ArrayList;
import java.util.Scanner;

public class Basic {

     public static void main(String[] args) {

          
          long age=15;
          int newage=(int)age;//Explicit type casting
          System.out.println(newage);
          

          // Basic bs1= new Basic("Aditya", 22,false , 'M');
          // Scanner sc= new Scanner(System.in);
          // System.out.println("Enter your name: ");
          // String name=sc.nextLine();
          // System.out.println("Enter your Age: ");
          // int age=sc.nextInt();
          // System.out.println("Are you Graduate? ");
          // boolean isGraduate=sc.nextBoolean();
          // System.out.println("Enter your Gender: ");
          // char gender=sc.next().charAt(0);
          // Basic bs= new Basic(name, age, isGraduate, gender);
          
          primeNumbers(3, 100);

          

     }
     public Basic(String name, int age, boolean isGraduate, char gender){
          System.out.println("Welcome "+name+" Your age is "+age+" Your graduation status is "+isGraduate+" your gender is "+gender);
     }

     public static void primeNumbers(int start, int end){
          ArrayList <Integer> primes= new ArrayList<>();

          for(int i=start; i<=end; i++){

               if(isPrime(i)){
                    primes.add(i);
               }
          }
          System.out.println(primes);

          

          
     }
     public static boolean isPrime(int n){
               for(int i=2; i<n; i++){
                    if(n%i==0){
                         return false;
                    }
               }

               return true;
          }

     

}
