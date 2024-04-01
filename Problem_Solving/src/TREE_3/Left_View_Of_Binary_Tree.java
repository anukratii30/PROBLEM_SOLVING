package TREE_3;

public class Left_View_Of_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Node {
	    int data;
	    Node left, right;
	 
	    public Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	class BinaryTree {
	    Node root;
	    static int max_level = 0;
	 
	    // recursive function to print left view
	    void leftViewUtil(Node node, int level)
	    {
	        // Base Case
	        if (node == null)
	            return;
	 
	        // If this is the first node of its level
	        if (max_level < level) {
	            System.out.print(node.data + " ");
	            max_level = level;
	        }
	 
	        // Recur for left and right subtrees
	        leftViewUtil(node.left, level + 1);
	        leftViewUtil(node.right, level + 1);
	    }
	
	    void leftView()
	    {
	        max_level = 0;
	        leftViewUtil(root, 1);
	    }
	}
}
