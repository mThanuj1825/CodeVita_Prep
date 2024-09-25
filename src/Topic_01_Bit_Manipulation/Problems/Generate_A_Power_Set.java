package Topic_01_Bit_Manipulation.Problems;

import java.util.ArrayList;
import java.util.List;

public class Generate_A_Power_Set {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};

		System.out.println(solve(arr));
	}

	public static List<List<Integer>> solve(int[] arr) {
		int n = arr.length;
		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < (1 << n); i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					list.add(arr[j]);
				}
			}

			res.add(list);
		}

		return res;
	}
}
