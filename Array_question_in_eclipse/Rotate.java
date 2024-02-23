package Pack1;

public class A {

	
	 public static void reverseInrange(int [] arr, int s, int e){
	        
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
	    public static void rotate(int[] nums, int k) {
	        
	        k= k%nums.length; // Peigon Hole Principle.
	        reverseInrange(nums, 0, nums.length-1);
	        reverseInrange(nums, 0, k-1);
	        reverseInrange(nums,k, nums.length-1);
	        
	        
	    }
	    
	    public static void main(String [] args) {
	    	
	    	int [] arr= {1,2,3,4,5};
	    	rotate(arr, 3);
	    	
	    	for(int i=0; i<arr.length;i++) {
	    		System.out.print(arr[i]+" ");
	    	}
	    	
	    	
	    }
}
