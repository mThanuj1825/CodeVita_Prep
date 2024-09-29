package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.Arrays;

/**
 * Problem Statement:
 * Given an array of integers where the number of positive and negative integers are equal,
 * rearrange the elements in the array so that the positive and negative integers are placed
 * alternatively. The positive integer should always appear first, followed by a negative integer.
 * You must do this without changing the relative order of positive and negative integers.
 * *
 * Intuition:
 * The goal is to place positive and negative integers alternatively, maintaining the order of
 * appearance of both types. We can use two pointers, one starting from index 0 (for positive
 * numbers) and another from index 1 (for negative numbers). We iterate through the input array
 * and assign the positive and negative numbers to their respective positions in the result array.
 * *
 * Approach:
 * 1. Initialize an empty result array `res` of the same size as the input array.
 * 2. Use two pointers `p` and `n`, where `p` tracks the position of the next positive number
 * (starting at index 0) and `n` tracks the position of the next negative number (starting at index 1).
 * 3. Iterate over the input array:
 * - If the current element is positive, place it at index `p` of the result array and increment `p` by 2.
 * - If the current element is negative, place it at index `n` of the result array and increment `n` by 2.
 * 4. Return the result array.
 * *
 * Topics / Data Structures Used:
 * - Arrays
 * - Two Pointer Technique
 * *
 * Time Complexity:
 * O(n), where `n` is the length of the input array. We make a single pass over the input array.
 * *
 * Space Complexity:
 * O(n), where `n` is the length of the input array. We use an additional result array of the same size.
 */

public class Rearrange_Array_Elements_By_Sign {
	public static void main(String[] args) {
		int[] arr = {3, 1, -2, -5, 2, -4};

		System.out.println(Arrays.toString(solve(arr)));
	}

	public static int[] solve(int[] arr) {
		int[] res = new int[arr.length];

		int p = 0, n = 1;

		for (int i : arr) {
			if (i < 0) {
				res[n] = i;
				n += 2;
			} else {
				res[p] = i;
				p += 2;
			}
		}

		return res;
	}
}
