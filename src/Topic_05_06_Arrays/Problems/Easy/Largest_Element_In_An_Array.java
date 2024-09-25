package Topic_05_06_Arrays.Problems.Easy;

/**
 * Largest_Element_In_An_Array class finds the largest element in a given array of integers.
 * *
 * Problem statement:
 * Given an array of integers, the goal is to find the largest element present in that array.
 * *
 * Approach:
 * - Initialize a variable `max` to the first element of the array.
 * - Iterate through each element in the array.
 * - If the current element is greater than `max`, update `max` with the current element.
 * - After checking all elements, `max` will hold the largest value.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the number of elements in the array, as each element is checked once.
 * *
 * Space Complexity:
 * - O(1), as only a constant amount of extra space is used for the `max` variable.
 */

public class Largest_Element_In_An_Array {
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 5, 4};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int max = arr[0];

		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}

		return max;
	}
}
