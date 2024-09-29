package Topic_12_Searching.Problems;

public class Interpolation_Search {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 4;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		int low = 0, high = arr.length - 1;

		while (key >= arr[low] && key <= arr[high] && low <= high) {
			int probe = low + (((high - low) / (arr[high] - arr[low])) * (key - arr[low]));

			if (key == arr[probe]) {
				return probe;
			}

			if (key < arr[probe]) {
				high = probe - 1;
			} else {
				low = probe + 1;
			}
		}

		return -1;
	}
}
