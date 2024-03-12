package Searching1;

public class FrequencyCountBinarySeach {
//unsorted array is given this time
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] unsortedArray = { 3, 5, 7, 10, 8, 10, 7, 10, 12, 15 };
		int[] queries = { 7, 10, 5 };

		findFrequencies(unsortedArray, queries);
	}
	public static void findFrequencies(int[] unsortedArray, int[] queries) {
        // Sort the array
        sort(unsortedArray);

        for (int query : queries) {
            int frequency = binarySearch(unsortedArray, query);
            System.out.println("Frequency of " + query + ": " + frequency);
        }
    }


}
