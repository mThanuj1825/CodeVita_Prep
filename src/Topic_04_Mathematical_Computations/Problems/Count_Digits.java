package Topic_04_Mathematical_Computations.Problems;

/**
 * Count_Digits class provides a method to count the number of digits in a given
 * integer.
 * *
 * Problem statement:
 * Given an integer n, we want to determine how many digits it contains. For
 * example, the number 88329 contains 5 digits.
 * *
 * Intuition:
 * The number of digits in a number can be determined using the logarithm
 * function. Specifically, the base-10 logarithm of a number gives the power of
 * 10 that is less than or equal to that number, and adding 1 to it provides the
 * count of digits.
 * *
 * Approach:
 * - Use the formula `floor(log10(n)) + 1` to calculate the number of digits.
 * - This can be simplified as casting `Math.log10(n)` to an integer and adding
 * 1.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * *
 * Time Complexity:
 * - O(1), as the computation does not depend on the number of digits in n.
 * *
 * Space Complexity:
 * - O(1), as we are using a constant amount of space for variables.
 */

public class Count_Digits {
    public static void main(String[] args) {
		int n = 88329;

		System.out.println(solve(n));
	}

	public static int solve(int n) {
		return (int) (Math.log10(n)) + 1;
	}
}
