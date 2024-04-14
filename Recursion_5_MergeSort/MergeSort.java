package Recursion_5_MergeSort;

public class MergeSort {
public static int [] Merge(int [] arr1, int [] arr2) {
		
		int n= arr1.length;
		int m= arr2.length;
		int [] ans= new int[n+m];
		int index=0;
		
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				ans[index]=arr1[i];
				i++;
				index++;
			}else {
				ans[index]=arr2[j];
				j++;
				index++;
			}
		}
		
		while(i<arr1.length) {
			ans[index]=arr1[i];
			i++;
			index++;
			
		}
		
		while(j<arr2.length) {
			ans[index]=arr2[j];
			j++;
			index++;
		}
		
		return ans;
	}

	public static int [] MergeSort(int [] arr, int s, int e) {
		
		if(s==e) {
			
			int [] base_ans= new int[1];
			base_ans[0]=arr[s];
			return base_ans;
		}
		
		
		int mid= (s+e)/2;
		int [] left=MergeSort(arr, s, mid);
		int [] right=MergeSort(arr, mid+1, e);
		
		int [] ans=Merge(left, right);
		    
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {3,1,7,10,2,9};
     
       int [] ans= MergeSort(arr,0, arr.length-1);
       
       for(int i=0;i<ans.length;i++) { 
    	   System.out.print(ans[i]+" ");
       }
       
       
        
	}

}
