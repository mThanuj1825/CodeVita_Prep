package Topic_19_20_Sliding_Window_And_Two_Pointers.Problems;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_With_At_Most_K_Distinct_Characters {
	public static void main(String[] args) {
		String str ="aabbcccd";
		int k = 2;

		System.out.println(solve(str, k));
	}

	public static int solve(
			String str,
			int k
	) {
		Map<Character, Integer> map = new HashMap<>();
		int left = 0, right = 0, res = 0;

		while (right < str.length()) {
			map.put(str.charAt(right), map.getOrDefault(str.charAt(right), 0) + 1);

			while (map.size() > k) {
				map.put(str.charAt(left), map.get(str.charAt(left)) - 1);
				if (map.get(str.charAt(left)) == 0) {
					map.remove(str.charAt(left));
				}

				left++;
			}

			res = Math.max(res, right - left + 1);
			right++;
		}

		return res;
	}
}
