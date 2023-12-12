package dec12;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int count = 0;
		int input = 0;
		int number = (int) (Math.random() * 99 + 1);
		Scanner sc = new Scanner(System.in);

		while (input != number) {

			System.out.println("1~100 숫자 입력: ");
			input = sc.nextInt();
			count++;
			if (input == number) {
				System.out.printf("정답입니다! %d회 만에 맞췄어요", count);
			} else if (input > number) {
				System.out.println("DOWN");
			} else if (input < number) {
				System.out.println("UP");
			}
		}

	}

}
