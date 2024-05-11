package InbuildStack;

import java.util.Stack;

public class Question1_InsertAtBottom {

	public static void InsertAtBottom(Stack<Integer> st, int val) {
		
		Stack<Integer> temp= new Stack();
		
		while(st.isEmpty()==false) {
			
			int temp2= st.pop();
			temp.push(temp2);
		}
		
		st.push(val);
		
		while(temp.isEmpty()==false) {
			
			int temp2= temp.pop();
			st.push(temp2);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<Integer> st= new Stack();
     
     st.push(1);
     st.push(2);
     st.push(3);
     System.out.println(st);
     InsertAtBottom(st, 34);
     System.out.println(st);
     
	}

}
