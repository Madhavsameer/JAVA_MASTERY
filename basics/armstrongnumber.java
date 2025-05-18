
public class armstrongnumber {

     public static void main(String[] args) {

          
          System.out.println(isarmstrong(1634));
          
     }

     public static boolean isarmstrong(int num){

          int temp=num;
          int temp2=num;
          int nd=0;
          int result=0;
          while(temp>0){
               int unit=temp%10;
               temp/=10;
               nd++;
          }

          while(temp2>0){
               int unit=temp2%10;
               result+=Math.pow(unit, nd);
               temp2/=10;
          }

          if(result==num){
               return true;
          }

          return false;



     }
     
}
