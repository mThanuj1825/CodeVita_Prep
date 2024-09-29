package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Two_Sum class provides a method to find two distinct indices in an array
 * such that their corresponding values sum up to a specified target.
 * *
 * Problem Statement:
 * Given an array of integers and a target sum, the task is to find the
 * indices of the two numbers in the array that add up to the target.
 * Each input will have exactly one solution, and you may not use the same
 * element twice.
 * *
 * Example:
 * Input: arr = {2, 6, 5, 8, 11}, target = 14
 * Output: [1, 3] (the values at these indices, 6 and 8, sum to 14)
 * *
 * Approach:
 * - Utilize a HashMap to store the numbers and their corresponding indices
 * as we iterate through the array.
 * - For each element, calculate the difference needed to reach the target
 * (i.e., target - current element).
 * - Check if this difference is already in the HashMap. If it is, return
 * the indices of the two numbers.
 * - If not found, store the current number and its index in the HashMap.
 * *
 * Topics / Data Structures used:
 * - Array (to hold integers)
 * - HashMap (for fast lookup of the required pair)
 * *
 * Time Complexity:
 * - O(n), where n is the length of the array, as we traverse the array
 * exactly once.
 * *
 * Space Complexity:
 * - O(n), in the worst case, when all elements are stored in the HashMap.
 */

public class Two_Sum {
	public static void main(String[] args) {
		int[] arr = {2, 6, 5, 8, 11};
		int target = 14;

		System.out.println(Arrays.toString(solve(arr, target)));
	}

	public static int[] solve(
			int[] arr,
			int target
	) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[i])) {
				return new int[]{map.get(target - arr[i]), i};
			}

			map.put(arr[i], i);
		}

		return new int[]{-1, -1};
	}
}
