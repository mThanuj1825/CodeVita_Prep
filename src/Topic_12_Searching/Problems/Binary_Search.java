package Topic_12_Searching.Problems;

/**
 * Problem: Perform binary search on a sorted array to find the index of a given key.
 * *
 * Intuition:
 * Binary search works by repeatedly dividing the search space in half.
 * By comparing the key with the middle element of the array, we can determine
 * whether to search the left or right half, reducing the time complexity.
 * *
 * Approach:
 * 1. Initialize `low` to the start of the array and `high` to the end.
 * 2. Find the middle element.
 * 3. If the key matches the middle element, return its index.
 * 4. If the key is smaller than the middle element, search in the left half.
 * 5. If the key is larger, search in the right half.
 * 6. Repeat the process until the key is found or the search space is exhausted.
 * *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Binary_Search {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 3;

		System.out.println(solve(arr, key, 0, arr.length - 1));
	}

	public static int solve(
			int[] arr,
			int key,
			int low,
			int high
	) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			System.out.println(mid);

			if (key == arr[mid]) {
				return mid;
			}

			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}
}
