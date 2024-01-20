package Lec_9;
import java.util.*;
public class Count_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int count=0;
		while(n>0) {
			
			int last_digit= n%10;
			count++;
			n=n/10;
		}
		
		System.out.println(count);
		
	}

}
