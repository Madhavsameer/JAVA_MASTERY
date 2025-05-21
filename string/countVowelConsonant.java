import java.util.Scanner;

public class countVowelConsonant {

     public static void main(String[] args) {

          Scanner sc= new Scanner(System.in);

          System.out.print("Enter the String: ");
          String str=sc.nextLine();

          count(str);


          


     }

     public static void count(String str){
          str=str.toLowerCase();
          int vowel=0,consonant=0,space=0;
          for(int i=0;i<str.length();i++){
               if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'){
                    vowel++;
               }

               if(str.charAt(i)==' '){
                    space++;
               }
               else{
                    consonant++;
               }
          }

          System.out.println("Number of vowels: "+vowel);
          System.out.println("Number of consonants: "+consonant);
          System.out.println("Number of Spaces: "+space);
     }
}