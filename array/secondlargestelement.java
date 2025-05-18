public class secondlargestelement {
     public static void main(String[] args) {

          int arr[]={1,2,6,11,5,9,4};
          System.out.println(sl(arr));
     }

     public static int sl(int arr[]){

          int largest=Integer.MIN_VALUE;
          int second=Integer.MIN_VALUE;
          for(int i=0; i<arr.length; i++){

               if(arr[i]>largest){
                    second=largest;
                    largest=arr[i];
               }

               else if{
                    

               }

          }

          return second;
     }
}
