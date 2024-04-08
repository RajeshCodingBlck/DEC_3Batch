package revision_2;

public class Subarray_print {
    
	public static void SubarrayPrint(int [] arr) {
		
		
		for(int s=0; s<arr.length;s++) {
			
			for(int e=s; e<arr.length;e++) {
				
				 System.out.println("Cut is from "+ s+ " , "+e);
				 
				 // loop for Print
				 for(int i=s; i<=e;i++) {
					 System.out.print(arr[i]+" ");
				 }
				 
				 System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5};
       
       SubarrayPrint(arr);
       
	}

}
