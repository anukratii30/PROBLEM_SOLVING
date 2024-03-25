package TREE_1_AND_2;

import java.util.LinkedList;
import java.util.Queue;



public class Level_order_traversal {
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void levelorder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp= q.remove();
			System.out.print(temp.data +" ");
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		System.out.println();
	}


}
