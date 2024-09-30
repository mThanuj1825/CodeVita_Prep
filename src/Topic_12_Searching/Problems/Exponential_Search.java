package Topic_12_Searching.Problems;

/**
 * Problem: Perform exponential search on a sorted array to find the index of a given key.
 * *
 * Intuition:
 * Exponential search works by finding a range where the element might exist,
 * and then performing binary search within that range. It is useful when the
 * element is near the beginning of the array.
 * *
 * Approach:
 * 1. Start with the first element. If it matches the key, return the index.
 * 2. Double the search index `i` exponentially until the key is smaller than or
 *    equal to the current element or the index exceeds the array size.
 * 3. Perform binary search between the range found by exponential steps.
 * *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Exponential_Search {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 3;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		if (arr[0] == key) {
			return 0;
		}

		int i = 1;
		while (i < arr.length && arr[i] <= key) {
			i = i * 2;
		}

		return Binary_Search.solve(arr, key, i / 2, Math.min(i, arr.length - 1));
	}
}
