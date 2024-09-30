package Topic_12_Searching.Problems;

/**
 * Problem: Perform linear search on an unsorted array to find the index of a given key.
 * *
 * Intuition:
 * Linear search is the simplest search algorithm. It checks each element in the array
 * one by one until the key is found or the entire array has been searched.
 * *
 * Approach:
 * 1. Iterate through the array from the start.
 * 2. For each element, check if it matches the key.
 * 3. If a match is found, return the index of the element.
 * 4. If no match is found by the end of the array, return -1.
 * *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Linear_Search {
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 7, 8, 6, 2, 9, 4};
		int key = 3;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		return -1;
	}
}
