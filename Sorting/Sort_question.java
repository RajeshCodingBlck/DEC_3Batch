package Sorting;

public class Sort_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3,1,10,1,5,11};
      
      int target= 13;
      for(int i=0;i< arr.length;i++) {
    	  
    	  for(int j= i+1;j<arr.length;j++) {
    		  
    		 // System.out.println("pair is " + arr[i] + " , " + arr[j]);
    		  
    		  if(arr[i]+arr[j]==target) {
    			  System.out.println("pair is " + arr[i] + " , " + arr[j]);
    			  
    		  }
    	  }
      }
      
	}

}
