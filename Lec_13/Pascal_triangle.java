package Lec_13;

import java.util.Scanner;

public class Pascal_triangle {

	public static void pattern(int n){
	      
		  int row=0;
	      int nst=1;
		  while(row<n){
	       
		   // print the star
		   int i=0;
		   int ncr=1;
		   while(i<nst){
			   System.out.print(ncr+"\t");
			   // Preparation for Next ncr
			   ncr= ((row-i)*ncr)/(i+1);
			   i=i+1;
		   }

		   // Preparation for Next row
		   nst=nst+1;

		   // go for next row
		   row=row+1;
		   System.out.println();
		  }

		}
	    public static void main(String args[]) {
	      
		  Scanner s=  new Scanner(System.in);
		  int n= s.nextInt();

		  pattern(n);

	    }

}
