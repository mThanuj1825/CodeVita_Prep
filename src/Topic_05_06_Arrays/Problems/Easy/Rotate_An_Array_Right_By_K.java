package Topic_05_06_Arrays.Problems.Easy;

import java.util.Arrays;

/**
 * Rotate_An_Array_Right_By_K class provides a method to right rotate an array
 * by a specified number of positions (k).
 * *
 * Problem Statement:
 * Given an array of integers, the task is to right rotate the array elements
 * by k positions. For example, if the array is {1, 2, 3, 4, 5} and k = 3,
 * the resulting array should be {3, 4, 5, 1, 2}.
 * *
 * Approach:
 * - Use the reversal algorithm to achieve the right rotation.
 * - Reverse the entire array.
 * - Reverse the first k elements of the array.
 * - Reverse the remaining n - k elements of the array.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the number of elements in the array, as each element
 * is reversed a constant number of times.
 * *
 * Space Complexity:
 * - O(1), as the operation modifies the array in place and uses a constant
 * amount of extra space.
 */

public class Rotate_An_Array_Right_By_K {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int k = 3;

		solve(arr, k);
		System.out.println(Arrays.toString(arr));
	}

	public static void solve(
			int[] arr,
			int k
	) {
		int n = arr.length;
		k %= n; // Ensure k is within the bounds of the array length

		Reverse_An_Array.solve(arr, 0, n - 1); // Reverse the entire array
		Reverse_An_Array.solve(arr, 0, k - 1); // Reverse the first k elements
		Reverse_An_Array.solve(arr, k, n - 1); // Reverse the remaining elements
	}
}
