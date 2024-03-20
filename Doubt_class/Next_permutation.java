import java.util.*;
public class Main {

   
   public static void reverse(int [] arr, int s, int e){

       while(s<=e){

           int temp= arr[s];
           arr[s]=arr[e];
           arr[e]=temp;
           s++;
           e--;
       }


   }
    public static void next_permutation(int [] arr){

      int index1=-1; //  Swapping Position 

      for(int i= arr.length-1; i>0;i--){

          if(arr[i] > arr[i-1]){

              index1=i-1;
              break;
          }
      }

      if(index1==-1){

          reverse(arr, 0, arr.length-1);
          return;
      }
     
     int index2=-1;

     for(int i= arr.length-1; i>=0; i--){

         if(arr[index1]< arr[i]){
             index2=i;
             break;
         }
     }

    // Swap  
    int temp =arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;


    reverse(arr, index1+1, arr.length-1);


        
    }
    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);
       
       int t= s.nextInt();

       while(t>0){

          int n=s.nextInt();
          int [] arr= new int [n];

          for(int i=0;i<n;i++){
              arr[i]=s.nextInt();
          }

          next_permutation(arr);

          for(int i=0; i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }
          
          System.out.println();

           t--;
       }


    }
}
