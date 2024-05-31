package Tree;

public class TreeNode {
   
	int data;
	TreeNode  left;
	TreeNode  right;
	
	TreeNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
	 
	TreeNode(int data, TreeNode left, TreeNode right){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
