package DP1;

class Solution {
	public int climbStairs(int n) {
		if (n == 1 || n == 2) {
			return n;
		}

		int dp[] = new int[n];
		int i = dp[0];
		if (dp[i] != 0) {
			return dp[i];
		}
		int c1 = climbStairs(n - 1);
		int c2 = climbStairs(n - 2);
		return dp[i] = c1 + c2;
	}
}
