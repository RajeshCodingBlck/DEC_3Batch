package Tree;

public class Client2 {
   
	public static int height(TreeNode root) {
		
		
	}
	public static int SumofTree(TreeNode root) {
		
		 if(root==null) {
			 return 0;
		 }

		int left_sum= SumofTree(root.left);
		int right_sum=SumofTree(root.right);
		
		int mera_sum=left_sum+right_sum+ root.data;
		return mera_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyTree tree= new MyTree();
//        System.out.println("PreOrder t")
//        tree.preOrder(tree.root);
        System.out.println(SumofTree(tree.root));
        
	}
    // 1 2 -1 -1 3 4 -1 -1 5 -1 -1
}
