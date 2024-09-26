package Topic_05_06_Arrays.Problems.Medium;

import Topic_05_06_Arrays.Problems.Easy.Reverse_An_Array;

import java.util.Arrays;

/**
 * Problem: Find the next lexicographical permutation of a given integer array.
 * *
 * Intuition:
 * The next permutation is the next arrangement of numbers in lexicographical order.
 * By identifying the rightmost ascent (where arr[i] < arr[i + 1]) and swapping
 * it with the smallest larger element to its right, we can generate the next permutation.
 * If no ascent exists, the current permutation is the largest, and we should return
 * the smallest permutation (i.e., reverse the entire array).
 * *
 * Approach:
 * 1. Traverse the array from right to left to find the first pair where arr[i] < arr[i + 1].
 * 2. If no such index is found, reverse the entire array to get the smallest permutation.
 * 3. If found, traverse from the end of the array to find the smallest element larger
 * than arr[idx] to swap with.
 * 4. Reverse the elements to the right of the swapped index to get the next permutation.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - Greedy algorithm
 * - Permutation generation
 * *
 * Time Complexity:
 * - O(n): The algorithm involves linear scans of the array to find indices and swap elements.
 * *
 * Space Complexity:
 * - O(1): The algorithm operates in place, requiring only a few extra variables.
 */

public class Next_Permutation {
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 4, 3, 0, 0};

		solve(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		int idx = -1;
		int n = arr.length;

		for (int i = n - 2; i > -1; i--) {
			if (arr[i] < arr[i + 1]) {
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			Reverse_An_Array.solve(arr, 0, n - 1);
			return;
		}

		for (int i = n - 1; i > idx; i--) {
			if (arr[i] > arr[idx]) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				break;
			}
		}

		Reverse_An_Array.solve(arr, idx + 1, n - 1);
	}
}
