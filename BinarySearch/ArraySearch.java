package BinarySearch;

import java.util.Arrays;

public class ArraySearch {

	public static int BinarySearch(int [] arr, int target) {
		
		Arrays.sort(arr);
		
		int low=0;
		int high= arr.length-1;	
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				
				low=mid+1;
			}else {	
				high=mid-1;
			}
		}
		
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] arr= {1,10,1,2,3,4,45};
		
		int target=100;
		
		System.out.println(BinarySearch(arr, target));
		
	}

}
