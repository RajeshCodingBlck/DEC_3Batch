package Lec_7;
import java.util.*;
public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     int n= s.nextInt();
     
     int row=1;
     int nsp=n-1;
     int nst=1;
     int row_val=1;
     while(row<=n) {
    	 
    	 // Print the Space
    	 int i=1;
    	 while(i<=nsp) {
    		 System.out.print(" "+" ");
    		 i=i+1;
    	 } 
    	 // print the Star
    	 int j=1;
    	 int col_val=row_val;
    	 while(j<=nst) {
    		 System.out.print(col_val+" ");
    		 // Preparation for Next col_val
    		 if(j< (nst+1)/2) {
    			 col_val=col_val+1;
    		 }else {
    			 col_val=col_val-1;
    		 }
    		 j=j+1;
    	 }
    	 // Preparation for Next Row
    	 nst=nst+2;
    	 nsp=nsp-1;
    	 row_val=row_val+1;
    	 // Go 
    	 row= row+1;
    	 System.out.println();
    	 
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
