package Topic_13_Sorting.Quadratic;

import java.util.Arrays;

/**
 * Problem: Perform insertion sort on an array.
 * *
 * Intuition:
 * Insertion sort builds a sorted array one element at a time by repeatedly
 * taking the next element and inserting it into the correct position in the
 * already sorted portion of the array.
 * *
 * Approach:
 * 1. Iterate through the array starting from the second element.
 * 2. For each element, compare it with the elements in the sorted portion.
 * 3. Shift larger elements to the right to make space for the current element.
 * 4. Insert the current element in its correct position.
 * *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class Insertion_Sort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 4, 1};

		solve(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j > -1 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[++j] = temp;
		}
	}
}
