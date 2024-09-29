package Topic_05_06_Arrays.Problems.Hard;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given an array of integers and a target XOR value `k`,
 * find the count of subarrays whose XOR equals `k`.
 * *
 * Intuition:
 * This problem is a variation of the subarray sum problem, but instead of summing, we are using XOR.
 * The key observation is that if `xor(0, i) ^ xor(0, j) == k` (for some j > i),
 * then `xor(i+1, j) == k`. Therefore, we can use a hashmap to store prefix XOR values and their frequencies.
 * *
 * Approach:
 * 1. Maintain a running XOR of elements as we iterate through the array.
 * 2. For each element, compute the XOR of the current prefix and check if the XOR of the current prefix with `k`
 * exists in the map. If it does, then the XOR of a subarray is equal to `k`.
 * 3. Add the current prefix XOR to the map and continue.
 * *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class Count_Subarrays_With_Given_XOR {
	public static void main(String[] args) {
		int[] arr = {4, 2, 2, 6, 4};
		int k = 6;

		System.out.println(solve(arr, k));
	}

	public static int solve(
			int[] arr,
			int k
	) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);  // Base case for prefix XOR being zero
		int XR = 0;  // Initialize XOR for current prefix
		int count = 0;

		// Iterate through each element in the array
		for (int i : arr) {
			XR ^= i;  // Compute prefix XOR up to the current element

			// Check if there exists a prefix subarray with XOR that matches the current XOR ^ k
			if (map.containsKey(XR ^ k)) {
				count += map.get(XR ^ k);
			}

			// Add the current prefix XOR to the map
			map.put(XR, map.getOrDefault(XR, 0) + 1);
		}

		return count;
	}
}
