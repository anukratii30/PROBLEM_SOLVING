package Graph_1;

import java.util.ArrayList;
import java.util.List;

public class minimum_number_of_vertices_to_reach_all_nodes {
	class Solution {
	    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
	        List<Integer> ans=new ArrayList<>();
	        int[] indegree=new int[n];
	        for(List<Integer> edge:edges){
	            indegree[edge.get(1)]++;
	        }
	        for(int i=0;i<n;i++){
	            if(indegree[i]==0){
	                ans.add(i);
	            }
	        }
	        return ans;
	    }
	}

}
