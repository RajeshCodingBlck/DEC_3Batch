package TwoD_array;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] arr= {
				 {1,2},
				 {3,4}
	      };
	      
	      int row= arr.length;
	      int col= arr[0].length;
	      
	      for(int i=0; i<row;i++) {
	    	  for(int j=i; j<col;j++) {
	    		  
	    		  // Swap between (i,j) and (j,i);	  
	    		  int temp= arr[i][j];
	    		  arr[i][j]=arr[j][i];
	    		  arr[j][i]=temp;
	    		  
//	    	System.out.println(" Swap between "+"("+ i+ " , "+ j+" ) "
//	    			+"("+ j+ " , "+ i + ")");
	    	  }
	    	  
	      }
	      
	      
	      for(int i=0; i<row; i++) {
	    	  for(int j=0; j<col;j++) {
	    		  
	    		  System.out.print(arr[i][j]+" ");
	    	  }
	    	  System.out.println();
	      }
	      
	      
	}

}
