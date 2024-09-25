package Day_01_Bit_Manipulation.Problems;

public class Swap_Two_Numbers {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		System.out.println("a= " + a + " b= " + b);

		a ^= b;
		b ^= a;
		a ^= b;

		System.out.println("a= " + a + " b= " + b);
	}
}
