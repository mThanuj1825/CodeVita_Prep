package Topic_12_Searching.Problems;

public class Linear_Search {
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 7, 8, 6, 2, 9, 4};
		int key = 3;

		System.out.println(solve(arr, key));
	}

	public static int solve(
			int[] arr,
			int key
	) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		return -1;
	}
}
