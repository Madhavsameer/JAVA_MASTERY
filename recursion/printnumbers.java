
public class printnumbers {

     public static void main(String[] args) {

          printNumbers(1,5);
        
          

     }

     public static void printNumbers(int start, int n){
         
          if(start >n) return;

          System.out.println(start);

          printNumbers(start+1,n);
          
          
     }

     
     
}
