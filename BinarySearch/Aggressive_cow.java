package BinarySearch;

import java.util.*;
public class Aggressive_cow {

    public static boolean Api_ispossible(int [] arr, int c, int mid){


        int no_of_cows_I_placed=1;
        int lastPosition= arr[0];

        for(int i=1; i<arr.length;i++){

            if(arr[i]-lastPosition>=mid){
                no_of_cows_I_placed++;
                lastPosition=arr[i];
            }

            if(no_of_cows_I_placed==c){
                return true;
            }

        }
       
       return false;



    }
    public static void main(String args[]) {
      Scanner s= new Scanner(System.in);

      int n= s.nextInt();
      int c=s.nextInt();

      int [] arr= new int[n];

      for(int i=0; i<n;i++){
          arr[i]= s.nextInt();
      }

      Arrays.sort(arr);

      int low=0;
      int high= arr[n-1]-arr[0];
      int ans=0;
      while(low<=high){

          int mid= low+ (high-low)/2;

          if(Api_ispossible(arr,c, mid)==true){
             ans= mid;
             low= mid+1;
          }else{
             high=mid-1;

          }
      }

      System.out.println(ans);
    }
}
