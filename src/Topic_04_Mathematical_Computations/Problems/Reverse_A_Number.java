package Topic_04_Mathematical_Computations.Problems;

/**
 * Reverse_A_Number class provides a method to reverse the digits of a
 * given integer n.
 * *
 * Problem statement:
 * Given an integer n, the goal is to reverse its digits and return the
 * resulting integer.
 * *
 * Intuition:
 * The algorithm extracts the last digit of n using modulo operation and
 * appends it to a new integer rev. This is repeated until all digits
 * have been processed.
 * *
 * Approach:
 * - Initialize rev to 0.
 * - While n is not 0, perform the following:
 * - Get the last digit of n (rem) using n % 10.
 * - Append this digit to rev by multiplying rev by 10 and adding rem.
 * - Remove the last digit from n by performing integer division (n /= 10).
 * - Return rev, which now contains the reversed number.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * *
 * Time Complexity:
 * - O(d), where d is the number of digits in n, as we process each digit
 * exactly once.
 * *
 * Space Complexity:
 * - O(1), since we use a constant amount of space for rev and rem.
 */

public class Reverse_A_Number {
	public static void main(String[] args) {
		int n = 123;

		System.out.println(solve(n));
	}

	public static int solve(int n) {
		int rev = 0;

		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}

		return rev;
	}
}
