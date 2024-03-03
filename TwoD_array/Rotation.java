package TwoD_array;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {
				 {1,2,3,4},
				 {5,6,7,8},
				 {9,10,11,12},
				 {13,14,15,16}
	      };
		
	      
	      int row= arr.length;
	      int col= arr[0].length;
	      
	      // Transpose
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
	      
	      // reverse
	      
	      for(int j=0; j<col;j++) {
	    	  
	    	  int i1=0;
	    	  int i2=row-1;
	    	  
	    	  while(i1<i2) {
	    		  
	    		  int temp= arr[i1][j];
	    		  arr[i1][j]=arr[i2][j];
	    		  arr[i2][j]=temp;
	    		  i1++;
	    		  i2--;
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
