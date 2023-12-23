package Lec_3;

import java.util.*;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        
        int p= sc.nextInt();
        
        int r= sc.nextInt();
        
        int t= sc.nextInt();
        
        
        int simple_interest= (p*r*t)/100;
        
        System.out.println(simple_interest);
        
        
	}

}
