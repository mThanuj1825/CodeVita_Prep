package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given two integers `start` and `end`, find the XOR of all integers from `start` to `end`, inclusive.
 * *
 * Intuition:
 * The XOR of a range can be computed by leveraging the property that
 * the XOR from 1 to `n` can be calculated efficiently.
 * The XOR from `start` to `end` can be derived by XORing the result of
 * the XOR from 1 to `end` and the XOR from 1 to `start - 1`.
 * *
 * Approach:
 * * Use the function `XOR_Of_Numbers_From_1_To_N.solve(n)` to calculate:
 * - `start_xor` as the XOR from 1 to `start - 1`.
 * - `end_xor` as the XOR from 1 to `end`.
 * * The final result for the XOR from `start` to `end` is then given by:
 * `return start_xor ^ end_xor;`
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(1), constant time complexity since both calls to the XOR function run in constant time.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class XOR_Of_Numbers_In_Range {
    public static void main(String[] args) {
		int start = 4; // Starting number of the range
		int end = 7;   // Ending number of the range

		System.out.println(solve(start, end)); // Output: 4, as XOR from 4 to 7 is 4^5^6^7 = 4.
	}

	public static int solve(
			int start,
			int end
	) {
		int start_xor = XOR_Of_Numbers_From_1_To_N.solve(start - 1);
		int end_xor = XOR_Of_Numbers_From_1_To_N.solve(end);

		return start_xor ^ end_xor;
	}
}
