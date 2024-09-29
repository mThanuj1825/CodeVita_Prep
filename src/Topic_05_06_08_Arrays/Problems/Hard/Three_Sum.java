package Topic_05_06_08_Arrays.Problems.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem: Find all unique triplets in the array that sum to zero.
 * The triplets must be unique, meaning no duplicates should appear in the result.
 * *
 * Intuition:
 * By sorting the array, we can use the two-pointer technique to find pairs that sum
 * to the negative of the current element, avoiding the need for nested loops.
 * Sorting also helps in efficiently skipping duplicate elements.
 * *
 * Approach:
 * 1. Sort the array.
 * 2. Use three pointers: one pointer to iterate through the array (`i`),
 * and two pointers (`j` and `k`) to search for pairs that sum to zero with the element at `i`.
 * 3. If the sum of `arr[i] + arr[j] + arr[k]` is zero, add the triplet to the result list,
 * and then skip over any duplicate values for both `j` and `k`.
 * 4. If the sum is less than zero, move `j` to the right to increase the sum.
 * If the sum is greater than zero, move `k` to the left to decrease the sum.
 * 5. Continue this until all unique triplets are found.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - Sorting
 * - Two-pointer technique
 * *
 * Time Complexity:
 * - O(n^2): Sorting the array takes O(n log n), and for each element, we perform a linear scan with two pointers.
 * *
 * Space Complexity:
 * - O(n): Additional space is used to store the result, but this depends on the number of valid triplets.
 */

public class Three_Sum {
	public static void main(String[] args) {
		int[] arr = {-2, -1, 0, 2, 2, 0, -2, -1, -2, 0, 2, -1};

		List<int[]> res = solve(arr);

		for (int[] ans : res) {
			System.out.println(Arrays.toString(ans));
		}
	}

	public static List<int[]> solve(int[] arr) {
		Arrays.sort(arr);

		List<int[]> res = new ArrayList<>();

		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			int k = arr.length - 1;

			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];

				if (sum == 0) {
					res.add(new int[]{arr[i], arr[j], arr[k]});
					int prev = arr[j];
					while (j < k && arr[j] == prev) {
						j++;
					}
					prev = arr[k];
					while (j < k && arr[k] == prev) {
						k--;
					}
					prev = arr[i];
					while (i < arr.length && arr[i] == prev) {
						i++;
					}
				} else if (sum < 0) {
					int prev = arr[j];
					while (j < k && arr[j] == prev) {
						j++;
					}
				} else {
					int prev = arr[k];
					while (j < k && arr[k] == prev) {
						k--;
					}
				}
			}
			i++;
		}

		return res;
	}
}
