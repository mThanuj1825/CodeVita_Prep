package Day_01_Bit_Manipulation.Problems;

public class XOR_Of_Numbers_From_1_To_N {
	public static void main(String[] args) {
		int n = 4;

		System.out.println(solve(n));
	}

	public static int solve(int n) {
		if (n % 4 == 1) {
			return 1;
		}

		if (n % 4 == 2) {
			return n + 1;
		}

		if (n % 4 == 3) {
			return 0;
		}

		return n;
	}
}
