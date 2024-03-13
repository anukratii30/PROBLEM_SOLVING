package Searching1;

import java.util.Arrays;

public class Find_Max_in_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9,10}
		};
		System.out.println(max(arr));

		
	}

	private static int max(int[][] arr ) {
		// TODO Auto-generated method stub
		int max = arr[0][0];//or Integer.MIN_VALUE
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}
}
