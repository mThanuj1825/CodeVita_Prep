package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.Arrays;

/**
 * Problem: Rearrange array elements such that positive and negative numbers appear alternatively.
 * The first position should have a positive number, the second a negative, and so on.
 * *
 * Intuition:
 * The task is to reorder the array such that positive and negative numbers alternate.
 * By maintaining two pointers, one for positive numbers and one for negative, we can swap elements
 * to ensure the correct order. One pointer moves through even indices (for positive numbers),
 * and the other moves through odd indices (for negative numbers).
 * *
 * Approach:
 * 1. Initialize two pointers, `p` for positive numbers (starting at index 0) and `n` for negative numbers (starting
 * at index 1).
 * 2. Traverse the array:
 *    - If `p` is not at a positive number, move `p` forward by 2.
 *    - If `n` is not at a negative number, move `n` forward by 2.
 * 3. If both `p` and `n` find misplaced elements, swap them to place them in their correct positions.
 * 4. Continue this process until all elements are rearranged.
 * *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Rearrange_Array_Elements_By_Sign {
	public static void main(String[] args) {
		int[] arr = {3, 1, -2, -5, 2, -4};

		System.out.println(Arrays.toString(solve(arr)));
	}

	public static int[] solve(int[] arr) {
		int p = 0, n = 1;

		while (p < arr.length && n < arr.length) {
			// Move `p` to the next incorrect positive position
			while (p < arr.length && arr[p] > 0) {
				p += 2;
			}

			// Move `n` to the next incorrect negative position
			while (n < arr.length && arr[n] < 0) {
				n += 2;
			}

			// Swap misplaced positive and negative numbers
			if (p < arr.length && n < arr.length) {
				int temp = arr[p];
				arr[p] = arr[n];
				arr[n] = temp;
			}
		}

		return arr;
	}
}
