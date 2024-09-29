package Topic_05_06_Arrays.Problems.Hard;

import java.util.Arrays;

/**
 * Problem: Find all elements in the array that appear more than ⌊n/3⌋ times, where n is the size of the array.
 * There can be at most two majority elements that satisfy this condition.
 * *
 * Intuition:
 * We can solve this problem by applying the Boyer-Moore Voting Algorithm for n/3 majority.
 * The algorithm identifies up to two potential candidates by counting votes and ensuring
 * that both candidates' counts can be decremented if they do not match the current element.
 * *
 * Approach:
 * 1. Initialize two counters (`cnt_1`, `cnt_2`) and two candidate variables (`candidate_1`, `candidate_2`).
 * 2. Traverse the array to select two potential candidates:
 * - If a counter is zero and the current element doesn't match the other candidate, set the candidate and reset the
 * count.
 * - If the current element matches one of the candidates, increment the respective count.
 * - Otherwise, decrement both counts.
 * 3. After selecting potential candidates, validate them by traversing the array again and counting their occurrences.
 * 4. Return the valid candidates (if any) that occur more than ⌊n/3⌋ times.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - Boyer-Moore Voting Algorithm
 * *
 * Time Complexity:
 * - O(n): The algorithm makes two passes over the array.
 * *
 * Space Complexity:
 * - O(1): The algorithm uses constant space apart from the input array.
 */

public class Majority_Element_N_By_3 {
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};

		System.out.println(Arrays.toString(solve(arr)));
	}

	public static Integer[] solve(int[] arr) {
		int cnt_1 = 0;
		Integer candidate_1 = -1;
		int cnt_2 = 0;
		Integer candidate_2 = -1;

		// First pass: Finding potential candidates
		for (int i : arr) {
			if (cnt_1 == 0 && candidate_2 != i) {
				cnt_1 = 1;
				candidate_1 = i;
			} else if (cnt_2 == 0 && candidate_1 != i) {
				cnt_2 = 1;
				candidate_2 = i;
			} else if (candidate_1 == i) {
				cnt_1++;
			} else if (candidate_2 == i) {
				cnt_2++;
			} else {
				cnt_1--;
				cnt_2--;
			}
		}

		// Second pass: Verifying the candidates
		cnt_1 = 0;
		cnt_2 = 0;

		for (int i : arr) {
			if (i == candidate_1) {
				cnt_1++;
			}
			if (i == candidate_2) {
				cnt_2++;
			}
		}

		// Validate the candidates
		if (cnt_1 <= arr.length / 3) {
			candidate_1 = null;
		}

		if (cnt_2 <= arr.length / 3) {
			candidate_2 = null;
		}

		return new Integer[]{candidate_1, candidate_2};
	}
}
