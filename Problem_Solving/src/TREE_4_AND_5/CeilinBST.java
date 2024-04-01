package TREE_4_AND_5;

public class CeilinBST {
	//Given a BST and a number X, find Ceil of X.
	//Note: Ceil(X) is a number that is either equal to X or is immediately greater than X.

	//If Ceil could not be found, return -1.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int findCeil(TreeNode<Integer> root,int key) {
		int ceil =-1;
		while(root!=null) {
			if(root.data ==key) {
				ceil=root.data;
				return ceil;
			}
			if(key>root.data) {
				root = root.right;
			}
			else {
				ceil = root.data;
				root = root.left;
			}
		}return ceil;
	}

}
