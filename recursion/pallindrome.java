
public class pallindrome {

     public static void main(String[] args) {
          String str="madam";
          System.out.println(isPalindrome(str, 0, str.length()-1));
          
     }

     public static boolean isPalindrome(String str,int i, int j){

          
  
          if(str.charAt(i)!=str.charAt(j)){
               isPalindrome(str, i+1, j-1);
          }

          if(i>j){
               return true;
          }

          return false;

     }
}