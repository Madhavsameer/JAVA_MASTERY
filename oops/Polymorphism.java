public class Polymorphism {
     public static void main(String[] args) {
          
          // System.out.println(sum(4, 5));
          // System.out.println(sum(4.2, 5.3,6.2));


          //Method Overriding
          Animal myCat= new Cat();
          myCat.sound();
          Animal myDog= new Dog();
          myDog.sound();
          
     }

     //Method Overloading same function with different parameters
     public static int sum(int a, int b){
          return a+b;
     }
     public static double sum(double a, double b,double c){
          return a+b+c;
     }



     
}


//Method overRiding

 class Animal {

       void sound(){
          System.out.println("Animal Sound");
     }

     
}

 class Dog extends Animal {
     void sound(){
          System.out.println("Bho-Bho");
     }

     
}
 class Cat extends Animal {

     void sound(){
          System.out.println("Meow- Meow");
     }

     
}
