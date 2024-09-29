package Topic_05_06_08_Arrays.Problems.Easy;

/**
 * Maximum_Consecutive_Ones class provides a method to find the maximum number
 * of consecutive 1's in a binary array.
 * *
 * Problem Statement:
 * Given a binary array (containing only 0s and 1s), the task is to find the
 * length of the longest contiguous subarray that contains only 1s.
 * *
 * Example:
 * Input: arr = {1, 1, 0, 1, 1, 1}
 * Output: 3 (the longest sequence of consecutive 1's is [1, 1, 1])
 * *
 * Approach:
 * - Iterate through the array while maintaining a counter for consecutive 1's.
 * - If a 1 is encountered, increment the counter and update the maximum if necessary.
 * - If a 0 is encountered, reset the counter to zero.
 * *
 * Topics / Data Structures used:
 * - Array (to hold binary values)
 * *
 * Time Complexity:
 * - O(n), where n is the length of the array, as it requires a single pass through the array.
 * *
 * Space Complexity:
 * - O(1), since only a constant amount of extra space is used for variables.
 */

public class Maximum_Consecutive_Ones {
	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 1, 1, 1};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int max = 0; // To keep track of the maximum length of consecutive 1's
		int cnt = 0; // To count the current length of consecutive 1's

		for (int i : arr) {
			if (i == 1) {
				cnt++; // Increment count for consecutive 1's
				max = Math.max(max, cnt); // Update maximum length if needed
			} else {
				cnt = 0; // Reset count when encountering a 0
			}
		}

		return max; // Return the maximum length of consecutive 1's found
	}
}
