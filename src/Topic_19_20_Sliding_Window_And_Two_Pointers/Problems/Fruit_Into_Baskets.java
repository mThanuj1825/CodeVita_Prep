package Topic_19_20_Sliding_Window_And_Two_Pointers.Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Fruit Into Baskets
 * *
 * Intuition:
 * The task is to find the longest contiguous subarray where there are at most two distinct elements.
 * This can be efficiently solved using a sliding window approach and a hashmap to track the count of each element in
 * the window.
 * The window expands by moving the `right` pointer and shrinks by moving the `left` pointer when there are more than
 * two distinct elements.
 * *
 * Approach:
 * 1. Use a sliding window technique with two pointers (`left` and `right`).
 * 2. A HashMap is used to store the frequency of elements in the current window.
 * 3. As we expand the window by moving the `right` pointer, we add the element to the map or update its count.
 * 4. If the window contains more than two distinct elements, move the `left` pointer to shrink the window until only
 * two distinct elements remain.
 * 5. Track the maximum size of the window at each step.
 * *
 * Time Complexity: O(n), where `n` is the length of the array. Each element is added and removed from the map at
 * most once.
 * Space Complexity: O(1), since the map will hold at most 3 keys (because we only care about two distinct types of
 * fruits).
 */
public class Fruit_Into_Baskets {
	public static void main(String[] args) {
		int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();  // Map to store the count of each type of fruit in the current
		// window.
		int left = 0, right = 0, res = 0;  // Initialize pointers and the result.

		// Expand the window by moving the `right` pointer through the array.
		while (right < arr.length) {
			// Add the current fruit type to the map or update its count.
			map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

			// If the window contains more than 2 distinct types, shrink it by moving the `left` pointer.
			while (map.size() > 2) {
				// Decrease the count of the fruit type at the `left` pointer.
				map.put(arr[left], map.get(arr[left]) - 1);
				// If the count becomes zero, remove that fruit type from the map.
				if (map.get(arr[left]) == 0) {
					map.remove(arr[left]);
				}
				left++;  // Shrink the window by moving the `left` pointer.
			}

			// Update the result to be the maximum size of the window.
			res = Math.max(res, right - left + 1);

			right++;  // Expand the window by moving the `right` pointer.
		}

		return res;  // Return the maximum number of fruits that can be collected in two baskets.
	}
}
