package InbuildStack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseTheStack {

public static void InsertAtBottom(Stack<Integer> st, int val) {
		
		if(st.isEmpty()) {
			
			st.push(val);
			return;
		}
		int data= st.pop();
		//System.out.println(data);
		InsertAtBottom(st, val);
		st.push(data);	
	}

	public static void reverse(Stack<Integer> st) {
		
		if(st.isEmpty()) {
			
			return;
		}
		
		int data=st.pop();
		reverse(st);
		InsertAtBottom(st,data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	       Stack<Integer> st= new Stack();
	       
	       int n= s.nextInt();
	       
	       for(int i=1; i<=n;i++) {
	    	   int val= s.nextInt();
	    	   st.push(val);
	       }
	       System.out.println(st);
	       reverse(st);
	       System.out.println(st);
	       
	}

}
