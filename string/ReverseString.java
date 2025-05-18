
public class ReverseString {
     public static void main(String[] args) {

          System.out.println(revString("madhav"));
          
     }

     public static String revString(String str){
          String res="";
          for(int i=0; i<str.length();i++){
               res=str.charAt(i)+res;
          }

          return res;


     }
}
