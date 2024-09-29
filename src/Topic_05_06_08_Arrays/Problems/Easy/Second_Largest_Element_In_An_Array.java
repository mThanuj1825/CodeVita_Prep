package Topic_05_06_08_Arrays.Problems.Easy;

/**
 * Second_Largest_Element_In_An_Array class finds the second largest element in a given array of integers.
 * *
 * Problem statement:
 * Given an array of integers, the goal is to find the second largest element present in that array.
 * If there is no second largest element (e.g., when all elements are equal), the method will return the largest
 * element.
 * *
 * Approach:
 * - Initialize two variables, `max_1` and `max_2`, to the first element of the array.
 * - Iterate through each element in the array:
 * - If the current element is greater than `max_1`, update `max_2` to be `max_1`, and then set `max_1` to the
 * current element.
 * - If the current element is less than `max_1` but greater than `max_2`, update `max_2` with the current element.
 * - After checking all elements, `max_2` will hold the second largest value.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the number of elements in the array, as each element is checked once.
 * *
 * Space Complexity:
 * - O(1), as only a constant amount of extra space is used for the `max_1` and `max_2` variables.
 */

public class Second_Largest_Element_In_An_Array {
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 5, 4};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int max_1 = arr[0];
		int max_2 = arr[0];

		for (int i : arr) {
			if (i > max_1) {
				max_2 = max_1;
				max_1 = i;
			} else if (i > max_2) {
				max_2 = i;
			}
		}

		return max_2;
	}
}
