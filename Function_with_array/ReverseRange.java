package Function_with_array;

public class ReverseRange {
  
	public static void reverseRange(int [] arr, int s, int e) {
		
		int i=s;
		int j=e;
		
		while(i<=j){		
			// Swap
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int [] arr= {1,2,3,4,5,6};
		reverseRange(arr, 1,4);	
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
