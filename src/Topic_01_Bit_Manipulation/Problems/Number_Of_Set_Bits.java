package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n`, count the number of set bits (1s) in its binary representation.
 * *
 * Intuition:
 * A set bit is a bit that is 1 in the binary representation of a number.
 * To count the number of set bits efficiently, we can use the property that `n & (n - 1)` clears the least
 * significant set bit of `n`.
 * This allows us to count the number of set bits by iteratively clearing them until `n` becomes 0.
 * *
 * Approach:
 * * Initialize a counter to zero.
 * * While `n` is not zero, increment the counter and update `n` by performing the operation `n & (n - 1)`, which
 * removes the least significant set bit.
 * * Return the counter as the result.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(k), where `k` is the number of set bits in `n`. This is efficient since we only iterate as many times as there
 * are set bits.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Number_Of_Set_Bits {
	public static void main(String[] args) {
		int n = 13;

		System.out.println(solve(n)); // Output: 3, since 13 (1101 in binary) has 3 set bits.
	}

	public static int solve(int n) {
		int count = 0;

		while (n != 0) {
			count += 1;
			n = (n & (n - 1));
		}

		return count;
	}
}
