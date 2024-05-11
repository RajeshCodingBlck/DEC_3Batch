package InbuildStack;

import java.util.*;

public class InBuiltStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<Integer> st= new Stack();
       System.out.println(st);
       
       st.push(12);
       st.push(23);
       st.push(24);
       System.out.println(st);// [12,23,24]
       System.out.println(st.pop());//24
       System.out.println(st.peek());// 23
       System.out.println(st.size());//2
       System.out.println(st.isEmpty());//false
       
       
       
       
	}

}
