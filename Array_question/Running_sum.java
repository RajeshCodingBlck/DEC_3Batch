class Solution {
    public int[] runningSum(int[] nums) {
        
     int [] run= new int [nums.length];
        
       run[0]= nums[0];        
        for(int i=1; i<run.length;i++){           
            run[i]=run[i-1]+nums[i];
        }
        
        return run;
    }
}
