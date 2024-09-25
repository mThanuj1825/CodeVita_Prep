package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given two integers `start` and `goal`, find the minimum number of bit flips required to convert `start` to `goal`.
 * *
 * Intuition:
 * A bit flip is needed wherever the bits of `start` and `goal` differ.
 * By using the XOR (^) operation between `start` and `goal`, we can identify which bits differ.
 * The result of the XOR operation will have bits set to 1 at positions where `start` and `goal` differ.
 * *
 * Approach:
 * * Compute the XOR of `start` and `goal` to get a `mask` representing differing bits.
 * * Count the number of 1s in the `mask` using the technique of repeatedly clearing the least significant set bit.
 * This can be done using the expression `mask & (mask - 1)`, which removes the lowest set bit from `mask`.
 * * Increment the count for each iteration until the `mask` becomes zero.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(b), where `b` is the number of bits in the integer representation (approximately log base 2 of the maximum
 * number).
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Minimum_Bit_Flips_To_Convert_A_Number_To_Another_Number {
	public static void main(String[] args) {
		int start = 3;
		int goal = 4;

		System.out.println(solve(start, goal)); // Output: 3, as 3 (11 in binary) needs 1 flip to become 4 (100 in
		// binary).
	}

	public static int solve(
			int start,
			int goal
	) {
		int count = 0;
		int mask = start ^ goal;

		while (mask != 0) {
			count += 1;
			mask = (mask & (mask - 1));
		}

		return count;
	}
}
