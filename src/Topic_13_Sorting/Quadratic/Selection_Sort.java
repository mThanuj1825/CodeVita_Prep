package Topic_13_Sorting.Quadratic;

import java.util.Arrays;

/**
 * Problem: Perform selection sort on an array.
 * *
 * Intuition:
 * Selection sort works by selecting the smallest (or largest) element from the unsorted part
 * of the array and swapping it with the first unsorted element. This process repeats until
 * the array is sorted.
 * *
 * Approach:
 * 1. For each position `i` in the array, find the smallest element in the unsorted portion.
 * 2. Swap the smallest element with the element at position `i`.
 * 3. Repeat this process for all positions until the array is sorted.
 * *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class Selection_Sort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 4, 1};

		solve(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[idx]) {
					idx = j;
				}
			}

			if (idx != i) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
		}
	}
}
