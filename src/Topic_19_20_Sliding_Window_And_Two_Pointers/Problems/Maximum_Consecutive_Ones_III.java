package Topic_19_20_Sliding_Window_And_Two_Pointers.Problems;

/**
 * Problem: Find the maximum number of consecutive 1s in the array if you can flip at most `k` 0s.
 * *
 * Intuition:
 * The goal is to find the longest contiguous subarray of 1s, where we are allowed to flip up to `k` 0s into 1s.
 * This problem can be efficiently solved using a sliding window approach. We expand the window by moving the `right`
 * pointer, and whenever the number of 0s in the window exceeds `k`, we move the `left` pointer to reduce the number
 * of 0s.
 * *
 * Approach:
 * 1. Use two pointers (`left` and `right`) to represent the sliding window.
 * 2. Traverse the array using the `right` pointer and count the number of 0s in the window.
 * 3. If the number of 0s exceeds `k`, move the `left` pointer to shrink the window until the number of 0s is within
 * the limit.
 * 4. Continuously update the result as the maximum length of the current window.
 * *
 * Time Complexity: O(n), where `n` is the length of the array.
 * Space Complexity: O(1), since we are using a constant amount of extra space.
 */

public class Maximum_Consecutive_Ones_III {
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		int k = 2;

		System.out.println(solve(arr, k));
	}

	public static int solve(
			int[] arr,
			int k
	) {
		int left = 0, right = 0;  // Sliding window pointers
		int zeroes = 0;  // Counter for the number of 0s in the current window
		int res = 0;  // Variable to store the result, i.e., the maximum length of 1s

		// Traverse the array using the `right` pointer
		while (right < arr.length) {
			// If a 0 is encountered, increment the `zeroes` counter
			if (arr[right] == 0) {
				zeroes++;
				// If the number of 0s exceeds `k`, move the `left` pointer to reduce the number of 0s
				while (zeroes > k) {
					if (arr[left] == 0) {
						zeroes--;  // Decrement the `zeroes` counter
					}
					left++;  // Shrink the window from the left
				}
			} else {
				// Update the result with the current window size
				res = Math.max(res, right - left + 1);
			}
			right++;  // Expand the window by moving `right` pointer
		}

		return res;
	}
}
