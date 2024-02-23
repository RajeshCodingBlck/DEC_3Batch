package Pack1;

public class A {

	
	public static int[] productExceptSelf(int[] nums) {
        
	      int [] ans= new int[nums.length];
	        
	      for(int i=0; i<nums.length;i++){
	          
	          int product=1;
	          
	          for(int j=0; j<nums.length;j++){
	              
	               if(i==j){
	                   continue;
	               }
	              
	              product=product*nums[j];
	          }
	          
	          ans[i]=product;
	      }
	        
	        return ans;
	    }
	    
	    public static void main(String [] args) {
	    	
	    	int [] arr= {1,2,3,4,5};
	    	int []ans=productExceptSelf(arr);
	    	
	    	for(int i=0; i<ans.length;i++) {
	    		System.out.print(ans[i]+" ");
	    	}
	    	
	    	
	    	
	    	
	    }
}
