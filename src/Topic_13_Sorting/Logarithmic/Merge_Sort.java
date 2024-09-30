package Topic_13_Sorting.Logarithmic;

import java.util.Arrays;

/**
 * Problem: Perform merge sort on an array.
 * *
 * Intuition:
 * Merge sort is a divide-and-conquer algorithm that divides the array into halves,
 * sorts each half, and then merges them back together in sorted order.
 * It is particularly efficient for large data sets.
 * *
 * Approach:
 * 1. Recursively divide the array into two halves until each subarray contains a single element.
 * 2. Merge the sorted halves back together.
 * 3. The merge process involves comparing the smallest elements of each half and
 * inserting them into the original array in sorted order.
 * *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n) for the temporary arrays used during merging.
 */
public class Merge_Sort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 4, 1};

		solve(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	public static void mergeSort(
			int[] arr,
			int low,
			int high
	) {
		if (low >= high) {
			return;
		}

		int mid = low + (high - low) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	public static void merge(
			int[] arr,
			int low,
			int mid,
			int high
	) {
		int[] left = new int[mid - low + 1];
		int[] right = new int[high - mid];

		System.arraycopy(arr, low, left, 0, left.length);

		for (int i = mid + 1, idx = 0; i <= high; i++, idx++) {
			right[idx] = arr[i];
		}

		int idx = low;
		int l = 0, r = 0;

		while (l < left.length && r < right.length) {
			if (left[l] < right[r]) {
				arr[idx++] = left[l];
				l++;
			} else {
				arr[idx++] = right[r];
				r++;
			}
		}

		while (l < left.length) {
			arr[idx++] = left[l];
			l++;
		}

		while (r < right.length) {
			arr[idx++] = right[r];
			r++;
		}
	}
}
