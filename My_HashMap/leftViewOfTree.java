package My_HashMap;
import Tree.*;
import java.util.*;
public class leftViewOfTree {
   
	public static void Preorder(TreeNode root, int level, HashMap<Integer, TreeNode> m) {
		
		if(root==null) {
			return;
		}
		if(!m.containsKey(level)) {
			m.put(level, root);
		}
		Preorder(root.left, level+1, m);
		Preorder(root.right, level+1, m);
	}
   public static void Preorder_topView(TreeNode root, int x, HashMap<Integer, TreeNode> m) {
		
		if(root==null) {
			return;
		}
		//System.out.println(x+ " "+ root.data);
		if(!m.containsKey(x)) {
		  System.out.println(x);
			m.put(x, root);
		}
		Preorder_topView(root.left, x-1, m);
		Preorder_topView(root.right, x+1, m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyTree tree= new MyTree();
       HashMap<Integer, TreeNode> m= new HashMap();
       Preorder_topView(tree.root, 0, m);
      // tree.preOrder(tree.root);
       
       for(Integer key : m.keySet()) {
    	   System.out.println(key + " -> "+ m.get(key).data);
       }
       // 1 2 4 -1 -1 -1 3 4 5 -1 -1 -1 -1
       // 1 2 4 -1 -1 -1 3 -1 -1
       
	}

}
