package Array_question_2;

public class PrintArrayINRange {
   
	public static void Print(int [] arr, int s, int e) {
		
		for(int i=s; i<=e;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      
       for(int start=0; start<arr.length;start++) {
    	   
    	   for(int end=start; end<arr.length; end++) {
    		   
    		   System.out.println(" cut is from "+start+ " to "+ end);
    		   Print(arr, start, end);
    	   }
       }
       
      
	}

}
