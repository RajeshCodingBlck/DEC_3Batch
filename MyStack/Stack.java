package MyStack;

public class Stack {
    
	 private int [] arr;
	 private int top;
	 
	 Stack(int size){
		 
		 arr= new int[size];
		 top=0;
	 }
	 
	 public void push(int val) {
		 
		  if(top== arr.length) {
			  System.out.println("Bhai Kyu Dal raha he");
		  }else {
			  arr[top]=val;
			  top++;
		  }
	 }
	 
	 public void pop() {
		 
		  if(top==0) {
			  System.out.println("Bhai Kyu Nikal raha he");
		  }else {
			  top--;
		  }
	 }
	 
	 public int peek() {
		 
		 if(top==0) {
			 
			System.out.println("Bhai kyu Dekh raha he");
			return -1;
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
