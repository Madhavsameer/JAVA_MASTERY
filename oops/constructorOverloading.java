public class constructorOverloading {

     public static void main(String[] args) {

          constructorOverloading c1= new constructorOverloading(97, "Madhav Sameer");
          constructorOverloading c2= new constructorOverloading(44);
          constructorOverloading c3= new constructorOverloading(4, 46);
          
     }

     constructorOverloading(int roll, String name){
          System.out.println("Roll No: "+roll+" Name: "+name);
     }

     constructorOverloading(int favnumber){
          System.out.println("Your favourite number is: "+favnumber);
     }

     constructorOverloading(int x, int y){
          System.out.println("Sum of the given numbers is: "+(x+y));
     }
}