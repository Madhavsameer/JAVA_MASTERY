

public class Student {

     private String name;
     private int rollNo;
     private int marks;

     String getName(){
          return name;
     }

     void setName(String name){
          this.name=name;
     }

     int getRoll(){
          return rollNo;
     }

     void setRoll(int rollNo){
          this.rollNo=rollNo;
     }

     int getMarks(){
          return marks;
     }

     void setMarks(int marks){
          this.marks=marks;
     }

     void display(){
          System.out.println("Your name is "+getName()+" Your roll is "+getRoll()+" Your marks is "+getMarks());
     }
}