package Sorting;

import java.util.Arrays;

public class Sorting_Oneloop {
    
	public static boolean CheckSum(int [] arr, int target) {
		
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			
			int sum= arr[i]+arr[j];			
			if(sum<target) {
				i++;
			}else if(sum>target) {
				j--;
			}else {
				
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 int [] arr= {3,10,1, 12,10};
		 
		 System.out.println(CheckSum(arr, 100));
		
	}

}
