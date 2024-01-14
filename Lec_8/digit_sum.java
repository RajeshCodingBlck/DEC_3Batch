package Lec_8;
import java.util.*;
public class digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     
     int digit_sum=0;
     while(n>0) {
    	 
    	 int last_digit= n%10;
    	 digit_sum +=last_digit; 
    	 n=n/10;
     }
     System.out.println(digit_sum);
     
     
	}

}
