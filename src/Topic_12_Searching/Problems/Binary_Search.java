package Topic_12_Searching.Problems;

public class Binary_Search {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 3;

		System.out.println(solve(arr, key, 0, arr.length - 1));
	}

	public static int solve(
			int[] arr,
			int key,
			int low,
			int high
	) {
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (key == arr[mid]) {
				return mid;
			}

			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}
}
