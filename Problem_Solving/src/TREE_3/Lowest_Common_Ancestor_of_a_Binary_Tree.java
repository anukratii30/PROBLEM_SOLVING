package TREE_3;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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
		 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		        return ac(root, p, q);
			}
			private TreeNode ac(TreeNode root, TreeNode p, TreeNode q) {
				if (root == null) {
					return null;
				}
				if (root == p || root == q) {// main to return the addr
					return root;
				} 
				TreeNode left = ac(root.left , p, q);
				TreeNode right = ac(root.right, p , q);
				if(left!=null && right!=null) {
					return root;
				}
				else if(left == null) {
					return right;
				}
				else {
					return left;
				}
		    }
	}


}
