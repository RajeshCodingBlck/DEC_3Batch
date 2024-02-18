// https://leetcode.com/submissions/detail/1178583161/
class Solution {
    public void reverseInrange(int [] arr, int s, int e){
        
        int i=s;
        int j=e;
        
        while(i<=j){
            
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
        
        
    }
    public void rotate(int[] nums, int k) {
        
        k= k%nums.length; // Peigon Hole Principle.
        reverseInrange(nums, 0, nums.length-1);
        reverseInrange(nums, 0, k-1);
        reverseInrange(nums,k, nums.length-1);
        
        
    }
}
