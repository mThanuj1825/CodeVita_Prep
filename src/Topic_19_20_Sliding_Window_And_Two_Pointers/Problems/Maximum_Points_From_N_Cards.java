package Topic_19_20_Sliding_Window_And_Two_Pointers.Problems;

/**
 * Problem: Find the maximum points from N cards by picking exactly `k` cards from the ends of the array.
 * *
 * Intuition:
 * The maximum points can be obtained by choosing a combination of `k` cards from either the start or the end of the
 * array.
 * By using a sliding window approach, we can compute the sum of a combination of cards taken from both ends and keep
 * track of the maximum sum.
 * *
 * Approach:
 * 1. Start by summing the first `k` cards from the left (start of the array).
 * 2. Use a sliding window to shift cards from the left sum to the right, while maintaining the total of `k` cards.
 * 3. For each window shift, update the maximum sum.
 * *
 * Time Complexity: O(k)
 * Space Complexity: O(1)
 */
public class Maximum_Points_From_N_Cards {
	public static void main(String[] args) {
		int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
		int k = 4;

		System.out.println(solve(arr, k));
	}

	public static int solve(
			int[] arr,
			int k
	) {
		int left_sum = 0, right_sum = 0, max_Sum = 0;
		// Calculate the initial left sum from the first `k` cards
		for (int i = 0; i < k; i++) {
			left_sum += arr[i];
		}
		max_Sum = left_sum;

		int t = k - 1;

		// Slide the window, moving cards from the left side to the right side
		while (t > -1) {
			left_sum -= arr[t]; // Remove from left sum
			right_sum += arr[arr.length - (k - t)]; // Add to right sum

			max_Sum = Math.max(max_Sum, left_sum + right_sum); // Update max sum
			t -= 1;
		}

		return max_Sum;
	}
}
