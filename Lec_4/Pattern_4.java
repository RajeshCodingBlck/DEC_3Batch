package Lec_4;

import java.util.*;
public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Scanner s= new Scanner(System.in);
		 
		 int n= s.nextInt();
		 
		 int row=1;
		 
		 int nst=1;
		 
		  while(row<=n) {
			  
			  
			  // Print the Star
			  
			  int i=1;
			  
			  while(i<=nst) {
				  
				  System.out.print("*");
				  i=i+1;
			  }
			  
			  // Preparation for Next Row
			    
			  nst= nst+2;
			  
			  //  Go for the Next Row
			  
			   row= row+1;
			   
			   System.out.println();
			   
			    
		  }
		 
	}

}
