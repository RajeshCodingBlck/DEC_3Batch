package Lec_5;

import java.util.*;
public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
	   Scanner s= new  Scanner(System.in);
	   
	   int n= s.nextInt();
	   
	   
	   int row=1;
	   
	   int nsp=0;
	   
	   int  nst=n;
	   
	   while(row<=n) {
		   
		  // Print the Space
		   
		   int i=1;
		   
		   while(i<=nsp) {
			   
			   System.out.print(" ");
			   i=i+1;
		   }
		   
		   // Print the Star
		   
		   int j=1;
		   
		   while(j<=nst) {
			   
			   System.out.print("*");
			   j=j+1;
		   }
		   
		   // Preparation for Next Row
		   
		     nsp=nsp+1;
		     
		     nst=nst-1;
		     
		   // Go for Next Row
		     
		     row=row+1;
		     System.out.println();
		    
	   }
	   
	   
	}

}
