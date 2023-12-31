package Lec_6;
import java.util.*;
public class Problem_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int row=1;
		int nst_l=(n-1)/2;
		int nsp=1;
		int nst_r=(n-1)/2;
		while(row<=n) {
			
			// Print the Left star
			
			int i=1;
			while(i<= nst_l) {
				System.out.print("*");
				i=i+1;
			}
			
			// Print the Space
			int j=1;
			while(j<=nsp) {
				System.out.print(" ");
				j=j+1;
			}
			
			// Print the Right Star
			
			int k=1;
			while(k<=nst_r) {
				System.out.print("*");
				k=k+1;
			}
			
			 if(row< (n+1)/2) {
				 nst_l=nst_l-1;
				 nst_r= nst_r-1;
				 nsp=nsp+2;
			 }else {
				 nst_l=nst_l+1;
				 nst_r= nst_r+1;
				 nsp=nsp-2;
			 }
			 
			 // Go for next Row
			 
			 row=row+1;
			 System.out.println();
			
			
		}
		
		
	}

}
