import java.util.HashMap;

public class hashmap {
     public static void main(String[] args) {
          frequencyCount("sameer");
     }

     public static void frequencyCount(String str){
          HashMap <Character,Integer> myMap= new HashMap<>();
          char characters[]=str.toCharArray();
          for(char ch:characters){
               int count=1;
               if(myMap.containsKey(ch)){
                    count++;
                    myMap.put(ch,count );  
               }
               else{
                    myMap.put(ch, count);
               }
          }
          System.out.println(myMap);
     }
}
