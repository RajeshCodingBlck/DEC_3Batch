package BinarySearch;

public class Just_smaller {

	public static int justSmaller(int [] arr, int target) {
		
		int low=0;
		int high=arr.length-1;
		
		int ans=-1;
		while(low<=high) {
			
			 int mid= (low+high)/2;		 
			 if(arr[mid]<target) {
				 ans=mid;
				 low=mid+1;
			 }else {
				 high=mid-1;
			 }
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {1,10,10,30,40,50,100};
		
		System.out.println(justSmaller(arr, 10));
		
	}

}
