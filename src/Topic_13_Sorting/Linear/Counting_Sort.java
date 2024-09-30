package Topic_13_Sorting.Linear;

import java.util.Arrays;

/**
 * Problem: Perform counting sort on an array of non-negative integers.
 * *
 * Intuition:
 * Counting sort is an integer sorting algorithm that counts the occurrence of each
 * unique element in the input array, using this count to determine the position of
 * each element in the sorted output array.
 * *
 * Approach:
 * 1. Find the maximum value in the input array to define the range of the counts.
 * 2. Create a count array to store the frequency of each unique element.
 * 3. Populate the count array based on the input array's elements.
 * 4. Iterate through the count array to reconstruct the sorted array based on the counts.
 * *
 * Time Complexity: O(n + k), where n is the number of elements in the input array
 * and k is the range of the input values.
 * Space Complexity: O(k) for the count array.
 */
public class Counting_Sort {
	public static void main(String[] args) {
		int[] arr = {2, 5, 3, 0, 2, 3, 0, 3};

		solve(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}

		int[] counts = new int[max + 1];
		for (int i : arr) {
			counts[i]++;
		}

		int idx = 0;
		for (int i = 0; i < max + 1; i++) {
			for (int j = 0; j < counts[i]; j++) {
				arr[idx++] = i;
			}
		}
	}
}
