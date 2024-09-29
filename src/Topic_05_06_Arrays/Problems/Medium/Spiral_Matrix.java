package Topic_05_06_Arrays.Problems.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Given a 2D matrix, return all elements of the matrix in spiral order.
 * The spiral order starts from the top-left corner, traverses the top row from
 * left to right, the right column from top to bottom, the bottom row from right
 * to left, and the left column from bottom to top, and continues inward.
 * *
 * Intuition:
 * The problem can be solved by maintaining boundaries for the top, bottom, left,
 * and right edges of the matrix and iteratively reducing these boundaries as we
 * traverse the matrix in spiral order.
 * *
 * Approach:
 * 1. Initialize variables for the top, bottom, left, and right boundaries.
 * 2. Iterate through the matrix, adding elements in the following order:
 * - Traverse from left to right along the top boundary.
 * - Traverse from top to bottom along the right boundary.
 * - Traverse from right to left along the bottom boundary (if within bounds).
 * - Traverse from bottom to top along the left boundary (if within bounds).
 * 3. After each traversal, update the boundaries to narrow the matrix area for
 * the next spiral traversal.
 * 4. Continue this process until all elements are added.
 * *
 * Topics / Data Structures:
 * - Arrays
 * - Simulation
 * - Iteration
 * *
 * Time Complexity:
 * - O(n * m): We visit each element of the matrix exactly once, where n is the
 * number of rows and m is the number of columns.
 * *
 * Space Complexity:
 * - O(n * m): We store the result in a list containing all elements of the matrix.
 */

public class Spiral_Matrix {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4, 5, 6}, {20, 21, 22, 23, 24, 7}, {19, 32, 33, 34, 25, 8}, {18, 31, 36, 35, 26, 9},
				{17, 30, 29, 28, 27, 10}, {16, 15, 14, 13, 12, 11}};

		System.out.println(solve(arr));
	}

	public static List<Integer> solve(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		List<Integer> res = new ArrayList<>();

		int left = 0, right = m - 1;
		int top = 0, bottom = n - 1;

		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				res.add(arr[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				res.add(arr[i][right]);
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					res.add(arr[bottom][i]);
				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					res.add(arr[i][left]);
				}
				left++;
			}
		}

		return res;
	}
}
