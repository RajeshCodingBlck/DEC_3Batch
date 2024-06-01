package Tree;

import java.util.LinkedList;

public class heightofTree {
    
	public static int height_with_Edge(TreeNode root) {
		
		if(root==null) {
			return -1;
		}
		
		int left_height = height(root.left);
		int right_height= height(root.right);
		
		int mera_height= Math.max(left_height, right_height)+1;
		return mera_height;
	}
	
	public static int height(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		int left_height = height(root.left);
		int right_height= height(root.right);
		
		int mera_height= Math.max(left_height, right_height)+1;
		return mera_height;
		
	}
	public static void BFS(TreeNode root) {
		
		if(root==null) {
			return ;
		}
		LinkedList<TreeNode> q= new LinkedList();
		q.add(root);
		while(q.size()>0) {
			
			// remove the Node
			TreeNode rn= q.removeFirst();
			// work
			System.out.print(rn.data+" ");
			// add the children
			if(rn.left !=null) {
				q.addLast(rn.left);
			}	
			if(rn.right!=null) {
				q.addLast(rn.right);
			}
		} 
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		// 1 2 -1 -1 3 4 -1 -1 5 -1 -1
        MyTree tree= new MyTree();
        System.out.println(height(tree.root));
        BFS(tree.root);
	}

}
