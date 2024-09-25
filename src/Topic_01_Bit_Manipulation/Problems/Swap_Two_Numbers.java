package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given two integers `a` and `b`, swap their values without using a temporary variable.
 * *
 * Intuition:
 * The XOR operation can be used to swap two numbers without requiring additional storage.
 * By applying XOR in a specific sequence, we can achieve the desired result.
 * *
 * Approach:
 * * Use the XOR operation to manipulate the values:
 * 1. `a ^= b;` — This stores the XOR of `a` and `b` in `a`.
 * 2. `b ^= a;` — This updates `b` to be the original value of `a` (as `a` now holds the XOR).
 * 3. `a ^= b;` — Finally, this updates `a` to the original value of `b`.
 * * After these three operations, the values of `a` and `b` will be swapped.
 * *
 * Topics / Data Structures used:
 * * Bit manipulation
 * *
 * Time Complexity:
 * * O(1), constant time complexity since the operations executed are fixed and independent of input size.
 * *
 * Space Complexity:
 * * O(1), constant space is used.
 */

public class Swap_Two_Numbers {
    public static void main(String[] args) {
		int a = 5;
		int b = 6;

		System.out.println("a= " + a + " b= " + b); // Output: a= 5 b= 6

		a ^= b;
		b ^= a;
		a ^= b;

		System.out.println("a= " + a + " b= " + b); // Output: a= 6 b= 5
	}
}
