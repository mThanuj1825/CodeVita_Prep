package Topic_01_Bit_Manipulation.Problems;

public class XOR_Of_Numbers_In_Range {
	public static void main(String[] args) {
		int start = 4;
		int end = 7;

		System.out.println(solve(start, end));
	}

	public static int solve(
			int start,
			int end
	) {
		int start_xor = XOR_Of_Numbers_From_1_To_N.solve(start - 1);
		int end_xor = XOR_Of_Numbers_From_1_To_N.solve(end);

		return start_xor ^ end_xor;
	}
}
