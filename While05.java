package dec11;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		// 스캐너 객체 만들기
		Scanner sc = new Scanner(System.in);
		int input;

		System.out.println("1.가위\t2.바위\t3.보"); // \t = tab
		input = sc.nextInt();

		A : while (input > 0 || input < 4) {
			int com;
			
			com = ((int) (Math.random() * 3 + 1));
			
			if (input == com) {
				System.out.println("비겼습니다.");
				break A;
			} else if (input == 1 && com == 3 || input == 2 && com == 1 || input == 3 && com == 2) {
				System.out.println("사용자가 이겼습니다.");
				break A;
			} else {
				System.out.println("컴퓨터가 이겼습니다.");
				break A;
			}
		}
		
	}

}
