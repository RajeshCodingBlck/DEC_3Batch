package MyStack;

public class Stack {
    
	 protected int [] arr;
	 protected int top;
	 
	 public Stack(int size){
		 
		 arr= new int[size];
		 top=0;
	 }
	 
	 public void push(int val) throws Exception {
		 
		  if(top== arr.length) {
//			  System.out.println("Bhai Kyu Dal raha he");
			  
			 try {
				 
				 throw  new Exception("Bhai Kyu Dal raha he");
			 }catch(Exception e1) {
				 
				 System.out.println(e1);
				 
			 }
			 
		  }else {
			  arr[top]=val;
			  top++;
		  }
	 }
	 
	 public void pop()  throws Exception{
		 
		  if(top==0) {
//			  System.out.println("Bhai Kyu Nikal raha he");
			  
			  throw new Exception("Bhai Kyu Nikal raha he");
		  }else {
			  top--;
		  }
	 }
	 
	 public int peek() throws Exception {
		 
		 if(top==0) {
			
			 throw new Exception("Bhai Kyu dekh raha he");
			
		 }else {
			 
			 int ans= arr[top-1];
			 return ans;
		 }	 
	 }
	 
	 public int size() {
		 
		 return top;
	 }
	 
	 public boolean IsEmpty() {
		 
		 if(top==0) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
}
