package Lec_5;

import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		 
		int row=1;
		
		int nst=1;
		
		int ndash=n-1;
		
		while(row<=n) {
			
			// Print the Dash
			
			 int i=1;
			 
			 while(i<= ndash) {
				 
				 System.out.print("_"+ " ");
				 i++;
			 }
			 
			 // Print the Star
			 
			 int j=1;
			 
			 while(j<=nst) {
				 
				 System.out.print("*"+ " ");
				 j++;
			 }
			 
			 // Preparation for Next Row
			 
			 ndash= ndash-1;
			 
			 nst= nst+1;
			 
			 // Go for the Next Row
			 
			 row=row+1;
			 System.out.println();
			
		}
		
		
	}

}
