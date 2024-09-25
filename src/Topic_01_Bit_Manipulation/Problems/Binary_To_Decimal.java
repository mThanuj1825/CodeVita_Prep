package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given a binary string, convert it to its decimal representation.
 * *
 * Intuition:
 * The binary number system is base-2. To convert it to a decimal, each binary digit
 * contributes its value as a power of 2, starting from the least significant bit (rightmost bit).
 * For each '1' in the binary string, add 2 raised to the power of its position to the result.
 * *
 * Approach:
 * 1. Traverse the binary string from the least significant bit to the most significant bit.
 * 2. If the current character is '1', add 2 raised to the power of its position (from the right) to the result.
 * 3. Continue this until all bits are processed.
 * 4. Return the final result, which is the decimal equivalent.
 * *
 * Topics / Data Structures used:
 * - Bit manipulation
 * - Strings
 * - Mathematical calculations (powers of 2)
 * *
 * Time Complexity:
 * O(n), where n is the length of the binary string. We iterate through each character of the string once.
 * *
 * Space Complexity:
 * O(1), constant space is used, as we only store a few variables like `res` and the length of the string.
 */

public class Binary_To_Decimal {
	public static void main(String[] args) {
		String binary = "1001110";

		System.out.println(solve(binary));
	}

	public static int solve(String binary) {
		int n = binary.length();
		int res = 0;

		for (int i = 0; i < n; i++) {
			char val = binary.charAt(n - i - 1);
			if (val == '1') {
				res += (int) (Math.pow(2, i));
			}
		}

		return res;
	}
}
