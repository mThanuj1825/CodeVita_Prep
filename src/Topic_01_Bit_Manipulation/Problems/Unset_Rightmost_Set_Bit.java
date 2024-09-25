package Topic_01_Bit_Manipulation.Problems;

public class Unset_Rightmost_Set_Bit {
	public static void main(String[] args) {
		int n = 15;

		System.out.println(solve(n));
	}

	public static int solve(int n) {
		return (n & (n - 1));
	}
}
