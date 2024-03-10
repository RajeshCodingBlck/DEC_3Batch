package BinarySearch;

public class Arrays_0_1 {
    
	public static int Minimum_index_1(int []arr) {
		
		int low=0;
		int high= arr.length-1;
		
		int index_ans=-1;
		while(low<=high) {	
			int mid= (low+high)/2;
			
			if(arr[mid]==0) {		
				low=mid+1;
			}else {
				high=mid-1;
				index_ans=mid;
				
			}
		}
		return index_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {0,0,0,1,1,1,1,1,1,1};
       
       System.out.println(Minimum_index_1(arr));
       
	}

}
