package TREE_1_AND_2;

import TREE_1_AND_2.count_no_of_nodes.Node;

public class Depth_Of_Tree_or_Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//consider depth of root is 0
		//height of the tree = depth of tree
		int depthOfTree(Node root) {
			if(root==null) {
				return -1;//if you want to make it 0 then the root height is 1
			}
//			if(root.left == null && root.right==null) {
//				return 0;
//			}
			return 1+ Math.max(depthOfTree(root.left), depthOfTree(root.right));
		}


}
