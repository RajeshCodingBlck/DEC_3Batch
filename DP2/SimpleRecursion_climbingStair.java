package DP2;

class Solution {
    public int helper(int n, int [] brain){
        
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        
//        // checking the Answer is present in Array or not 
        if(brain[n] !=0){
            return brain[n];
        }
        
        int chhota_ans1= helper(n-1, brain);
        int chhota_ans2= helper(n-2, brain);
        int mera_ans= chhota_ans1+chhota_ans2;
        brain[n]=mera_ans;// Store the my ans(mera_ans);
        return  mera_ans;
    }
    public int climbStairs(int n) {
        
        int [] brain= new int[n+1];
        return helper(n, brain);
    }
}

public class SimpleRecursion_climbingStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
