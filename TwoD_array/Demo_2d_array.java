package TwoD_array;

import java.util.Scanner;

public class Demo_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
	   int m=3;
	   int n=4;
       int [] [] arr= new int[n][m];
       
       
       // Input in 2D array
       
       for(int row=0; row<n; row++) {
    	   
    	   for(int col=0; col<m;col++) {
    		   
    		   arr[row][col]= s.nextInt(); 
    	   }
       }
       
       for(int row=0; row<n; row++) {
    	   
    	   for(int col=0; col<m;col++) {
    		   
    		   System.out.print(arr[row][col]+" ");
    	   }
    	   System.out.println();
       }
       
       
      
      
      
      
      
	}

}
