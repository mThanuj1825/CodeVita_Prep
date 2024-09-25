package Topic_01_Bit_Manipulation.Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem statement:
 * Given an array of integers, generate all possible subsets (the power set) of the array.
 * *
 * Intuition:
 * A power set is a set of all subsets, including the empty set and the set itself.
 * Each element can either be included in a subset or excluded from it.
 * By representing subsets as binary numbers, we can iterate through all possible combinations of elements in the array.
 * Each bit in a binary representation corresponds to whether to include the respective element.
 * *
 * Approach:
 * * Use a loop to iterate through all numbers from 0 to (2^n - 1), where (n) is the length of the array.
 * * For each number, determine its binary representation to decide which elements to include in the current subset.
 * * Use a nested loop to check each bit of the number. If the bit at position `j` is set (1), include `arr[j]` in
 * the current subset.
 * * Add each generated subset to the result list.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * * List (for storing subsets)
 * *
 * Time Complexity:
 * * O(n * 2^n), where (n) is the number of elements in the input array.
 * There are (2^n) possible subsets, and constructing each subset takes O(n) time in the worst case.
 * *
 * Space Complexity:
 * * O(n * 2^n), to store all the subsets in the result list.
 */

public class Generate_A_Power_Set {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};

		System.out.println(solve(arr)); // Output: [[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
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
