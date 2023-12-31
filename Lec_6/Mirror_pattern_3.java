package Lec_6;
import java.util.*;
public class Mirror_pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      
      int n= s.nextInt();
      
      int row=1;
      
      int nsp=0;
      int nst=n;
      
      while(row<=2*n-1) {
    	  
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
    	  
    	  // preparation for Next Row
    	  
    	  if(row<n) {
    		  nsp=nsp+2;
    		  nst=nst-1;
    	  }else {
    		  nsp=nsp-2;
    		  nst=nst+1;
    	  }
    	  
    	  // Go Next row
    	  
    	  row=row+1;
    	  System.out.println();
    	  
      }
      
	}

}
