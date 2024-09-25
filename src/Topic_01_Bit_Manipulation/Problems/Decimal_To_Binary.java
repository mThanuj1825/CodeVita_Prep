package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given a decimal integer `n`, convert it to its binary representation as a string.
 * *
 * Intuition:
 * To convert a decimal number to binary, repeatedly divide the number by 2 and record the remainders.
 * The binary representation is formed by the sequence of these remainders when read in reverse order.
 * *
 * Approach:
 * * Start with an empty string to store the binary digits.
 * * Repeatedly divide the number by 2, appending the remainder (which will be 0 or 1) to the string.
 * * Once the number becomes 1, append '1' to the string.
 * * Reverse the string to get the correct binary representation.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * * StringBuilder (for efficient string manipulations)
 * *
 * Time Complexity:
 * * O(log n), since the number of divisions by 2 corresponds to the number of bits in `n` (approximately log base 2
 * of `n`).
 * *
 * Space Complexity:
 * * O(log n), due to the space needed to store the binary digits in the StringBuilder.
 */

public class Decimal_To_Binary {
	public static void main(String[] args) {
		int n = 0;

		System.out.println(solve(n)); // Output: "0"
	}

	public static String solve(int n) {
		if (n == 0) {
			return "0";
		}

		StringBuilder str = new StringBuilder();

		while (n != 1) {
			int rem = n % 2;
			str.append(rem);
			n /= 2;
		}
		str.append(1).reverse();

		return str.toString();
	}
}
