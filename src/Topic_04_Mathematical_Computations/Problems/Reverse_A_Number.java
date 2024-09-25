package Topic_04_Mathematical_Computations.Problems;

public class Reverse_A_Number {
	public static void main(String[] args) {
		int n = 123;

		System.out.println(solve(n));
	}

	public static int solve(int n) {
		int rev = 0;

		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}

		return rev;
	}
}
