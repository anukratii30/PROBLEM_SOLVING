package Graph_2;

import java.util.LinkedList;
import java.util.Queue;

public class Knight_On_Chess {
	class Pair {
		int row;
		int col;
		int moves;

		Pair(int row, int col, int moves) {
			this.row = row;
			this.col = col;
			this.moves = moves;
		}

	public int knightNumber(int row, int col, int starti, int startj, int endi, int endj) {

		int visited[][] = new int[row + 1][col + 1];
		Queue<Pair> q = new LinkedList<>();

		// Initialize visited array
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				visited[i][j] = 0;
			}
		}

		// Knight moves
		int dr[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
		int dc[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		q.add(new Pair(starti, startj, 0));

		while (!q.isEmpty()) {
			Pair p = q.remove();
			int r = p.row;
			int c = p.col;
			int m = p.moves;
			visited[r][c] = 1;

			if (r == endi && c == endj) {
				return m;
			}

			// Explore knight's moves
			for (int i = 0; i < 8; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				if (nr >= 1 && nr <= row && nc >= 1 && nc <= col && visited[nr][nc] == 0) {
					q.add(new Pair(nr, nc, m + 1));
					visited[nr][nc] = 1; // Mark the position as visited
				}
			}
		}
		return -1; // No path found
	}
	
}
