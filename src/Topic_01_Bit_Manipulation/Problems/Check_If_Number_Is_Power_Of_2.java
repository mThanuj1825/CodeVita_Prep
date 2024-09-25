package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n`, check if the number is a power of 2.
 * *
 * Intuition:
 * A number that is a power of 2 has exactly one bit set in its binary representation (e.g., 1 (2^0), 2 (2^1), 4
 * (2^2), 8 (2^3), etc.).
 * If `n` is a power of 2, then `n - 1` will have all bits set below the highest bit of `n`.
 * Using the bitwise AND operation `n & (n - 1)`, we can check whether `n` has only one bit set. If the result is 0,
 * then `n` is a power of 2.
 * *
 * Approach:
 * * Use the expression `n & (n - 1)` to check if `n` has exactly one bit set.
 * * Return true if the result is 0, indicating that `n` is a power of 2.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(1), constant time complexity, since bitwise operations are executed in constant time.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Check_If_Number_Is_Power_Of_2 {
	public static void main(String[] args) {
		int n = 15;

		System.out.println(solve(n)); // Output: false, since 15 is not a power of 2.
	}

	public static boolean solve(int n) {
		return (n > 0) && (n & (n - 1)) == 0;
	}
}
