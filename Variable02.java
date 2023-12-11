package dec04;

//진짜 변수 ------ 변수 선언, 값 대입, 활용
public class Variable02 {
	public static void main(String[] args) {
		// 변수 선언 ------ 데이터타입 변수명 = 값;
		// 자바의 데이터 타입은 2개
		// P(Primitive)타입 기본 타입
		
		// 정수형태 = 127
		//		byte, short, int, long
		
		// 실수형태 = 3.14
		//		float, double
		
		// 문자형태 = 가, 나, A = 글자 하나
		//		char
		
		// 논리형태 = 참/거짓
		//		boolean
		
		// R(Reference)타입 참조 타입
		
		/*
		 * 컴퓨터 진기신호
		 * 		전기가 통한다 1 = 참
		 * 		전기가 안 통한다 0 = 거짓
		 * 
		 * 도체 부도체 반도체
		 * 8비트 = 1바이트
		 * 
		 * 비트 바이트 킬로바이트 메가바이트 기가바이트 테라바이트
		 * 페타바이트 엑사바이트 제타바이트 요타바이트
		 * 
		 */
	
		//변수 선언
		//데이터 타입 변수명 = 값;
			byte num = 127;
			
			short num02 = num;
			
			int num03 = num02;
			
			long num04 = num03; // 자동 대입 = 프로모션
			
			num03 = (int) num04; // 강제로 대입 = 캐스트 연산자
			
			num02 = (short) (num02 + 1); // 산수 괄호

			num = (byte) 5200;

			System.out.println(num);// -128
			float pi = (float) 3.14;
			
			double pi2 = pi;
			
			int number = 150;
			double pi3 = number;
			System.out.println(pi3);
			
			pi3 = 3.14;
			System.out.println(pi3);
			number = (int) pi3;
			System.out.println(number);
			
			char ch = '1';// 홀따옴표
			System.out.println(ch);
			
			ch = 102;
			System.out.println(ch);// ASCII CODE(아스키 코드표)
			
			ch = 103;
			System.out.println(ch);
			
			ch = 97;
			System.out.println(ch);
			System.out.println(ch + 1);
			System.out.println((char)(ch + 1));
			System.out.println((int)ch);// 97
			
			final int FINAL_INT = 30;// 절대 변할수 없는 값, 상수
			//FINAL_INT = 100;;// 수정불가
			
			//논리타입 = 참/거짓, true/false
			
			boolean check = false;
			System.out.println(check);
			
			check = check != true; // ==같아?	!= 다르다?
			//    2        1
			
			System.out.println(check);
			
			if(check) {
				System.out.println("check가 참입니다.");
			}
			else {
				System.out.println("check가 거짓입니다.");
			}
			
			int maxValue = 2147483647;
			int minValue = -2147483647;
			
			long lValue = 2147483648L;// long, float
			float pi4 = 3.14F;
			
			//래퍼런스타입
			String name = "홍길동";
			Name name1 = new Name();
			
			//var iii = 10;// 추론타입
			//var let const
			
			
	}
}

/*
 * 클래스 = 이느턴스화 되어질 내용을 코드로 만들어 둔 것
 * 인스턴스 = 클래스를 실제 메모리에 객체화하는 것
 */