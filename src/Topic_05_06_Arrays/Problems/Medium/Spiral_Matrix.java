package Topic_05_06_Arrays.Problems.Medium;

import java.util.ArrayList;
import java.util.List;

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
