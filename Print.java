package dec11;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
//		System.out.println("");// 따옴표 안의 내용을 출력하고 엔터
//		System.out.print("");// 따옴표 안의 내용을 출력
//		
//		System.out.print("여기까지가 print출력\r\n");
//		System.out.println("ln이 있는 것.");
//		//System.out.printf("출력 서식", 출력내용);
//		
		String name = "홍길동";
//		System.out.println(name);
//		System.out.printf("저는 %s입니다.", name);//기본적으로 print()입니다
//		//System.out.println();
//		System.out.printf("\r\n제 나이는 %d입니다.", 35);
//		System.out.printf("제 나이는 %f입니다.\n", 35.0);
//		
//		System.out.printf("%d를 8진수로 변환하면 %o \n", 10, 10);
		System.out.printf("%d를 16진수로 변환하면 %x \n", 15, 15);

		for (int i = 0; i < 16; i++) {
			// System.out.printf("%d를 16진수로 변환하면 %x \n", i, i);
		}

		/*
		 * 지시자 내용 %b boolean %d 정수 %f 실수 %o 8진수 %x 16진수 %c 문자 %s 문자열 %n 줄바꿈
		 */

		double pi = 3.1415926535;
		System.out.printf("pi는 %f%n", pi);

		System.out.printf("pi는 %.10f%n", pi);// 소수점 아래 10번째(.10)까지 출력

		System.out.printf("%5d%n", 5);// 기본적으로 5칸을 만들고 숫자를 찍고, 빈공간은 0으로 표시

		System.out.printf("%5d %n", 1300);

		System.out.printf("%s %n", name);

		System.out.printf("%5s %n", name);// 오른쪽

		System.out.printf("%-5s %n", name);// 왼쪽
		name = "홍길동입니다.";
		System.out.printf("글자수 : %d %n", name.length());
		System.out.printf("%s %n", name);
		System.out.printf("%.5s %n", name);
		System.out.printf("%6.5s %n", name);

		// 아래서 만든 add 메소드 호출해서 사용하기
		Scanner ret = add();// add()에서 나온 값이 scanner기에 좌항에도 scanner를 적어줘야함
		// <------------

		byte one = 10;
		int two = one; // 프로모션
		byte three = (byte) two;// 케스트

	}

	public static Scanner add() {
		Scanner sc = new Scanner(System.in);
		return sc; // return으로 나갈 타입을 클래스와 같은 타입으로 지정해주기
	}
}
