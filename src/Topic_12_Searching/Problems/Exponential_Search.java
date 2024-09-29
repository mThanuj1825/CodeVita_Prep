package Topic_12_Searching.Problems;

public class Exponential_Search {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 3;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		if (arr[0] == key) {
			return 0;
		}

		int i = 1;
		while (i < arr.length && arr[i] <= key) {
			i = i * 2;
		}

		return Binary_Search.solve(arr, key, i / 2, Math.min(i, arr.length - 1));
	}
}
