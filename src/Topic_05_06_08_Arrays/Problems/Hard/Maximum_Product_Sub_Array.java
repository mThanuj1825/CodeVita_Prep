package Topic_05_06_08_Arrays.Problems.Hard;

/**
 * Problem: Find the maximum product of a contiguous subarray in an array.
 * *
 * Intuition:
 * The maximum product can be achieved by considering both positive and negative numbers.
 * A negative number can turn the product positive if multiplied by another negative number.
 * *
 * Approach:
 * 1. Use two variables, `prefix` and `suffix`, to track the product of the current subarray
 * from the start and end, respectively.
 * 2. Iterate through the array from both ends, updating the products and tracking the maximum.
 * 3. Reset the product to 1 when encountering zero, since zero will nullify the product.
 * *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Maximum_Product_Sub_Array {
	public static void main(String[] args) {
		int[] arr = {2, 0, 3, -2, 4};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int n = arr.length;

		if (n == 0) {
			return 0; // Handle empty array
		}

		int res = arr[0]; // Initialize to the first element
		int prefix = 1;
		int suffix = 1;

		for (int i = 0; i < n; i++) {
			// Handle prefix product
			if (prefix == 0) {
				prefix = 1;
			}
			prefix *= arr[i];

			// Handle suffix product
			if (suffix == 0) {
				suffix = 1;
			}
			suffix *= arr[n - i - 1];

			// Update the maximum product
			res = Math.max(res, Math.max(prefix, suffix));
		}

		return res;
	}
}
