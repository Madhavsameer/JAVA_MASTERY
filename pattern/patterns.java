
public class patterns {

     public static void main(String[] args) {

          rectangle(5, 8);
          square(5);
          rightTriangle(5);
          rightInversedTriangle(5);
          leftTriangle(5);
          leftInverseTriangle(5);
          
     }

     public static void rectangle(int l, int b){
          System.out.println("Rectangle");
          for(int i=0; i<l;i++){
               for(int j=0; j<b; j++){
                    System.out.print(" * ");
               }
               System.out.println();
          }
     }

     public static void square(int n){
          System.out.println("Square");
          for(int i=0; i<n; i++){
               for(int j=0; j<n; j++){
                    System.out.print(" * ");
               }
               System.out.println();
          }
     }

     public static void rightTriangle(int n){
          System.out.println("Right Triangle");
          for (int i = 0; i < n; i++) {

               for(int j=0; j<=i;j++){
                    System.out.print(" * ");
               }
               System.out.println();
               
          }
     }

     public static void rightInversedTriangle(int n){
          System.out.println("Right Inversed Triangle");
          for (int i = n; i >= 0; i--) {

               for(int j=0; j<=i;j++){
                    System.out.print(" * ");
               }
               System.out.println();
               
          }
     }

     public static void leftTriangle(int n){
          System.out.println("Left Triangle");
          for (int i = 0; i < n; i++) {

               for(int j=0;j<n-i; j++){
                    System.out.print(" ");
               }

               for(int j=0; j<=i;j++){
                    System.out.print("*");
               }
               System.out.println();
               
          }
     }

     public static void leftInverseTriangle(int n){
          System.out.println("Left Inversed Triangle");
          for (int i = n; i > 0; i--) {

               for(int j=0;j<n-i; j++){
                    System.out.print(" ");
               }

               for(int j=0; j<=i;j++){
                    System.out.print("*");
               }
               System.out.println();
               
          }
     }
     
}
