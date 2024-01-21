package Lec_10;

import java.util.Scanner;

public class Decimal_Any_Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		   int n= s.nextInt();
		   int b=s.nextInt();
		   int ans=0;
		   int place_value=1;
		   while(n >0) {  
			   int rem= n%b;   
			   ans= ans+ rem*place_value;  
			   place_value*=10; 
			   n=n/b;
		   }
		   System.out.println(ans);
	}

}
