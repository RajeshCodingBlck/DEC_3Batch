package PriorityQueue_Questions;
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq= new PriorityQueue();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        
        long ans=0;
        
        while(pq.size()>1){
          
          long val1= pq.remove();
          long val2=pq.remove();
          
          ans+=(val1+val2);
          pq.add(val1+val2);
          
        }
        return ans;
        
        
    }
}
public class RopeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
