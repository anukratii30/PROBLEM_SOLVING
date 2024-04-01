package TREE_1_AND_2;

import java.util.ArrayList;
import java.util.Map;

public class Bottom_View_of_a_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ArrayList <Integer> bottomView(Node root)
	    {
	        ArrayList<Integer> ans = new ArrayList<>(); 
	        if(root == null) return ans;
	        Map<Integer, Integer> map = new TreeMap<>();
	        Queue<Node> q = new LinkedList<Node>();
	        root.hd = 0;
	        q.add(root); 
	        while(!q.isEmpty()) {
	            Node temp = q.remove();
	            int hd = temp.hd; 
	            map.put(hd, temp.data); 
	            if(temp.left != null) {
	                temp.left.hd = hd - 1; 
	                q.add(temp.left); 
	            }
	            if(temp.right != null) {
	                temp.right.hd = hd + 1; 
	                q.add(temp.right); 
	            }
	        }
	        
	        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
	            ans.add(entry.getValue()); 
	        }
	        return ans; 
	        
	    }

}
