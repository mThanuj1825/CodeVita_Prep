package Topic_04_Mathematical_Computations.Problems;

public class Check_Palindrome {
	public static void main(String[] args) {
		int n = 12321;

		System.out.println(solve(n));
	}

	public static boolean solve(int n) {
		int rev = Reverse_A_Number.solve(n);

		return n == rev;
	}
}
