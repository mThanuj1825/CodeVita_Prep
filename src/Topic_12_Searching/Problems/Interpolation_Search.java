package Topic_12_Searching.Problems;

/**
 * Problem: Perform interpolation search on a sorted array to find the index of a given key.
 * *
 * Intuition:
 * Interpolation search improves on binary search by using a probing formula based on
 * the distribution of the data. It is particularly efficient for uniformly distributed data.
 * Instead of dividing the search space in half, it estimates the position of the key
 * based on its value relative to the minimum and maximum values.
 * *
 * Approach:
 * 1. Initialize `low` and `high` as the start and end of the array.
 * 2. Use the interpolation formula to calculate the probable position of the key.
 * 3. If the key matches the element at the probe position, return the index.
 * 4. If the key is smaller, update `high`. If the key is larger, update `low`.
 * 5. Repeat the process until the key is found or the search space is exhausted.
 * *
 * Time Complexity: O(log log n) in the best case for uniformly distributed data,
 * O(n) in the worst case.
 * Space Complexity: O(1)
 */
public class Interpolation_Search {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 4;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		int low = 0, high = arr.length - 1;

		while (key >= arr[low] && key <= arr[high] && low <= high) {
			int probe = low + (((high - low) / (arr[high] - arr[low])) * (key - arr[low]));

			if (key == arr[probe]) {
				return probe;
			}

			if (key < arr[probe]) {
				high = probe - 1;
			} else {
				low = probe + 1;
			}
		}

		return -1;
	}
}
