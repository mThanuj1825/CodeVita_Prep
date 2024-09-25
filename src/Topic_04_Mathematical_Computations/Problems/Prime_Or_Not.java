package Topic_04_Mathematical_Computations.Problems;

/**
 * Prime_Or_Not class provides a method to determine whether a given number
 * is prime or not.
 * *
 * Problem statement:
 * Given a positive integer n, the goal is to check if n is a prime number.
 * A prime number is defined as a natural number greater than 1 that has no
 * positive divisors other than 1 and itself.
 * *
 * Intuition:
 * The algorithm utilizes a combination of basic checks and a loop to efficiently
 * determine if a number is prime, reducing unnecessary computations.
 * *
 * Approach:
 * - First, check if n is less than or equal to 1; if so, return false.
 * - If n is 2 or 3, return true (both are prime).
 * - If n is even or divisible by 3, return false (they cannot be prime).
 * - For numbers greater than 3, check potential divisors from 5 to the
 * square root of n, skipping even numbers by incrementing by 6.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * - Looping
 * *
 * Time Complexity:
 * - O(√n), as we only check divisors up to the square root of n.
 * *
 * Space Complexity:
 * - O(1), since the algorithm uses a constant amount of space.
 */

public class Prime_Or_Not {
    public static void main(String[] args) {
		int n = 29;

		System.out.println(solve(n));
	}

	public static boolean solve(int n) {
		if (n <= 1) {
			return false;
		}

		if (n == 2 || n == 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}
}
