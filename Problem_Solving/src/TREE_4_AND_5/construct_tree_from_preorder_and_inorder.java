package TREE_4_AND_5;

public class construct_tree_from_preorder_and_inorder {
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

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return createTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
	}

	private TreeNode createTree(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}
		TreeNode node = new TreeNode(pre[plo]);
		int idx = search(in, ilo, ihi, pre[plo]);
		int nel = idx - ilo;
		node.left = createTree(pre, in, plo + 1, plo + nel, ilo, idx - 1);
		node.left = createTree(pre, in, plo + nel + 1, phi, idx + 1, ihi);
		return node;
	}

	private int search(int[] in, int si, int ei, int item) {
		// TODO Auto-generated method stub
		for (int i = si; i <= ei; i++) {
			if (in[i] == item) {
				return i;
			}
		}
		return 0;
	}

}
