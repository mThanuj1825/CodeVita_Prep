import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
		int k = 3;

		System.out.println(solve(arr, k));
	}

	public static int solve(
			int[] arr,
			int k
	) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		int sum = 0;
		int count = 0;

		for (int i : arr) {
			sum += i;
			count += map.getOrDefault(sum - k, 0);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		return count;
	}
}
