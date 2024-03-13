package Searching1;

import java.util.Arrays;

public class Search_2_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9,10}
		};
		int target = 4;
		int ans[] =search(arr,target);
		System.out.println(Arrays.toString(ans));;

	}

	private static int[] search(int[][] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}return new int[] {-1,-1};
		
	}

}
