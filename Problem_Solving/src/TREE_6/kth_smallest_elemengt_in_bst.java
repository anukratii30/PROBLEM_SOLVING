package TREE_6;

import TREE_6.Two_Sum_IV_Input_is_a_BST.TreeNode;

public class kth_smallest_elemengt_in_bst {
	class TreeNode {
		public int minNode, maxNode, maxSize;
		TreeNode left;
		TreeNode right;
		int val;
	}

	public int kthSmallest(TreeNode root, int k) {
		final int leftCount = countNodes(root.left);

		if (leftCount == k - 1)
			return root.val;
		if (leftCount >= k)
			return kthSmallest(root.left, k);
		return kthSmallest(root.right, k - 1 - leftCount); // leftCount < k
	}

	private int countNodes(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + countNodes(root.left) + countNodes(root.right);
	}

}
