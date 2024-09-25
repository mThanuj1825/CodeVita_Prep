package Topic_01_Bit_Manipulation.Problems;

import java.util.Arrays;

/**
 * Problem statement:
 * Given an integer array where every element appears twice except for two elements that appear only once,
 * find those two unique elements.
 * *
 * Intuition:
 * The XOR operation can help identify the unique numbers. By XORing all elements, the result will be the XOR of the
 * two unique numbers
 * (let's call them `a` and `b`). The key is to find a bit that differentiates `a` and `b`.
 * *
 * Approach:
 * * First, calculate the XOR of all numbers in the array, which gives `total_xor = a ^ b`.
 * * Find a bit position `idx` where `total_xor` has a 1. This indicates that `a` and `b` differ at this position.
 * * Create a mask based on this bit position and partition the numbers into two buckets:
 * - Bucket 1 for numbers with the bit at `idx` as 0.
 * - Bucket 2 for numbers with the bit at `idx` as 1.
 * * XOR the numbers in each bucket to retrieve the two unique numbers.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(n), where `n` is the number of elements in the array. We traverse the array a couple of times.
 * *
 * Space Complexity:
 * * O(1), constant space is used (not counting the output array).
 */

public class Single_Number_III {
    public static void main(String[] args) {
		int[] arr = {2, 4, 2, 6, 3, 7, 7, 3};

		System.out.println(Arrays.toString(solve(arr))); // Output: [4, 6], as 4 and 6 are the unique numbers.
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
