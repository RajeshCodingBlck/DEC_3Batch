package Function_with_array;
import java.util.*;

public class GetMin {
    
	public static int getMin(int [] arr) {
		
		int min_val=arr[0];		
		for(int i=1; i< arr.length; i++) {			
			   if(min_val> arr[i]) {
				   min_val=arr[i];
			   }
		}	
		return min_val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();		
		int [] arr= new int[size];		
		for(int i=0; i<size;i++) {
			arr[i]=s.nextInt();
		}		
		int min_val= getMin(arr);		
		System.out.println(min_val);
				
	}

}
