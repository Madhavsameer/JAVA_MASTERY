

public class Encapsulation {

     public static void main(String[] args) {

          Encapsulated es= new Encapsulated();
          System.out.println(es.getName());
          System.out.println(es.getAge());
          es.setName("Aditya");
          es.setAge(22);
          System.out.println(es.getName());
          System.out.println(es.getAge());
          
     }
    
          
     
     


}

class Encapsulated{

     private String name= "Madhav";
     private int age=21;

     public String getName(){
          return name;
     }

     public int getAge(){
          return age;
     }

     public void setName(String name){
          this.name=name;
     }
     
     public void setAge(int age){
          this.age=age;

     }

}