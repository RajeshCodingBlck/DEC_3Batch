package Function_with_array;

public class Case_study_2 {

	public static void swap(int [] arr, int [] brr) {
		
		
		int [] temp= arr;
		arr=brr;
		brr=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // int [] arr= new int[0];
		
		int [] arr= {1,2,3,4,5};	
		int [] brr= {10,20,30,40,50};	
		System.out.println(arr[0]+ " , "+ brr[0]);
		swap(arr, brr);
		System.out.println(arr[0]+ " , "+ brr[0]);
      
	}

}
