package Lec_6;
import java.util.*;
public class Pattern1 {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=n-1;
		while(row<=n) {
			// Print the Space
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			// Print the Star
			int j=1;
			while(j<=nst) {
				
				if(j%2==0) {
					System.out.print("!"+" ");
				}else {
					System.out.print("*"+" ");
				}
				j=j+1;
			}
			// Preparation for the Next Row
			nsp=nsp-1;
			nst=nst+2;
			
			// Go for Next Row
			row=row+1;
			System.out.println();
			
		}
		
		
	}

}
