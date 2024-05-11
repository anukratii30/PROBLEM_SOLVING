package Graph_6;
import java.util.Arrays;
public class redundant_connection {
	

	class Solution {
	    int[] parent;

	    public int[] findRedundantDirectedConnection(int[][] edges) {
	        int n = edges.length;
	        parent = new int[n + 1];
	        Arrays.fill(parent, -1);

	        int[] secondEdge = null;
	        int[] firstEdge = null;
	        boolean hasTwoParents = false;

	        for (int[] edge : edges) {
	            int from = edge[0];
	            int to = edge[1];

	            if (parent[to] == -1) {
	                parent[to] = from;
	            } else {
	                hasTwoParents = true;
	                secondEdge = edge;
	                firstEdge = new int[] { parent[to], to };
	                break;
	            }
	        }

	        int[] result = null;
	        if (!hasTwoParents) {
	            for (int[] edge : edges) {
	                int from = edge[0];
	                int to = edge[1];

	                int leader = find(from);
	                if (leader == to) {
	                    result = edge;
	                    break;
	                } else {
	                    parent[to] = leader;
	                }
	            }
	        } else {
	            boolean isCycle = false;
	            for (int[] edge : edges) {
	                if (Arrays.equals(edge, secondEdge))
	                    continue;
	                int from = edge[0];
	                int to = edge[1];

	                int leader = find(from);

	                if (leader == to) {
	                    isCycle = true;
	                    break;
	                } else {
	                    parent[to] = leader;
	                }
	            }
	            if (isCycle) {
	                result = firstEdge;
	            } else {
	                result = secondEdge;
	            }
	        }
	        return result;
	    }

	    public int find(int x) {
	        if (parent[x] == -1)
	            return x;
	        return parent[x] = find(parent[x]);
	    }
	}


}
