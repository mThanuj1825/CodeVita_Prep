package Topic_05_06_08_Arrays.Problems.Hard;

import java.util.Arrays;

/**
 * Problem: Merge two sorted arrays without using extra space.
 * *
 * Intuition:
 * By using the gap method, we can perform a modified bubble sort to ensure
 * both arrays remain sorted while merging them.
 * *
 * Approach:
 * 1. Calculate the initial gap as the combined length of both arrays.
 * 2. While the gap is greater than zero:
 * - Compare elements at the current positions of both arrays and swap them if needed.
 * - Update the gap for the next iteration.
 * 3. Continue until the gap becomes zero.
 * *
 * Time Complexity: O((n + m) * log(n + m)), where n and m are the lengths of the two arrays.
 * Space Complexity: O(1) since we are not using any extra space.
 */

public class Merge_Two_Sorted_Arrays_Without_Extra_Space {
	public static void main(String[] args) {
		int[] arr_1 = {1, 3, 5, 7};
		int[] arr_2 = {0, 2, 4, 6, 8, 9};

		solve(arr_1, arr_2);

		System.out.println(Arrays.toString(arr_1) + " " + Arrays.toString(arr_2));
	}

	public static void solve(
			int[] arr_1,
			int[] arr_2
	) {
		int n = arr_1.length;
		int m = arr_2.length;
		int len = n + m;
		int gap = (len / 2) + (len % 2);  // Initial gap calculation

		while (gap > 0) {
			int left = 0;
			int right = left + gap;

			while (right < len) {
				if (left < n && right >= n) {
					// Compare arr_1[left] with arr_2[right - n]
					if (arr_1[left] > arr_2[right - n]) {
						int temp = arr_1[left];
						arr_1[left] = arr_2[right - n];
						arr_2[right - n] = temp;
					}
				} else if (left >= n) {
					// Compare arr_2[left - n] with arr_2[right - n]
					if (arr_2[left - n] > arr_2[right - n]) {
						int temp = arr_2[left - n];
						arr_2[left - n] = arr_2[right - n];
						arr_2[right - n] = temp;
					}
				} else {
					// Compare arr_1[left] with arr_1[right]
					if (arr_1[left] > arr_1[right]) {
						int temp = arr_1[left];
						arr_1[left] = arr_1[right];
						arr_1[right] = temp;
					}
				}
				left++;
				right++;
			}

			// Update gap for the next iteration
			if (gap == 1) {
				break;
			}
			gap = (gap / 2) + (gap % 2);
		}
	}
}
