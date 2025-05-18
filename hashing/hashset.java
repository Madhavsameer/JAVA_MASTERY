import java.util.HashSet;

public class hashset {

     public static void main(String[] args) {

          System.out.println(hasAllUniqueChars("samer"));
          int arr[]={1,2,9,3,4,2,5,6,7,9};
          removeDuplicates(arr);
          
     }

     public static boolean hasAllUniqueChars(String str){

          HashSet <Character> myset= new HashSet<>();
          char characters[]=str.toCharArray();

          for(char ch:characters){
               if(myset.contains(ch)){
                    return false;
               }
               else{
                    myset.add(ch);
               }
          }

          return true;
     }

     public static void removeDuplicates(int arr[]){

          HashSet <Integer> myset= new HashSet<>();

          for(int i=0; i<arr.length; i++){
               myset.add(arr[i]);
          }

          System.out.println(myset);
     }
     
}
