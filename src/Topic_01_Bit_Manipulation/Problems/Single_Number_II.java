package Topic_01_Bit_Manipulation.Problems;

public class Single_Number_II {
	public static void main(String[] args) {
		int[] arr = {2, 3, 2, 3, 2, 3, 1};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int ones = 0, twos = 0;

		for (int i : arr) {
			ones ^= (i & ~twos);
			twos ^= (i & ~ones);
		}

		return ones;
	}
}
