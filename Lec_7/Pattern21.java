package Lec_7;
import java.util.*;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     
     int row=1;
     int left_nst=1;
     int right_nst=1;
     int nsp=2*n-3;
     
     while(row<=n) {
    	 // print the left Star
    	 int i=1;
    	 while(i<=left_nst) {
    		 System.out.print("*\t");
    		 i=i+1;
    	 }
    	 
    	 // Print the Space
    	 int j=1;
    	 while(j<=nsp) {
    		 System.out.print(" \t");
    		 j=j+1;
    	 }
    	 
    	 // Print the right Star
    	 int k=1;
    	 if(row==n) {
    		 k=2;
    	 }
    	 while(k<=right_nst) {
    		 System.out.print("*\t");
    		 k=k+1;
    	 }
    	 
    	 // preparation for Next row
    	 
    	 left_nst=left_nst+1;
    	 right_nst=right_nst+1;
    	 nsp=nsp-2;
    	 
    	 // Go for Next 
    	 row=row+1;
    	 System.out.println();
     }
     
	}

}
