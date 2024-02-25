package Sorting;

public class Selection_sort {
   
	public static int GetminIndex(int [] arr, int s, int e) {
		
		int min_val= arr[s];
		int index=s;	
		for(int i=s+1; i<=e;i++) {
			
			if(arr[i]< min_val) {
				min_val=arr[i];
				index=i;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {10,2,21,-1,3,2,4};
       
       for(int i=0; i<arr.length;i++) {
    	   
    	   int index= GetminIndex(arr, i, arr.length-1);
    	   
    	   int temp= arr[index];
    	   arr[index]=arr[i];
    	   arr[i]=temp;
       }
       
       
	}

}
