package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n` and an index `i`, flip the `i`th bit of `n`. Flipping means changing the bit from 1 to 0 or
 * from 0 to 1.
 * *
 * Intuition:
 * To flip the `i`th bit of a number, we can use the XOR (^) operation. XOR with 1 flips the bit, while XOR with 0
 * keeps it the same.
 * By left-shifting 1 by `i` positions (i.e., `1 << i`), we create a mask with the `i`th bit set.
 * XORing the number `n` with this mask will flip the `i`th bit while leaving other bits unchanged.
 * *
 * Approach:
 * * Create a mask by left-shifting `1` by `i` positions (i.e., `1 << i`).
 * * XOR the number `n` with this mask (`n ^ mask`) to flip the `i`th bit.
 * * Return the result.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(1), constant time complexity since bitwise operations are executed in constant time.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Flip_ith_Bit {
	public static void main(String[] args) {
		int n = 13;
		int i = 2;

		System.out.println(solve(n, i)); // Output: 9, flips the 2nd bit of 13 (1101 -> 1001)
	}

	public static int solve(
			int n,
			int i
	) {
		int mask = 1 << i;
		return (n ^ mask);
	}
}
