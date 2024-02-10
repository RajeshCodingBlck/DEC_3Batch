package Lec_12;

import java.util.Scanner;

public class Take_somethink_and_nothing_return {
  
	public static void add( int c, int d) {
		System.out.println("add Start");
		int ans=c+d;
		c--;
		System.out.println(ans);
		System.out.println("add end");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main Start");
        Scanner s= new Scanner(System.in);
        int c=s.nextInt();
        int d=s.nextInt();
        add(c,d);
        System.out.println(c+d);
        System.out.println("main end");
        
        
	}

}
