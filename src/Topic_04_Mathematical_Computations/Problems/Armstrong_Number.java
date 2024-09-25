package Topic_04_Mathematical_Computations.Problems;

/**
 * Armstrong_Number class provides a method to check if a given number is an
 * Armstrong number.
 * *
 * Problem statement:
 * An Armstrong number (also known as a narcissistic number) for a given
 * number of digits n is a number that is equal to the sum of its own digits
 * each raised to the power of the number of digits. For example, 153 is an
 * Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 * *
 * Intuition:
 * To determine if a number is an Armstrong number, we need to:
 * 1. Find the number of digits in the number.
 * 2. Calculate the sum of each digit raised to the power of the number of digits.
 * 3. Compare the sum with the original number.
 * *
 * Approach:
 * - Initialize a variable `sum` to store the sum of the powered digits.
 * - Use a temporary variable to keep the original number for comparison.
 * - Calculate the number of digits using logarithmic calculation.
 * - Iterate through the digits of the number, raising each digit to the power
 * of the number of digits and adding it to `sum`.
 * - Finally, check if `sum` is equal to the original number.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * *
 * Time Complexity:
 * - O(d), where d is the number of digits in the number, as we process each
 * digit once.
 * *
 * Space Complexity:
 * - O(1), since we are using a constant amount of space.
 */

public class Armstrong_Number {
    public static void main(String[] args) {
		int n = 1634;

		System.out.println(solve(n));
	}

	public static boolean solve(int n) {
		int sum = 0;
		int temp = n;
		int len = (int) (Math.log10(n)) + 1;

		while (n != 0) {
			int rem = n % 10;
			sum += (int) (Math.pow(rem, len));
			n /= 10;
		}

		return sum == temp;
	}
}
