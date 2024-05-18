package My_Queue;

public class MyQueue {
    
	// State
	private int [] arr;
	private int front; // front element ka Index
	private int rear; // Last element ka index.
	
	public MyQueue(int size){
		arr= new int [size];
		front=-1;
		rear=-1;
	}
	
	public boolean IsEmpty() {
		
		if(front==-1 && rear==-1) {
			return true;
		}
		
		return false;
	}
	
	public boolean IsFull() {
		
//		if(rear==arr.length-1) {
//			return true;
//		}else {
//			return false;
//		}
		
		if((rear+1)%arr.length==front) {
			return true;
		}else {
			return false;
		}
	}
	
	public int front() throws Exception{
		
		if(IsEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		return arr[front];
		
	}
	
	public void Enqueue(int val) throws Exception {
		
		if(IsFull()) {
			 throw new Exception("Bhai Kyu add Kar raha he"); 
		}else if(IsEmpty()) {
			
//			front++;
//			rear++;
			front= (front+1)%arr.length;
			rear= (rear+1)%arr.length;
			arr[rear]=val;
		}else {
			//rear++;
			rear= (rear+1)%arr.length;
			arr[rear]=val;
		}
	}
	
	public int Dequeue() throws Exception{
		
		if(IsEmpty()) {
			
			throw new Exception("Kyu Nikal Rahe ho");
		}else if(front==rear) {
	// this condition is true Only when one eleement is there.
			int ans=arr[front];
			front=-1;
			rear=-1;
			return ans;
		}else {
			int ans=arr[front];
			//front++;
			front= (front+1)%arr.length;
			return ans;
		}
	}
	
}
