package dec06;

public class Test01 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 127 + 1);
		// System.out.println((char) a);

		// 영문자인지, 숫자인지, 특수기호인지 찾아내는 if문을 만들고 싶어요

		if (a >= 48 && a <= 57) {
			System.out.println("숫자입니다");
		} else if (a >= 58 && a <= 64 || a >= 91 && a <= 96 || a >= 123 && a <= 126) {
			System.out.println("특수기호 입니다");
		} else if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
			System.out.println("영문자입니다");
		} else {
			System.out.println("이상한 문자입니다");
		}

		// 숫자인지, 특수기호인지 찾아내는 if문을 만들고 싶어요
		if (a >= '0' && a <= '9') {
			System.out.println("숫자입니다");
		} else if (a >= 'A' && a <= 'Z') {
			System.out.println("영어 대문자입니다");
		} else if (a >= 'a' && a <= 'z') {
			System.out.println("영어 소문자입니다");
		} else {
			System.out.println("숫자/영어 외 특수문자입니다.");
		}

		// 메소드로 구분하기
		// api보기
		// Character 클래스가 있습니다.
		// 이 클래스는 자바에서 사용되는 모든 문자 정보가 있습니다.
		// 특정 메소드를 사용하면 더 쉽게 만들 수 있습니다.

		if (Character.isDigit(a)) {
			System.out.println("숫자입니다");
		} else if (Character.isUpperCase(a)) {
			System.out.println("대문자입니다");
		} else if (Character.isLowerCase(a)) {
			System.out.println("소문자입니다");
		} else {
			System.out.println("숫자/영어 외 특수문자입니다");
		}
		//API 애플리케이션 프로그램 인터페이스
	}
}
