package dec08;

import java.io.IOException;

//반복문 중 무한 반복이 가능한 while입니다.
/*
 * while문은 보통 무한 반복을 하다가 특정 조건이 되면 탈출합니다.
 * 채팅이나 게임 등 무한 반복되는 로직에서 사용됩니다.
 * 무한 loop
 */
public class While01 {
	public static void main(String[] args) throws IOException {

		boolean quit = true;
		while (quit) {
			// 조건이 참일때 실행
			System.out.println("게임을 시작합니다.");
			System.out.println("게임중...");
			System.out.println("게임을 종료할까요?(Y/N)");

			char input = (char) System.in.read();
			//엔터까지 같이 가져옵니다. Y\n\r
			
			System.in.read();
			System.in.read();//엔터키 처리
			
			if (input == 'Y' || input == 'y') {
				System.out.println("게임을 종료합니다.");
				quit = !quit;
			}
		}
	}
}
