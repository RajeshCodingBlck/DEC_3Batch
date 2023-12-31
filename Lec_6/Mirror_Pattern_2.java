package Lec_6;
import java.util.*;
public class Mirror_Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       
       int row=1;
       
       int nsp=n-1;
       int nst=1;
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
    	   
    	   // Preparation 
    	   
    	   if(row<n) {
    		   nst=nst+1;
    		   nsp=nsp-1;
    	   }else {
    		   nst=nst-1;
    		   nsp=nsp+1;
    	   }
    	   
    	   // Go 
    	   
    	   row=row+1;
    	   System.out.println();
       }
       
	}

}
