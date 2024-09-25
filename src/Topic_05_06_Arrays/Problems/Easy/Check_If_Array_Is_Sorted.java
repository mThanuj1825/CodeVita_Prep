package Topic_05_06_Arrays.Problems.Easy;

/**
 * Check_If_Array_Is_Sorted class checks whether a given array of integers is sorted in either
 * ascending or descending order.
 * *
 * Problem statement:
 * Given an array of integers, the goal is to determine if the array is sorted in non-decreasing
 * (ascending) or non-increasing (descending) order.
 * *
 * Approach:
 * - Determine if the first two elements indicate ascending order. If the first element is less than
 * or equal to the second, assume ascending order.
 * - Iterate through the array:
 * - If the array is determined to be ascending, check if each element is less than or equal to
 * the next element.
 * - If the array is determined to be descending, check if each element is greater than or equal
 * to the next element.
 * - If any condition fails, return false.
 * - If the loop completes without issues, return true indicating that the array is sorted.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the number of elements in the array, as each element is checked once.
 * *
 * Space Complexity:
 * - O(1), as only a constant amount of extra space is used for the `is_asc` boolean variable.
 */

public class Check_If_Array_Is_Sorted {
	public static void main(String[] args) {
		int[] arr = {5, 4, 5, 2, 1};

		System.out.println(solve(arr));
	}

	public static boolean solve(int[] arr) {
		boolean is_asc = arr[0] <= arr[1];

		for (int i = 0; i < arr.length - 1; i++) {
			if (is_asc) {
				if (arr[i] > arr[i + 1]) {
					return false;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					return false;
				}
			}
		}

		return true;
	}
}
