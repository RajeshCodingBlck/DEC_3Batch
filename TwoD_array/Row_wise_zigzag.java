package TwoD_array;

public class Row_wise_zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] arr= {
    		  {1,2,3,4},
    		  {5,6,7,},
    		  {9,10,11,12},
    		  {1,2,3,4}
      };
      
      int row= arr.length;
      int col= arr[0].length;
      
      // i is for row
      for(int i=0; i<row;i++) {  	  
    	  if(i%2==0) { 
    		  // even row we have to left to right;
    		  // j is for col
    		  for(int j=0; j<col;j++) {
    			  System.out.print(arr[i][j]+" ");
    		  }	  
    	  }else {
    	     // Odd row we have to move right to left
    		  // j is for col
    		  for(int j=col-1; j>=0;j--) {
    			  System.out.print(arr[i][j]+" ");
    		  }
    	  }
    	  
    	  System.out.println();
      }
      
	}

}
