package Priority_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class cmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
	    
		if(o1>o2) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
public class Inbuit_PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      PriorityQueue<Integer> pq= new PriorityQueue(new cmp());
      pq.add(34);
      pq.add(15);
      pq.add(56);
      System.out.println(pq.peek());
      pq.remove();
      System.out.println(pq.peek());
      pq.add(20);
      System.out.println(pq);
      ArrayList<Integer> arr= new ArrayList();
      Collections.sort(arr);
      
      
	}

}
