package Topic_05_06_Arrays.Problems.Hard.Pascals_Triangle;

import java.util.HashMap;

public class Given_R_And_C_Find_The_Value {
	public static void main(String[] args) {
		long r = 100;
		long c = 58;
		HashMap<Long, Long> memo = new HashMap<>();

		System.out.println(solve(r, c, memo));
	}

	public static long solve(
			long r,
			long c,
			HashMap<Long, Long> memo
	) {
		long key = (r << 16) ^ c;

		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		if (c == 0 || c == r) {
			return 1;
		}

		memo.put(key, solve(r - 1, c, memo) + solve(r - 1, c - 1, memo));

		return memo.get(key);
	}
}
