package Topic_04_Mathematical_Computations.Problems;

/**
 * Power_Exponentiation class provides a method to compute the power of a
 * number using the exponentiation by squaring technique.
 * *
 * Problem statement:
 * Given a base number n and an exponent x, the goal is to compute n raised
 * to the power of x (n^x).
 * *
 * Intuition:
 * Exponentiation by squaring is an efficient algorithm for computing
 * large powers of numbers. It reduces the number of multiplications by
 * dividing the exponentiation into smaller parts, which allows us to use
 * the properties of exponents.
 * *
 * Approach:
 * - If the exponent x is 0, return 1 (as any number raised to the power of 0 is 1).
 * - Recursively compute half the power (n^(x/2)).
 * - If x is even, return the square of the half power.
 * - If x is odd, return n multiplied by the square of the half power.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * - Recursion
 * *
 * Time Complexity:
 * - O(log x), since the problem size is reduced by half with each recursive call.
 * *
 * Space Complexity:
 * - O(log x), due to the call stack used for recursion.
 */

public class Power_Exponentiation {
    public static void main(String[] args) {
		int n = 19;
		int x = 19;

		System.out.println(solve(n, x));
	}

	public static long solve(
			int n,
			int x
	) {
		if (x == 0) {
			return 1;
		}

		long half = solve(n, x / 2);

		if (x % 2 == 0) {
			return half * half;
		}

		return n * half * half;
	}
}
