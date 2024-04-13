package Recursion_4;

import java.util.ArrayList;

public class Subset_sum {
    
	public static void SubsetSum(int [] arr, int index, 
		int curr_sum, int sum, ArrayList<Integer> ans) {
		
		if(curr_sum==sum) {
			System.out.println(ans);
			return ;
		}
		if(index==arr.length) {
			return ;
		}
		
		if(curr_sum>sum) {
			return ;
		}
		// Pick 
		ans.add(arr[index]);
		SubsetSum(arr, index+1, curr_sum+arr[index], sum, ans);
		ans.remove(ans.size()-1);
		// Not Pick
		SubsetSum(arr, index+1, curr_sum, sum, ans);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,2,1,3};
       
       ArrayList<Integer> ans= new ArrayList();
       
       SubsetSum(arr, 0,0, 5,ans);
       
	}

}
