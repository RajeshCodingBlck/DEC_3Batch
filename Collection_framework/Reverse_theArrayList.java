package Collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_theArrayList {

	public static void reverse(ArrayList<Integer> arr) {
		
		int i=0;
		int j= arr.size()-1;
		
		while(i<=j) {
			
			// swap
			int temp= arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			
			i++;
			j--;
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      ArrayList<Integer> arr= new ArrayList(
    		  Arrays.asList(1,2,3,4,5));
      
      Collections.reverse(arr);
      
      //reverse(arr);
      
      for(int i=0; i<arr.size();i++) {
    	  
    	  System.out.print(arr.get(i)+" ");
      }
      
      
      
      
      
      
	}

}
