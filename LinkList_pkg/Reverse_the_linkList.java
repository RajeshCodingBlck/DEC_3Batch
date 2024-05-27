package LinkList_pkg;

public class Reverse_the_linkList {
	
	 // Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	class Solution {
	    public ListNode reverseList(ListNode head) {
	        
	        if(head==null || head.next==null){
	            
	            return head;
	        }
	       ListNode next= head.next;
	        head.next=null;
	       ListNode new_head= reverseList(next);
	        
//	         ListNode tail=new_head;
	        
//	         while(tail.next !=null){
//	             tail=tail.next;
//	         }
	        
	        next.next=head;
	        
	        return new_head;
	    }
	}
}
