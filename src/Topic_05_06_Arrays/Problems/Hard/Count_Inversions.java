package Topic_05_06_Arrays.Problems.Hard;

/**
 * Problem: Count the number of inversions in an array.
 * An inversion is a pair of indices (i, j) such that i < j and arr[i] > arr[j].
 * *
 * Intuition:
 * Using the merge sort algorithm, we can count inversions while sorting the array.
 * This method has a time complexity of O(n log n).
 * *
 * Approach:
 * 1. Recursively divide the array into two halves until the base case is reached.
 * 2. Count inversions in the left half, right half, and during the merge step.
 * 3. During merging, if an element from the right half is smaller than an element
 * from the left half, it forms inversions with all remaining elements in the left half.
 * *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n) - for temporary arrays used in merging.
 */

public class Count_Inversions {
	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 4, 1};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		return mergeSort(arr, 0, arr.length - 1);
	}

	private static int mergeSort(
			int[] arr,
			int low,
			int high
	) {
		if (low >= high) {
			return 0;
		}

		int count = 0;
		int mid = low + (high - low) / 2;

		// Count inversions in left half, right half, and during merge
		count += mergeSort(arr, low, mid);
		count += mergeSort(arr, mid + 1, high);
		count += merge(arr, low, mid, high);

		return count;
	}

	private static int merge(
			int[] arr,
			int low,
			int mid,
			int high
	) {
		int leftSize = mid - low + 1;
		int rightSize = high - mid;

		int[] left = new int[leftSize];
		int[] right = new int[rightSize];

		// Copy data to temporary arrays
		System.arraycopy(arr, low, left, 0, leftSize);
		System.arraycopy(arr, mid + 1, right, 0, rightSize);

		int count = 0;

		int left_idx = 0;
		int right_idx = 0;
		int arr_idx = low;

		// Merge the two halves and count inversions
		while (left_idx < leftSize && right_idx < rightSize) {
			if (left[left_idx] <= right[right_idx]) {
				arr[arr_idx++] = left[left_idx++];
			} else {
				arr[arr_idx++] = right[right_idx++];
				count += (leftSize - left_idx); // Count inversions
			}
		}

		// Copy remaining elements of left array, if any
		while (left_idx < leftSize) {
			arr[arr_idx++] = left[left_idx++];
		}

		// Copy remaining elements of right array, if any
		while (right_idx < rightSize) {
			arr[arr_idx++] = right[right_idx++];
		}

		return count;
	}
}
