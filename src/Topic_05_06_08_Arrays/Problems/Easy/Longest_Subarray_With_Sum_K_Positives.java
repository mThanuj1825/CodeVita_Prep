package Topic_05_06_08_Arrays.Problems.Easy;

import java.util.Arrays;

/**
 * Longest_Subarray_With_Sum_K_Positives class provides a method to find the
 * longest contiguous subarray in a given array of positive integers that sums up to a specified value k.
 * *
 * Problem Statement:
 * Given an array of positive integers and a target sum k, the task is to find
 * the longest contiguous subarray whose sum equals k. The method returns the
 * start and end indices of this subarray.
 * *
 * Example:
 * Input: arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3}, k = 3
 * Output: [3, 5] (the longest subarray that sums to 3 is [1, 1, 1])
 * *
 * Approach:
 * - Utilize a two-pointer technique to maintain the current sum of the subarray.
 * - Expand the right pointer to include elements and increase the sum.
 * - If the sum exceeds k, contract the left pointer to reduce the sum.
 * - If the sum equals k, check if the current subarray is the longest found.
 * *
 * Topics / Data Structures used:
 * - Array (to hold positive integers)
 * *
 * Time Complexity:
 * - O(n), where n is the length of the array, as both pointers traverse the array at most once.
 * *
 * Space Complexity:
 * - O(1), since only a fixed amount of extra space is used for variables.
 */

public class Longest_Subarray_With_Sum_K_Positives {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
		int k = 3;

		int[] res = solve(arr, k);
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, res[0], res[1])));
	}

	public static int[] solve(
			int[] arr,
			int k
	) {
		int i = 0, j = 0; // Initialize pointers
		int sum = arr[0]; // Start with the first element
		int max = 0; // Length of the longest subarray found
		int[] res = {-1, -1}; // Result to hold the start and end indices

		while (j < arr.length) {
			while (i <= j && sum > k) { // Contract the left pointer if the sum exceeds k
				sum -= arr[i];
				i++;
			}

			if (sum == k) { // Check if the current sum matches k
				int size = j - i + 1; // Calculate the size of the subarray
				if (size > max) { // Update the result if this is the longest subarray
					max = size;
					res[0] = i; // Update start index
					res[1] = j + 1; // Update end index (exclusive)
				}
			}

			j++; // Move the right pointer
			if (j < arr.length) {
				sum += arr[j]; // Add the next element to the sum
			}
		}

		return res; // Return the start and end indices of the longest subarray
	}
}
