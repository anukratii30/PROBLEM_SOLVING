package TREE_4_AND_5;

public class Max_sum_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSumBST(TreeNode root) {
	    traverse(root);
	    return ans;
	  }

	  private int ans = 0;

	  private T traverse(TreeNode root) {
	    if (root == null)
	      return new T(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);

	    T left = traverse(root.left);
	    T right = traverse(root.right);

	    if (!left.isBST || !right.isBST)
	      return new T();
	    if (root.val <= left.max || root.val >= right.min)
	      return new T();

	    // The `root` is a valid BST.
	    final int sum = root.val + left.sum + right.sum;
	    ans = Math.max(ans, sum);
	    return new T(true, Math.max(root.val, right.max), Math.min(root.val, left.min), sum);
	  }

}
