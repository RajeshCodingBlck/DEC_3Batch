package My_HashMap;

import java.util.HashMap;

public class Question1 {

	public static void Unique(int [] arr) {
		
		HashMap<Integer, Integer> mp= new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				
				int old_fre= mp.get(arr[i]);
				mp.put(arr[i], old_fre+1);
				
			}else {
			  mp.put(arr[i], 1);
			}
		}
		
		for(Integer key : mp.keySet()) {
			
			int fre= mp.get(key);
			if(fre==1) {
				System.out.println(key);
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int [] arr= {1,1,2,2,4,4,5,10,3};
	   Unique(arr);
	   
	}

}
