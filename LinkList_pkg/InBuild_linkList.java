package LinkList_pkg;

import java.util.LinkedList;

public class InBuild_linkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  LinkedList<Integer> list= new LinkedList();
	  System.out.println(list);
	  
	  // Adding at First
	  list.addFirst(10);
	  list.addFirst(20);
	  System.out.println(list);
	  
	  // Adding At Lst in LinkedList
	  list.addLast(30);
	  System.out.println(list);
	  
	  // Adding at Any index.
	  list.add(1, 50);
	  System.out.println(list);
	  
	  // remove from First
	  list.removeFirst();
	  System.out.println(list);
	  
	  // remove from Last
	  list.removeLast();
	  System.out.println(list);
	  
	  // remove from any index.
	  list.remove(1);
	  System.out.println(list);
	  
	  list.addFirst(30);
	  list.addLast(40);
	  System.out.println(list);
	  
	  // Get at any index
	  System.out.println(list.get(0));
	  
	  
	  // Set at any index
	  list.set(0, 60);
	  System.out.println(list);
	  
	}

}
