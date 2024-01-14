package Lec_8;
import java.util.*;
public class Digit_sum_with_placeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      int place_val=1;
      int even_sum=0;
      int odd_sum=0;
      while(n>0) {
    	  
    	  int last_digit=n%10;
    	  if(place_val%2==0) {
    		  even_sum+=last_digit;
    	  }else {
    		  odd_sum+=last_digit;
    	  }
    	  
    	  n=n/10;
    	  place_val++;
      }
      
      System.out.println("even Sum "+ even_sum);
      System.out.println("odd Sum "+ odd_sum);
      
      
	}

}
