package Topic_05_06_08_Arrays.Problems.Easy;

import java.util.Arrays;

/**
 * Move_All_Zeroes_To_The_End class provides a method to move all zero elements
 * in an array to the end while maintaining the order of non-zero elements.
 * *
 * Problem Statement:
 * Given an array of integers, the task is to move all the zeros present in
 * the array to the end without changing the order of the non-zero elements.
 * For example, if the array is {1, 0, 2, 3, 2, 0, 0, 4, 5, 1}, the resulting
 * array should be {1, 2, 3, 2, 4, 5, 0, 0, 0, 0}.
 * *
 * Approach:
 * - Iterate through the array to find the first zero and track its index.
 * - Swap non-zero elements with the first found zero, incrementing the index
 * of the last found zero for each swap.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * *
 * Time Complexity:
 * - O(n), where n is the number of elements in the array, as each element
 * is processed once.
 * *
 * Space Complexity:
 * - O(1), as the operation modifies the array in place and uses a constant
 * amount of extra space.
 */

public class Move_All_Zeroes_To_The_End {
	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

		System.out.println(solve(arr));
		System.out.println(Arrays.toString(arr));
	}

	public static int solve(int[] arr) {
		int n = arr.length;
		int j = -1; // To track the index of the last found zero

		// Find the first zero
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		// If no zero found, return -1
		if (j == -1) {
			return j;
		}

		// Move non-zero elements to the front
		for (int i = j + 1; i < n; i++) {
			if (arr[i] != 0) {
				// Swap the found non-zero element with the zero at index j
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++; // Increment j to the next zero position
			}
		}

		return j; // Return the index of the last zero found
	}
}
