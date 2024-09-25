package Topic_01_Bit_Manipulation.Problems;

public class Minimum_Bit_Flips_To_Convert_A_Number_To_Another_Number {
	public static void main(String[] args) {
		int start = 3;
		int goal = 4;

		System.out.println(solve(start, goal));
	}

	public static int solve(
			int start,
			int goal
	) {
		int count = 0;
		int mask = start ^ goal;

		while (mask != 0) {
			count += 1;
			mask = (mask & (mask - 1));
		}

		return count;
	}
}
