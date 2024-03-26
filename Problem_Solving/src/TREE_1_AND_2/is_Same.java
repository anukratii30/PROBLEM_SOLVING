package TREE_1_AND_2;

import TREE_1_AND_2.Level_order_traversal.Node;

public class is_Same {
	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean isSameTree(Node p,Node q) {
	        
	        if(p == null && q == null) return true;

	        if(q == null || p == null) return false;
	        if(p.val != q.val) return false;

	        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
	    }

}
