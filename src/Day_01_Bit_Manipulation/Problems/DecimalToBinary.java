package Day_01_Bit_Manipulation.Problems;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n = 52;

		System.out.println(solve(n));
	}

	public static String solve(int n) {
		StringBuilder str = new StringBuilder();

		while (n != 1) {
			int rem = n % 2;
			str.append(rem);
			n /= 2;
		}

		return str.append(1).reverse().toString();
	}
}
