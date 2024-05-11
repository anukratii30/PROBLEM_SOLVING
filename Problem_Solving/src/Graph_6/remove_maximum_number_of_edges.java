package Graph_6;

import java.util.Arrays;

public class remove_maximum_number_of_edges {
	class DSU {
	    int[] p, r;

	    DSU(int n) {
	        p = new int[n + 1];
	        r = new int[n + 1];
	        Arrays.fill(r, 1);
	        for (int i = 0; i <= n; i++)
	            p[i] = i;
	    }

	    int find(int u) {
	        if (p[u] == u)
	            return u;
	        return p[u] = find(p[u]);
	    }

	    boolean union(int u, int v) {
	        int pu = find(u);
	        int pv = find(v);
	        if (pu == pv)
	            return false;
	        if (r[pu] < r[pv]) {
	            p[pu] = pv;
	        } else {
	            p[pv] = pu;
	            if (r[pu] == r[pv]) {
	                r[pu]++;
	            }
	        }
	        return true;
	    }
	}

	class Solution {
	    public int maxNumEdgesToRemove(int n, int[][] edges) {
	        int red = 0, b = 0, a = 0;
	        DSU ad = new DSU(n);
	        DSU bd = new DSU(n);
	        for (int[] e : edges) {
	            if (e[0] == 3) {
	                if (ad.union(e[1], e[2])) {
	                    bd.union(e[1], e[2]);
	                    b++;
	                    a++;
	                } else {
	                    red++;
	                }
	            }
	        }
	        for (int[] e : edges) {
	            if (e[0] == 1) {
	                if (ad.union(e[1], e[2]))
	                    a++;
	                else
	                    red++;
	            }
	            if (e[0] == 2) {
	                if (bd.union(e[1], e[2]))
	                    b++;
	                else
	                    red++;
	            }
	        }
	        if (b == n - 1 && a == n - 1) {
	            return red;
	        }
	        return -1;
	    }
	}


}
