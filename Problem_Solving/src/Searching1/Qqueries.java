package Searching1;
import java.util.Arrays;
import java.util.Scanner;
public class Qqueries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int numq= sc.nextInt();
		int []q = new int [numq];
		Arrays.sort(arr);//O(n log n)
		  
		int ans =Integer.MIN_VALUE;
		int low = 0;
		int high= arr.length-1;
		while(low<=high) {
		}
	}

}
