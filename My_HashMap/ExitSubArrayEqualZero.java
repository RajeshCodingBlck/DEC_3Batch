package My_HashMap;

import java.util.HashMap;

public class ExitSubArrayEqualZero {
   
// find :- Check whether Any Subarray is there whose Sum is Equal to Zero.
	public static boolean check(int [] arr) {
		
		int [] prefix=new int [arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefix[i]=arr[i]+prefix[i-1];
			
		}
		
		HashMap<Integer, Integer> m= new HashMap();	
		for(int i=0; i<prefix.length;i++) {			
			if(m.containsKey(prefix[i])) {
				int old_fre= m.get(prefix[i]);
				m.put(prefix[i], old_fre+1);
			}else {
				m.put(prefix[i], 1);
			}
		}
		
		for(Integer key : m.keySet()) {
			int fre= m.get(key);
			if(fre>=2) {
				return true;
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int [] arr= {1,2,-2,+1,+1,4,5};
		  int [] brr= {1,2,3,4,5};
		 System.out.println(check(brr));
	}

}
