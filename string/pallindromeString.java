public class pallindromeString {
     public static void main(String[] args) {

          System.out.println(checkPall("madam"));

          
          
     }
     public static boolean checkPall(String str){

          String res="";
          for(int i=0; i<str.length(); i++){
               res=str.charAt(i)+res;

          }

          if(res.equals(str)){
               return true;
          }

          return false;

     }
}
