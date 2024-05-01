package DP1;

public class Jump_Game2 {
	class Solution {
	    public int jump(int[] nums) {
	        int reach = 0, rs=0,step=0;
	        if(nums.length==1) return 0;
	        for(int i=0;i<nums.length;i++){
	            reach=Math.max(reach,nums[i]+i);
	            if(i==rs){
	                step++;
	                rs=reach;
	            }
	            if(rs>=nums.length-1) return step;
	        }
	        return step;
	    }
	}

}
