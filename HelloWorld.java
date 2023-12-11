package dec05;

public class HelloWorld {// 클래스
	public static void main(String[] args) {// main메소드
		//변수 선언 정수 기본 타입으로 number라는 이름의 변수를 만들어
		//값은 리터럴 값을 저장해주세요.
		int number = 1;
		
		System.out.println("Hello World");
		System.out.println(number);
	}
}
/*
 * 기본타입(크기 순서대로)
 * 정수 : byte, short, int, long
 * 실수 : float, double
 * 문자 : char
 * 논리 : boolean
 * 
 * 프로모션 : 작은 타입이 큰 타입에 자동 대입될 때
 * 캐스트 : 큰 타입이 작은 타입에 대입할 때, (타입)적어주기, 값 절삭
 */