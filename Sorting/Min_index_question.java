package Sorting;

public class Min_index_question {
    
	public static int GetminIndex(int [] arr) {
		
		int min_val=arr[0];
		int index=0;	
		for(int i=1; i<arr.length;i++) {		
			if(arr[i]<min_val) {
				min_val=arr[i];
				index=i;
			}
		}
		
		//int min_val=arr[0];
//		int index=0;	
//		for(int i=1; i<arr.length;i++) {		
//			if(arr[i]<arr[index]) {
//				//min_val=arr[i];
//				index=i;
//			}
//		}
		
		return index;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {10,1,2,-1,3,2,10};
      
       System.out.println(GetminIndex(arr));
       
	}

}
