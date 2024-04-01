package TREE_1_AND_2;

public class Height_of_Bianry_Tree {
	public static int heightofBT(Treenode root){
	    if(root==null){
	      return null;
	    }
	    int left_subtree=heightofBT(root.left);
	    int right_subtree=heightofBT(root.right);
	    return Math.max(left_subtree,right_subtree)+1;
	  }

}
