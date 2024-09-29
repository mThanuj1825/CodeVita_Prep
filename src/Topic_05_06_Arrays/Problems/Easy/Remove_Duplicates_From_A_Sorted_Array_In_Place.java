package Topic_05_06_Arrays.Problems.Easy;

import java.util.Arrays;

/**
 * Remove_Duplicates_From_A_Sorted_Array_In_Place class removes duplicate elements from a
 * sorted array in place, ensuring that the array maintains its order after duplicate
 * elements are removed.
 * *
 * Problem statement:
 * Given a sorted array of integers, the task is to remove duplicates in such a way that each
 * unique element appears only once, and the remaining elements are stored in the same array
 * in their original order.
 * *
 * Approach:
 * - Use two pointers: one (`i`) to track the position of unique elements and another (`j`) to
 * traverse the array.
 * - Start with the first element and initialize `prev` to the first element.
 * - Iterate through the array starting from the second element:
 * - If the current element (`arr[j]`) is different from `prev`, increment `i` and set `arr[i]`
 * to `arr[j]`, updating `prev` to `arr[j]`.
 * - The function will return the length of the array containing unique elements.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the number of elements in the array, as each element is checked once.
 * *
 * Space Complexity:
 * - O(1), as the operation modifies the array in place and uses a constant amount of extra
 * space for the pointers.
 */

public class Remove_Duplicates_From_A_Sorted_Array_In_Place {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 3, 3};

		System.out.println(solve(arr));
		System.out.println(Arrays.toString(arr));
	}

	public static int solve(int[] arr) {
		int i = 0;
		int prev = arr[i];

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != prev) {
				i++;
				arr[i] = arr[j];
				prev = arr[i];
			}
		}

		return i + 1;
	}
}
