package Lec_10;

import java.util.*;

public class Aby_base_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		 int n= s.nextInt();
	     int b= s.nextInt();
	      int ans=0;
	      int place_value=1;
	      
	      while(n>0) {  
	    	  int last_digit=n%10;  
	    	  ans= ans+ place_value*last_digit; 
	    	  n=n/10; 
	    	  place_value*=b;
	    	  
	      }
	      
	      System.out.println(ans);
	}

}
