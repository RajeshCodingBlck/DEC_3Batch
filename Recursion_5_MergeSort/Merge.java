package Recursion_5_MergeSort;

public class Merge {
    
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr1= {1,3,5,7,10,13};
       int [] arr2= {2,4, 5, 7, 12, 15};
       
       int [] ans= Merge(arr1, arr2); 
       for(int i=0; i<ans.length;i++) { 
    	   System.out.print(ans[i]+" ");
       }
       
	}

}
