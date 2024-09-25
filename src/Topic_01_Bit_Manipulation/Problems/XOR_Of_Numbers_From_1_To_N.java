package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer `n`, find the XOR of all integers from 1 to `n`.
 * *
 * Intuition:
 * The XOR operation exhibits a periodic pattern when applied to a series of consecutive integers.
 * Specifically, the result of XORing numbers from 1 to `n` can be derived based on the remainder of `n` when divided
 * by 4.
 * *
 * Approach:
 * * The result of the XOR operation from 1 to `n` follows a pattern based on `n % 4`:
 * - If `n % 4 == 0`, the result is `n`.
 * - If `n % 4 == 1`, the result is `1`.
 * - If `n % 4 == 2`, the result is `n + 1`.
 * - If `n % 4 == 3`, the result is `0`.
 * * This approach provides an efficient way to calculate the XOR without iterating through all numbers from 1 to `n`.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(1), constant time complexity as the operations depend only on the value of `n`.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class XOR_Of_Numbers_From_1_To_N {
	public static void main(String[] args) {
		int n = 4; // Example input

		System.out.println(solve(n)); // Output: 4, as XOR from 1 to 4 is 1^2^3^4 = 4.
	}

	public static int solve(int n) {
		if (n % 4 == 1) {
			return 1;
		}

		if (n % 4 == 2) {
			return n + 1;
		}

		if (n % 4 == 3) {
			return 0;
		}

		return n;
	}
}
