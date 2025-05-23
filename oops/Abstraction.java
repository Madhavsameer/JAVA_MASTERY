public class Abstraction  {
     public static void main(String[] args) {

          //Using interface
          MyInterface mf= new Interfaced();
          mf.welcome();

          //Using abstract class

          MyAbstract ms= new Abstracted();
          ms.info();
          ms.intro();
     }
}

 interface MyInterface {
     void welcome();
}

class Interfaced implements MyInterface{
     public void welcome(){
          System.out.println("Welcome to world! ");
          
     }
}

abstract class MyAbstract{

     //Concrete methodd
      void info(){
          System.out.println("I tells info! ");
     }

     //abstract method
      abstract void intro();
}
class Abstracted extends MyAbstract{

     void intro(){
          System.out.println("I am supposed to Introduce you!");
     }


}
