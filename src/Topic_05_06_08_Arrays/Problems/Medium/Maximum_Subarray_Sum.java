package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.Arrays;

/**
 * Maximum_Subarray_Sum class implements Kadane's Algorithm to find the
 * subarray with the maximum sum in a given array of integers.
 * *
 * Problem Statement:
 * Given an array of integers, find the contiguous subarray (containing at least
 * one number) which has the largest sum and return the indices of that subarray.
 * *
 * Example:
 * Input: arr = {-2, -3, 4, -1, -2, 1, 5, -3}
 * Output: [4, -1, -2, 1, 5] (the subarray from index 2 to index 6 has the largest sum)
 * *
 * Approach:
 * - Use Kadane's Algorithm to keep track of the current subarray sum and
 * the maximum sum encountered so far.
 * - If the current subarray sum becomes negative, reset it and start a new subarray.
 * - Keep track of the indices of the maximum sum subarray.
 * *
 * Time Complexity:
 * - O(n), where n is the length of the array, as we traverse the array exactly once.
 * *
 * Space Complexity:
 * - O(1), as we only use a few variables for tracking sums and indices.
 * *
 */

public class Maximum_Subarray_Sum {
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

		int[] res = solve(arr);
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, res[0], res[1])));
	}

	public static int[] solve(int[] arr) {
		int l = 0, r = 0;
		int max = 0;
		int sum = 0;
		int[] res = {-1, -1};

		while (r < arr.length) {
			sum += arr[r];

			if (sum >= max) {
				max = sum;
				res[0] = l;
				res[1] = r + 1;
			}
			if (sum < 0) {
				sum = 0;
				l = r + 1;
			}

			r++;
		}

		return res;
	}
}
