package Topic_12_Searching.Binary_Search_Problems;

/**
 * Problem: Find the insert position for a key in a sorted array.
 * *
 * Intuition:
 * The insert position is the index at which the key should be inserted
 * to maintain the sorted order of the array. If the key already exists,
 * the insert position is the index of the first occurrence of the key.
 * *
 * Approach:
 * 1. Utilize the `Lower_Bound` method to find the appropriate insert position
 * for the given key.
 * 2. The `Lower_Bound` method returns the index of the first element
 * that is greater than or equal to the key.
 * *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Search_Insert_Position {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 7};
		int key = 3;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		return Lower_Bound.solve(arr, key);
	}
}
