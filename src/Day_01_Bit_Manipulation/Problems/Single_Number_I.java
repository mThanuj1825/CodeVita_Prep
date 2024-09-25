package Day_01_Bit_Manipulation.Problems;

public class Single_Number_I {
	public static void main(String[] args) {
		int[] arr = {4, 1, 2, 1, 2};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int xor = 0;

		for (int i : arr) {
			xor ^= i;
		}

		return xor;
	}
}
