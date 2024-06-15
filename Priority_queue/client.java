package Priority_queue;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyPriorityQueue pq= new MyPriorityQueue();
       pq.add(12);
       pq.add(54);
       pq.add(34);
       System.out.println(pq.peek());
       pq.remove();
       System.out.println(pq.peek());
       
	}

}
