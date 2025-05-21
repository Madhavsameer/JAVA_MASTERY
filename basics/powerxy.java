public class powerxy {
     public static void main(String[] args) {
          System.out.println(value(2,5));
          

     }

     public static int value(int base, int power){
          int value=1;
          if(power==0){
               return 1;
          }
          else{
               int i=1;
               while(i<=power){

                    value=base*value;
                    i++;

               }

               

          }

          return value;

     }
}
