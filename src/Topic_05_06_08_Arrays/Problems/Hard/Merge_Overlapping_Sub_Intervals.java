package Topic_05_06_08_Arrays.Problems.Hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Merge overlapping sub-intervals.
 * *
 * Intuition:
 * You only need to compare the current interval with the last added interval and merge them if they overlap.
 * *
 * Approach:
 * 1. Iterate through the intervals, and for each interval, check if it overlaps with the last added interval.
 * 2. If they overlap, merge them by updating the end of the last added interval.
 * 3. If they don’t overlap, add the new interval to the result list.
 * *
 * Time Complexity: O(n).
 * Space Complexity: O(k), where `k` denotes number of intervals.
 */

public class Merge_Overlapping_Sub_Intervals {
	public static void main(String[] args) {
		int[][] arr = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};

		System.out.println(solve(arr));
	}

	public static int solve(int[][] arr) {
		List<int[]> res = new ArrayList<>();
		res.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			int[] last = res.getLast();  // Get the last added interval

			// Check if the current interval overlaps with the last interval
			if (arr[i][0] <= last[1]) {
				// If they overlap, merge the intervals by updating the end of the last interval
				last[1] = Math.max(arr[i][1], last[1]);
			} else {
				// If they don't overlap, add the current interval as a new entry
				res.add(arr[i]);
			}
		}

		return res.size();
	}
}
