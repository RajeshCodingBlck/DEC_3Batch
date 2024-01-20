package Lec_9;
import java.util.*;
public class reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       
       int n= s.nextInt();
       
       int ans=0;
       while(n>0) {
    	   
    	   int last_digit=n%10;
    	   //System.out.print(last_digit);
    	   ans= ans*10+last_digit;
    	   n=n/10;
       }
       
       System.out.println(ans);
       
	}

}
