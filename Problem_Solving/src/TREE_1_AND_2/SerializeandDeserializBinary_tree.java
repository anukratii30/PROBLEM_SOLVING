package TREE_1_AND_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import TREE_3.Diameter_of_binary_tree.TreeNode;

public class SerializeandDeserializBinary_tree {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root ) {
		if (root == null) {
			return "X";
	}

	String leftserialise = serialize(root.left);
	String rightserialise = serialize(root.right);

	return root.value+","+leftserialise+","+rightserialize;

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
	    String arr[] = data.split(",");
	    Queue<String> q  = new LinkedList<>();
	    for (int i = 0; i < arr.length; i++) {
			q.add(arr[i]);
		}
	    TreeNode root = deseialize(q);
	    return root;


}

	private static TreeNode deseialize(Queue<String> q) {
		// TODO Auto-generated method stub
		if(q.size()==0) {
			return null;
		}
		String peek = q.poll();
		if(peek.equals("X")) {
				return null;
				}
		TreeNode root = new TreeNode (Integer.parseInt(peek));
		root.left = deseialize(q);
		root.right = deseialize(q);
		return root;
	}

}
