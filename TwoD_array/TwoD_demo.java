package TwoD_array;

public class TwoD_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [][] arr= new int[3][4];
		
		System.out.println(arr);
		
	    for(int i=0; i<3;i++) {
	    	System.out.println(arr[i]);
	    }
	    
	    for(int i=0; i<3;i++) {
	    	
	    	for(int j=0; j<4;j++) {
	    		
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
	    
	}

}
