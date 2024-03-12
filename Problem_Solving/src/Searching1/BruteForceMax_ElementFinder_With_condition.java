package Searching1;
import java.util.Scanner;
public class BruteForceMax_ElementFinder_With_condition {
//given an array find the max element X which satisfies the condition X<=Y, 
//Where Y willl be a given i/p
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int y = sc.nextInt();
		System.out.println(maxElement(arr, y));
	}
	private static int maxElement(int[] arr, int y) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=y && arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
//t.c=O(N)
	}

}
