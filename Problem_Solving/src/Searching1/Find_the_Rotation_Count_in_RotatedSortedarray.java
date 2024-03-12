package Searching1;

public class Find_the_Rotation_Count_in_RotatedSortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static  int searchPeak(int a[], int low, int high) {
        int mid = low + (high - low) / 2;
        if (a[low] <= a[mid] && a[mid] <= a[high])
            return low; 
        else if (a[mid] >= a[low])
            return searchPeak(a, mid + 1, high);
        else
            return searchPeak(a, low, mid);
    }
    public static  int findKRotation(int arr[], int n) {
        return searchPeak(arr, 0, n - 1);
    }

}
