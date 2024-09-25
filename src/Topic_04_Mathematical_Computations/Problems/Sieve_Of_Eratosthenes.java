package Topic_04_Mathematical_Computations.Problems;

import java.util.ArrayList;
import java.util.List;

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

		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				for (int j = i * i; j * i <= n; j += i) {
					primes[j * i] = false;
				}
			}
		}

		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				res.add(i);
			}
		}

		return res;
	}
}
