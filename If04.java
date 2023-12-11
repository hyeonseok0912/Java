package dec05;

public class If04 {

	public static void main(String[] args) {
		int num1 = 90;
		int num2 = 5;
		int temp;
		// 정렬해주세요.

		if (num1 < num2) {
			System.out.println(num1);
			System.out.println(num2);
		} else {
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println(num1);
			System.out.println(num2);
		}
	}
}
