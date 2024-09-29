package Topic_05_06_Arrays.Problems.Medium;

/**
 * Problem: Given an integer array, find the majority element that appears
 * more than n/2 times, where n is the size of the array. If no such element exists, return null.
 * *
 * Intuition:
 * The majority element must appear more than half the time in the array. We can solve this using
 * the Boyer-Moore Voting Algorithm, which finds a candidate for the majority element in O(n) time
 * and verifies if the candidate occurs more than n/2 times.
 * *
 * Approach:
 * 1. Use the Boyer-Moore Voting Algorithm:
 * - Traverse the array to find a candidate by maintaining a count that increments for the
 * same element and decrements for different ones.
 * - If the count reaches zero, update the candidate to the current element.
 * 2. After finding a candidate, traverse the array again to verify if it appears more than n/2 times.
 * 3. If it does, return the candidate; otherwise, return null.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - Boyer-Moore Voting Algorithm
 * - Greedy
 * *
 * Time Complexity:
 * - O(n): We traverse the array twice.
 * *
 * Space Complexity:
 * - O(1): Only a few variables are used, independent of the array size.
 */

public class Majority_Element_N_By_2 {
	public static void main(String[] args) {
		int[] arr = {2, 2, 3, 3, 1, 2, 2};

		System.out.println(solve(arr));
	}

	public static Integer solve(int[] arr) {
		int candidate = arr[0];
		int count = 0;

		for (int i : arr) {
			if (count == 0) {
				candidate = i;
			}

			if (candidate == i) {
				count++;
			} else {
				count--;
			}
		}

		count = 0;
		for (int i : arr) {
			if (i == candidate) {
				count++;
			}
		}

		return (count > (arr.length / 2)) ? candidate : null;
	}
}
