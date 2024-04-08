package revision_2;

import java.util.Scanner;

public class reverse {
public static void reverseInRange(int [] arr, int s, int e) {
		
		int i=s; 
		int j=e;
		
		while( i<=j ) {	
			// Swapping Concept
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;	
		}
		
		
		
	}
	public static void reverse(int [] arr) {
		
		int i=0; 
		int j=arr.length-1;
		
		while( i<=j ) {	
			// Swapping Concept
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;	
		}
		
		
		
	}
	public static void rotation(int []arr, int k) {
		
		k= k%arr.length;
		reverseInRange(arr,0, arr.length-1);
		reverseInRange(arr,0,k-1 );
		reverseInRange(arr,k, arr.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the Size of Array");
      int size= s.nextInt();
      int [] arr= new int[size];
      
      // Input
      for(int i=0; i<arr.length;i++) {
    	  System.out.println(i+" index ");
    	  arr[i]=s.nextInt();
      }
      
      // work
      reverseInRange(arr, 1,3);
      
 
      // print
      for(int i=0; i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
      
	}

}
