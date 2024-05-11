package InbuildStack;

import java.util.*;

public class InsertAtBottom_Recursion {
   
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
       Stack<Integer> st= new Stack();
       
       int n= s.nextInt();
       
       for(int i=1; i<=n;i++) {
    	   int val= s.nextInt();
    	   st.push(val);
       }
   
       InsertAtBottom(st, 32);
       System.out.println(st);
       
       
	}

}
