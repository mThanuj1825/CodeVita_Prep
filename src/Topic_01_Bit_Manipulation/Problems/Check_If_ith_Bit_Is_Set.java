package Topic_01_Bit_Manipulation.Problems;

public class Check_If_ith_Bit_Is_Set {
	public static void main(String[] args) {
		int n = 13;
		int i = 0;

		System.out.println(solve(n, i));
	}

	public static boolean solve(
			int n,
			int i
	) {
		int mask = 1 << i;
		return (n & mask) != 0;
	}
}
