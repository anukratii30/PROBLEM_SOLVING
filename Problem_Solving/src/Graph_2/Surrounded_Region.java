package Graph_2;

public class Surrounded_Region {
	public void solve(char[][] mat) {
		int n = mat.length;
		int m = mat[0].length;

		int visited[][] = new int[n][m];

		for (int j = 0; j < m; j++) {

			if (visited[0][j] == 0 && mat[0][j] == 'O') {

				dfs(0, j, visited, mat);
			}

			if (visited[n - 1][j] == 0 && mat[n - 1][j] == 'O') {

				dfs(n - 1, j, visited, mat);
			}
		}

		for (int i = 0; i < n; i++) {

			if (visited[i][0] == 0 && mat[i][0] == 'O') {

				dfs(i, 0, visited, mat);
			}

			if (visited[i][m - 1] == 0 && mat[i][m - 1] == 'O') {
				dfs(i, m - 1, visited, mat);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (visited[i][j] == 0 && mat[i][j] == 'O')
					mat[i][j] = 'X';
			}
		}

		return;
	}

	void dfs(int row, int col, int visited[][], char mat[][]) {
		visited[row][col] = 1;
		int n = mat.length;
		int m = mat[0].length;

		int nrow = row + 1;
		int ncol = col;

		if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && mat[nrow][ncol] == 'O') {
			dfs(nrow, ncol, visited, mat);
		}

		nrow = row - 1;
		ncol = col;

		if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && mat[nrow][ncol] == 'O') {
			dfs(nrow, ncol, visited, mat);
		}

		nrow = row;
		ncol = col + 1;

		if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && mat[nrow][ncol] == 'O') {
			dfs(nrow, ncol, visited, mat);
		}

		nrow = row;
		ncol = col - 1;

		if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && mat[nrow][ncol] == 'O') {
			dfs(nrow, ncol, visited, mat);
		}
	}

}
