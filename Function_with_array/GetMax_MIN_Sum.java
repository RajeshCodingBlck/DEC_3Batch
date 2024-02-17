package Function_with_array;

public class GetMax_MIN_Sum {

	public static int [] get(int [] arr) {	
		int min_val=arr[0]; int max_val=arr[0];int sum=arr[0];	
		for(int i=1; i<arr.length;i++) {			
			if(min_val> arr[i]) {
				min_val=arr[i];
			}			
			if(max_val<arr[i]) {
				max_val=arr[i];
			}		
			sum+=arr[i];
		}	
		int [] ans= {min_val, max_val, sum};		
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {1,2,3,0,-1};    
         int [] ans= get(arr);        
         System.out.println(ans[0]+ " , "+ ans[1]+ " , "+ans[2]);
         
         
	}

}
