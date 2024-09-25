package Day_01_Bit_Manipulation.Problems;

public class Set_ith_Bit {
	public static void main(String[] args) {
		int n = 9;
		int i = 1;

		System.out.println(solve(n, i));
	}

	public static int solve(
			int n,
			int i
	) {
		int mask = 1 << i;

		return (n | mask);
	}
}
