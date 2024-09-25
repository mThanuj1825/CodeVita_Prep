package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n` and an index `i`, check if the `i`th bit of `n` is set (1).
 * *
 * Intuition:
 * In binary representation, each bit in an integer corresponds to a power of 2.
 * To check whether the `i`th bit is set, we can use a bitmask. By left-shifting `1` by `i` positions,
 * we create a mask with only the `i`th bit set. Using the bitwise AND operation, we can isolate the `i`th bit of `n`.
 * If the result is non-zero, the bit is set; otherwise, it is not.
 * *
 * Approach:
 * 1. Create a bitmask by left-shifting `1` by `i` positions (i.e., `1 << i`).
 * 2. Use a bitwise AND operation between `n` and the mask (`n & mask`).
 * 3. If the result is non-zero, the `i`th bit of `n` is set. Otherwise, it is not.
 * *
 * Topics / Data Structures used:
 * - Bit manipulation
 * *
 * Time Complexity:
 * O(1), constant time complexity, since bitwise operations are executed in constant time.
 * *
 * Space Complexity:
 * O(1), constant space is used.
 */

public class Check_If_ith_Bit_Is_Set {
	public static void main(String[] args) {
		int n = 13;
		int i = 0;

		System.out.println(solve(n, i)); // Output: true, since 13 (1101 in binary) has the 0th bit set.
	}

	public static boolean solve(
			int n,
			int i
	) {
		int mask = 1 << i;
		return (n & mask) != 0;
	}
}
