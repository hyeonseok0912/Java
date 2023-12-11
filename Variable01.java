package dec04;
//변수 : 변하는 값

public class Variable01 {
	public static void main(String[] args) {
		int num = 10;// 변수 선언 + 값 대입 = 변수 초기화
		// <==== 컴퓨터에서 값의 흐름(오른쪽에서 왼쪽)
		// 변수 쓰기 = 변수 값 바꾸기
		System.out.println(num);// 변수 활용

		num = 11;// 변수 활용
		int number = 55;// 여기에 숫자 55를 저장하는 문장으로
		
		number = num;
		// == 
		
		System.out.println(number);
	}
}
