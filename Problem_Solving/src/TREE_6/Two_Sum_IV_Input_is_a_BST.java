package TREE_6;

import java.util.ArrayList;

public class Two_Sum_IV_Input_is_a_BST {
	class TreeNode {
		public int minNode, maxNode, maxSize;
		TreeNode left;
		TreeNode right;
		int val;
	}

	ArrayList<Integer> al = new ArrayList<>();

	public void inorder(TreeNode root) {
		if (root == null)
			return;

		inorder(root.left);
		al.add(root.val);
		inorder(root.right);
	}

	public boolean findTarget(TreeNode root, int k) {
		inorder(root);

		int n = al.size();

		int i = 0;
		int j = n - 1;

		while (i < j) {
			int sum = al.get(i) + al.get(j);

			if (sum == k)
				return true;

			else if (sum < k)
				i++;
			else if (sum > k)
				j--;

		}

		return false;
	}
}
