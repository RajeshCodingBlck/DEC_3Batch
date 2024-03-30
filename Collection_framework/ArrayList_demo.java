package Collection_framework;

import java.util.ArrayList;

public class ArrayList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Integer> arr= new ArrayList();
		System.out.println(arr);
		// adding the item in ArrayList at the 
		arr.add(10);
		System.out.println(arr);
		arr.add(20);
		
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println(arr);
		// fetch the value from any index.
		arr.add(60);
		System.out.println(arr);
		System.out.println(arr.get(5));  // arr[2]
		
		// Update 
		arr.set(5, 100);
		System.out.println(arr);
		
		// remove
		
		arr.remove(3);
		
		System.out.println(arr);
		
		
		
		
		
		
		
		
	}

}
