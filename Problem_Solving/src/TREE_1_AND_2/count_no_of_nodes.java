package TREE_1_AND_2;

public class count_no_of_nodes {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	int countNumberOfNode(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + countNumberOfNode(root.left) + countNumberOfNode(root.right);
	}

	int sumOfNode(Node root) {
		if (root == null) {
			return 0;
		}
		return root.val + countNumberOfNode(root.left) + countNumberOfNode(root.right);
	}
    }