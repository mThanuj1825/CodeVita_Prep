package Topic_05_06_08_Arrays.Problems.Medium;

import java.util.Arrays;

/**
 * Sort_Arrays_Of_0s_1s_2s class implements the Dutch National Flag algorithm
 * to sort an array containing only 0s, 1s, and 2s in linear time.
 * *
 * Problem Statement:
 * Given an array of integers consisting of 0s, 1s, and 2s, the task is to
 * sort the array in a single pass.
 * *
 * Example:
 * Input: arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1}
 * Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2]
 * *
 * Approach:
 * - We use three pointers: low, mid, and high.
 * - low: tracks the position for the next 0.
 * - high: tracks the position for the next 2.
 * - mid: scans the array, deciding where to place each element.
 * - The array is modified in place without using extra space.
 * *
 * Time Complexity:
 * - O(n), where n is the length of the array, as we traverse the array exactly once.
 * *
 * Space Complexity:
 * - O(1), as we do not use extra space apart from the input array.
 * *
 */

public class Sort_Arrays_Of_0s_1s_2s {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};

		solve(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void solve(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;

		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
		}
	}
}
