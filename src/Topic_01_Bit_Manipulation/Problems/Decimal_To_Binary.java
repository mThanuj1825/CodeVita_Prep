package Topic_01_Bit_Manipulation.Problems;

public class Decimal_To_Binary {
	public static void main(String[] args) {
		int n = 0;

		System.out.println(solve(n));
	}

	public static String solve(int n) {
		if (n == 0) {
			return "0";
		}

		StringBuilder str = new StringBuilder();

		while (n != 1) {
			int rem = n % 2;
			str.append(rem);
			n /= 2;
		}
		str.append(1).reverse();

		return str.toString();
	}
}
