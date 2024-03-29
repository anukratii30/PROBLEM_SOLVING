package Searching3;

import java.util.Scanner;
//Every painter can paint only contiguous segments of boards.
//A board can only be painted by 1 painter at maximum.
public class Painter_Partitions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();//k painter
			int n = sc.nextInt();//n boards
			//where each painter takes 1 unit of time to paint 1 unit of boards
			int arr [] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(partition(arr, n, k));
		}
			public static int sum(int arr[], int from, int to)
			{
			    int total = 0;
			    for (int i = from; i <= to; i++)
			        total += arr[i];
			    return total;
			}
			  
			// for n boards and k partitions
			public static int partition(int arr[], int n, int k)
			{
			    // base cases   
			    if (k == 1) // one partition
			        return sum(arr, 0, n - 1);   
			    if (n == 1)  // one board
			        return arr[0];
			  
			    int best = Integer.MAX_VALUE;
			  
			    for (int i = 1; i <= n; i++)
			        best = Math.min(best, Math.max(partition(arr, i, k - 1),
			                                sum(arr, i, n - 1)));
			  
			    return best;
			}


}
