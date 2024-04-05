package TREE_4_AND_5;

import Tree_BST.Inserting_into_bst_701.TreeNode;

public class converted_sorted_array_to_BST {
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
	}

	public TreeNode sortedArrayToBST(int[] nums) {
	    return build(nums, 0, nums.length - 1);
	  }

	  private TreeNode build(int[] nums, int l, int r) {
	    if (l > r)
	      return null;
	    final int m = (l + r) / 2;
	    return new TreeNode(nums[m], build(nums, l, m - 1), build(nums, m + 1, r));
	  }

}
