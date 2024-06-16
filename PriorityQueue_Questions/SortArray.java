package PriorityQueue_Questions;

import java.util.Comparator;
import java.util.PriorityQueue;

class cmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1>o2) {
			return -1; 
		}else {
			return 1;
		}
	}
}
public class SortArray {
   
	public static void Sort(int [] arr) {
		
       PriorityQueue<Integer> pq= new PriorityQueue(new cmp());
       // Add All Element
       for(int i=0;i<arr.length;i++) {
    	   pq.add(arr[i]);
       }
       // Remove Elements one by one
       int index=0;
       while(pq.size()>0) {
    	   
    	   int peek_val= pq.peek();
    	   pq.remove();
    	   arr[index]=peek_val;
    	   index++;
       }
       
       
       
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {4,3,10,2,1};
     Sort(arr);
     for(int val : arr) {
    	 System.out.print(val+" ");
     }
     
     
	}

}
