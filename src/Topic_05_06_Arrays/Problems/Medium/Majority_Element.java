package Topic_05_06_Arrays.Problems.Medium;

public class Majority_Element {
	public static void main(String[] args) {
		int[] arr = {2, 2, 3, 3, 1, 2, 2};

		System.out.println(solve(arr));
	}

	public static Integer solve(int[] arr) {
		int candidate = arr[0];
		int count = 0;

		for (int i : arr) {
			if (count == 0) {
				candidate = i;
			}

			if (candidate == i) {
				count++;
			} else {
				count--;
			}
		}

		count = 0;
		for (int i : arr) {
			if (i == candidate) {
				count++;
			}
		}

		return (count > (arr.length / 2)) ? candidate : null;
	}
}
