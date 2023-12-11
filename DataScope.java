package dec04;

//자바스크립트

//데이터 스코프 = 해당 변수가 사용되는 범위

public class DataScope {
	public static void main(String[] args) {

		int number;
		{
			number = 100;
		}
		System.out.println(number);
	}
	
	public static void main2() {
		
	}
	
	public static void main3() {
		
	}
}
