package recursion_1;

public class SortArray {
   
	public static void Insert(int [] arr, int i, int item) {
		
		
		while(i>=0 && arr[i]> item) {
			
			// shift
			arr[i+1]=arr[i];
			i--;
		}
		
		arr[i+1]=item;
	}
	public static void Sort(int [] arr, int n) {
		
		if(n==1) {
			return ;
		}
		
		Sort(arr, n-1);
		Insert(arr, n-2,arr[n-1]);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,3,1,10,4,2,5};
     
     Sort(arr, arr.length);
     
     for(int i=0; i<arr.length;i++) {
    	 System.out.print(arr[i]+" ");
     }
     
	}

}
