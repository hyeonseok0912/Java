package dec07;

import java.util.Arrays;
import java.util.Scanner;

//사용자가 원하는 게임 수 만큼 게임을 진행하고
//그 승패 결과를 배열에 저장, 승률을 출력하는 프로그램 만들기

public class Array07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, com, game[];
		float win; //승률을 저장해주세요.
		
		System.out.println("가위바위보 게임에 오신것을 환영합니다.");
		System.out.println("몇 게임 하시겠습니까?");
		
		game = new int[sc.nextInt()];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int i = 0; i < game.length; i++) {
			System.out.println("게임을 시작하지.");
			System.out.println("1. 가위\t2. 바위\t3. 보");	
			
			//이기면 1, 지면 0, 비기면 0
			com = ((int)(Math.random()*3 + 1));
			int input2 = sc.nextInt();
			
			if(input2 == com)	{
				System.out.println("비겼습니다.");
				count2++;
				game[i] = 0;
			}
			else if	(input2 == 1 && com == 3 || input2 ==2 && com == 1 || input2 == 3 &&  com == 2) {
				System.out.println("사용자가 이겼습니다.");
				count1++;
				game[i] = 1;
			}
			else {
				System.out.println("컴퓨터가 이겼습니다.");
				count3++;
				game[i] = 0;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(game));
		System.out.println("승률 : " + (double)count1 / game.length*100+"%");
		
		
	}

}
