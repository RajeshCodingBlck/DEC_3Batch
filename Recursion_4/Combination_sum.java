package Recursion_4;

import java.util.ArrayList;

public class Combination_sum {
    
	public static void GetSubset(int [] arr, int index, 
			int curr_sum, int sum, ArrayList<Integer> ans) {
		
		if(curr_sum==sum) {
			System.out.println(ans);
			return;
		}
		
		if(index==arr.length) {
			return ;
		}
		// Index vali Value pick karenge
		ans.add(arr[index]);
		GetSubset(arr, index+1, curr_sum+arr[index], sum, ans);
		
		// Not Pick
		ans.remove(ans.size()-1);
		GetSubset(arr, index+1, curr_sum, sum, ans);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,10,-10,3,-3,4,2};
       
       ArrayList<Integer> ans= new ArrayList();
       
       GetSubset(arr,0,0,4,ans);
       
	}

}
