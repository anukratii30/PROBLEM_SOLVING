package TREE_4_AND_5;

public class Validate_Binary_Search_Tree {
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, null, null);
	}

	private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
		if (root == null)
			return true;
		if (minNode != null && root.val <= minNode.val)
			return false;
		if (maxNode != null && root.val >= maxNode.val)
			return false;

		return //
		isValidBST(root.left, minNode, root) && //
				isValidBST(root.right, root, maxNode);
	}

}
