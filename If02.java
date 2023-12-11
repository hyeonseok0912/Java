package dec05;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		
		//아래 내용을 충족하는 프로그램을 작성해주세요.
		int number = 12;
		//위 변수가 짝수인지 홀수인지 구분하는 if문을 만들어주세요.
		//짝수이면 "짝수입니다."
		//홀수이면 "홀수입니다"라고 출력하게 해주세요
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다.");
		}
		//스캐너 = 키보드로 들어오는 숫자, 문자를 받아 자바가 처리
		//데타  변수명   값
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 뒤 첫숫자를 적어주세요.");
		//입력대기
		int input = sc.nextInt();
		System.out.println("당신이 입력한 숫자: " + input);
		if (input % 2 == 0)	{
			System.out.println("여자입니다");
		}
		else {
			System.out.println("남자입니다");
		}
		
		//닫아주기
		sc.close();
	}

}
