package Pack1;

public class A {

	
	 public static int[] runningSum(int[] nums) {
	        
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
	    
	    public static void main(String [] args) {
	    	
	    	int [] arr= {1,2,3,4,5};
	    	int [] ans=runningSum(arr);
	    	
	    	for(int i=0; i<ans.length;i++) {
	    		System.out.print(ans[i]+" ");
	    	}
	    	
	    	
	    }
}
