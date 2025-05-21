public class reverseeachword {

     public static void main(String[] args) {

         
          
          System.out.println(rv("sameer is king of the world"));
          
     }

     public static String rv(String str){

          String []words= str.split(" ");
          String result="";
          for(String st: words){
               

               String rev="";
               for(int i=0; i<st.length();i++){
                    rev=st.charAt(i)+rev;
               }
               result+=rev+" ";
          }

          return result;
          
     }


}