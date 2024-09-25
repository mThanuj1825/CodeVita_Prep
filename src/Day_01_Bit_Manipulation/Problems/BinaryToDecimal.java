package Day_01_Bit_Manipulation.Problems;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String binary = "1001110";

		System.out.println(solve(binary));
	}

	public static int solve(String binary) {
		int n = binary.length();
		int res = 0;

		for (int i = 0; i < n; i++) {
			char val = binary.charAt(n - i - 1);
			if (val == '1') {
				res += (int) (Math.pow(2, i));
			}
		}

		return res;
	}
}
