package TREE_3;
public class Diameter_of_binary_tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
		// length of the longest path b/w any node in a tree
		// not require to involve root node

		// if you count node =1, then
		// do {left + right}
		// if you count edge
		// then left +right +2
		public int diameterOfBinaryTree(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int ld = diameterOfBinaryTree(root.left);
			int rd = diameterOfBinaryTree(root.right);
			int sd = ht(root.left) + ht(root.right) + 2;

			return Math.max(sd, Math.max(rd, ld));
		}

		public int ht(TreeNode nn) {
			if (nn == null) {
				return -1;
			}
			int lh = ht(nn.left);
			int rh = ht(nn.right);
			return Math.max(lh, rh) + 1;
		}
	}

}
