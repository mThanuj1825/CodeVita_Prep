package Topic_04_Mathematical_Computations.Problems;

/**
 * Check_Palindrome class provides a method to check if a given integer is a
 * palindrome.
 * *
 * Problem statement:
 * A palindrome is a number that remains the same when its digits are reversed.
 * For example, 12321 is a palindrome, while 123 is not.
 * *
 * Intuition:
 * To determine if a number is a palindrome, we need to reverse the number and
 * check if the reversed number is equal to the original number.
 * *
 * Approach:
 * - Utilize a helper method, `Reverse_A_Number.solve(int n)`, to reverse the
 * digits of the number.
 * - Compare the original number with the reversed number.
 * *
 * Topics / Data Structures used:
 * - Mathematical computations
 * *
 * Time Complexity:
 * - O(d), where d is the number of digits in the number, since we are
 * reversing the number.
 * *
 * Space Complexity:
 * - O(1), as we are using a constant amount of space for variables.
 */

public class Check_Palindrome {
    public static void main(String[] args) {
		int n = 12321;

		System.out.println(solve(n));
	}

	public static boolean solve(int n) {
		int rev = Reverse_A_Number.solve(n);

		return n == rev;
	}
}
