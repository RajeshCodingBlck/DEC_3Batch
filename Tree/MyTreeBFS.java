package Tree;

import java.util.*;

public class MyTreeBFS {

	TreeNode root;
	MyTreeBFS(){
		
		root=BuidTree();
	}
	private TreeNode BuidTree() {
		
		Scanner s= new Scanner(System.in);
		LinkedList<TreeNode> q= new LinkedList();
		
	    System.out.println("Enter the root data");
	    int data= s.nextInt();
	    
	    TreeNode root= new TreeNode(data);
	    q.add(root);
	    
	    while(q.size()>0) {
	    	
	    	// remove the front Node of Tree
	    	TreeNode rn= q.removeFirst();
	    	
	    	// work
	    	System.out.println("Enter the left child data of " +rn.data);
	    	int left_data= s.nextInt();
	    	 if(left_data !=-1) {
	    		 TreeNode leftchild= new TreeNode(left_data);
	    		 
	    		 rn.left=leftchild;
	    		 q.addLast(leftchild);
	    	 }
	    	
	    	
	    	System.out.println("Enter the Right child data of " +rn.data);
	    	int right_data= s.nextInt();
	    	
	    	if(right_data !=-1) {
	    		TreeNode rightchild= new TreeNode(right_data);
	    		rn.right=rightchild;
	    		 q.addLast(rightchild);
	    	}	
	    }
	    return root;
		
	}
	
	
}
