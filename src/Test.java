public class Test {
	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int n = arr.length;
		int j = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		if (j == -1) {
			return n;
		}

		for (int i = j + 1; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;
			}
		}

		return j;
	}
}
