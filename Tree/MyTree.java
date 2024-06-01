package Tree;

import java.util.Scanner;

public class MyTree {
    
	TreeNode root;
	Scanner s= new Scanner(System.in);
	MyTree(){
		root=BuildTree();
	}
	
	private TreeNode BuildTree() {
		
	   System.out.println("Enter the Data ");
	   int data= s.nextInt();
	   
	   if(data==-1) {
		   return null;
	   }
	   // Work is Creating the Root Node.
	   TreeNode root= new TreeNode(data);
	   
	   System.out.println("Enter the Left child "+ data);
	    TreeNode leftTreeRoot=BuildTree();
	      // Left Subtree root  is my left child
	      root.left=leftTreeRoot;
	      
	   System.out.println("Enter the Right child "+ data); 
	   TreeNode RightTreeroot= BuildTree();
	   // Right Subtree root  is my Right child
	   root.right= RightTreeroot;
	   return root;
	   
	}
	
	void PostOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		PostOrder(root.left);
		PostOrder(root.right);
		// Work is Print the root Node Value
		System.out.print(root.data+" ");
	}
	
	void Inorder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		Inorder(root.left);
		// Work is Print the root Node Value
		System.out.print(root.data+" ");
		Inorder(root.right);
	}
	
	void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		// Work is Print the root Node Value 
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
