package Topic_04_Mathematical_Computations.Problems;

/**
 * GCD class provides a method to compute the Greatest Common Divisor (GCD)
 * of two integers using the Euclidean algorithm.
 * *
 * Problem statement:
 * Given two integers a and b, the goal is to find their GCD, which is the
 * largest positive integer that divides both numbers without leaving a remainder.
 * *
 * Intuition:
 * The Euclidean algorithm is based on the principle that the GCD of two numbers
 * also divides their difference. By repeatedly replacing the larger number with
 * the remainder of the two numbers until one of them becomes zero, we can
 * determine the GCD.
 * *
 * Approach:
 * - If a is 0, the GCD is b.
 * - If b is 0, the GCD is a.
 * - Otherwise, recursively call the function with the smaller number and the
 * remainder of the larger number divided by the smaller number.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * - Recursion
 * *
 * Time Complexity:
 * - O(log(min(a, b))), as the size of the inputs reduces with each recursive
 * call.
 * *
 * Space Complexity:
 * - O(log(min(a, b))), due to the call stack used for recursion.
 */

public class GCD {
    public static void main(String[] args) {
		int a = 20;
		int b = 15;

		System.out.println(solve(a, b));
	}

	public static int solve(
			int a,
			int b
	) {
		if (a == 0) {
			return b;
		}

		if (b == 0) {
			return a;
		}

		if (a > b) {
			return solve(a % b, b);
		}

		return solve(a, b % a);
	}
}
