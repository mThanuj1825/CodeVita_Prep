package Topic_04_Mathematical_Computations.Problems;

public class Count_Digits {
	public static void main(String[] args) {
		int n = 88329;

		System.out.println(solve(n));
	}

	public static int solve(int n) {
		return (int) (Math.log10(n)) + 1;
	}
}
