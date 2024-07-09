package DP1;

import java.util.HashMap;

public class Fibonacci {
   
	public static int fibo(int n, HashMap<Integer, Integer> brain) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		if(brain.containsKey(n)) { // check and fetch
			return brain.get(n);
		}
		
		System.out.println(" n is "+n );
		int chhota_ans1= fibo(n-1, brain);
		int chhota_ans2=fibo(n-2, brain);
		int mera_ans= chhota_ans1+chhota_ans2;
		brain.put(n, mera_ans); // Store
		return mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> brain= new HashMap();
        System.out.println(fibo(10, brain));
	}

}
