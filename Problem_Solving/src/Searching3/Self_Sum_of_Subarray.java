package Searching3;

public class Self_Sum_of_Subarray {
	
	public static void main(String[] args) {
        int[] A = {1, 3, 4, 2};
        int S = 7;
        System.out.println(maxSubarraySize(A, S));
    }

    public static int maxSubarraySize(int[] A, int S) {
        int low = 1;
        int high = A.length;
        int result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(A, S, mid)) {//if true then only
                result = mid;
                low = mid + 1;
            } else {//otherwise
                high = mid - 1;
            }
        }
        
        return result;
    }

    public static boolean isValid(int[] A, int S, int size) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i >= size) {
                sum -= A[i - size];
            }
            sum += A[i];
            if (i >= size - 1 && sum > S) {
                return false;
            }
        }
        return true;
    }
}
