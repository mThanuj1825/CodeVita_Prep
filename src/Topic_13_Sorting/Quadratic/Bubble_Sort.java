package Topic_13_Sorting.Quadratic;

import java.util.Arrays;

/**
 * Problem: Perform bubble sort on an array.
 * *
 * Intuition:
 * Bubble sort works by repeatedly swapping adjacent elements if they are in the wrong order.
 * The largest element "bubbles" to the end in each pass. The process repeats until the array is sorted.
 * *
 * Approach:
 * 1. For each pass through the array, compare adjacent elements.
 * 2. Swap them if they are in the wrong order.
 * 3. After each pass, the next largest element is in its correct position.
 * 4. If no swaps occur in a pass, the array is already sorted.
 * *
 * Time Complexity: O(n^2) in the worst case, O(n) in the best case if the array is already sorted.
 * Space Complexity: O(1)
 */
public class Bubble_Sort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 4, 1};

		solve(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}

			if (count == 0) {
				break;
			}
		}
	}
}
