package Searching5;

import java.util.Arrays;

public class K_th_Element_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
        int[] arr1 = {2, 3, 45};
        int[] arr2 = {4, 6, 7, 8};
        int k = 4;
        System.out.println(kthElement(arr1, arr2, k)); // Output: 6

        // Another example:
        int[] arr3 = {1, 2, 3, 5, 6};
        int[] arr4 = {4, 7, 8, 9, 100};
        k = 6;
        System.out.println(kthElement(arr3, arr4, k));
	}
	public static int kthElement(int[] arr1, int[] arr2, int k) {
        // Merge the two sorted arrays
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[index++] = arr1[i++];
            } else {
                mergedArray[index++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergedArray[index++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[index++] = arr2[j++];
        }

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Return the k-th element (1-indexed)
        return mergedArray[k - 1];
    }

}
