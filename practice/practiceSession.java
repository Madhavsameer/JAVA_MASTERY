import java.util.ArrayList;

public class practiceSession {


     public static void main(String[] args) {

         // System.out.println(isPrime(18));
         // System.out.println(factorial(5));
          //printFibb(5);
          // System.out.println(reverse(53685));
          // System.out.println(countDigits(87546));
         // System.out.println(pallNumber(141));

         int arr[]={4,8,9,5,3,2,7};
         int arr2[]={8,9,10,11,12};
         int arr3[]={4,0,5,7,5,0,6,8,9,0,5};
     //     maxMin(arr);
     // reverseArray(arr);
     // System.out.println(sum(arr));
     // System.out.println(isSorted(arr2));
     // rotateRight(arr2,2);
     // rotateLeft(arr2, 2);
     moveZeroes(arr3);



          

     }

     public static boolean isPrime(int n){
          for(int i=2; i<n; i++){
               if(n%i==0){
                    return false;
               }
          }

          return true;
     }

     public static int factorial(int n){

          int fact=1;
          for(int i=n; i>=1; i--){

               fact*=i;

          }

          return fact;
     }

     public static void printFibb(int n){
          ArrayList <Integer> myList= new ArrayList<>();

          if(n==0){
               myList.add(0);
               System.out.println(myList);
          }

          if(n==1){
               myList.add(0);
               myList.add(1);
               System.out.println(myList);
          }

          else{

               myList.add(0);
               myList.add(1);


               for(int i=2; i<n; i++){
                    myList.add(myList.get(i-1)+myList.get(i-2));

               }
               System.out.println(myList);
               
               
          }
     }

     public static int reverse(int n){

          int rev=0;
          while (n>0) {

               int unit=n%10;
               rev=rev*10+unit;
               n/=10;
               
          }
          return rev;
     }

     public static int countDigits(int n){
          int count=0;
          while (n>0) {

               n/=10;
               count++;

               
          }

          return count;
     }

     public static boolean pallNumber(int n){

          int temp=n;
          int rev=0;
          while (n>0) {
               int unit=n%10;
               n/=10;

               rev=rev*10+unit;

          }

          if(temp==rev){
               return true;
          }

          else{
               return false;
          }
     }

     public static void maxMin(int arr[]){

          int max=Integer.MIN_VALUE;
          int min= Integer.MAX_VALUE;

          for(int i=0; i<arr.length; i++){

               if(arr[i]>max){
                    max=arr[i];
               }

               if(arr[i]<min){
                    min=arr[i];
               }

          }

          System.out.println("Maximum number in the given array is :"+max);
          System.out.println("Minimum number in the given array is: "+min);
     }


     public static void reverseArray(int arr[]){
          int i=0;
          int j=arr.length-1;

          while (i<=j) {

               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
               
          }
          for (int num : arr) {
               System.out.print(num+" ");
          }
     }

     public static int sum(int arr[]){
          int sum=0;

          for(int i=0; i<arr.length;i++){
               sum+=arr[i];
          }

          return sum;
     }

     public static boolean isSorted(int arr[]){
          for(int i=1; i<arr.length; i++){
               if(arr[i]<arr[i-1]){
                    return false;
               }
          }

          return true;
     }

     public static void rotateRight(int arr[],int k){

          rotArr(arr, 0, arr.length-1);
          

          for (int j : arr) {
               System.out.print(j+" ");
          }
     }

     public static void rotateLeft(int arr[], int k){
          
          rotArr(arr, 0, k-1);
          rotArr(arr, k, arr.length-1);
          rotArr(arr, 0, arr.length-1);
          
          for (int i : arr) {
               System.out.print(i+" ");
          }

     }


     public static void rotArr(int arr[], int i, int j){
          while (i<=j) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;  
          }   
     }

     public static void moveZeroes(int arr[]){
          int result[]=new int[arr.length];
          int index=0;
          int count=0;
          for(int i:arr){
               if(i!=0){
                    result[index]=i;
                    index++;
               }
               else{
                    count++;
               }
          }
          while(count<=0){
               result[index]=0;
               index++;
          }
          for (int i : result) {
               System.out.println(i+" ");
          }
     }

     public static void secondLargest(int arr[]){
          int max=Integer.MIN_VALUE;
          int secondMax=Integer.MIN_VALUE;

          for(int i:arr){
               if(i>max){
                    max=i; 
                    secondMax=max; 
               }

               else{
                    
               }
          }
     }




}
