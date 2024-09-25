package Day_01_Bit_Manipulation.Problems;

public class Flip_ith_Bit {
	public static void main(String[] args) {
		int n = 13;
		int i = 2;

		System.out.println(solve(n, i));
	}

	public static int solve(
			int n,
			int i
	) {
		int mask = 1 << i;
		return (n ^ mask);
	}
}
