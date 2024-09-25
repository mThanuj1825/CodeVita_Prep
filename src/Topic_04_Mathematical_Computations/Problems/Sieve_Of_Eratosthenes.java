package Topic_04_Mathematical_Computations.Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Sieve_Of_Eratosthenes class implements the Sieve of Eratosthenes algorithm
 * to find all prime numbers up to a specified integer n.
 * *
 * Problem statement:
 * Given an integer n, the goal is to find all prime numbers less than or
 * equal to n.
 * *
 * Intuition:
 * The Sieve of Eratosthenes is an efficient algorithm that iteratively
 * marks the multiples of each prime number starting from 2. The numbers
 * which remain unmarked after processing all potential factors are the
 * prime numbers.
 * *
 * Approach:
 * - Create a boolean array `primes` of size n + 1, initialized to true,
 * where index i represents the number i.
 * - Starting from the first prime number 2, mark all of its multiples
 * as false (non-prime).
 * - Repeat this for all numbers up to the square root of n.
 * - Finally, collect all indices of `primes` that remain true and return
 * them as the list of prime numbers.
 * *
 * Topics / Data Structures used:
 * - Array (boolean array to track prime status)
 * *
 * Time Complexity:
 * - O(n log log n), where n is the input number, which accounts for the
 * number of operations needed to mark non-prime numbers.
 * *
 * Space Complexity:
 * - O(n), for the storage of the boolean array to track prime numbers.
 */

public class Sieve_Of_Eratosthenes {
	public static void main(String[] args) {
		int n = 100;

		System.out.println(solve(n));
	}

	public static List<Integer> solve(int n) {
		List<Integer> res = new ArrayList<>();

		boolean[] primes = new boolean[n + 1];
		for (int i = 2; i < primes.length; i++) {
			primes[i] = true;
		}

		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				for (int j = i * i; j <= n; j += i) {
					primes[j] = false;
				}
			}
		}

		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				res.add(i);
			}
		}

		return res;
	}
}
