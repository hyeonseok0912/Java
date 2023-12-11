package dec11;

public class Test01 {

	public static void main(String[] args) {
		// 진법문제
		// 10 -> 1010
		// System.out.println(Integer.toBinaryString(10));

		int number = 4;

		while (number >= 1) {
			System.out.print(number % 2);
			number /= 2;
		}
	}

}
