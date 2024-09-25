package Topic_01_Bit_Manipulation.Problems;

public class Divide_Without_Division_Or_Multiplication {
	public static void main(String[] args) {
		int dividend = 22;
		int divisor = 3;

		System.out.println(solve(dividend, divisor));
	}

	public static int solve(
			int dividend,
			int divisor
	) {
		if (dividend == divisor) {
			return 1;
		}

		boolean sign = true;
		if (dividend >= 0 && divisor < 0) {
			sign = false;
		} else if (dividend < 0 && divisor > 0) {
			sign = false;
		}

		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		int res = 0;
		while (dividend >= divisor) {
			int count = 0;
			while (dividend >= (divisor << (count + 1))) {
				count += 1;
			}

			res += 1 << count;
			dividend -= (divisor << (count));
		}

		return (sign) ? res : (-1 * res);
	}
}
