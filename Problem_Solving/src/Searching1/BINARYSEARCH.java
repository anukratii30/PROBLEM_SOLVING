package Searching1;

import java.util.Scanner;

public class BINARYSEARCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int  arr[] = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(bs(arr,target));;

	}

	private static int bs(int[] arr,int target) {
		// TODO Auto-generated method stub
		int low = 0;
		int high=arr.length-1;
		while(low<=high) {
			int mid =(low+high)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if (arr[mid]>target) {
				high =  mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
		
	}

}
