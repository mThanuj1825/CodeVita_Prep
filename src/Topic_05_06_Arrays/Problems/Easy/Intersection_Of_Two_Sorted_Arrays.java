package Topic_05_06_Arrays.Problems.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Intersection_Of_Two_Sorted_Arrays class provides a method to find the intersection of two sorted arrays.
 * *
 * Problem Statement:
 * Given two sorted arrays, the task is to return a new array that contains all the elements that appear
 * in both arrays, preserving their order of appearance. Each element in the intersection should be unique.
 * *
 * Example:
 * Input: arr_1 = {1, 1, 2, 3, 4, 5}, arr_2 = {2, 3, 4, 4, 5, 6}
 * Output: [2, 3, 4, 5]
 * *
 * Approach:
 * - Use two pointers to traverse through both arrays.
 * - When elements at both pointers are equal, add that element to the result list and increment both pointers.
 * - If the elements are not equal, increment the pointer of the smaller element to find the next potential match.
 * - To avoid adding duplicate elements to the result, check for uniqueness before adding to the result list.
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
 * - O(min(n, m)), as the result list can store up to min(n, m) unique intersection elements.
 */

public class Intersection_Of_Two_Sorted_Arrays {
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
			if (arr_1[i] == arr_2[j]) {
				res.add(arr_1[i]);
				i++;
				j++;
			} else if (arr_1[i] < arr_2[j]) {
				i++;
			} else {
				j++;
			}

			if (!res.isEmpty()) {
				while (i < arr_1.length && res.get(res.size() - 1) == arr_1[i]) {
					i++;
				}
				while (j < arr_2.length && res.get(res.size() - 1) == arr_2[j]) {
					j++;
				}
			}
		}

		return res;
	}
}
