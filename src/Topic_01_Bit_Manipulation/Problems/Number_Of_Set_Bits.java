package Topic_01_Bit_Manipulation.Problems;

public class Number_Of_Set_Bits {
	public static void main(String[] args) {
		int n = 13;

		System.out.println(solve(n));
	}

	public static int solve(int n) {
		int count = 0;

		while (n != 0) {
			count += 1;
			n = (n & (n - 1));
		}

		return count;
	}
}
