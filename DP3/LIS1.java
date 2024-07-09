package DP3;

class Solution {
    
    public int BS(int [] dp, int val){
        
        
      int low=1;
      int high= dp.length-1;
        
       int ans=-1;
       while(low<=high){
           
           int mid= low+ (high-low)/2;
           
           if(dp[mid]>=val){
               ans=mid;
               high=mid-1;
           }else{
               low=mid+1;
           }
       } 
        return ans;
    }
    public int lengthOfLIS(int[] nums) {
       
      int n= nums.length;
      int [] dp= new int[n+1];
    // dp[i]= Minimum Ending value I can store to Create i length Increasing Subsequence
      for(int i=0; i<dp.length;i++){
          dp[i]= (int)(1e9);
      }
        
      for(int i=0; i<nums.length;i++){
          
          int index= BS(dp, nums[i]);
          dp[index]=nums[i];
      }
        
    for(int i=dp.length-1; i>=1;i--){
        
        if(dp[i] != (int)(1e9)){
            return i;
        }
    }
        
        return 1;
        
    
        
    }
}
public class LIS1 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
