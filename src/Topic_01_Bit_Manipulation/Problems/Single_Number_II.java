package Topic_01_Bit_Manipulation.Problems;

/**
 * Problem statement:
 * Given an integer array where every element appears three times except for one element that appears only once,
 * find that single element.
 * *
 * Intuition:
 * To efficiently track the counts of bits in the binary representation of the numbers, we can use two variables:
 * * `ones`: keeps track of bits that have appeared once.
 * * `twos`: keeps track of bits that have appeared twice.
 * *
 * The goal is to ensure that we can eliminate bits that appear three times while retaining the bit corresponding to
 * the single number.
 * *
 * Approach:
 * * Iterate through each number in the array:
 * - Update `ones` to include the current number's bits, unless those bits are already in `twos`.
 * - Update `twos` to include the current number's bits, unless those bits are already in `ones`.
 * * After processing all elements, `ones` will hold the value of the single number.
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

public class Single_Number_II {
    public static void main(String[] args) {
		int[] arr = {2, 3, 2, 3, 2, 3, 1};

		System.out.println(solve(arr)); // Output: 1, as 1 is the number that appears only once.
	}

	public static int solve(int[] arr) {
		int ones = 0, twos = 0;

		for (int i : arr) {
			ones ^= (i & ~twos);
			twos ^= (i & ~ones);
		}

		return ones;
	}
}
