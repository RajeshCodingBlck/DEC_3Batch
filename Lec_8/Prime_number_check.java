package Lec_8;
import java.util.*;
public class Prime_number_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 Scanner s= new Scanner(System.in);
	 int n= s.nextInt();
	 
	 if(n==1) {
		 System.out.println("N is Not Prime");
	 }else {
		 int count=0;
		  for(int i=2; i<=n-1;i++) {  
			  if(n%i==0) {
				  count++;
			  }
		  } 
		  if(count==0) {
			  System.out.println("N is Prime");
		  }else {
			  System.out.println("N is not Prime");
		  }
	 }
	}

}
