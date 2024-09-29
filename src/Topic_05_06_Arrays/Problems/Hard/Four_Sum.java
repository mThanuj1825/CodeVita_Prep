package Topic_05_06_Arrays.Problems.Hard;

import java.util.*;

/**
 * Problem: Find all unique quadruplets in the array that sum to the given target.
 * *
 * Approach:
 * 1. Use a HashMap to store pairs of numbers and their sum. The key will be the sum, and the value will be a list of
 * index pairs (i, j).
 * 2. For each pair (i, j), find the complementary sum (target - sum) in the HashMap.
 * 3. Ensure no indices overlap between pairs to avoid duplicates.
 * 4. Sort the quadruplet and store in a HashSet to ensure uniqueness.
 * *
 * Time Complexity:
 * - O(n^2): We use a nested loop to calculate all pairs of numbers and their sums.
 * *
 * Space Complexity:
 * - O(n^2): The HashMap stores all pairs of indices, and the HashSet stores the unique quadruplets.
 */

public class Four_Sum {
	public static void main(String[] args) {
		int[] arr = {1, 0, -1, 0, -2, 2};
		int target = 0;  // Target sum

		List<List<Integer>> res = solve(arr, target);

		for (List<Integer> ans : res) {
			System.out.println(ans);
		}
		System.out.println("Total quadruplets: " + res.size());
	}

	public static List<List<Integer>> solve(
			int[] arr,
			int target
	) {
		int n = arr.length;
		Map<Integer, List<int[]>> map = new HashMap<>();
		Set<List<Integer>> set = new HashSet<>(); // To ensure uniqueness of quadruplets

		// Step 1: Store all pairs of numbers and their sum in the map
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				map.putIfAbsent(sum, new ArrayList<>());
				map.get(sum).add(new int[]{i, j});  // Store the indices of the pair
			}
		}

		// Step 2: Find complementary pairs and add to result list
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				int complement = target - sum;

				// If the complement exists in the map, check for valid pairs
				if (map.containsKey(complement)) {
					for (int[] pair : map.get(complement)) {
						int k = pair[0];
						int l = pair[1];

						// Ensure that the indices are distinct
						if (i != k && i != l && j != k && j != l) {
							List<Integer> quad = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
							Collections.sort(quad);  // Sort the quadruplet to avoid duplicates
							set.add(quad);  // HashSet will ensure uniqueness
						}
					}
				}
			}
		}

		// Convert the set back to a list
		return new ArrayList<>(set);
	}
}
