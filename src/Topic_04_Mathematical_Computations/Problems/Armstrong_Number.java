package Topic_04_Mathematical_Computations.Problems;

public class Armstrong_Number {
	public static void main(String[] args) {
		int n = 1634;

		System.out.println(solve(n));
	}

	public static boolean solve(int n) {
		int sum = 0;
		int temp = n;
		int len = (int) (Math.log10(n)) + 1;

		while (n != 0) {
			int rem = n % 10;
			sum += (int) (Math.pow(rem, len));
			n /= 10;
		}

		return sum == temp;
	}
}
