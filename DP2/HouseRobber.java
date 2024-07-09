package DP2;
class Solution {
    
    public int helper(int [] nums, int i, int [] dp){
        
    if(i==nums.length){
        return 0;
    }
        if(i>nums.length){
            return 0;
        }
        
        if(dp[i] !=-1){
            return dp[i];
        }
     // i par Chori Nahi karke 
       int chhota_ans1 = helper(nums, i+1, dp);
     // i par chori karenge
       int chhota_ans2= nums[i]+ helper(nums,i+2, dp);       
      int mera_ans= Math.max(chhota_ans1,chhota_ans2);
        // dp[i]=mera_ans;
        // return mera_ans;
      return dp[i]=mera_ans;
        
    }
    public int rob(int[] nums) {
        
        int [] dp= new int[nums.length];
        for(int i=0; i<dp.length;i++){
            dp[i]=-1;
        }
        return helper(nums, 0, dp);
    }
}

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
