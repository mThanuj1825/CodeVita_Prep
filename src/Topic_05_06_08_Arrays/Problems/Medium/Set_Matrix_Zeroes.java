package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.Arrays;

/**
 * Problem: Given a m x n matrix, set the entire row and column to zero
 * if an element is 0.
 * *
 * Intuition:
 * We can use two boolean arrays to keep track of which rows and columns
 * need to be zeroed. First, we traverse the matrix to identify the rows
 * and columns containing zeros, and then we apply the zeroing operation.
 * *
 * Approach:
 * 1. Initialize two boolean arrays, one for rows and one for columns,
 * to keep track of which rows and columns need to be set to zero.
 * 2. Traverse the matrix. When a zero is found, mark the corresponding
 * row and column in the boolean arrays.
 * 3. Traverse the matrix again. For each element, if its row or column
 * is marked, set the element to zero.
 * *
 * Topics / Data Structures:
 * - 2D Arrays
 * - Boolean Arrays
 * - Iteration
 * *
 * Time Complexity:
 * - O(m * n): The algorithm involves two passes over the matrix, where
 * m is the number of rows and n is the number of columns.
 * *
 * Space Complexity:
 * - O(m + n): The space complexity is due to the boolean arrays used to
 * keep track of rows and columns.
 */

public class Set_Matrix_Zeroes {
	public static void main(String[] args) {
		int[][] arr = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};

		solve(arr);
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static void solve(int[][] arr) {
		int n = arr.length;
		boolean[] cols = new boolean[n];
		boolean[] rows = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (rows[i] || cols[j]) {
					arr[i][j] = 0;
				}
			}
		}
	}
}
