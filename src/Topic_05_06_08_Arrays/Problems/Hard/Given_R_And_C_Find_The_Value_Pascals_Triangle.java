package Topic_05_06_08_Arrays.Problems.Hard;

import java.util.HashMap;

/**
 * Problem: Given row `r` and column `c`, find the value at position (r, c)
 * in Pascal's Triangle.
 * *
 * Intuition:
 * Pascal's Triangle follows the rule that the value at position (r, c) is the sum
 * of the values at (r-1, c-1) and (r-1, c). Using this property, we can recursively
 * compute the value at (r, c) with memoization to optimize and avoid redundant calculations.
 * *
 * Approach:
 * 1. Use a hashmap to store previously computed values (memoization) for faster lookups.
 * 2. The base cases are when `c == 0` or `c == r`, both of which return 1.
 * 3. Recursively compute the value at (r, c) by summing the values at (r-1, c-1) and (r-1, c).
 * 4. Use a unique key (derived from `r` and `c`) for memoization.
 * *
 * Topics / Data Structures:
 * - Pascal's Triangle
 * - Dynamic Programming (Memoization)
 * - Recursion
 * *
 * Time Complexity:
 * - O(r * c): In the worst case, the algorithm computes every value in the Pascal's Triangle
 * for row `r`, while memoization reduces redundant work.
 * *
 * Space Complexity:
 * - O(r * c): The space is used for memoization to store previously computed values.
 * *
 */

public class Given_R_And_C_Find_The_Value_Pascals_Triangle {
	public static void main(String[] args) {
		long r = 100;
		long c = 58;
		HashMap<Long, Long> memo = new HashMap<>();

		System.out.println(solve(r, c, memo));
	}

	public static long solve(
			long r,
			long c,
			HashMap<Long, Long> memo
	) {
		long key = (r << 16) ^ c;

		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		if (c == 0 || c == r) {
			return 1;
		}

		memo.put(key, solve(r - 1, c, memo) + solve(r - 1, c - 1, memo));

		return memo.get(key);
	}
}
