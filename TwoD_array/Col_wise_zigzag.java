package TwoD_array;

public class Col_wise_zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] arr= {
	    		  {1,2,3,4},
	    		  {5,6,7,9},
	    		  {9,10,11,12},
	    		  {1,2,3,4}
	      };
	      
	      int row= arr.length;
	      int col= arr[0].length;
	      
	      for(int j=0; j<col;j++) {
	    	  
	    	  if(j%2==0) {
	    		  
	    		  for(int i=0; i<row;i++) {
	    			  System.out.print(arr[i][j]+" ");
	    		  }
	    		  
	    	  }else {
	    		  
	    		  for(int i=row-1; i>=0;i--) {
	    			  System.out.print(arr[i][j]+" ");
	    		  }
	    	  }
	    	  
	    	  System.out.println();
	      }
	}

}
