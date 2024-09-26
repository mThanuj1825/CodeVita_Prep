package Topic_05_06_Arrays.Problems.Medium;

import java.util.Arrays;

/**
 * Problem: Rotate a given n x n matrix by 90 degrees clockwise.
 * *
 * Intuition:
 * To rotate a matrix, we can first transpose it and then reverse
 * each row. The transposition flips the matrix over its diagonal,
 * and the row reversal gives us the desired rotation.
 * *
 * Approach:
 * 1. Transpose the matrix by swapping arr[i][j] with arr[j][i].
 * 2. Reverse each row of the transposed matrix to achieve the 90-degree
 * clockwise rotation.
 * *
 * Topics / Data Structures:
 * - 2D Arrays
 * - Iteration
 * *
 * Time Complexity:
 * - O(n^2): The algorithm involves two passes through the matrix,
 * each taking O(n^2) time.
 * *
 * Space Complexity:
 * - O(1): The rotation is done in-place, so no additional space
 * is used other than a few variables.
 */

public class Rotate_Matrix_By_90_Degrees {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

		solve(arr);
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static void solve(int[][] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n - j - 1];
				arr[i][n - j - 1] = temp;
			}
		}
	}
}
