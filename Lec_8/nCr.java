package Lec_8;
import java.util.*;
public class nCr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       int r= s.nextInt();
       
       int n_fact=1;
       int r_fact=1;
       int n_r_fact=1;
       
       for(int i=1;i<=n;i++) {
    	   n_fact=n_fact*i;
       }
       
       for(int i=1;i<=r;i++) {
    	   r_fact=r_fact*i;
       }
       
       for(int i=1;i<=n-r;i++) {
    	   n_r_fact=n_r_fact*i;
       }
       
       int ans= n_fact/ (r_fact*n_r_fact);
       System.out.println(ans);
       
       
       
	}

}
