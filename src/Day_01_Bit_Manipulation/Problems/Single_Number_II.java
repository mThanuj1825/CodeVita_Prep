package Day_01_Bit_Manipulation.Problems;

public class Single_Number_II {
	public static void main(String[] args) {
		int[] arr = {5, 4, 5, 4, 5, 2, 4, 3, 3, 1, 3, 1, 1};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int ones = 0, twos = 0;

		for (int i : arr) {
			ones = (ones ^ i) & ~twos;
			twos = (twos ^ i) & ~ones;
		}

		return ones;
	}
}
