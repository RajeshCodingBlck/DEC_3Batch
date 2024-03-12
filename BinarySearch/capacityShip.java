class Solution {
    
    public  boolean API_ispossible(int [] arr, int d, int w) {
		
		int sum=0;
		int days=1;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>w) {
				return false;
			}
			sum+=arr[i];		
			if(sum<=w) {
				continue;
			}else {
				days++;
				sum=arr[i];
			}
			
		}
		
		if(days>d) {
			return false;
		}else {
			return true;
		}
	}
    
    public int shipWithinDays(int[] arr, int days) {
        
        
     int low=1;
     int high= (int)(1e9);
    int ans=1;
    while(low<=high){
        
        int mid= low+ (high-low)/2;
        
        if(API_ispossible(arr, days, mid)==true){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
        
        return ans;
        
    }
}
