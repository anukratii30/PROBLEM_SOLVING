package TREE_6;
public class Construct_Binary_Search_Tree_from_Preorder_Traversal {
	class TreeNode {
		public TreeNode(int i) {
			// TODO Auto-generated constructor stub
		}
		public int minNode, maxNode, maxSize;
		TreeNode left;
		TreeNode right;
		int val;
	}
	public TreeNode constructBST(int[] preorder, int bound, int[] i) {
		if (i[0] == preorder.length || preorder[i[0]] > bound)
			return null;
		TreeNode root = new TreeNode(preorder[i[0]++]);
		root.left = constructBST(preorder, root.val, i);
		root.right = constructBST(preorder, bound, i);
		return root;
	}
	public TreeNode bstFromPreorder(int[] preorder) {
		return constructBST(preorder, Integer.MAX_VALUE, new int[] { 0 });
	}
}
