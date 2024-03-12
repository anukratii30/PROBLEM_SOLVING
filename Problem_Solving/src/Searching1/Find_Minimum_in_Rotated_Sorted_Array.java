package Searching1;

public class Find_Minimum_in_Rotated_Sorted_Array {
//153 on leetcode
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,4,5,1,2};
		System.out.println(findMin(nums));

	}
	public  static int findMin(int[] nums) {
	    int l = 0;
	    int r = nums.length - 1;

	    while (l < r) {
	      final int m = (l + r) / 2;
	      if (nums[m] < nums[r])
	        r = m;
	      else
	        l = m + 1;
	    }

	    return nums[l];
	  }

}
