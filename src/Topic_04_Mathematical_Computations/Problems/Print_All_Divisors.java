package Topic_04_Mathematical_Computations.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Print_All_Divisors class provides a method to find and return all
 * divisors of a given integer n.
 * *
 * Problem statement:
 * Given a positive integer n, the goal is to compute and print all its
 * divisors in ascending order.
 * *
 * Intuition:
 * The algorithm iterates through potential divisors from 1 up to the square
 * root of n. For each integer that divides n without a remainder, both
 * the divisor and its corresponding pair (n / divisor) are added to the
 * result list.
 * *
 * Approach:
 * - Iterate from 1 to the square root of n.
 * - For each i, check if it divides n evenly. If it does, add i to the
 * result list.
 * - Also add n / i to the result list if it's not the same as i (to avoid
 * duplicates).
 * - Finally, sort the list to present the divisors in ascending order.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * - List manipulation
 * *
 * Time Complexity:
 * - O(√n * log(√n)), where O(√n) is for finding the divisors and log(√n)
 * is for sorting them.
 * *
 * Space Complexity:
 * - O(√n), as we store the divisors in a list.
 */

public class Print_All_Divisors {
	public static void main(String[] args) {
		int n = 36;

		System.out.println(solve(n));
	}

	public static List<Integer> solve(int n) {
		List<Integer> res = new ArrayList<>();

		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				res.add(i);
				if (i * i != n) {
					res.add(n / i);
				}
			}
		}

		Collections.sort(res);

		return res;
	}
}
