package Sorting;

public class QuestionofPartial_sorted_array {
   
	public static void Insert(int [] arr, int i, int temp) {
		
		  while(i>=0 && arr[i]>=temp ) {
			  
			  // Shift
			  arr[i+1]=arr[i];
			  i--;
		  }
		  
		  arr[i+1]=temp;
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {6,10,11,13,14,15,1};
		
//		Insert(arr, arr.length-2, arr[arr.length-1]);	
			
		for(int i=1; i<arr.length;i++) {
			
			Insert(arr, i-1,arr[i]);
			
		}
		for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
