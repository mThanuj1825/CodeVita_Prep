package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given an integer array and an integer k, find the number of subarrays
 * whose sum is equal to k.
 * *
 * Intuition:
 * We can solve this problem using a prefix sum approach. By maintaining a running sum
 * (prefix sum) and using a hashmap to store the frequency of prefix sums, we can
 * efficiently count subarrays whose sum equals k. If the difference between the current
 * prefix sum and k exists in the map, it means there exists a subarray that sums to k.
 * *
 * Approach:
 * 1. Initialize a map to store the frequency of prefix sums.
 * 2. Iterate through the array, updating the prefix sum at each step.
 * 3. For each element, check if (prefix_sum - k) exists in the map. If it does,
 * add the count from the map to the result since this represents subarrays
 * whose sum equals k.
 * 4. Update the map to include the current prefix sum.
 * 5. Return the count of subarrays that sum to k.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - HashMap
 * - Prefix Sum
 * *
 * Time Complexity:
 * - O(n): We iterate through the array once, performing O(1) operations at each step.
 * *
 * Space Complexity:
 * - O(n): The space complexity is due to the hashmap that stores prefix sums.
 */

public class Number_Of_Subarrays_With_Sum_K {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
		int k = 3;

		System.out.println(solve(arr, k));
	}

	public static int solve(
			int[] arr,
			int k
	) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int prefix_sum = 0;
		int count = 0;

		for (int i : arr) {
			prefix_sum += i;

			count += map.getOrDefault(prefix_sum - k, 0);

			map.put(prefix_sum, map.getOrDefault(prefix_sum, 0) + 1);
		}

		return count;
	}
}
