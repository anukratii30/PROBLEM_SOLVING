package TREE_1_AND_2;

public class Find_Bottom_Left_Tree_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findBottomLeftValue(TreeNode root) {
	        Queue<TreeNode> q = new LinkedList<>();
	        q.offer(root);
	        TreeNode leftmost = null;

	        while (!q.isEmpty()) {
	            leftmost = q.poll();

	            if (leftmost.right != null) {
	                q.offer(leftmost.right);
	            }
	            if (leftmost.left != null) {
	                q.offer(leftmost.left);
	            }
	        }

	        return leftmost.val;
	    }

}
