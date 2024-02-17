package Function_with_array;

public class SearchInArray {

	public static boolean Search(int [] arr, int target) {
		
		for(int i=0; i<arr.length;i++) {
			
			System.out.println(i);
			if(arr[i]==target) {
				return true;
			}
			
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  int [] arr= {10,1,3,4,5};
	  
	  System.out.println(Search(arr, 100));
	  
	  
	  
	}

}
