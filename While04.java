package dec11;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int input;


//		do {
//			System.out.println("점수를 입력해주세요");
//			score = sc.nextInt();
//			System.out.println("반복합니다.");
//			score = sc.nextInt();
//		} while (score >= 0 && score <= 100);
		
		System.out.println("=========================");
		// 1, 2, 3
		do {
			System.out.println("가위바위보 게임을 시작합니다.");
			System.out.println("1.가위\t2.바위\t3.보");
			input = sc.nextInt();
			
		} while (input == 0 || input > 3);
		
		//for
		//while
		//do~while
		
		for (int i = 0; i < 10; i++) {
			//참일때 문장 실행		
		}
		
		for(String string : args) {// 데이터타입 구성요소 : 집합
			
		}
		
		while(/*조건식*/true) { // 조건식이 참이라면 실행
			System.out.println("참일때 실행");
		}
		
//		do {
//			System.out.println("참일때 실행");
//		} while(/*조건식*/);//구문을 먼저 실행하고 조건을 감시합니다.
		
	}
}
