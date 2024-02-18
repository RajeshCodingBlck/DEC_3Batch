class Solution {
    public int[] runningSum(int[] nums) {
        
     int [] run= new int [nums.length];
        
     for(int i=0; i<run.length;i++){
         
         int curr_sum=0;         
         for(int j=0; j<=i;j++){
             
             curr_sum+=nums[j];
         }
         
         run[i]=curr_sum;
     }
        
        return run;
    }
}
