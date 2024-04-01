package TREE_1_AND_2;

public class Odd_evenleveldifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int getLevelDiff(Node root)
	{
	    if(root==null) {
	    	return 0;
	    }
	    return root.data- getLevelDiff(root.left)- getLevelDiff(root.right);
	}

}
