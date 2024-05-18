package My_Queue;

import java.util.Stack;

public class Queue_Using_Stack {

	 Stack<Integer> st;
	 
	 Queue_Using_Stack(){
		 st= new Stack();
	 }
	 
	 public boolean IsEmpty() {
		 
		 return st.isEmpty();
	 }
	 
	 public void Enqueue(int val) {
		 
		 st.push(val);
	 }
	 
	 public  void InsertAtBottom(Stack<Integer> st, int val) {
			
			if(st.isEmpty()) {
				
				st.push(val);
				return;
			}
			int data= st.pop();
			//System.out.println(data);
			InsertAtBottom(st, val);
			st.push(data);	
		}

		private  void reverse(Stack<Integer> st) {
			
			if(st.isEmpty()) {
				
				return;
			}
			
			int data=st.pop();
			reverse(st);
			InsertAtBottom(st,data);
		}
	 public int Dequeue() throws Exception{
		 
		 if(IsEmpty()) {
			 throw new Exception("Kyu Nikal rahe ho");
		 }
		 reverse(st);
		int ans= st.pop();
		 reverse(st);
		 return ans;
	 }
	  
	 
}
