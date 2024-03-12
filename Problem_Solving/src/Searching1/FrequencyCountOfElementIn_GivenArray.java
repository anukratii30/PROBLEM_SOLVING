package Searching1;

public class FrequencyCountOfElementIn_GivenArray {
//no use of any library
	public static void main(String[] args) {
		
	
        int[] sortedArray = {3, 5, 7, 7, 8, 10, 10, 10, 12, 15};
        int[] queries = {7, 10, 5};

        findFrequencies(sortedArray, queries);
    }
	 public static void findFrequencies(int[] sortedArray, int[] queries) {
	        for (int query : queries) {
	            int frequency = 0;
	            
	            for (int element : sortedArray) {
	                if (element == query) {
	                    frequency++;
	                } else if (element > query) {
	                    break;
	                }
	            }
	            System.out.println(  query + ": " + frequency);
	        }
	 }
}
