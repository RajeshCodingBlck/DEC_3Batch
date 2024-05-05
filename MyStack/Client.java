package MyStack;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack mystack= new Stack(5);
        
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        
        System.out.println(mystack.size());
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        System.out.println(mystack.size());
        System.out.println(mystack.peek());
        
        int [] arr= new int[3];
        System.out.println(arr[3]);
	}

}
