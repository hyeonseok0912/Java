package dec05;

//연산자 = 계산할 때 사용되는 기호, 순서
/*
 * 모든 프로그래밍에서는 데이터의 연산을 하기 위해 연산자를 사용합니다.
 * 지금 배울 연산자는 자바 외 모든 언어에서 비슷하게 활용됩니다.
 * 잘 알아두시면 편합니다.
 * 
 * 주의해서 보셔야 할 것은 연산자의 기능과 순서입니다.
 * 연산자의 종류가 많기 때문에 모두 외우려고 하기보다는 자주
 * 사용하시면서 익숙해지도록 하시면 좋습니다.
 * 
 * 또한 아래 나열되는 연산자의 종류는 그 순서대로 정의한 것이기 때문에
 * 그대로 외우시면 좋습니다.
 * 
 * 1. 최우선 연산자
 * 		. 닷, 점 = 클래스 또는 객체 소유의 변수, 메소드
 * 		[] 배열
 * 		() 괄호
 * 
 * 2. 단항 연산자
 * 		!(논리 부정, not), ~(비트 반전), +/-(부호연산), ++/--(선행증감)
 * 		캐스팅(cast)
 * 
 * 3. 산술연산자
 * 		+, -, /, *, %(모듈러 : 나눈 후 나머지 값을 가져갑니다)
 * 
 * 4. 쉬프트 연산자
 * 		>>, <<
 * 
 * 5. 관계 연산자
 * 
 * 6. 비트 연산자
 * 		&, |, ^, !
 * 
 * 7. 논리 연산자 &&(AND), ||(OR)
 * 		&&, ||
 * 
 * 8. 삼항 연산자
 * 		조건식 ? 참일때 : 거짓일때
 * 
 * 9. 배정대입 연산자
 * 		=, +=, -=, /=, %=
 * 
 * 10. 후행증감 연산자
 * 		++, --
 */
public class Operator {
	public static void main(String[] args) {
		System.out.println();
		String name = "홍길동";
		char first = name.charAt(0);
		
		//System.out.println(first);
		//System.out.println(name.length());
		Math.random();
		
		//선행증감
		int num = 1;
		int num2 = ++num; // ++ -> +1
		//System.out.println(num); //2
		//System.out.println(num2); //2
		
		int num3 = ++num + num2;
		//System.out.println(num); //3
		//System.out.println(num2); //2
		//System.out.println(num3); //5
		
		int num4 = --num + --num2 + --num3;
		//System.out.println(num4); //2, 1, 4
		
		num = 1; num2 = 1; num3 = 1;
		num2 = num--;
		//System.out.println(num); //0
		//System.out.println(num2); // 1
		
		num3 = ++num - --num2 + num3--;
		//System.out.println(num); //1
		//System.out.println(num2); //0
		//System.out.println(num3); //2
		
		//System.out.println(!true);
		//System.out.println(1 != 2);
		//System.out.println(1 != (num4-1));
		
		//10진법 1을 2진법으로 변환합니다.
		String result = Integer.toBinaryString(0);
		//System.out.println(result);
		
		//System.out.println(Integer.toBinaryString(~1));
		
		num = 2;
		num2 = 2;
		num3 = 8 % 50;
		//나누는 값이 더 클 경우에는 작은 수를 리턴합니다.
		//System.out.println(num3);
		
		num = 16; //--->2칸 밀어
		//System.out.println(Integer.toBinaryString(num >> 2));
		
		//비트 연산자
		//&(and, 논리곱) = 양쪽 모두 참일때 참
		//|(or, 논리합) = 어느 한쪽이 참일때 참
		//^(XOR) = 한쪽이 참이고, 다른 한 쪽이 거짓일때 참
		//		   참^참 = 거짓, 거짓^거짓 = 거짓
		
		System.out.println(10 & 2);
		System.out.println();
	}
}
