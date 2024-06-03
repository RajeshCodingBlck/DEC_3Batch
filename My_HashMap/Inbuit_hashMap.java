package My_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Inbuit_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // Key , value  
		HashMap<String, Integer> map= new HashMap();
		
		// add -> put
		map.put("Mohan", 34);
		map.put("Sohan",40 );
		map.put("Rahul", 60);
		map.put("Sohan", 34);
		map.put(null, 45);
		System.out.println(map);
		
		// read
	    System.out.println(map.get("Rajesh"));
	    
	    // update
	    map.put("Sohan", 56);
	    System.out.println(map);
	    
	    // remove
	    map.remove("Sohan");
	    System.out.println(map);
	    
	    // check
	    if(map.containsKey("Mohan")) {
	    	System.out.println(map.get("Mohan"));
	    }
	    
//	    ArrayList<Integer> arr= new ArrayList();
//	    arr.add(1);
//	    arr.add(2);
//	    arr.add(3);
//	    arr.add(4);
	    
//	    for(int i=0; i<arr.size();i++) {
//	    	System.out.print(arr.get(i)+" ");
//	    }
//	    System.out.println();
//	     // for Each
//	     for( Integer val: arr) {
//	    	 
//	    	System.out.print(val+" "); 
//	     }
	    
	     for( String key : map.keySet()) { 
	    	 System.out.println(key+ " "+ map.get(key));
	     }
		
	}

}
