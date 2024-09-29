package Topic_05_06_08_Arrays.Problems.Easy;

import java.util.Arrays;

/**
 * Reverse_An_Array class provides a method to reverse a given array in place.
 * *
 * Problem statement:
 * Given an array of integers, the task is to reverse the elements of the array
 * such that the first element becomes the last, the second element becomes the
 * second last, and so on.
 * *
 * Approach:
 * - Use two pointers: one starting from the beginning of the array (`i`) and
 * the other from the end of the array (`j`).
 * - Swap the elements at these indices and then move the pointers closer until
 * they meet in the middle.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the number of elements in the array, as each element is
 * swapped once.
 * *
 * Space Complexity:
 * - O(1), as the operation modifies the array in place and uses a constant
 * amount of extra space for the pointers.
 */

public class Reverse_An_Array {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int start = 0, end = arr.length - 1; // Corrected from args.length to arr.length

		solve(arr, start, end);
		System.out.println(Arrays.toString(arr));
	}

	public static void solve(
			int[] arr,
			int i,
			int j
	) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}
}
