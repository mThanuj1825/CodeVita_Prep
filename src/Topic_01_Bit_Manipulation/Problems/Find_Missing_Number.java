package Topic_01_Bit_Manipulation.Problems;

/**
 * Find_Missing_Number class provides a method to find the missing number
 * in a sequence of integers from 1 to n.
 * *
 * Problem Statement:
 * Given an array of n-1 integers where each integer is unique and in the range
 * from 1 to n, the task is to find the missing number from this sequence.
 * *
 * Example:
 * Input: arr = {1, 2, 4, 5}
 * Output: 3
 * *
 * Approach:
 * - Use the XOR operation to identify the missing number efficiently.
 * - The XOR of all numbers from 1 to n is calculated.
 * - The XOR of all numbers in the given array is also calculated.
 * - By XORing these two results, the missing number can be identified because
 * the XOR of a number with itself is 0 and the XOR of a number with 0 is the number itself.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the length of the original sequence (i.e., the highest number in the range).
 * *
 * Space Complexity:
 * - O(1), as only a constant amount of extra space is used for the XOR variables.
 */

public class Find_Missing_Number {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int xor_1 = arr.length + 1; // XOR of numbers from 1 to n
		int xor_2 = 0; // XOR of elements in the array

		for (int i = 0; i < arr.length; i++) {
			xor_2 ^= arr[i]; // XOR of the given array elements
			xor_1 ^= (i + 1); // XOR of numbers from 1 to n
		}

		return xor_1 ^ xor_2; // The missing number
	}
}
