package Lec_9;
import java.util.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
	   int n= s.nextInt();
	   int ans=0;
	   int place_value=1;
	   while(n >0) {  
		   int rem= n%2;   
		   ans= ans+ rem*place_value;  
		   place_value*=10; 
		   n=n/2;
	   }
	   System.out.println(ans);
	   
	}

}
