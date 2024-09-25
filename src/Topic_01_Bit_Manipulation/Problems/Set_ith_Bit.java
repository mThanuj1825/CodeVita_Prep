package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n` and an index `i`, set the `i`th bit of `n` to 1.
 * If the bit is already 1, it remains unchanged.
 * *
 * Intuition:
 * To set a specific bit in a number, we can use the bitwise OR (|) operation.
 * By creating a mask that has the `i`th bit set to 1 (using left shift), we can ensure that the `i`th bit of `n`
 * becomes 1 when we perform the OR operation.
 * *
 * Approach:
 * * Create a mask by left-shifting `1` by `i` positions (i.e., `1 << i`).
 * * Use the bitwise OR operation (`n | mask`) to set the `i`th bit of `n`.
 * * Return the modified number.
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

public class Set_ith_Bit {
	public static void main(String[] args) {
		int n = 9;
		int i = 1;

		System.out.println(solve(n, i)); // Output: 11, as 9 (1001 in binary) becomes 11 (1011 in binary) after
		// setting the 1st bit.
	}

	public static int solve(
			int n,
			int i
	) {
		int mask = 1 << i;

		return (n | mask);
	}
}
