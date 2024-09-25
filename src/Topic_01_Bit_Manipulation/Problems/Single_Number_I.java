package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an array of integers, where every element appears twice except for one element that appears only once,
 * find that single element.
 * *
 * Intuition:
 * The XOR operation has properties that make it useful for this problem:
 * * `x ^ x = 0` (XOR of a number with itself is zero)
 * * `x ^ 0 = x` (XOR of a number with zero is the number itself)
 * *
 * By XORing all the numbers in the array, the pairs will cancel each other out, leaving only the single number.
 * *
 * Approach:
 * * Initialize a variable `xor` to 0.
 * * Iterate through each element in the array and XOR it with `xor`.
 * * After processing all elements, `xor` will hold the value of the single number.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(n), where `n` is the number of elements in the array. We traverse the array once.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Single_Number_I {
	public static void main(String[] args) {
		int[] arr = {4, 1, 2, 1, 2};

		System.out.println(solve(arr)); // Output: 4, as 4 is the number that appears only once.
	}

	public static int solve(int[] arr) {
		int xor = 0;

		for (int i : arr) {
			xor ^= i;
		}

		return xor;
	}
}
