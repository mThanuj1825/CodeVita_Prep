package Topic_05_06_08_Arrays.Problems.Hard;

import java.util.Arrays;

/**
 * Problem: Find the missing and repeating numbers in an array of size n
 * containing numbers from 1 to n.
 * *
 * Intuition:
 * Use mathematical formulas to derive the missing and repeating numbers
 * based on the sum of natural numbers and the sum of squares of natural numbers.
 * *
 * Approach:
 * 1. Calculate the expected sum of the first n natural numbers.
 * 2. Calculate the expected sum of squares of the first n natural numbers.
 * 3. Compute the actual sum and the actual sum of squares from the array.
 * 4. Derive the differences to find the repeating and missing numbers.
 * *
 * Time Complexity: O(n) - We traverse the array only once.
 * Space Complexity: O(1) - Only a few variables are used for storage.
 */

public class Find_Missing_And_Repeating_Number {
	public static void main(String[] args) {
		int[] arr = {4, 3, 6, 2, 1, 1};
		int n = 6;

		System.out.println(Arrays.toString(solve(arr, n)));
	}

	public static int[] solve(
			int[] arr,
			int n
	) {
		// Calculate expected sums
		int sum_n = (n * (n + 1)) / 2;
		int sum_sq_n = (n * (n + 1) * (2 * n + 1)) / 6;

		// Initialize sums from the array
		int sum = 0;
		int sum_sq = 0;

		// Calculate the actual sums
		for (int i : arr) {
			sum += i;
			sum_sq += i * i;
		}

		// Calculate the differences
		int diff = sum - sum_n; // (repeating - missing)
		int diff_sq = sum_sq - sum_sq_n; // (repeating^2 - missing^2)

		// Derive repeating and missing numbers
		diff_sq /= diff; // (repeating + missing)

		int repeating = (diff + diff_sq) / 2;
		int missing = repeating - diff;

		return new int[]{missing, repeating};
	}
}
