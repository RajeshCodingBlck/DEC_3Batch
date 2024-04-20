package Quick_sort;

public class Quick_sort {
   
	public static void QuickSort(int [] arr, int s, int e) {
		
		      if(s>=e) {
		    	  return;
		      }
		
		     int index= Partition(arr, s, e);
		     QuickSort(arr, s, index-1);
		     QuickSort(arr, index+1,e);
		     
	}
	private static int Partition(int[] arr, int s , int e) {
		// TODO Auto-generated method stub
		
		int index=s;
		int pivot= arr[e];
		for(int i=s; i<e; i++) {
			
			 if(arr[i]>= pivot) { 
				 continue;
			 }else {
				 
				 int temp= arr[i];
				 arr[i]=arr[index];
				 arr[index]=temp;
				 index++;
			 }
		}
		int temp=arr[index];
		arr[index]=arr[e];
		arr[e]=temp;
		
		return index;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {5,3,1,10,9,7,9,6};
		
		QuickSort(arr,0, arr.length-1);
		
//		int index=Partition(arr);
		
		//System.out.println(index);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
