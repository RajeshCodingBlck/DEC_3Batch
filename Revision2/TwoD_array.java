package Revision2;

import java.util.Scanner;

public class TwoD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner s= new Scanner(System.in);
		int [][] arr= new int[3][4];
		
		
		 for(int i=0; i<arr.length;i++) {
			 
			 for(int j=i; j<arr[0].length;j++) {
				 
				 
				 arr[i][j]=s.nextInt();
			 }
		 }
		 
		 
		// output
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr[0].length;j++) {
				
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
