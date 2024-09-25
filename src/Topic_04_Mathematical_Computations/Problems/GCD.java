package Topic_04_Mathematical_Computations.Problems;

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
