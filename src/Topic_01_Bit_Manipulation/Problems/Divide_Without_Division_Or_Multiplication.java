package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Divide two integers `dividend` and `divisor` without using division (`/`), multiplication (`*`), or modulus (`%`)
 * operators.
 * Return the quotient after dividing `dividend` by `divisor`.
 * *
 * Intuition:
 * Division can be thought of as repeatedly subtracting the divisor from the dividend.
 * Instead of subtracting one divisor at a time, we can use bit manipulation (left shift) to efficiently subtract
 * multiples of the divisor,
 * making the process faster by reducing the dividend in larger chunks (powers of 2).
 * *
 * Approach:
 * * First, handle the sign of the result based on the signs of the `dividend` and `divisor`.
 * * Use absolute values for both the `dividend` and `divisor` to simplify the logic.
 * * While the `dividend` is greater than or equal to the `divisor`, find the largest multiple of the divisor (using
 * left shift) that fits in the dividend.
 * * Subtract this multiple from the dividend and accumulate the result.
 * * Return the final result with the appropriate sign.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * * Control structures (loops and conditionals)
 * *
 * Time Complexity:
 * * O(log n), where `n` is the `dividend`. The inner loop uses bit manipulation to speed up the process by powers of
 * 2, so the number of iterations is logarithmic.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Divide_Without_Division_Or_Multiplication {
	public static void main(String[] args) {
		int dividend = 22;
		int divisor = 3;

		System.out.println(solve(dividend, divisor)); // Output: 7
	}

	public static int solve(
			int dividend,
			int divisor
	) {
		if (dividend == divisor) {
			return 1;
		}

		boolean sign = true;
		if (dividend >= 0 && divisor < 0) {
			sign = false;
		} else if (dividend < 0 && divisor > 0) {
			sign = false;
		}

		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		int res = 0;
		while (dividend >= divisor) {
			int count = 0;
			while (dividend >= (divisor << (count + 1))) {
				count += 1;
			}

			res += 1 << count;
			dividend -= (divisor << count);
		}

		return (sign) ? res : (-1 * res);
	}
}
