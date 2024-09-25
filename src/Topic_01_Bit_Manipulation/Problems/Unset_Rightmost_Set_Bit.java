package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n`, unset (clear) the rightmost set bit of `n`.
 * *
 * Intuition:
 * The rightmost set bit of an integer can be cleared using a simple bitwise operation.
 * By subtracting 1 from `n`, we flip all bits to the right of the rightmost set bit,
 * including the rightmost set bit itself. Performing a bitwise AND operation between `n` and
 * `n - 1` effectively clears this rightmost set bit.
 * *
 * Approach:
 * * Use the expression: `return (n & (n - 1));`
 * - `n - 1` flips all bits to the right of the rightmost set bit (including the bit itself).
 * - The AND operation results in `n` with the rightmost set bit cleared.
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

public class Unset_Rightmost_Set_Bit {
    public static void main(String[] args) {
		int n = 15; // Binary: 1111

		System.out.println(solve(n)); // Output: 14, as unsetting the rightmost set bit of 15 results in 14 (Binary:
		// 1110).
	}

	public static int solve(int n) {
		return (n & (n - 1));
	}
}
