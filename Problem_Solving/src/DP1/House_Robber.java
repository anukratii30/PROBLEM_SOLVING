package DP1;

import java.util.Arrays;

public class House_Robber {
	class Solution {
	    public int rob(int[] nums) {
	       
	        int dp[] = new int [nums.length+1];
	        Arrays.fill(dp,-1);
	         return rob1(nums,0, dp);
	    }
	    public static int rob1(int[] nums, int idx ,int[] dp) {
	         if(idx>=nums.length) {
	        	 return 0 ;
	         }
	         if(dp[idx]!=-1){
	             return dp[idx];
	         }
	         int ro=nums[idx]+rob1(nums,idx+2, dp);
	         int dnr = rob1(nums, idx+1, dp);
	         return dp[idx]=Math.max(dnr, ro);//memoization
	         //Very happy , did by myself!!!!
		}
	}

}
