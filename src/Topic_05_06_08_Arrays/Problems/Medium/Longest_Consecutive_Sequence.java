package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem: Find the longest consecutive sequence of integers in a given array.
 * The sequence can be formed by using the elements of the array without any
 * gaps in between.
 * *
 * Intuition:
 * By storing all elements in a set for O(1) look-up time, we can efficiently
 * check for the existence of consecutive elements. Starting from each element,
 * we can count how many consecutive numbers follow it.
 * *
 * Approach:
 * 1. Store all elements of the array in a HashSet to allow for constant time
 * look-up.
 * 2. For each element, check if it is the start of a sequence by ensuring the
 * previous number (element - 1) does not exist in the set.
 * 3. If it is the start, count how many consecutive numbers are present in the
 * sequence.
 * 4. Keep track of the longest sequence found and return it.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - HashSet
 * - List
 * - Iteration
 * *
 * Time Complexity:
 * - O(n): The algorithm traverses the array a couple of times, making it linear
 * in relation to the number of elements.
 * *
 * Space Complexity:
 * - O(n): The space complexity is due to storing the elements in a HashSet.
 */

public class Longest_Consecutive_Sequence {
	public static void main(String[] args) {
		int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};

		System.out.println(solve(arr));
	}

	public static List<Integer> solve(int[] arr) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		for (int i : arr) {
			set.add(i);
		}

		int max = 0;

		for (int i : arr) {
			if (!set.contains(i - 1)) {
				List<Integer> temp = new ArrayList<>();
				int cur = 0;
				int j = i;
				while (set.contains(j)) {
					temp.add(j);
					cur++;
					j++;
				}

				if (cur > max) {
					max = cur;
					list = temp;
				}
			}
		}

		return list;
	}
}
