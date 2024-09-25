package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n` and an index `i`, unset (clear) the ith bit of `n`.
 * *
 * Intuition:
 * To clear a specific bit in an integer, we can create a mask that has all bits set to 1 except for the ith bit,
 * which will be set to 0. By performing a bitwise AND operation between `n` and this mask,
 * we can effectively unset the ith bit.
 * *
 * Approach:
 * * Create a mask by left-shifting 1 by `i` positions: `mask = 1 << i`.
 * * Invert the mask to get all bits set to 1 except the ith bit: `mask = ~mask`.
 * * Perform a bitwise AND operation between `n` and the inverted mask to clear the ith bit:
 * `return (n & mask);`
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(1), constant time complexity since the operations executed are fixed and independent of input size.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Unset_ith_Bit {
	public static void main(String[] args) {
		int n = 13; // Binary: 1101
		int i = 2;  // Index of the bit to unset

		System.out.println(solve(n, i)); // Output: 9, as unsetting the 2nd bit of 13 results in 9 (Binary: 1001).
	}

	public static int solve(
			int n,
			int i
	) {
		int mask = 1 << i;
		mask = ~mask;

		return (n & mask);
	}
}
