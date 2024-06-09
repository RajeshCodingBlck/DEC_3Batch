package My_HashMap;

import java.util.Scanner;

public class SubarraySumEqualZero {
   
	public static void helper(int [] arr) {
		
		// PreComputation Work :- Create a Prefix Array/.
		int [] prefix=new int [arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefix[i]=arr[i]+prefix[i-1];
			
		}
		 Scanner s= new Scanner(System.in);
		int q=5;
		while(q>0) {
		   
			int l=s.nextInt();
			int r=s.nextInt();
			
			int ans= helper2(prefix, l,r);
			System.out.println(ans);
			q--;
		}
		
	}
	private static int helper2(int[] prefix, int l, int r) {
		
		if(l==0) {
			return prefix[r];
		}else {
			return prefix[r]-prefix[l-1];
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,-2,+1,+1,4,5};
      helper(arr);
	}

}
