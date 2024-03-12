package Searching1;
import java.util.Scanner;
public class LINEAR_SEARCH {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int  arr[] = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(Ls(arr,target));;
	}
	private static int  Ls(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
