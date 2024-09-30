package Topic_12_Searching.Binary_Search_Problems;

/**
 * Problem: Find the upper bound of a key in a sorted array.
 * *
 * Intuition:
 * The upper bound of a key in a sorted array is the index of the first element
 * that is strictly greater than the key. If all elements are less than or
 * equal to the key, the upper bound will be the length of the array.
 * *
 * Approach:
 * 1. Initialize two pointers, `low` and `high`, to represent the search range.
 * 2. Use a binary search approach to find the upper bound:
 * - Calculate the midpoint.
 * - If the element at `mid` is greater than the key, update the result to `mid`
 * and move the `high` pointer left.
 * - Otherwise, move the `low` pointer right.
 * 3. Continue until the search range is exhausted.
 * *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Upper_Bound {
	public static void main(String[] args) {
		int[] arr = {2, 3, 6, 7, 8, 8, 11, 11, 11, 12};
		int key = 11;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		int low = 0, high = arr.length - 1;
		int res = arr.length;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > key) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return res;
	}
}
