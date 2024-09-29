package Topic_05_06_08_Arrays.Problems.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Union_Of_Two_Sorted_Arrays class provides a method to find the union of two sorted arrays.
 * *
 * Problem Statement:
 * Given two sorted arrays, the task is to return a new array that contains all the unique elements
 * present in either of the two arrays. The result should maintain the sorted order.
 * *
 * Example:
 * Input: arr_1 = {1, 1, 2, 3, 4, 5}, arr_2 = {2, 3, 4, 4, 5, 6}
 * Output: [1, 2, 3, 4, 5, 6]
 * *
 * Approach:
 * - Use two pointers to traverse through both arrays.
 * - Compare the elements pointed to by the two pointers and add the smaller element to the result list,
 * ensuring it is unique.
 * - Continue until one of the arrays is fully traversed.
 * - Add any remaining unique elements from the other array to the result list.
 * *
 * Topics / Data Structures used:
 * - Array (to hold the integers)
 * - List (to store the result)
 * *
 * Time Complexity:
 * - O(n + m), where n is the length of arr_1 and m is the length of arr_2,
 * since both arrays are traversed once.
 * *
 * Space Complexity:
 * - O(n + m), as the result list can store up to n + m unique elements in the worst case.
 */

public class Union_Of_Two_Sorted_Arrays {
	public static void main(String[] args) {
		int[] arr_1 = {1, 1, 2, 3, 4, 5};
		int[] arr_2 = {2, 3, 4, 4, 5, 6};

		System.out.println(solve(arr_1, arr_2));
	}

	public static List<Integer> solve(
			int[] arr_1,
			int[] arr_2
	) {
		List<Integer> res = new ArrayList<>();
		int i = 0, j = 0;

		while (i < arr_1.length && j < arr_2.length) {
			if (arr_1[i] < arr_2[j]) {
				if (res.isEmpty() || res.getLast() != arr_1[i]) {
					res.add(arr_1[i]);
				}
				i++;
			} else {
				if (res.isEmpty() || res.getLast() != arr_2[j]) {
					res.add(arr_2[j]);
				}
				j++;
			}
		}

		while (i < arr_1.length) {
			if (res.isEmpty() || res.getLast() != arr_1[i]) {
				res.add(arr_1[i]);
			}
			i++;
		}

		while (j < arr_2.length) {
			if (res.isEmpty() || res.getLast() != arr_2[j]) {
				res.add(arr_2[j]);
			}
			j++;
		}

		return res;
	}
}
