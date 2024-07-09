class Solution {
    public int lengthOfLIS(int[] nums) {
        
      int n=nums.length;
      int [] dp= new int[n];
    int overallmax=1;
        
    // dp[i]= Longest Strictly inc subsequence Ending at index i.
      for(int i=0; i<n;i++){
          
          dp[i]=1;
          
          int currlength=1;
          for(int j=i-1; j>=0; j--){
              
              if(nums[i]> nums[j]){
                  currlength= Math.max(currlength, dp[j]+1);
              }
          }
          
          dp[i]=currlength;
          overallmax= Math.max(overallmax, dp[i]);
          
      }
        
        return overallmax;
    }
}
