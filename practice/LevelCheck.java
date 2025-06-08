import java.util.Arrays;
import java.util.HashMap;

public class LevelCheck {
     

     public static void main(String[] args) {

          // int arr[]={8,2,1,4,7,6};
          // int arr2[]={2,2,2,3,2,3};
          // first();
          // second();
          // reverseArray(arr);
          // majorityElement(arr2);

          // int arr3[]={1,2,4,2,1};
          // System.out.println(pallindromeArray(arr3));

          int arr[]={7,8,5,9,3,2,6};
          // rightRotate(arr, 2);

          secondLargest(arr);
          
          

     }

     public static void first(){

          int a=5;
          int b=5;
          String str="Aditya";
          String str1="Aditya";

          System.out.println(a==b);
          System.out.println(str==str1);
          System.out.println(str1.equals(str));
          
     }
     public static void second(){
          int a = 5;
          int b = 10;
          System.out.println(a++ + ++b);
     }

     public static void reverseArray(int arr[]){
          int i=0;
          int j=arr.length-1;
          while(i<=j){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
          }

          for (int k : arr) {
               System.out.print(k+" ");
          }
          System.out.println();


     }

     public static void majorityElement(int arr[]){
          int n=arr.length;

          HashMap <Integer, Integer> hm= new HashMap<>();
          for(int i: arr){

               if(hm.containsKey(i)){
                    hm.put(i, hm.get(i)+1);
               }

               else{

                     hm.put(i, 1);

               }

              
          }
          System.out.println(hm);

          for(int i:hm.keySet()){
               if(hm.get(i)>n/2){
                    System.out.println("Majority Element is: "+i);
                    return;
               }

          }
          System.out.println("majority element not found");

          

          

     }

     public static boolean pallindromeArray(int arr[]){
          int end=arr.length-1;
          int start=0;

          while (start<=end) {

               if(arr[start]!=arr[end]){
                    return false;
               }
               start++;
               end--;
               
          }

          return true;
     }

     public static void rightRotate(int arr[], int k){

          int n=arr.length-1;

          reverse(0, n, arr);
          reverse(0, k-1, arr);
          reverse(k, n, arr);

          for (int i : arr) {
               System.out.print(i+" ");
          }
          
     }
     public static void reverse(int start, int end, int arr[]){
          while(start<=end){
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
          }
     }

     public static void secondLargest(int arr[]){
          Arrays.sort(arr);
          int n=arr.length-1;

          if(arr[n]!=arr[n-1]){
               System.out.println(arr[n-1]);
          }
          

     }




}
