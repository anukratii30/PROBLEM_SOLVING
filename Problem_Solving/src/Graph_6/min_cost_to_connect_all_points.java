package Graph_6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
public class min_cost_to_connect_all_points {
	

	class Solution {
	    public int minCostConnectPoints(int[][] points) {
	        int n = points.length;
	        ArrayList<int[]>[] adjList = new ArrayList[n];
	        for (int i = 0; i < n; i++) {
	            adjList[i] = new ArrayList<>();
	        }

	        // create graph
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int x1 = points[i][0];
	                int x2 = points[i][1];
	                int y1 = points[j][0];
	                int y2 = points[j][1];
	                int distance = Math.abs(x1 - y1) + Math.abs(x2 - y2);
	                adjList[i].add(new int[] { j, distance });
	                adjList[j].add(new int[] { i, distance });
	            }
	        }

	        int result = 0;
	        HashSet<Integer> visited = new HashSet<>();
	        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
	        queue.offer(new int[] { 0, 0 });

	        while (visited.size() < n && !queue.isEmpty()) {
	            int[] pair = queue.poll();
	            int currentNode = pair[0];
	            int currentWeight = pair[1];
	            if (visited.contains(currentNode))
	                continue;
	            visited.add(currentNode);
	            result += currentWeight;
	            for (int[] edge : adjList[currentNode]) {
	                if (visited.contains(edge[0]))
	                    continue;
	                queue.offer(edge);
	            }
	        }

	        return result;
	    }
	}


}
