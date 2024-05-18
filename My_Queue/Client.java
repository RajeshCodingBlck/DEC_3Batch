package My_Queue;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        MyQueue q= new MyQueue(5);
        
        System.out.println(q.IsEmpty());
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
       // q.Enqueue(6);
        q.Dequeue();
        System.out.println(q.front());
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.Enqueue(45);
        
        System.out.println(q.front());
        System.out.println(q.IsEmpty());
        System.out.println(q.IsFull());
        
       
       
      
	}

}
