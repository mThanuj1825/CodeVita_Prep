package Topic_04_Mathematical_Computations.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
