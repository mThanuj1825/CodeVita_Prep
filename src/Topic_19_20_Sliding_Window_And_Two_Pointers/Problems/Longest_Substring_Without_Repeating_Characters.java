package Topic_19_20_Sliding_Window_And_Two_Pointers.Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Find the length of the longest substring without repeating characters.
 * *
 * Intuition:
 * The goal is to find the longest contiguous substring where no character repeats. This can be efficiently solved
 * using a sliding window approach.
 * The window keeps expanding by moving the `right` pointer. If a duplicate character is encountered, the `left`
 * pointer is adjusted to skip past the last occurrence of the duplicate.
 * *
 * Approach:
 * 1. Use two pointers (`left` and `right`) to represent the sliding window.
 * 2. As we traverse the string, store each character's index in a map.
 * 3. If a character is repeated (i.e., it's in the map), move the `left` pointer to the right of the previous
 * occurrence of the character.
 * 4. Continuously update the result as the maximum length of the current window.
 * *
 * Time Complexity: O(n), where `n` is the length of the string.
 * Space Complexity: O(min(n, m)), where `m` is the size of the character set (in this case, constant for
 * ASCII/Unicode characters).
 */
public class Longest_Substring_Without_Repeating_Characters {
	public static void main(String[] args) {
		String s = "cadbzabcd";

		System.out.println(solve(s));
	}

	public static int solve(String s) {
		int res = 0;  // Variable to store the result, i.e., maximum length of substring found
		Map<Character, Integer> map = new HashMap<>();  // Map to store the latest index of each character
		int left = 0, right = 0;  // Sliding window pointers

		// Traverse the string using the `right` pointer
		while (right < s.length()) {
			// If the character is not in the map (i.e., not a repeat), update the result with the current window size
			if (!map.containsKey(s.charAt(right))) {
				res = Math.max(res, right - left + 1);  // Update the result to the maximum window size
			} else {
				// If the character is a repeat, move the `left` pointer to the right of the last occurrence
				left = Math.max(left, map.get(s.charAt(right)) + 1);
			}

			// Add the current character to the map with its index
			map.put(s.charAt(right), right);
			right++;  // Expand the window by moving `right` pointer
		}

		return res;
	}
}
