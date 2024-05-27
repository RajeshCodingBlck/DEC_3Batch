package LinkList_pkg;

public class MyLinkList {

	
	private Node head;

	MyLinkList(){
		head=null;
	}
	
	// Insert a node at Beginning.
	public void insertAtStart(int val) {
		
		// Create a Node
		Node new_node= new Node(val);
		new_node.next=head;
		head=new_node;
	}
	
	public void display() {
		
		Node temp=head;		
		while(temp !=null) {
			
		   System.out.print(temp.data+" -> ");
		   temp=temp.next;
		}	
	}
	
	public void InsertAtEnd(int val) {
		
		// LinkList is Empty
		if(head==null) {
			
			insertAtStart(val);
			return ;
		}
	    // Find the Tail
		 Node temp= head;
		 
		 while(temp.next !=null) {		 
			 temp=temp.next;
		 }
		 // create a Node
		 Node new_node= new Node(val);
		 temp.next=new_node;
		 	 
	}
	
	public void deleteAtBegin() throws Exception{
		
		if(head==null) {
			throw new Exception("LinkList is Empty");
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
	}
	
	public void deleteAtEnd() throws Exception {
		
		// Find the Second Last Node...
		if(head==null) {
			// throw Exception
			return ;
		}
		
		if(head.next==null) {
			deleteAtBegin();
			return;
		}	
		Node temp= head;
		while(temp.next.next !=null) {
			
			temp=temp.next;
		}	
		temp.next=null;	
	}
	
	public void InsertAtIndex(int val, int index) {
		
		if(index==0) {
			
			insertAtStart(val);
			return ;
		}
		int jump=index-1;
		Node temp= head;
		
		while(jump>0) {
			
			temp=temp.next;
			jump--;
		}
		
		Node new_node= new Node(val);
		new_node.next= temp.next;
		temp.next=new_node;	
	}
	
	public void deleteAtIndex(int index) {
		
		int jump=index-1;
		Node temp= head;
		
		while(jump>0) {
			
			temp=temp.next;
			jump--;
		}
		
		Node temp2= temp.next;
		temp.next=temp2.next;
		temp2.next=null;		
	}
	
	public int getAtIndex(int index) {
		
		int jump=index;
		Node temp= head;
		
		while(jump>0) {
			temp=temp.next;
			jump--;
		}
		
		return temp.data;
	}
	
	public void set(int index, int new_val) {
		
		int jump=index;
		Node temp= head;
		
		while(jump>0) {
			temp=temp.next;
			jump--;
		}
		
		 temp.data=new_val;
		
	}
	
	
}
