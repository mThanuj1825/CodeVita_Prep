package Topic_13_Sorting.Logarithmic;

import java.util.Arrays;

/**
 * Problem: Perform quick sort on an array.
 * *
 * Intuition:
 * Quick sort is a divide-and-conquer algorithm that selects a 'pivot' element
 * and partitions the other elements into two sub-arrays, according to whether
 * they are less than or greater than the pivot. The sub-arrays are then sorted
 * recursively.
 * *
 * Approach:
 * 1. Choose a pivot element from the array.
 * 2. Partition the array into two halves: elements less than the pivot and elements
 * greater than the pivot.
 * 3. Recursively apply the same process to the left and right sub-arrays.
 * 4. The process continues until the base case of a single element is reached.
 * *
 * Time Complexity: O(n log n) on average; O(n^2) in the worst case.
 * Space Complexity: O(log n) due to recursive stack space.
 */
public class Quick_Sort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 4, 1};

		solve(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(
			int[] arr,
			int low,
			int high
	) {
		if (low >= high) {
			return;
		}

		int p = hoarePartition(arr, low, high);
		quickSort(arr, low, p - 1);
		quickSort(arr, p + 1, high);
	}

	public static int lomutoPartition(
			int[] arr,
			int low,
			int high
	) {
		int pivot = arr[high];
		int j = low;

		for (int i = low; i <= high; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		int temp = arr[j];
		arr[j] = arr[high];
		arr[high] = temp;

		return j - 1;
	}

	public static int hoarePartition(
			int[] arr,
			int low,
			int high
	) {
		int pivot = arr[high];
		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}

		return i - 1;
	}
}
