package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Find all leaders in a given integer array.
 * A leader is defined as an element that is greater than all the elements to its right
 * in the array.
 * *
 * Intuition:
 * By iterating through the array from right to left, we can track the maximum value
 * encountered so far. An element is a leader if it is greater than this maximum value.
 * This approach ensures that we efficiently identify leaders in a single pass.
 * *
 * Approach:
 * 1. Initialize a list to store leader elements and a variable to keep track of the maximum
 * value seen so far.
 * 2. Traverse the array from the last element to the first.
 * 3. If the current element is greater than the maximum value, it is a leader; add it
 * to the result list and update the maximum value.
 * 4. Finally, return the list of leaders, which will be in reverse order.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - List
 * - Iteration
 * *
 * Time Complexity:
 * - O(n): The algorithm involves a single pass through the array.
 * *
 * Space Complexity:
 * - O(k): The space complexity depends on the number of leaders found, where k is the
 * number of leaders in the array.
 */

public class Leaders_In_An_Array {
	public static void main(String[] args) {
		int[] arr = {10, 22, 12, 3, 0, 6};

		System.out.println(solve(arr));
	}

	public static List<Integer> solve(int[] arr) {
		List<Integer> res = new ArrayList<>();
		int max = Integer.MIN_VALUE;

		for (int i = arr.length - 1; i > -1; i--) {
			if (arr[i] > max) {
				res.add(arr[i]);
				max = arr[i];
			}
		}

		return res;
	}
}
