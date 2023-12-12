package dec12;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");

		int input = sc.nextInt();

		char arr01[][] = new char[input][input];

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (j == 0 || j == input - 1 || i == j) {
					arr01[i][j] = 'N';
				} else {
					arr01[i][j] = ' ';
				}
			}
		}
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.print(arr01[i][j]);
			}
			System.out.println(" ");
		}

	}
}