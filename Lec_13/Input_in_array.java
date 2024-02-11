package Lec_13;

import java.util.Scanner;

public class Input_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner s= new Scanner(System.in);
		
	    int size=s.nextInt();
	   int [] arr= new int [size];
	  
	   // Input 
	   for(int i=0; i<size;i++) {
		   
		   arr[i]= s.nextInt();
	   }
	   
	   // Print
	   for(int i=0; i<size;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   
	   
	   
	}

}
