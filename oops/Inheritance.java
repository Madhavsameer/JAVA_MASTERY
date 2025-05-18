
public class Inheritance {

     public static void main(String[] args) {

          Laptop hp= new Laptop();
         
          System.out.println( hp.getName());
          System.out.println(hp.getPrice());
          
          
     }


     
}

class Car{

     int price=1000;
     int getPrice(){
          return price;
     }
}



class Laptop extends Car {
     String name="Hp pavillion";
     String getName(){
          return name;
     }
     


     
}



