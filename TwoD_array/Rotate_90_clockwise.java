package TwoD_array;

public class Rotate_90_clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [][] arr= {
        		 {1,2,3},
        		 {5,6,7},
        		 {10,11,12}
        		 
         };
         
         Transpose(arr);
         reverse(arr);
         
         for(int i=0; i<arr.length;i++) {
        	 
        	 for(int j=0; j<arr[i].length;j++) {
        		 
        		 System.out.print(arr[i][j]+" ");
        	 }
        	 
        	 System.out.println();
         }
         
	}

	public static void reverse(int[][] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length;i++) {
			
			// reverse Approach;
			int j1=0;
			int j2= arr[i].length-1;
			
			while(j1<=j2) {
				
				int temp= arr[i][j1];
				arr[i][j1]=arr[i][j2];
				arr[i][j2]=temp;
				
				j1++;
				j2--;
			}
			
		}
		
	}

	public static void Transpose(int[][] arr) {
	
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr[i].length;j++) {
				
				// Swap
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
