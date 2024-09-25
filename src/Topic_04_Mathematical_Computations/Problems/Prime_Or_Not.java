package Topic_04_Mathematical_Computations.Problems;

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
