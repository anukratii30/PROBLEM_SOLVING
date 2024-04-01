package TREE_3;

public class Invert_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TreeNode invertTree(TreeNode root) {
	        if(root==null) return root;
	        invertTree(root.left);
	        invertTree(root.right);
	        TreeNode temp=root.left;
	        root.left=root.right;
	        root.right=temp;
	        return root;
	    }

}
