package Lec_13;

import java.util.Scanner;

public class array_problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
		
	    int size=s.nextInt();
	   int [] arr= new int [size];
	  
	   
	   for(int i=0; i<size;i++) {
		   
		   arr[i]= 10*(i+1);
		  
	   }
	   
	   // Print
	   for(int i=0; i<size;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   
	   
	}

}
