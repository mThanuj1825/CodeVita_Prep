package Topic_01_Bit_Manipulation.Problems;

public class Check_If_Number_Is_Power_Of_2 {
	public static void main(String[] args) {
		int n = 15;

		System.out.println(solve(n));
	}

	public static boolean solve(int n) {
		return (n & (n - 1)) == 0;
	}
}
