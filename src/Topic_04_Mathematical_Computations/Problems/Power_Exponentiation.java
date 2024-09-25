package Topic_04_Mathematical_Computations.Problems;

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
