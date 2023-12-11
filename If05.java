package dec05;

import java.util.Random;
import java.util.Scanner;

//가위바위보 게임 만들기
public class If05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com; // 컴퓨터가 뽑은 1가위 2바위 3보
		
		System.out.println("가위바위보 게임에 오신것을 환영합니다");
		System.out.println("1 가위, 2 바위, 3 보");
		System.out.println("입력 >_");
		
		//랜덤뽑기 Math.random();
		com = ((int)(Math.random()*3 + 1));
		int input = sc.nextInt();
		
		if(input == com)	{
			System.out.println("비겼습니다.");
		}
		else if	(input == 1 && com == 3 || input ==2 && com == 1 || input == 3 &&  com == 2) {
			System.out.println("사용자가 이겼습니다.");
		}
		else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
	}

}
