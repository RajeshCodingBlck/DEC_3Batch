package PriorityQueue_Questions;

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq= new PriorityQueue();
        
        // Add first K element  inside the PQ.
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        
        // Compare the Values of nums one by one that can be part of answer or not.
        for(int i=k;i<nums.length;i++){
            
            if(nums[i]> pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
public class TopKElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans=100000;
	}

}
