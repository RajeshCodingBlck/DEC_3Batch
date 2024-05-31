package Tree;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeNode n1= new TreeNode(1);
        TreeNode n2= new TreeNode(2);
        TreeNode n3= new TreeNode(3);
        TreeNode n4= new TreeNode(4);
        
        n1.left=n2;
        n1.right=n3;  
        n2.left=n4;
        
	}

}
