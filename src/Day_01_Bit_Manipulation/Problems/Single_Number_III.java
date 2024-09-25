package Day_01_Bit_Manipulation.Problems;

import java.util.Arrays;

public class Single_Number_III {
	public static void main(String[] args) {
		int[] arr = {2, 4, 2, 6, 3, 7, 7, 3};

		System.out.println(Arrays.toString(solve(arr)));
	}

	public static int[] solve(int[] arr) {
		int total_xor = 0;

		for (int i : arr) {
			total_xor ^= i;
		}

		int idx = 0;
		for (; idx < 32; idx++) {
			int mask = 1 << idx;
			if ((total_xor & mask) != 0) {
				break;
			}
		}

		int mask = 1 << idx;
		int bucket_1 = 0;
		int bucket_2 = 0;

		for (int i : arr) {
			if ((i & mask) == 0) {
				bucket_1 ^= i;
			} else {
				bucket_2 ^= i;
			}
		}

		return new int[]{bucket_1, bucket_2};
	}
}
